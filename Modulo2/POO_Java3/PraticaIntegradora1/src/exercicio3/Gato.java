package exercicio3;

public class Gato extends Animal implements Alimentacao{

    public Gato() {
        super();
        super.setTipoDeAlimentacao("Carnivoro");





    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        if(this.getTipoDeAlimentacao() == "Hernivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("O gato esta comendo Carne");
    }

    @Override
    public void comerPasto() {
        if(this.getTipoDeAlimentacao() == "Carnivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("O gato esta comendo Pasto");

    }


}
