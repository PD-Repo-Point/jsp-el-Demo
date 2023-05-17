package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Address;
import model.Employee;

import java.io.IOException;

@WebServlet("/getEmployeeDetails")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = new Employee(
                "1001",
                "Sonia",
                "Patel");

        Address address = new Address(
                "MG Road",
                "Gangtok",
                "Sikkim");

        employee.setAddress(address);

        //Request - Scope
        req.setAttribute("emp",employee);
        req.getRequestDispatcher("employee.jsp").forward(req,resp);

    }
}
