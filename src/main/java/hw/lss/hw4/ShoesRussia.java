package hw.lss.hw4;

public class ShoesRussia implements ShoesCentimeter{
    private double sizeRu;

    public ShoesRussia(double size) {
        this.sizeRu = size;
    }

    @Override
    public double getSizeCm() {
        return sizeRu;
    }
}
