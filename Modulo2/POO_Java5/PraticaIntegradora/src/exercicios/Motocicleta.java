package exercicios;

public class Motocicleta extends Veiculo{


    public Motocicleta(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = 300;
        this.rodas = 2;

    }



    @Override
    public String toString() {
        return super.toString();
    }
}
