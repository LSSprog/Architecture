package hw.lss.hw5;

import java.util.HashMap;
import java.util.Map;

public class ShortfallStock extends Stocktaking{
        private HashMap<String,Integer> shortfallStockItems;

    public ShortfallStock() {
        this.shortfallStockItems = new HashMap<>();
    }

    @Override
        public HashMap<String, Integer> discrepancy(HashMap<String, Integer> stockItems) {
            // какая-то нормальная логика вычисления НЕДОСТАЧИ
            for (Map.Entry si: stockItems.entrySet()) {

                if ((Integer)si.getValue() < 1) {
                    shortfallStockItems.put((String) si.getKey(), (Integer) si.getValue());
                }
            }
            return shortfallStockItems;
        }
}

