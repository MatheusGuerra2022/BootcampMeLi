package exercicio2;

public class LivrosEmPDF extends Documento implements Impressora{

    String titulo;
    String genero;

    public LivrosEmPDF(String autor, int numeroDePaginas,
                       String titulo, String genero) {
        super(autor, numeroDePaginas);
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivrosEmPDF{" +
                "autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }


    @Override
    public void imprimir() {
        System.out.println("Imprimindo..." + toString());
    }
}
