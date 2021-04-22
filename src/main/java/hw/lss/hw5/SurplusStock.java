package hw.lss.hw5;

import java.util.HashMap;
import java.util.Map;

public class SurplusStock extends Stocktaking {
    private HashMap<String,Integer> surplusStockItems;

    public SurplusStock() {
        this.surplusStockItems = new HashMap<>();
    }

    @Override
    public HashMap<String, Integer> discrepancy(HashMap<String, Integer> stockItems) {
        // какая-то нормальная логика вычисления ИЗЛИШКОВ
        for (Map.Entry si: stockItems.entrySet()) {

            if ((Integer)si.getValue() > 1) {
                surplusStockItems.put((String) si.getKey(), (Integer) si.getValue());
            }
        }
        return surplusStockItems;
    }
}
