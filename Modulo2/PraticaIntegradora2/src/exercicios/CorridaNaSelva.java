package exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CorridaNaSelva {


    public static class Participante{

        String rg;
        String nome;
        String sobrenome;
        int idade;
//        String telefone;
//        String numDeEmergencia;
//        String grupoSanguineo;
        int numDeRegistro;

    }



    static HashMap<String, Participante> listaCircuitoPequeno = new HashMap<>();
    static HashMap<String, Participante> listaCircuitoMedio = new HashMap<>();
    static HashMap<String, Participante> listaCircuitoAvançado = new HashMap<>();

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        boolean sistemaOn = true;



        while(sistemaOn){

            System.out.println("Insira um numero correspondente a operação desejada");
            System.out.println("1 - Inscrição de Participante");
            System.out.println("2 - Consulta Lista de Participante");
            System.out.println("3 - Cancelar inscrição de Participante");
            System.out.println("0 - Terminar Aplicação \n \n");



            switch (entrada.nextInt()){

                case 0:
                    sistemaOn = false;
                    break;
                case 1:
                    addParticipante();
                    break;
                case 2:
                    mostrarPartipantes();
                    break;
                case 3:
                    cancelarInscricao();
                    break;

            }


        };

        entrada.close();
    }

    static void cancelarInscricao() {

        System.out.println("Entre com a categoria desejada:");
        System.out.println("1 - Circuito Pequeno");
        System.out.println("2 - Circuito Médio");
        System.out.println("3 - Circuito Avançado \n\n");


        switch (entrada.nextInt()){
            case 1:
                System.out.println("Insira o RG da participante:");
                listaCircuitoPequeno.remove(entrada.next());

                break;
            case 2:
                System.out.println("Insira o RG da participante:");
                listaCircuitoMedio.remove(entrada.next());

                break;
            case 3:
                System.out.println("Insira o RG da participante:");
                listaCircuitoAvançado.remove(entrada.next());

                break;
        }




    }

    static void mostrarPartipantes() {

        System.out.println("Entre com a categoria desejada:");
        System.out.println("1 - Circuito Pequeno");
        System.out.println("2 - Circuito Médio");
        System.out.println("3 - Circuito Avançado \n \n");

        switch (entrada.nextInt()){
            case 1:
                System.out.println("1 - Circuito Pequeno \n");
                listaCircuitoPequeno.forEach( (rg,part) -> System.out.println("\t\t N° de registro: "+ part.numDeRegistro + "\t RG:" + part.rg +
                        "\t Nome: " + part.nome + "\t Sobrenome: " + part.sobrenome + "\t Idade: " + part.idade + " \n") );

                break;
            case 2:
                System.out.println("2 - Circuito Médio");
                listaCircuitoMedio.forEach( (rg,part) -> System.out.println("\t\t N° de registro: "+ part.numDeRegistro + "\t RG:" + part.rg +
                        "\t Nome: " + part.nome + "\t Sobrenome: " + part.sobrenome + "\t Idade: " + part.idade + " \n") );

                break;
            case 3:
                System.out.println("3 - Circuito Avançado");
                listaCircuitoAvançado.forEach( (rg,part) -> System.out.println("\t\t N° de registro: "+ part.numDeRegistro + "\t RG:" + part.rg +
                        "\t Nome: " + part.nome + "\t Sobrenome: " + part.sobrenome + "\t Idade: " + part.idade + " \n") );

                break;
        }

    }

    static void addParticipante() {

        Participante participante = new Participante();
        int categoria = 0;
        boolean validaInscricao = false;

        System.out.println("Para qual competição você gostaria de se inscrever? ");
        System.out.println("1 - Circuito Pequeno");
        System.out.println("2 - Circuito Médio");
        System.out.println("3 - Circuito Avançado \n \n");

        switch (entrada.nextInt()){
            case 1:
                System.out.println("1 - Circuito Pequeno");
                categoria = 1;
                break;
            case 2:
                System.out.println("2 - Circuito Médio");
                categoria = 2;
                break;
            case 3:
                System.out.println("3 - Circuito Avançado");
                categoria = 3;
                break;
        }

        System.out.println("Insira o seu RG:");
        participante.rg = entrada.next();

        System.out.println("Insira o seu Nome:");
        participante.nome = entrada.next();

        System.out.println("Insira o seu Sobrenome:");
        participante.sobrenome = entrada.next();

        System.out.println("Insira o seu idade:");
        participante.idade = entrada.nextInt();


        validaInscricao = calculoDeTaxa(participante.idade, categoria);

        switch (categoria){
            case 1:
                participante.numDeRegistro = listaCircuitoPequeno.size() + 1;
                listaCircuitoPequeno.put(participante.rg, participante);
                break;
            case 2:
                participante.numDeRegistro = listaCircuitoMedio.size() + 1;
                listaCircuitoMedio.put(participante.rg, participante);
                break;
            case 3:
                if(validaInscricao){
                    participante.numDeRegistro = listaCircuitoAvançado.size() + 1;
                    listaCircuitoAvançado.put(participante.rg, participante);
                }
                System.out.println("Operação rejeitada");
                break;
        }

    }

    static boolean calculoDeTaxa(int idadeParticipante, int categoria) {

            boolean valida = true;

            switch (categoria){
                case 1:
                    if(idadeParticipante < 18)
                        System.out.println("Taxa a ser paga pela inscrição: R$ 1300,00");
                    else
                        System.out.println("Taxa a ser paga pela inscrição: R$ 1500,00");
                    break;

                case 2:
                    if(idadeParticipante < 18)
                        System.out.println("Taxa a ser paga pela inscrição: R$ 2000,00");
                    else
                        System.out.println("Taxa a ser paga pela inscrição: R$ 2300,00");
                    break;
                case 3:
                    if(idadeParticipante < 18) {
                        System.out.println("Inscrição não permitida: Menor de idade");
                        valida = false;
                    }
                    else
                        System.out.println("Taxa a ser paga pela inscrição: R$ 2300,00 \n");
                    break;
            }

            return valida;
    }


}
