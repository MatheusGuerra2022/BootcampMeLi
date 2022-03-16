package exercicio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entradaId;

        Client pedro = new Client("Pedro", "Silva");
        Client maria = new Client("Maria", "Eduarda");
        Client jose = new Client("Jose", "Felipe");

        ArrayList<Client> listaClientes = new ArrayList<>();

        listaClientes.add(pedro);
        listaClientes.add(maria);
        listaClientes.add(jose);

        listaClientes.stream().forEach(System.out::println);

        listaClientes.remove(1);
        System.out.println("\n");

        listaClientes.stream().forEach(System.out::println);
        System.out.println("\n");

        System.out.println(" Informe ID para consulta:\n");
        entradaId = entrada.nextInt();

        listaClientes
                .stream()
                .filter(client -> client.getId()==entradaId)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Cadastro inexistente"));






    }



}
