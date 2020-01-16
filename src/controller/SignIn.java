package controller;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signin")
public class SignIn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //PrintWriter out = response.getWriter();
        //out.print("user name :" + request.getParameter("loginName"));

        String userName = request.getParameter("name");
        String password = request.getParameter("password");
       request.setAttribute("username",request.getParameter("name"));
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = employeeDao.getEmployee(userName,password);
        if(employee != null) {
            HttpSession session = request.getSession();
            session.setAttribute("employee", employee);
            request.setAttribute("message",userName);
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else {
            request.setAttribute("message","Wrong username or password");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("user name :"+ request.getParameter("loginName")+"\n password :" + request.getParameter("password"));
    }
}
