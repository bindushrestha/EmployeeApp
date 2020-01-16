package controller;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import datalayer.ConnectionProvider;
import model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "SignUp")
public class SignUp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("inside Sign Up Servlet");

        Employee employee = new Employee();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setContact(contact);
        employee.setEmail(email);
        employee.setUserName(username);
        employee.setPassword(password);
        employeeDao.insertEmployee(employee);
        request.setAttribute("message","Registration completed. Please sign in to continue");
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
