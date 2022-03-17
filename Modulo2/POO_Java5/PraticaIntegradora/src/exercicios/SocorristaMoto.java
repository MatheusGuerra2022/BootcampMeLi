package exercicios;

public class SocorristaMoto extends Veiculo{

    public SocorristaMoto() {
    }

    public void socorrer(Motocicleta moto){

        System.out.println("Se aproximando...");
        System.out.println("Socorro moto: " + moto.getPlaca());
    }

}
