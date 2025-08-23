package bisinessLayer.model;

import lombok.ToString;

@ToString
public class Orders {
   private String orderID;
   private String userID;
   private String customerID;
   private Double total;
   private String orderDate;
   private String orderTime;

    public Orders(String orderID, String userID, Double total, String orderDate, String orderTime) {
        this.orderID = orderID;
        this.userID = userID;
        this.total = total;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getUserID() {
        return userID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public Double getTotal() {
        return total;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }
}
