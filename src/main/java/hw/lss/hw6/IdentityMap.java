package hw.lss.hw6;

import java.util.HashMap;

public class IdentityMap {
    private HashMap<Integer, Product> productMap;

    public IdentityMap() {
        this.productMap = new HashMap<>();
    }

    public void addProductToMap(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product getProductFromMap(Integer id){
        if (productMap.containsKey(id)) {
            return productMap.get(id);
        }
        return null;
    }
}
