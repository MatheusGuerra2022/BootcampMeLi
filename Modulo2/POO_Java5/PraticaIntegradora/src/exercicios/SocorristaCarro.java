package exercicios;

public class SocorristaCarro extends Veiculo{

    public SocorristaCarro() {
    }

    public void socorrer(Carro carro){

        System.out.println("Se aproximando...");
        System.out.println("Socorro carro: " + carro.getPlaca());
    }


}
