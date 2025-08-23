package daoLayer.employee.impl;

import DataBase.DBConnection;
import bisinessLayer.model.Employee;
import bisinessLayer.model.Supplier;
import bisinessLayer.model.User;
import daoLayer.employee.EmployeeDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDaoImpl implements EmployeeDao {
    public Boolean SaveEmployee(Employee newEmployee, Boolean isUser, String uderID) {

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement psTm = connection.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?)");
            psTm.setString(1, newEmployee.getID());
            psTm.setString(2, newEmployee.getName());
            psTm.setString(3, newEmployee.getEmail());
            psTm.setString(4, newEmployee.getJobRole());
            psTm.setDouble(5, newEmployee.getSalary());

            if (psTm.executeUpdate() > 0) {
                if (isUser) {
                    psTm = connection.prepareStatement("INSERT INTO User VALUES(?,?,?,?,?)");
                    psTm.setString(1, newEmployee.getName());
                    psTm.setString(2, uderID);
                    psTm.setString(3, "");
                    psTm.setString(4, newEmployee.getEmail());
                    psTm.setString(5, newEmployee.getID());

                    return psTm.executeUpdate() > 0;
                } else {
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public Integer getEmployeeID() {
        int idValue = 0;

            try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM Employee");
            while (resultSet.next()) {
                String ID = resultSet.getString(1).toString();
                if (idValue < Integer.parseInt(ID)) {
                    idValue = Integer.parseInt(ID);
                }
            }
        } catch(
        SQLException e) {
            throw new RuntimeException(e);
        }
            return idValue;
    }

    public Integer getUserID() {
        int idValue = 0;

        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM User");
            while (resultSet.next()) {
                String ID = resultSet.getString(2).toString();
                if (idValue < Integer.parseInt(ID)){
                    idValue = Integer.parseInt(ID);
                }
            }
        } catch(
                SQLException e) {
            throw new RuntimeException(e);
        }
        return idValue;
    }

    public Employee getEmployeeDetails(String value,String method){
        Employee employeeDetails = null;
        Boolean isUser=false;
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            if(method.equals("byID")) {
                PreparedStatement psTm = connection.prepareStatement("SELECT * FROM Employee WHERE ID = ?");

                psTm.setString(1, value);

                ResultSet resultSet = psTm.executeQuery();
                if (resultSet.next()) {
                    employeeDetails = new Employee(
                            resultSet.getString(1).toString(),
                            resultSet.getString(2).toString(),
                            resultSet.getString(3).toString(),
                            resultSet.getString(4).toString(),
                            resultSet.getDouble(5)
                    );
                }
            }else {
                PreparedStatement psTm = connection.prepareStatement("SELECT * FROM Employee WHERE NAME = ?");

                psTm.setString(1, value);

                ResultSet resultSet = psTm.executeQuery();
                if (resultSet.next()) {
                    employeeDetails = new Employee(
                            resultSet.getString(1).toString(),
                            resultSet.getString(2).toString(),
                            resultSet.getString(3).toString(),
                            resultSet.getString(4).toString(),
                            resultSet.getDouble(5)
                    );
                }
            }
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM User");
            while (resultSet.next()) {
                String employeeID = resultSet.getString(5).toString();
                if (employeeID.equals(employeeDetails.getID())){
                    isUser=true;
                }
            }
            employeeDetails.setUser(isUser);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeDetails;
    }

    public Boolean updateEmployee(Employee employee){
        Connection connection = DBConnection.getInstance().getConnection();
        Boolean isUser=false;

        PreparedStatement psTm = null;
        try {
            psTm = connection.prepareStatement("UPDATE Employee SET  NAME =?,EMAIL =? ,JOBROLE =?,SALARY =? WHERE ID = ?");

            psTm.setString(1,employee.getName());
            psTm.setString(2,employee.getEmail());
            psTm.setString(3,employee.getJobRole());
            psTm.setDouble(4,employee.getSalary());
            psTm.setString(5,employee.getID());

            if(psTm.executeUpdate() > 0){
                ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM User");
                while (resultSet.next()) {
                    String employeeID = resultSet.getString(5).toString();
                    if (employeeID.equals(employee.getID())){
                        isUser=true;
                    }
                }
               if(employee.getUser()==isUser) {
                   return true;
               }else {
                   if(isUser==false){
                       psTm = connection.prepareStatement("INSERT INTO User VALUES(?,?,?,?,?)");

                       psTm.setString(1, employee.getName());
                       psTm.setString(2, (getUserID()+1)+"");
                       psTm.setString(3, "");
                       psTm.setString(4, employee.getEmail());
                       psTm.setString(5, employee.getID());

                       return psTm.executeUpdate() > 0;
                   }else{
                        psTm = connection.prepareStatement("DELETE FROM User WHERE EmployeeID=?");

                        psTm.setString(1, employee.getID());

                       return psTm.executeUpdate() > 0;
                   }
               }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public Boolean delateemployee(String Id){
        Boolean isUser=false;
        Connection connection = DBConnection.getInstance().getConnection();

        PreparedStatement psTm = null;
        try {
            psTm = connection.prepareStatement("DELETE FROM Employee WHERE ID=?");

            psTm.setString(1, Id);
            if( psTm.executeUpdate() > 0){
                ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM User");
                while (resultSet.next()) {
                    String employeeID = resultSet.getString(5).toString();
                    if (employeeID.equals(Id)){
                        isUser=true;
                    }
                }
                if (isUser){
                    psTm = connection.prepareStatement("DELETE FROM User WHERE EmployeeID=?");

                    psTm.setString(1,Id);

                    return psTm.executeUpdate() > 0;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public ObservableList<User> getUserInformation() {
        ObservableList<User> userDetails = FXCollections.observableArrayList();
        ResultSet resultSet = null;
        try {
            resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM User");
            while (resultSet.next()) {
                User user=new User(
                        resultSet.getString(1),
                        resultSet.getString(5),
                        resultSet.getString(2),
                        resultSet.getString(4)
                );
                user.setPassword(resultSet.getString(3));
                userDetails.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userDetails;
    }
}
