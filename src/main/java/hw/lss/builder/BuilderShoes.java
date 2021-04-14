package hw.lss.builder;

import hw.lss.builder.params.Heel;
import hw.lss.builder.params.Material;
import hw.lss.builder.params.Size;
import hw.lss.builder.params.Type;

public interface BuilderShoes {
    void setType(Type type);
    void setMaterial(Material material);
    void setSize(Size size);
    void setHeel(Heel heel);
}
