package dbconsoleapplication;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDaoFileImplementation implements ProductDAO {

    @Override
    public void insertProduct(Product product) {
        try {
            RandomAccessFile productFile = ConnectionFileIOSingleton.getFileConnection();
            productFile.seek(productFile.length());
            productFile.writeBytes("productId = " + product.getProductId() + "\n");
            productFile.writeBytes("productName = " + product.getProductName() + "\n");
            productFile.writeBytes("unitPrice = " + product.getUnitPrice() + "\n");
            productFile.close();
        } catch (IOException ex) {
            Logger.getLogger(ProductDaoFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public void getProduct(int productId) {
    }

    @Override
    public void deleteProduct(Product product) {
    }

    @Override
    public void updateProduct(Product product) {
    }

}
