package hw.lss.hw3.builder;

import hw.lss.hw3.builder.params.Heel;
import hw.lss.hw3.builder.params.Material;
import hw.lss.hw3.builder.params.Size;
import hw.lss.hw3.builder.params.Type;

public class Shoes {
    private Type type;
    private Size size;
    private Material material;
    private Heel heel;

    public Shoes(Type type, Size size, Material material, Heel heel) {
        this.type = type;
        this.size = size;
        this.material = material;
        this.heel = heel;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "type=" + type +
                ", size=" + size +
                ", material=" + material +
                ", heel=" + heel +
                '}';
    }
}
