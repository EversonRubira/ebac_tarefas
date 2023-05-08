package automovel;

public class Ford extends Carro{

    private boolean categoriaPopular;

    public Ford(String marca, String modelo, Integer potencia, boolean categoriaPopular) {
        super(marca, modelo, potencia);
        this.categoriaPopular = categoriaPopular;
    }

    public boolean isCategoriaPopular() {
        return categoriaPopular;
    }


    @Override
    public String toString() {
        return "Ford{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia='" + getPotencia() + '\'' +
                ", categoriaPopular=" + categoriaPopular +
                '}';
    }
}
