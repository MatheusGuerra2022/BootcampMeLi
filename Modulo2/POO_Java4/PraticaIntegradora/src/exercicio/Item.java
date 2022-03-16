package exercicio;

import java.math.BigDecimal;

public class Item {

    String codigo;
    String nome;
    int quantidadeComprada;
    BigDecimal custoUnitario;

    public Item(String codigo, String nome, int quantidadeComprada, BigDecimal custoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeComprada = quantidadeComprada;
        this.custoUnitario = custoUnitario;
    }
}
