package exercicio;

import java.util.ArrayList;

public class MainSprint2 {

    public static void main(String[] args) {

        // Demonstração Sprint 2
        ArrayList<Item> items = new ArrayList<>();

        Item bola = new Item("BM01", "Bola", 5, 4.0);
        Item tenis = new Item("BM02", "Tenis", 1, 100.0);


        items.add(bola);
        items.add(tenis);

        Client pedro = new Client("Pedro", "Silva");


        Fatura fatura = new Fatura(pedro, items);
        fatura.validaCliente(pedro);
        fatura.validaCliente(pedro);

        fatura.calculaTotal();
        System.out.println(fatura.getTotal());


    }
}
