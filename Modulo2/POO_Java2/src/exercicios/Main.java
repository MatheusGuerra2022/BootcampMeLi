package exercicios;

public class Main {

    public static void main(String[] args) {

        Pessoa cliente = new Pessoa();
        Pessoa funcionario = new Pessoa("Roberto", 35, "BC85");
        Pessoa paciente = new Pessoa("Paulo", 17, "GH78", 55.5, 1.78);

        // Não é possivel realizar essa operação
        // Pessoa usuario = new Pessoa("Pedro", 17);
        
        System.out.println(paciente.toString());
        paciente.calculaIMC();
        paciente.ehMaiorIdade();

    }
}
