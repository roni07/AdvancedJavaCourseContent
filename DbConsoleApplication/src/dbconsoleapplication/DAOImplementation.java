package dbconsoleapplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOImplementation implements ProductDAO {

    @Override
    public void insertProduct(Product product) {

        try {
            Connection connection = ConnectionSingleton.getConnection();

          /*  RandomAccessFile input = new RandomAccessFile("product.txt", "r");
            String queryName;
            String query = "";

            while (true) {
                queryName = input.readLine();
                if (queryName == null) {
                    break;
                }
                query = input.readLine();
                if (queryName.equals("INSERT_PRODUCT")) {
                    break;
                }

            }
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setDouble(3, product.getUnitPrice());

            preparedStatement.executeUpdate();*/
            Statement statement = connection.createStatement();
            String query = String.format("insert into Product values(%d, '%s', %f);",
                    product.getProductId(), product.getProductName(), product.getUnitPrice());
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } /*catch (FileNotFoundException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();

        try {
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM product";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                int productId = rs.getInt("productId");
                String productName = rs.getString("productName");
                double unitPrice = rs.getDouble("unitPrice");

                Product product = new Product(productId, productName, unitPrice);
                productList.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

        return productList;
    }

    @Override
    public void getProduct(int productId) {

        try {
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();

            String query = "select * from product where productId = " + productId + "";
            System.out.println(productId);
            statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();

            String query = "DELETE FROM Product where productId = " + product.getProductId() + "";

            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            Connection connection = ConnectionSingleton.getConnection();
            Statement statement = connection.createStatement();

            String query = "UPDATE Product SET  productName = 'Huawei' where productId = " + product.getProductId() + " ";

            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
