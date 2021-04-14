package hw.lss.prototype;

public abstract class Shoes {
    public String name;
    public int size;
    public String material;

    public Shoes() {}

    public Shoes(Shoes shoes) {
        this.name = shoes.name;
        this.size = shoes.size;
        this.material = shoes.material;
    }

    public abstract Shoes clone();

    public boolean equalsAll(Shoes shoes){
        return ((this.name.equals(shoes.name)) &&
                (this.size == shoes.size) &&
                (this.material.equals(shoes.material)));
    }
}
