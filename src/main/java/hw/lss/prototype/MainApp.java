package hw.lss.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Shoes> shoesList = new ArrayList<>();

        WomenShoes LaW = new WomenShoes();
        LaW.name = "LaW";
        LaW.size = 24;
        LaW.material = "satin";
        LaW.heel = 7;
        shoesList.add(LaW);

        Shoes LaW2 = LaW.clone();
        shoesList.add(LaW2);

        System.out.println(Arrays.asList(shoesList));
    }
}
