package daoLayer.order.impl;

import DataBase.DBConnection;
import bisinessLayer.model.*;
import daoLayer.order.orderDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class orderDaoimpl implements orderDao {
    public  ObservableList<Product> getProductID(){
       ObservableList<Product> product1= FXCollections.observableArrayList();

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM PRODUCT");
            while (resultSet.next()) {
                Product productDetails = new Product(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)
                );
                product1.add(productDetails);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product1;
    }

    public String getOrderID() {
        String nextOrderID = null;

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Orders");
            while (resultSet.next()) {
                nextOrderID = resultSet.getString(1).toString();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nextOrderID;
    }
    public Boolean placeOrder(PlaceOrder order){
        if(saveCustomer(order.getCustomer())){
            if(saveOrders(order.getOrders())){
                if(saveorderDetails(order.getOrderDetails())){
                        return true;
                }
            }
        }
        return false;
    }

    private boolean saveProductQuantity(Integer productQuantity,String productID) {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm  = connection.prepareStatement("UPDATE PRODUCT SET QuantityOnHand=QuantityOnHand-? WHERE ProductID=?");

            psTm.setInt(1, productQuantity);
            psTm.setString(2, productID);

            boolean isItemAdd= (psTm.executeUpdate()>0);
            if(isItemAdd){
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    private boolean saveorderDetails(ObservableList<Table> orderDetails) {
        Connection connection = DBConnection.getInstance().getConnection();

        L1:for (Table details:orderDetails) {
            try {
                PreparedStatement psTm = connection.prepareStatement("INSERT INTO ORDERDETAILS VALUES(?,?,?,?,?)");
                psTm.setString(1, details.getOrderID());
                psTm.setString(2, details.getProductId());
                psTm.setInt(3, details.getQuantity());
                psTm.setDouble(4, details.getTotal());
                psTm.setString(5, details.getPaymentMethod());

                if (psTm.executeUpdate() < 0){
                   return false;
                }

                if(saveProductQuantity(details.getQuantity(),details.getProductId())==false){
                   return false;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    private boolean saveOrders(Orders orders) {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm= connection.prepareStatement("INSERT INTO ORDERS VALUES(?,?,?,?,?,?)");
            psTm.setString(1, orders.getOrderID());
            psTm.setString(2, orders.getUserID());
            psTm.setString(3, orders.getCustomerID());
            psTm.setDouble(4, orders.getTotal());
            psTm.setString(5, orders.getOrderDate());
            psTm.setString(6, orders.getOrderTime());

            return psTm.executeUpdate()>0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Boolean saveCustomer(Customer customer) {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm = connection.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?)");
            psTm.setString(1, customer.getCustomerID());
            psTm.setString(2, customer.getCustomerName());
            psTm.setString(3, customer.getCustomerEmail());

            return psTm.executeUpdate()>0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public ObservableList<Table>  getrRetunOrderDetails(String Id){
        ObservableList<Table> returnOrder=FXCollections.observableArrayList();
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM OrderDetails WHERE OrderID=?");

            psTm.setString(1, Id);

            ResultSet resultSet=psTm.executeQuery();
            while (resultSet.next()) {
                Table table=new Table(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(4),
                        resultSet.getInt(3),
                        resultSet.getString(5)
                );
                psTm  = connection.prepareStatement("SELECT * FROM Product WHERE PRODUCTID=?");
                psTm.setString(1, resultSet.getString(2));

                ResultSet resultSet1=psTm.executeQuery();
                while (resultSet1.next()){
                    table.setProductDescription(resultSet1.getString(2));
                }
                returnOrder.add(table);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return returnOrder;
    }

    public Boolean returnOrder(ReturnOrder returnOrder) {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement psTm = connection.prepareStatement("INSERT INTO ReturnOrders VALUES(?,?,?)");
            psTm.setString(1, returnOrder.getOrderID());
            psTm.setString(2, returnOrder.getProductID());
            psTm.setInt(3, returnOrder.getQuantity());

            if (psTm.executeUpdate() > 0) {
                psTm = connection.prepareStatement("UPDATE Orders SET Total=Total-? WHERE OrderID=?");

                psTm.setDouble(1, returnOrder.getReturnTotal());
                psTm.setString(2, returnOrder.getOrderID());

                if (psTm.executeUpdate() > 0) {
                    psTm = connection.prepareStatement("UPDATE OrderDetails SET ProductQuantity=ProductQuantity-? , ProductCost=ProductCost-? WHERE OrderID=?  AND  ProductID=? ");

                    psTm.setInt(1, returnOrder.getQuantity());
                    psTm.setDouble(2, returnOrder.getReturnTotal());
                    psTm.setString(3, returnOrder.getOrderID());
                    psTm.setString(4, returnOrder.getProductID());

                    if (psTm.executeUpdate() > 0) {
                        psTm = connection.prepareStatement("UPDATE Product SET QuantityonHand=QuantityonHand-?  WHERE ProductID=? ");

                        psTm.setInt(1, returnOrder.getQuantity());
                        psTm.setString(2, returnOrder.getProductID());

                        return psTm.executeUpdate() > 0;
                    }

                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
     }
        return false;
    }

}

