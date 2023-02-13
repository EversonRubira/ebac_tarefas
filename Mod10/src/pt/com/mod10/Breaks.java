package pt.com.mod10;

public class Breaks {
    public static void main(String[] args) {
        for(int jogador=1; jogador<=300; jogador++) {
            System.out.println("break nesse jogador " + jogador);
            if(jogador==34)
                break;
        }
    }
}
