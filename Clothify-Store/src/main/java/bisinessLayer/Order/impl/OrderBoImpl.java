package bisinessLayer.Order.impl;

import bisinessLayer.BoFactory;
import bisinessLayer.Customer.CustomerBo;
import bisinessLayer.Order.OrderBo;
import bisinessLayer.model.PlaceOrder;
import bisinessLayer.model.Product;
import bisinessLayer.model.ReturnOrder;
import bisinessLayer.model.Table;
import daoLayer.DaoFactory;
import daoLayer.order.orderDao;
import javafx.collections.ObservableList;
import util.BoType;
import util.DaoType;

public class OrderBoImpl implements OrderBo {

    orderDao instence= DaoFactory.getInstance().getDao(DaoType.ORDER);
    CustomerBo customerInstance= BoFactory.getInstence().getBo(BoType.CUSTOMER);

    public ObservableList<Product> getProduct(){
        return instence.getProductID();
    }

    public String getOrderID(){
        String currentOrderID= instence.getOrderID();
        String OrderID= currentOrderID.charAt(1)+""+currentOrderID.charAt(2)+currentOrderID.charAt(3)+currentOrderID.charAt(4);
        Integer newOrderValue=Integer.parseInt(OrderID)+1;
        if(newOrderValue<=9){
            return "C000" + newOrderValue;
        } else if(newOrderValue<=99) {
            return "C00" + newOrderValue;
        }else if(newOrderValue<=999){
            return "C0" + newOrderValue;
        }else if (newOrderValue<=9999) {
            return "C" + newOrderValue;
        }else{
            return newOrderValue+"";
        }
    }

    public Boolean placeOrder(PlaceOrder order){
        String customerID=customerInstance.getCustomerID();
        order.getCustomer().setCustomerID(customerID);
        order.getOrders().setCustomerID(customerID);
        return instence.placeOrder(order);

    }

    public ObservableList<Table>  getReturnOrderDetails(String Id){
        return instence.getrRetunOrderDetails(Id);
    }

    public Boolean returnOrder(ReturnOrder returnOrder){
        return instence.returnOrder(returnOrder);

    }
}
