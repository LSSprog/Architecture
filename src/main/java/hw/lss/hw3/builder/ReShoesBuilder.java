package hw.lss.hw3.builder;

import hw.lss.hw3.builder.params.Heel;
import hw.lss.hw3.builder.params.Material;
import hw.lss.hw3.builder.params.Size;
import hw.lss.hw3.builder.params.Type;

public class ReShoesBuilder implements BuilderShoes{
    private Type type = new Type("Re");
    private Size size;
    private Material material;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setHeel(Heel heel) {
    }

    public Shoes create() {
        return new Shoes(type, size, material, null);
    }
}
