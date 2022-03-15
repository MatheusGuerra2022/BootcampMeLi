package exercicio2;

public class Pereciveis extends Produto{

    int diasParaVencer;

    public Pereciveis(String nome, double preco) {
        super(nome, preco);
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }




    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + super.getNome() + '\'' +
                ", preco=" + super.getPreco() +
                '}';
    }


    @Override
    public double calcular(int numeroDeProdutos) {

        if (diasParaVencer==1)
            return super.calcular(numeroDeProdutos)*0.25;
        else if(diasParaVencer == 2)
            return super.calcular(numeroDeProdutos)*0.33;
        else if(diasParaVencer==3)
            return super.calcular(numeroDeProdutos)*0.5;
        else
            return super.calcular(numeroDeProdutos);
    }
}
