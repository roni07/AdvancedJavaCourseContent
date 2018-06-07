package dbconsoleapplication;

import java.util.List;

public interface ProductDAO {
    public void insertProduct(Product product);
    public List<Product> getAllProduct();
    public void getProduct(int productId);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);
}
