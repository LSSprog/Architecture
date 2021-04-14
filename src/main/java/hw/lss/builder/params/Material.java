package hw.lss.builder.params;

public class Material {
    public String material;

    public Material(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "" + material;
    }
}
