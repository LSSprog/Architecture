package hw.lss.hw6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

    public static void main(String[] args) {

        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver not found");
        }
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_schema", "root", "root13");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Driver registration Error");
        }

        ProductMapper productMapper = new ProductMapper(connection);
        IdentityMap identityMap = new IdentityMap();

        System.out.println(getProduct(1, productMapper, identityMap));
        System.out.println(getProduct(3, productMapper, identityMap));
    }

    private static Product getProduct(int id, ProductMapper mapper, IdentityMap cash) {
        Product product = cash.getProductFromMap(id);
        if (product == null) {
            product = mapper.getProductById(1);
            cash.addProductToMap(product);
        }
        return product;
    }
}
