package exercicio3;

public class Vaca extends Animal implements Alimentacao{

    public Vaca() {
        super();
        super.setTipoDeAlimentacao("Herbivoro");
    }




    @Override
    public void emitirSom() {
        System.out.println("Mu");

    }

    @Override
    public void comerCarne() {
        if(this.getTipoDeAlimentacao() == "Hernivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("A vaca esta comendo Carne");
    }

    @Override
    public void comerPasto() {
        if(this.getTipoDeAlimentacao() == "Carnivoro")
            System.out.println("Alimetação impropria");
        else
            System.out.println("A vaca esta comendo Pasto");

    }
}
