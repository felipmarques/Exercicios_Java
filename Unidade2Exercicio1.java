package uscs;

public class Unidade2Exercicio1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2019;

        carro3.marca = "Fiat";
        carro3.modelo = "Pulse";
        carro3.ano = 2023;

        carro1.ligar();
        carro2.acelerar();

        System.out.println(carro1.marca + " " + carro1.modelo);
        System.out.println(carro2.marca + " " + carro2.modelo);
        System.out.println(carro3.marca + " " + carro3.modelo);
    }
}
