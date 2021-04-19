package hw.lss.hw4;

import java.util.HashMap;

public class ShoesEuropeInCm extends ShoesEurope implements ShoesCentimeter{
    private HashMap<Double, Double> sizeMatch = new HashMap<Double, Double>() {{
        put(38.0, 24.5);
        put(39.0, 25.0);
        put(40.0, 25.5);
        put(40.5, 26.0);
        put(41.0, 26.5);
        put(42.0, 27.0);
        put(43.0, 27.5);
        put(43.5, 28.0);
        put(44.0, 28.5);
    }};

    public ShoesEuropeInCm(double size) {
        super(size);
    }

    @Override
    public double getSizeCm() {
        return sizeMatch.get(getSizeEu());
    }
}
