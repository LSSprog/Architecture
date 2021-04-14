package hw.lss.builder;

import hw.lss.builder.params.Heel;
import hw.lss.builder.params.Material;
import hw.lss.builder.params.Size;
import hw.lss.builder.params.Type;

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
