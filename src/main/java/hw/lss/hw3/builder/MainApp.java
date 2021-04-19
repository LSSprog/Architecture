package hw.lss.hw3.builder;

import hw.lss.hw3.builder.params.Material;
import hw.lss.hw3.builder.params.Size;

public class MainApp {
    public static void main(String[] args) {

        Material material = new Material("satin");
        Size size = new Size(19);

        ReShoesBuilder shoesBuilder = new ReShoesBuilder();
        shoesBuilder.setMaterial(material);
        shoesBuilder.setSize(size);
        Shoes newShoes = shoesBuilder.create();

        System.out.println(newShoes);
    }
}
