package daoLayer.product.impl;

import DataBase.DBConnection;
import bisinessLayer.model.Product;
import bisinessLayer.model.Supplier;
import daoLayer.product.ProductDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {
    public Product getProductdetails(String value,String method) {
        Product productDetails = null;
        String productCategoryID="0";
        String Id="0";
        Connection connection = DBConnection.getInstance().getConnection();


        try {
            if(method.equals("byID")) {
                PreparedStatement psTm = connection.prepareStatement("SELECT * FROM PRODUCT WHERE ProductID = ?");

                psTm.setString(1, value);

                ResultSet resultSet = psTm.executeQuery();
                if (resultSet.next()) {
                    productDetails = new Product(
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5)
                    );
                }
                Id=value;
            }else {
                PreparedStatement psTm = connection.prepareStatement("SELECT * FROM PRODUCT WHERE ProductName = ?");

                psTm.setString(1, value);

                ResultSet resultSet = psTm.executeQuery();
                if (resultSet.next()) {
                    productDetails = new Product(
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5)
                    );
                }
                Id=productDetails.getProductID();
            }

            PreparedStatement psTm  = connection.prepareStatement("SELECT * FROM ProductCategory WHERE ProductID =?");
            psTm.setString(1, Id);
            ResultSet resultSet2=psTm.executeQuery();
            while (resultSet2.next()) {
                productCategoryID=resultSet2.getString(1);
            }


            psTm  = connection.prepareStatement("SELECT * FROM Category WHERE CategoryID =?");
            psTm.setString(1, productCategoryID);
            ResultSet resultSet3=psTm.executeQuery();
            while (resultSet3.next()) {
                productDetails.setCategory(resultSet3.getString(2));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productDetails;
    }

    public boolean addNewProduct(Product productDetails){
        Connection connection = DBConnection.getInstance().getConnection();
        String categortID="0";

        try {
            PreparedStatement psTm= connection.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?)");
            psTm.setString(1, productDetails.getProductID());
            psTm.setString(2, productDetails.getProductName());
            psTm.setString(3, productDetails.getSize());
            psTm.setInt(4, productDetails.getQuantityOnHand());
            psTm.setInt(5, productDetails.getUnitPrice());

            Boolean isAdd= psTm.executeUpdate()>0;
            if(isAdd){
                psTm= connection.prepareStatement("SELECT * FROM Category WHERE CategoryName =?");
                psTm.setString(1, productDetails.getCategory());
                ResultSet resultSet=psTm.executeQuery();
                while (resultSet.next()) {
                    categortID=resultSet.getString(1);
                }

                psTm= connection.prepareStatement("INSERT INTO PRODUCTCATEGORY VALUES(?,?)");
                psTm.setString(1, categortID);
                psTm.setString(2, productDetails.getProductID());
                return psTm.executeUpdate()>0;

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public String getProductID(){
        int idValue=0;

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM PRODUCT");
            while (resultSet.next()) {
                String ID = resultSet.getString(1).toString();
                ID=ID.substring(1);
                if(idValue<Integer.parseInt(ID)){
                    idValue=Integer.parseInt(ID);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return idValue+"";
    }

    public ObservableList<String> getCategoryList(){
        ObservableList<String> categoryList=FXCollections.observableArrayList();
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Category");
            while (resultSet.next()) {
                categoryList.add(resultSet.getString(2).toString());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categoryList;
    }

    public Boolean removeProduct(String productID){
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement psTm = connection.prepareStatement("DELETE FROM SupplierDetails WHERE productID=?");
            psTm.setString(1,productID);

            Boolean isremoved = (psTm.executeUpdate() > 0);
            if(isremoved){
                 psTm = connection.prepareStatement("DELETE FROM ProductCategory WHERE productID=?");
                 psTm.setString(1,productID);

                isremoved = (psTm.executeUpdate() > 0);
                if(isremoved){
                    psTm = connection.prepareStatement("DELETE FROM Product WHERE productID=?");
                    psTm.setString(1,productID);

                    return (psTm.executeUpdate() > 0);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public Boolean UpdateProduct(Product updatedProduct){
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement psTm = connection.prepareStatement("UPDATE Product SET  ProductName = ?,size =?,QuantityOnHand =? ,unitPrice =? WHERE ProductID = ?");

            psTm.setString(1,updatedProduct.getProductName());
            psTm.setString(2,updatedProduct.getSize());
            psTm.setInt(3,updatedProduct.getQuantityOnHand());
            psTm.setInt(4,updatedProduct.getUnitPrice());
            psTm.setString(5,updatedProduct.getProductID());

            return psTm.executeUpdate() > 0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
