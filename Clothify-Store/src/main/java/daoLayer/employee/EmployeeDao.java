package daoLayer.employee;

import bisinessLayer.model.Employee;
import bisinessLayer.model.User;
import daoLayer.SuperDao;
import javafx.collections.ObservableList;

public interface EmployeeDao extends SuperDao {
    public Boolean SaveEmployee(Employee newEmployee , Boolean isSelected,String uderID);
    public Integer getEmployeeID();
    public Integer getUserID();
    public Employee getEmployeeDetails(String value,String method);
    public Boolean updateEmployee(Employee employee);
    public Boolean delateemployee(String Id);
    public ObservableList<User> getUserInformation();
}
