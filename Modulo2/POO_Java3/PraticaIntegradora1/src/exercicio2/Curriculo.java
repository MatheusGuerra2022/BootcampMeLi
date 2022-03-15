package exercicio2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Curriculo extends Documento implements Impressora{

    ArrayList<String> atributos = new ArrayList();
    ArrayList<String> habilidades = new ArrayList();

    public Curriculo(String autor, int numeroDePaginas, ArrayList<String> atributos,
                     ArrayList<String> habilidades) {
        super(autor, numeroDePaginas);
        this.atributos = atributos;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "atributos=" + atributos +
                ", habilidades=" + habilidades +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo..." + toString());
    }
}
