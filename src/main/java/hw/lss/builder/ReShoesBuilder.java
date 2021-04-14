package hw.lss.builder;

import hw.lss.builder.params.Heel;
import hw.lss.builder.params.Material;
import hw.lss.builder.params.Size;
import hw.lss.builder.params.Type;

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
