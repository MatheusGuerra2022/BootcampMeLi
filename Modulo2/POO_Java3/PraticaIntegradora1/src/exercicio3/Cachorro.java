package exercicio3;

public class Cachorro extends Animal implements Alimentacao{


    public Cachorro() {
        super();
        super.setTipoDeAlimentacao("Carnivoro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }


    @Override
    public void comerCarne() {
        if(this.getTipoDeAlimentacao() == "Hernivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("O cachorro esta comendo Carne");

    }

    @Override
    public void comerPasto() {
        if(this.getTipoDeAlimentacao() == "Carnivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("O cachorro esta comendo Pasto");

    }




}
