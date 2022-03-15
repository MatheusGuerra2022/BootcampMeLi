package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        LivrosEmPDF meuLivro = new LivrosEmPDF("Ernest Hemingway", 127, "O Velho e o Mar", "Romance");
        Relatorio vendasSetembro = new Relatorio("Bob",5,50,"Pedro Paulo");
        Curriculo meuCurriculo = new Curriculo("Jose",1,
                new ArrayList<String>(
                        Arrays.asList("Honesto",
                                        "Curioso",
                                        "Dedicado")),
                new ArrayList<String>(Arrays.asList("C++",
                                                    "Java",
                                                "Python")));


        meuLivro.imprimir();
        vendasSetembro.imprimir();
        meuCurriculo.imprimir();

    }

}
