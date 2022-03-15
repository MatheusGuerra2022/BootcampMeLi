package exercicio3;

public abstract class Animal{

    private String tipoDeAlimentacao;

    public Animal() {

    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public abstract void emitirSom();
}
