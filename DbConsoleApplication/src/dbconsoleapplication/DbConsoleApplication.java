package dbconsoleapplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConsoleApplication {
    
    public DbConsoleApplication() {
//        Single Product
        Product product = new Product(17, "Walton", 30000);
        System.out.println(product);
        ProductDAO productDao = new DAOImplementation();
//        ProductDAO productFileDao = new ProductDaoFileImplementation();
//        productFileDao.insertProduct(product);

        productDao.insertProduct(product);

        /*   List<Product> productList = productDAO.getAllProduct();

        for (Product product : productList)
            System.out.println(product);
            productDAO.deleteProduct(product);
            productDAO.updateProduct(product);
       
        productDAO.getProduct(20);*/
    }
    
    public static void main(String[] args) {
        new DbConsoleApplication();
    }
    
}
