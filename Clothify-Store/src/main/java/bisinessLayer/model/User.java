package bisinessLayer.model;

import lombok.ToString;

@ToString
public class User {
    private String name;
    private String EmployeeID;
    private String userID;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String employeeID, String userID, String email) {
        this.name = name;
        this.EmployeeID = employeeID;
        this.userID = userID;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
