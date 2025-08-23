package bisinessLayer.model;

import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import lombok.ToString;

@ToString
public class Supplier {
    private String supplierId;
    private String supplierName;
    private String supplierEmail;
    private String Company;

    private ObservableList<String> productList;

    public ObservableList<String> getProductList() {
        return productList;
    }

    public void setProductList(ObservableList<String> productList) {
        this.productList = productList;
    }

    public Supplier(String supplierName, String supplierEmail, String company) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.Company = company;
    }

    public Supplier(String supplierId, String supplierName, String supplierEmail, String company) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        Company = company;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getCompany() {
        return Company;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
