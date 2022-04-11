package exercicios;

public class Main {

    public static void main(String[] args) {

        Carro palio = new Carro(30,2,45,"BOB45");
        Motocicleta vespa = new Motocicleta(30,2,45,"SOB45");
        Carro gol = new Carro(30,2,45,"FIT45");
        Motocicleta harley = new Motocicleta(30,2,45,"MAD45");

        Corrida lemans = new Corrida(1000, 10000, "Le Mans 24H", 3);
        lemans.addCarro(30,2,45,"BOB45");
        lemans.addMoto(30,2,45,"SOB45");
        lemans.addCarro(30,3,45,"FIT45");
        lemans.addMoto(30,1,45,"MAD45");

        System.out.println(lemans.toString());

        // Testar funções de delete
//        lemans.deleteVeiculo(palio);
//        lemans.deleteVeiculoComPlaca("BOB45");
//        lemans.addMoto(30,2,45,"MAD45");
//        System.out.println(lemans.toString());


        // Testar função de definir vencedor
//        lemans.definirVencedor();

        // Teste ambulancia
        lemans.setSocorristaCarro(new SocorristaCarro());
        lemans.setSocorristaMoto(new SocorristaMoto());

        lemans.socorrerCarro("BOB45");
        lemans.socorrerMoto("SOB45");

    }

}
