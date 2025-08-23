package bisinessLayer.model;

import lombok.ToString;

@ToString
public class Table {
    private String OrderID;
    private String ProductId;
    private String ProductDescription;
    private Integer total;
    private Integer quantity;
    private String paymentMethod;

    public Table(String orderID, String productId, String productDescription, Integer total, Integer quantity, String paymentMethod) {
        OrderID = orderID;
        ProductId = productId;
        ProductDescription = productDescription;
        this.total = total;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public Table(String orderID, String productId,  Integer total, Integer quantity, String paymentMethod) {
        this.OrderID = orderID;
        this.ProductId = productId;
        this.total = total;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getOrderID() {
        return OrderID;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
