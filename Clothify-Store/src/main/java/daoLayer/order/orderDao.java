package daoLayer.order;

import bisinessLayer.model.PlaceOrder;
import bisinessLayer.model.Product;
import bisinessLayer.model.ReturnOrder;
import bisinessLayer.model.Table;
import daoLayer.CrudDao;
import javafx.collections.ObservableList;

public interface orderDao extends CrudDao {
    public ObservableList<Product> getProductID();

    public String getOrderID();

    public Boolean placeOrder(PlaceOrder order);
    public ObservableList<Table>  getrRetunOrderDetails(String Id);
    public Boolean returnOrder(ReturnOrder returnOrder);
}
