package bisinessLayer.model;

import lombok.ToString;

@ToString
public class Suppliertable {
    String productID;
    String productDesc;

    public Suppliertable(String productID, String productDesc) {
        this.productID = productID;
        this.productDesc = productDesc;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductDesc() {
        return productDesc;
    }

}
