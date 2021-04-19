package hw.lss.hw3.builder;

import hw.lss.hw3.builder.params.Heel;
import hw.lss.hw3.builder.params.Material;
import hw.lss.hw3.builder.params.Size;
import hw.lss.hw3.builder.params.Type;

public interface BuilderShoes {
    void setType(Type type);
    void setMaterial(Material material);
    void setSize(Size size);
    void setHeel(Heel heel);
}
