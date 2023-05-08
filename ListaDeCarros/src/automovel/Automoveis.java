package automovel;

import java.util.ArrayList;
import java.util.List;

public class Automoveis {

    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<Carro>();

        KiaMotors carro1 = new KiaMotors("Kia", "Sportage", 160, true);
        Ford carro2 = new Ford("Ford", "Focus", 135, true);
        Mercedes carro3 = new Mercedes("Mercedes", "I3", 85, true);

        carroList.add(carro1);
        carroList.add(carro2);
        carroList.add(carro3);

        for (Carro carro : carroList) {
            System.out.println(carro);
        }
    }
}
