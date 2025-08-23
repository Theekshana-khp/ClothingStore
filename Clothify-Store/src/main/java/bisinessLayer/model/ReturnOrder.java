package bisinessLayer.model;

import lombok.ToString;

@ToString
public class ReturnOrder {
    String orderID;
    String productID;
    Integer Quantity;
    Double returnTotal;

    public ReturnOrder(String orderID, String productID, Integer quantity, Double returnTotal) {
        this.orderID = orderID;
        this.productID = productID;
        this.Quantity = quantity;
        this.returnTotal = returnTotal;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getProductID() {
        return productID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public Double getReturnTotal() {
        return returnTotal;
    }
}
