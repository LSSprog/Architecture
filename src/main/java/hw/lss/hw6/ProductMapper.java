package hw.lss.hw6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {

    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product getProductById (Integer id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement
                    ("SELECT id, title, price FROM product_tbl WHERE product_id = ?");
        statement.setInt(1, id);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        resultSet.first();
        Integer productId = resultSet.getInt(1);
        String title = resultSet.getString(2);
        Integer price = resultSet.getInt(3);
        Product product = new Product(productId, title, price);
        return product;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
