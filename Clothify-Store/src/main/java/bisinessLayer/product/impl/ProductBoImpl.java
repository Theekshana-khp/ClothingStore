package bisinessLayer.product.impl;

import bisinessLayer.model.Product;
import bisinessLayer.product.ProductBo;
import daoLayer.DaoFactory;
import daoLayer.product.ProductDao;
import javafx.collections.ObservableList;
import util.DaoType;

public class ProductBoImpl implements ProductBo {

    ProductDao instence= DaoFactory.getInstance().getDao(DaoType.PRODUCT);
    public Product getProductdetails(String value, String method) {
        return instence.getProductdetails(value,method);
    }

    public boolean addNewProduct(Product productDetals){
        productDetals.setProductID(getProductID());
        return instence.addNewProduct(productDetals);
    }
    public String getProductID() {
        String productID=instence.getProductID();
        Integer ID=Integer.parseInt(productID);
        ID=ID+1;
        if(ID<10){
            productID=("C00"+ID);
        }else if(ID<100){
            productID=("C0"+ID);
        }else if(ID<1000){
            productID=("C"+ID);
        }else{
            productID=("C"+ID);
        }

        return productID;
    }

    public ObservableList<String> getCategoryList(){
        return instence.getCategoryList();
    }

    public Boolean removeproduct(String productID){
        return instence.removeProduct(productID);
    }

    public boolean UpdateProduct(Product updatedProduct){
        return instence.UpdateProduct(updatedProduct);
    }

}
