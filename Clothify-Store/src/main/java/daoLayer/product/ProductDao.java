package daoLayer.product;

import bisinessLayer.model.Product;
import daoLayer.SuperDao;
import javafx.collections.ObservableList;

public interface ProductDao extends SuperDao {
    public Product getProductdetails(String value,String method);
    public boolean addNewProduct(Product productDetals);
    public String getProductID();
    public ObservableList<String> getCategoryList();
    public Boolean removeProduct(String productID);
    public Boolean UpdateProduct(Product updatedProduct);
}
