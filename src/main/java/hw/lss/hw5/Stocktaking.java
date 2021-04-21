package hw.lss.hw5;

import java.util.HashMap;

public abstract class Stocktaking {
    private HashMap<String, Integer> stockItems;

    public Stocktaking() {
        this.stockItems = new HashMap<>();
    }

    protected void addStockItems(String art, Integer num) {
        stockItems.put(art, num);
    }

    public final HashMap<String, Integer> getAllStocktaking(){ //паттерн Шаблонный метод/Template Method
        return stockItems;
    }

    public abstract HashMap<String, Integer> discrepancy(HashMap<String, Integer> stockItems); //паттерн Стратегия/Strategy
}
