package automovel;

public class KiaMotors extends Carro {

    private boolean tecnologiaEmbarcada;

    public KiaMotors(String marca, String modelo, Integer potencia, boolean tenologiaEmbarcada) {
        super(marca, modelo, potencia);
        this.tecnologiaEmbarcada = tenologiaEmbarcada;
    }

    public boolean isTecnologiaEmbarcada() {
        return tecnologiaEmbarcada;
    }

    @Override
    public String toString() {
        return "KiaMotors{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia='" + getPotencia() + '\'' +
                ", tenologiaEmbarcada=" + tecnologiaEmbarcada +
                '}';
    }

}

