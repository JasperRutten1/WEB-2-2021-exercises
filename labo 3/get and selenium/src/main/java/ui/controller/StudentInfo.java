package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "StudentInfo", value = "/StudentInfo")
public class StudentInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("naam");
        String studentFirstName = request.getParameter("voornaam");

        Student student = new StudentDB().getStudent(studentName, studentFirstName);

        if(student != null){
            request.setAttribute("found", student);
            RequestDispatcher view = request.getRequestDispatcher("gevonden.jsp");
            view.forward(request, response);
        }
        else{
            RequestDispatcher view = request.getRequestDispatcher("nietGevonden.jsp");
            view.forward(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
