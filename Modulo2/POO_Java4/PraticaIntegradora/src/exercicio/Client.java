package exercicio;

public class Client {
    static int idGeral = 0;
    int id;
    String nome;
    String sobrenome;
    boolean cadastradoEmFatura;

    public Client(String nome, String sobrenome) {
        idGeral = idGeral + 1;
        this.id = idGeral;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean isCadastradoEmFatura() {
        return cadastradoEmFatura;
    }

    public void setCadastradoEmFatura(boolean cadastradoEmFatura) {
        this.cadastradoEmFatura = cadastradoEmFatura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    void fazerCompra(){
        // Instanciar fatura

    }


    static boolean validaCliente(Client cliente){
        boolean isCliente = false;




        return isCliente;
    }


}
