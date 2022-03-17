package exercicios;

import java.util.ArrayList;
import java.util.Comparator;

public class Corrida {

    double distancia;
    double premioEmDolares;
    String nome;
    int numeroDeVeiculosMax;
    ArrayList<Veiculo> listaDeVeiculos;

    SocorristaCarro socorristaCarro;
    SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, int numeroDeVeiculosMax) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numeroDeVeiculosMax = numeroDeVeiculosMax;
        this.listaDeVeiculos = new ArrayList<>();
    }

    public void addCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa){

        if(listaDeVeiculos.size() < numeroDeVeiculosMax){
            listaDeVeiculos.add(new Carro(velocidade,aceleracao,anguloDeGiro,placa));
        }
        else
            System.out.println("Lista de veiculos completa");
    }


    public void addMoto(double velocidade, double aceleracao, double anguloDeGiro,String placa){

        if(listaDeVeiculos.size()<numeroDeVeiculosMax){
            listaDeVeiculos.add(new Motocicleta(velocidade,aceleracao,anguloDeGiro,placa));
        }
        else
            System.out.println("Lista de veiculos completa");
    }


    public void deleteVeiculo(Veiculo veiculo){
        listaDeVeiculos.remove(veiculo);

    }

    public void deleteVeiculoComPlaca(String placa){

    listaDeVeiculos
            .stream()
            .filter(veiculo -> veiculo.getPlaca().equals(placa))
            .findFirst()
            .ifPresent(veiculo -> listaDeVeiculos.remove(veiculo));

    }
    
    public void definirVencedor(){
        Object[] listaDeVencedores = new ArrayList().toArray();

//        listaDeVeiculos
//                .stream()
//                .mapToDouble(v -> v.aceleracao*0.5*v.aceleracao/(v.anguloDeGiro*(v.peso-v.rodas*100)));

//        listaDeVeiculos
//                .stream().sorted((v,a) -> (int) (v.aceleracao*0.5*v.aceleracao/(v.anguloDeGiro*(v.peso-v.rodas*100))))
//                .forEach(System.out::println);

        listaDeVeiculos
                .stream()
                .sorted(Comparator.comparingDouble(v -> v.aceleracao*0.5*v.aceleracao/(v.anguloDeGiro*(v.peso-v.rodas*100))))
                .forEach(System.out::println);

        listaDeVencedores = listaDeVeiculos
                .stream()
                .sorted(Comparator.comparingDouble(v -> v.aceleracao*0.5*v.aceleracao/(v.anguloDeGiro*(v.peso-v.rodas*100))))
                .toArray();

        System.out.println("O VENCEDOR FOI:");
        System.out.println(listaDeVencedores[listaDeVencedores.length-1]);



    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public void socorrerCarro(String placa){

        listaDeVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .findFirst()
                .ifPresent(veiculo -> socorristaCarro.socorrer((Carro) veiculo));

    }

    public void socorrerMoto(String placa){

        listaDeVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .findFirst()
                .ifPresent(veiculo -> socorristaMoto.socorrer((Motocicleta) veiculo));

    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", numeroDeVeiculosMax=" + numeroDeVeiculosMax +
                ", listaDeVeiculos=" + listaDeVeiculos +
                '}';
    }
}
