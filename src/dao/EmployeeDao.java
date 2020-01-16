package dao;

import model.Employee;

public interface EmployeeDao {
    void  insertEmployee(Employee employee);
    Employee getEmployee(String userName, String password);
    boolean validUser(String userName, String password);
}
