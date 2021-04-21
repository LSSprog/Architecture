package hw.lss.hw5;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {

        Stocktaking stock = new Stocktaking() {
            @Override
            public HashMap<String, Integer> discrepancy(HashMap<String, Integer> stockItems) {
                return null;
            }
        };
        stock.addStockItems("101", 2);
        stock.addStockItems("102", 1);
        stock.addStockItems("103", 3);
        stock.addStockItems("104", 0);

        //получаем списков излишков
        SurplusStock surplusStock = new SurplusStock();
        HashMap<String, Integer> list1 = surplusStock.discrepancy(stock.getAllStocktaking());
        System.out.println(list1);

        //получаем список недостач
        ShortfallStock shortfallStock = new ShortfallStock();
        HashMap<String, Integer> list2 = shortfallStock.discrepancy(stock.getAllStocktaking());
        System.out.println(list2);
    }
}
