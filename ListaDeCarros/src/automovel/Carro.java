import java.util.ArrayList;
import java.util.List;

public abstract class Carro {

    private String marca;
    private String modelo;
    private Integer potencia;

    public Carro(String marca, String modelo, Integer potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public Integer getPotencia() {
        return potencia;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia='" + potencia +
                '}';
    }


    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<Carro>();

        Carro carro1 = new Carro("Kia", "Sportage", 160);
        Carro carro2 = new Carro("Ford", "Focus", 135);
        Carro carro3 = new Carro("Mercedes", "I3", 85);

        carroList.add(carro1);
        carroList.add(carro2);
        carroList.add(carro3);

        for (Carro carro : carroList) {
            System.out.println(carro);
        }
    }
}