package daoLayer.supplier.impl;

import DataBase.DBConnection;
import bisinessLayer.model.Orders;
import bisinessLayer.model.Supplier;
import bisinessLayer.model.Suppliertable;
import daoLayer.supplier.supplierDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class supplierDaoImpl implements supplierDao {

    public String getSupplierID(){
        int idValue=0;

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM SUPPLIER");
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

    public Boolean saveNewCustomer(Supplier supplier) {
        Connection connection = DBConnection.getInstance().getConnection();
        
        try {
            PreparedStatement psTm= connection.prepareStatement("INSERT INTO SUPPLIER VALUES(?,?,?,?)");
            psTm.setString(1, supplier.getSupplierId());
            psTm.setString(2, supplier.getSupplierName());
            psTm.setString(3, supplier.getCompany());
            psTm.setString(4, supplier.getSupplierEmail());

            return psTm.executeUpdate()>0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Supplier getSupplierDetailsByID (String method) {
        Supplier supplierDetails = null;
        ObservableList<String> productDetails =  FXCollections.observableArrayList();;

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM Supplier WHERE SupplerID = ?");

            psTm.setString(1, method);

            ResultSet resultSet=psTm.executeQuery();
            if (resultSet.next()) { 
                supplierDetails = new Supplier(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(4),
                        resultSet.getString(3)
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM SupplierDetails WHERE SupplerID =?");

            psTm.setString(1, method);

            ResultSet resultSet=psTm.executeQuery();
            while (resultSet.next()) {
                productDetails.add(resultSet.getString(2).toString());
            }

            supplierDetails.setProductList(productDetails);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return supplierDetails;
    }

    public Supplier getSupplierDetailsByName (String method) {
        Supplier supplierDetails = null;
        ObservableList<String> productDetails = FXCollections.observableArrayList();

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM Supplier WHERE SupplierName = ?");

            psTm.setString(1, method);

            ResultSet resultSet=psTm.executeQuery();
            if (resultSet.next()) {
                supplierDetails = new Supplier(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(4),
                        resultSet.getString(3)
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM SupplierDetails WHERE SupplerID =?");

            psTm.setString(1, supplierDetails.getSupplierId());

            ResultSet resultSet=psTm.executeQuery();
            while (resultSet.next()) {
                productDetails.add(resultSet.getString(2).toString());
            }

            supplierDetails.setProductList(productDetails);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return supplierDetails;
    }

    public Boolean updateSupplierProducts(ObservableList<Suppliertable> products,String supplierID){
        Connection connection = DBConnection.getInstance().getConnection();

        for(Suppliertable product:products) {
            try {
                PreparedStatement psTm = connection.prepareStatement("UPDATE Supplierdetails SET SupplerID=? WHERE ProductID=?");

                psTm.setString(1,supplierID );
                psTm.setString(2, product.getProductID());

                boolean isItemAdd = (psTm.executeUpdate() > 0);
                if (isItemAdd) {
                    return true;
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public Boolean removeSupplier(Supplier supplier){
        Connection connection = DBConnection.getInstance().getConnection();
        boolean isItemAdd = false;
        
        ObservableList<String> productlist=supplier.getProductList();
        for(String product:productlist) {
            try {
                PreparedStatement psTm = connection.prepareStatement("UPDATE Supplierdetails SET SupplerID=? WHERE ProductID=?");

                psTm.setString(1,"0" );
                psTm.setString(2,product);

                isItemAdd = (psTm.executeUpdate() > 0);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(isItemAdd) {
            try {
                PreparedStatement psTm2 = connection.prepareStatement("DELETE FROM Supplier WHERE SupplerID=?");

                psTm2.setString(1, supplier.getSupplierId());

                boolean isAdd = (psTm2.executeUpdate() > 0);
                if (isAdd) {
                    return true;
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }
}
