package exercicio;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Fatura {

    Client client;
    ArrayList<Item> items;
    double total;


    public Fatura(Client client) {
        this.client = client;
        this.total = Double.valueOf(0);
    }

    public Fatura(Client client, ArrayList<Item> items) {
        this.client = client;
        this.items = items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    void addItem(Item item){

        items.add(item);

    }

    void calculaTotal(){

        total = items
                    .stream()
                    .mapToDouble(item -> item.custoUnitario * item.quantidadeComprada)
                    .sum();
    }

    void validaCliente(Client cliente){
        if(cliente.isCadastradoEmFatura())
            System.out.println("Cliente cadastraddo");
        else{
            System.out.println("Cliente não cadastrado");
            System.out.println("Cadastrando cliente");
            cliente.setCadastradoEmFatura(true);
        }


    }

    @Override
    public String toString() {
        return "Fatura{" +
                "client=" + client +
                ", items=" + items +
                ", total=" + total +
                '}';
    }
}
