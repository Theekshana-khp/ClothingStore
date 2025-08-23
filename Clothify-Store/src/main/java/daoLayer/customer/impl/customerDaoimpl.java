package daoLayer.customer.impl;

import DataBase.DBConnection;
import bisinessLayer.model.PlaceOrder;
import bisinessLayer.model.Product;
import daoLayer.customer.customerDao;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class customerDaoimpl implements customerDao {

    public String getCustomerID(){
        int idValue=0;

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Customer");
            while (resultSet.next()) {
                String ID = resultSet.getString(1).toString();
                if(idValue<Integer.parseInt(ID)){
                    idValue=Integer.parseInt(ID);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return idValue+"";
    }

}
