package exercicio2;

import java.util.ArrayList;

public class Distribuidora {


    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList();
        double precoTotal = 0;

        produtos.add(new Pereciveis("Caixa de morango", 8.0, 1));
        produtos.add(new Pereciveis("1L de Leite", 4.0, 3));
        produtos.add(new Pereciveis("1 rosa", 4.00, 10));
        produtos.add(new Pereciveis("Peito de frango", 16.00, 30));
        produtos.add(new Pereciveis("1 cartela de dorflex", 3.0, 200));
        produtos.add(new NaoPereciveis("Camisa azul", 20.0, "Vestuario"));
        produtos.add(new NaoPereciveis("Camisa verde", 20.0, "Vestuario"));
        produtos.add(new NaoPereciveis("Sapato social", 150.0, "Vestuario"));
        produtos.add(new NaoPereciveis("Açucar", 4.00, "Alimentos"));
        produtos.add(new NaoPereciveis("Sal", 2.00, "Vestuario"));



        for(int i = 0; i < produtos.size(); i++){
            precoTotal = precoTotal + produtos.get(i).calcular(1);
//            System.out.println(produtos.get(i).toString());
//            System.out.println(precoTotal);

        }

        System.out.println("Preço total da venda = " + precoTotal + " reais");


    }

}
