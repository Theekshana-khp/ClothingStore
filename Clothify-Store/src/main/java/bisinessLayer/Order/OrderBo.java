package bisinessLayer.Order;

import bisinessLayer.SuperBo;
import bisinessLayer.model.PlaceOrder;
import bisinessLayer.model.Product;
import bisinessLayer.model.ReturnOrder;
import bisinessLayer.model.Table;
import javafx.collections.ObservableList;

public interface OrderBo extends SuperBo {
    public ObservableList<Product> getProduct();
    public String getOrderID();
    public Boolean placeOrder(PlaceOrder order);
    public ObservableList<Table> getReturnOrderDetails(String Id);
    public Boolean returnOrder(ReturnOrder returnOrder);
}
