package bisinessLayer.model;

import lombok.ToString;

@ToString
public class Customer {

    private String customerID;
    private String customerEmail;
    private String customerName;

    public Customer( String customerEmail, String customerName) {
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
