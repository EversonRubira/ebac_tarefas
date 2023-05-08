package automovel;

public class Mercedes extends Carro{

    private boolean categoriaLuxo;

    public Mercedes(String marca, String modelo, Integer potencia, boolean categoriaLuxo) {
        super(marca, modelo, potencia);
        this.categoriaLuxo = categoriaLuxo;
    }

    public boolean essaCategoriaLuxo() {
        return categoriaLuxo;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", potencia='" + getPotencia() + '\'' +
                ", categoriaLuxo=" + categoriaLuxo +
                '}';
    }
}
