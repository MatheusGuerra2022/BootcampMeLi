package exercicio1;

public class PraticaExcecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;
        int razao = 0;

        // Letra a
//        try {
//
//            razao = b/a;
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("Ocorreu um erro");
//        }

        // Letra b
        try {

            razao = b/a;

        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Não pode ser divido por zero");
        }

        System.out.println("Programa finalizado");

    }
}
