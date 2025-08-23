package bisinessLayer.model;

import javafx.scene.control.TextField;
import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
public class Product {
    private String productID;
    private String productName;
    private String Size;
    private Integer QuantityOnHand;
    private Integer unitPrice;
    private String category;

    public Product(String string, String string1, String string2, Integer anInt, Integer anInt1) {
        this.productID=string;
        this.productName=string1;
        this.Size=string2;
        this.QuantityOnHand=anInt;
        this.unitPrice=anInt1;
    }

    public Product(String productName, String size, Integer quantityOnHand, Integer unitPrice, String category) {
        this.productName = productName;
        this.Size = size;
        this.QuantityOnHand = quantityOnHand;
        this.unitPrice = unitPrice;
        this.category = category;
    }



    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getSize() {
        return Size;
    }

    public Integer getQuantityOnHand() {
        return QuantityOnHand;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
