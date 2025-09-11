package bisinessLayer.employee.impl;

import bisinessLayer.employee.EmpolyeeBo;
import bisinessLayer.model.Employee;
import bisinessLayer.model.User;
import daoLayer.DaoFactory;
import daoLayer.employee.EmployeeDao;
import javafx.collections.ObservableList;
import util.DaoType;

public class EmployeeBoImpl implements EmpolyeeBo{

   EmployeeDao instence= DaoFactory.getInstance().getDao(DaoType.Employee);
    public Boolean AddEmployee(Employee newEmployee, Boolean isUser) {
        String userID = null;

        newEmployee.setID(getEmployeeID());
        if(isUser){
         userID=getUserID();
        }
        return instence.SaveEmployee(newEmployee,isUser,userID);

    }

    public String getEmployeeID(){
        int pastEmployeeID=instence.getEmployeeID();
        pastEmployeeID++;
        return pastEmployeeID+"";
    }
    public String getUserID(){
        int pastUserID=instence.getUserID();
        pastUserID++;
        return pastUserID+"";
    }

    public Employee getEmployeeDetails(String value,String method){
        return instence.getEmployeeDetails(value,method);
    }
    public Boolean UpdateEmployee(Employee employee){
        return instence.updateEmployee(employee);
    }
    public Boolean delateEmployee(String ID){
        return instence.delateemployee(ID);
    }
    public ObservableList<User> getUsersDetails(){
        return instence.getUserInformation();
    }
}
