package com.studentfilterapp.controller;

import com.studentapp.dao.StudentDAO;
import com.studentapp.dao.StudentDAOImpl;
import com.studentapp.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.getAllStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("views/table.jsp").forward(request, response);
    }
}
