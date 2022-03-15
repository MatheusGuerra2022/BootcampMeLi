package exercicio2;

public class Relatorio extends Documento implements Impressora{


    int tamanhoTexto;
    String revisor;

    public Relatorio(String autor, int numeroDePaginas, int tamanhoTexto, String revisor) {
        super(autor, numeroDePaginas);
        this.tamanhoTexto = tamanhoTexto;
        this.revisor = revisor;
    }


    @Override
    public String toString() {
        return "Relatorio{" +
                "autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", tamanhoTexto=" + tamanhoTexto +
                ", revisor='" + revisor + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo..." + toString());
    }
}
