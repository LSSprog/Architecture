package hw.lss.hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) { // задача разложить по размерам всю обувь в магазине

        ShoesRussia shoes1 = new ShoesRussia(27.0);
        ShoesRussia shoes2 = new ShoesRussia(28.0);
        ShoesEuropeInCm shoes3 = new ShoesEuropeInCm(43.0);

        List<ShoesCentimeter> listShoes = new ArrayList<>();
        listShoes.add(shoes1);
        listShoes.add(shoes2);
        listShoes.add(shoes3);

        printListShoes(listShoes);

        listShoes.sort(Comparator.comparingDouble(ShoesCentimeter :: getSizeCm));

        printListShoes(listShoes);

    }

    private static void printListShoes(List<ShoesCentimeter> listShoes) {
        for (ShoesCentimeter ls:listShoes) {
            System.out.println(ls.getSizeCm());
        }

    }
}
