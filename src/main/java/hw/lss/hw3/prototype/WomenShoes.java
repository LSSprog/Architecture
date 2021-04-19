package hw.lss.hw3.prototype;

public class WomenShoes extends Shoes implements Cloneable{
    public int heel;

    public WomenShoes() {}

    public WomenShoes(WomenShoes shoes) {
        super(shoes);
        this.heel = shoes.heel;
    }

    @Override
    public Shoes clone() {
        return new WomenShoes(this);
    }

    public boolean equalsW(WomenShoes shoes) {
        return (this.equalsAll(shoes)) &&
                (this.heel == shoes.heel);
    }

    @Override
    public String toString() {
        return "WomenShoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", heel=" + heel +
                '}';
    }
}
