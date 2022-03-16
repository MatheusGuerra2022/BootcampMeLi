package exercicio;

import java.math.BigDecimal;

public class Item {

    String codigo;
    String nome;
    int quantidadeComprada;
    double custoUnitario;

    public Item(String codigo, String nome, int quantidadeComprada, double custoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeComprada = quantidadeComprada;
        this.custoUnitario = custoUnitario;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", custoUnitario=" + custoUnitario +
                '}';
    }
}
