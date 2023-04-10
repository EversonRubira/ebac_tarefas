package pt.com.fabricante;

public abstract class Carro {

    private int potencia;
    private String fonteCombustivel;
    private String cor;

    public Carro(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.fonteCombustivel = combustivel;
        this.cor = cor;
    }

    public void ligaMotor() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + fonteCombustivel + " motor ligado em pronto para ser utilizado " + potencia);
    }

    public void limpeza() {
        System.out.println("O carro foi limpo, e a cor " + cor.toLowerCase() + " esta perfeita, conforme entregue!");
    }

    public void mecanica() {
        System.out.println("O carro foi revisado pelo mecanico. Tudo parece perfeito!");
    }

    public void combustivelDoCarro (){
        System.out.println("o Carro esta com tanque cheio " + fonteCombustivel.toLowerCase());
    }
}
