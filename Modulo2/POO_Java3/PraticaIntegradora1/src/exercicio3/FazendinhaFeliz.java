package exercicio3;

public class FazendinhaFeliz {

    public static void main(String[] args) {

        Cachorro hazel = new Cachorro();
        Gato josephGalego = new Gato();
        Vaca mimosa = new Vaca();


        hazel.comerCarne();
        hazel.emitirSom();
        //hazel.comerPasto();

        josephGalego.comerCarne();
        josephGalego.emitirSom();
        //josephGalego.comerPasto();

        mimosa.comerPasto();
        mimosa.emitirSom();
        //mimosa.comerCarne();

    }

}
