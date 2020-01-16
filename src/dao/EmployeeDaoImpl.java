package dao;

import datalayer.ConnectionProvider;
import model.Employee;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void insertEmployee(Employee employee) {
        Connection connection = null;
        try{
            connection = ConnectionProvider.getConnection();
            String query = "INSERT INTO empdetails(EmpId, FirstName, LastName, Contact, Email, Username, Password) values(null,?,?,?,?,?,?)";
            System.out.println("connect "+ connection);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,employee.getFirstName() );
            preparedStatement.setString(2,employee.getLastName());
            preparedStatement.setString(3,employee.getContact());
            preparedStatement.setString(4,employee.getEmail());
            preparedStatement.setString(5,employee.getUserName());
            preparedStatement.setString(6,employee.getPassword());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public Employee getEmployee(String userName, String password) {
        Connection connection = null;
        try{
            connection = ConnectionProvider.getConnection();
            String query = "SELECT * FROM empdetails where Username = ? and Password = ?";
            System.out.println("connect "+ connection);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userName );
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            if (resultSet.next()) {
                employee = new Employee();
                employee.setFirstName(resultSet.getString("Username"));
                employee.setEmployeeId(resultSet.getInt("EmpId"));
                employee.setFirstName(resultSet.getString("FirstName"));
                employee.setLastName(resultSet.getString("LastName"));
                employee.setContact(resultSet.getString("Contact"));
                employee.setEmail(resultSet.getString("Email"));
                return employee;
            }

            preparedStatement.close();

        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }

    public boolean validUser(String userName, String password){
        Connection connection = null;
        try{
            connection = ConnectionProvider.getConnection();
            String query = "SELECT * FROM empdetails where Username = ? and Password = ?";
            System.out.println("connect "+ connection);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userName );
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return true;
            preparedStatement.close();

        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }

}
