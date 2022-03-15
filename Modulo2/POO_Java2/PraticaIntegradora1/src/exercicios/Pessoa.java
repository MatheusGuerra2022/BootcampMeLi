package exercicios;

public class Pessoa {

    String nome;
    int idade;
    String id;
    double peso;
    double altura;


    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String id){

        this.nome = nome;
        this.idade = idade;
        this.id = id;

    }

    public Pessoa(String nome, int idade, String id, double peso, double altura){

        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this. altura = altura;

    }

    public int calculaIMC(){

        double imc;
        imc = this.peso/(this.altura*this.altura);

        if(imc < 20){
            System.out.println("Usuario abaixo do peso");
            return -1;
        }
        else if(20 <= imc && imc <=25 ){
            System.out.println("Usuario com peso saudavel");
            return 0;
        }
        else{
            System.out.println("Usuario com sobrepeso");
            return 1;
        }



    }

    public boolean ehMaiorIdade(){

        if(this.idade< 18){
            System.out.println("Usuario menor de idade");
            return false;
        }
        else{
            System.out.println("Usuario maior de idade");
            return true;
        }


    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", id = '" + id + '\'' +
                ", peso = " + peso +
                " kg , altura = " + altura +
                " m}";
    }
}



