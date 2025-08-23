package bisinessLayer.model;

import lombok.ToString;

@ToString
public class Employee {

    private String ID;
    private String name;
    private String Email;
    private String JobRole;
    private Double Salary;
    private Boolean isUser;

    public Employee(String name, String email, String jobRole, Double salary) {
        this.name = name;
        this.Email = email;
        this.JobRole = jobRole;
        this.Salary = salary;
    }

    public Employee(String ID, String name, String email, String jobRole, Double salary) {
        this.ID = ID;
        this.name = name;
        this.Email = email;
        this.JobRole = jobRole;
        this.Salary = salary;
    }

    public Employee(String name, String email, String jobRole, Double salary, Boolean isUser) {
        this.name = name;
        this.Email = email;
        this.JobRole = jobRole;
        this.Salary = salary;
        this.isUser = isUser;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getJobRole() {
        return JobRole;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getUser() {
        return isUser;
    }

    public void setUser(Boolean user) {
        isUser = user;
    }
}
