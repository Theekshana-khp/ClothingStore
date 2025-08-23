package bisinessLayer.model;

import javafx.collections.ObservableList;

public class PlaceOrder {
    Customer customer;
    Orders orders;
    ObservableList<Table> orderDetails;
    public PlaceOrder(Customer customer, Orders orders, ObservableList<Table> orderDetails){
        this.customer = customer;
        this.orders = orders;
        this.orderDetails = orderDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Orders getOrders() {
        return orders;
    }

    public ObservableList<Table> getOrderDetails() {
        return orderDetails;
    }

}
