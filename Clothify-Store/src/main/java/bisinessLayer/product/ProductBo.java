package bisinessLayer.product;

import bisinessLayer.SuperBo;
import bisinessLayer.model.Product;
import javafx.collections.ObservableList;

public interface ProductBo extends SuperBo {
    public Product getProductdetails(String value,String method);
    public boolean addNewProduct(Product productDetals);
    public String getProductID();
    public ObservableList<String> getCategoryList();
    public Boolean removeproduct(String productID);
    public boolean UpdateProduct(Product updatedProduct);
}
