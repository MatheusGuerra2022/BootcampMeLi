package exercicios;

import java.util.Objects;

public class Veiculo {

    double velocidade;
    double aceleracao;
    double anguloDeGiro;
    String placa;
    double peso;
    int rodas;

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(veiculo.velocidade, velocidade) == 0 && Double.compare(veiculo.aceleracao, aceleracao) == 0 && Double.compare(veiculo.anguloDeGiro, anguloDeGiro) == 0 && Double.compare(veiculo.peso, peso) == 0 && rodas == veiculo.rodas && placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, aceleracao, anguloDeGiro, placa, peso, rodas);
    }
}
