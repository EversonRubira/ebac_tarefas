package automovel;

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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(Integer potencia) {
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
        return "automovel.Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia='" + potencia +
                '}';
    }



}