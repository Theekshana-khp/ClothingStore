package bisinessLayer.employee;

import bisinessLayer.SuperBo;
import bisinessLayer.model.Employee;
import bisinessLayer.model.User;
import javafx.collections.ObservableList;

public interface EmpolyeeBo extends SuperBo {
    public Boolean AddEmployee(Employee newEmployee , Boolean isUser);
    public Employee getEmployeeDetails(String value,String method);
    public Boolean UpdateEmployee(Employee employee);
    public Boolean delateEmployee(String ID);
    public ObservableList<User> getUsersDetails();
}
