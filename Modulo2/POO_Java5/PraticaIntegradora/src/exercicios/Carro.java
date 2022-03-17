package exercicios;

public class Carro extends Veiculo{

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = 1000;
        this.rodas = 4;

    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    public boolean equals(Carro carro) {
//        boolean  igual = false;
//
//        if(carro.placa == this.placa && carro.rodas == this.rodas && carro.peso == this.peso && carro.aceleracao == this.aceleracao && carro.anguloDeGiro == this.anguloDeGiro && carro.velocidade == this.velocidade)
//            igual = true;
//
//
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
