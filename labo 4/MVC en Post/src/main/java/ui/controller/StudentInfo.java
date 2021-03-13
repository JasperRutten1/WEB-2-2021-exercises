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
    public StudentDB studentData = new StudentDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("naam");
        String studentFirstName = request.getParameter("voornaam");

        Student student = studentData.getStudent(studentName, studentFirstName);

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
        String name = request.getParameter("Naam");
        String firstName = request.getParameter("Voornaam");
        int age = -1;
        try{
            age = Integer.parseInt(request.getParameter("Leeftijd"));
        }
        catch (NumberFormatException ignored){

        }
        String studies = request.getParameter("Studierichting");

        if(name != null && firstName != null && age > 0 && studies != null){
            studentData.addStudent(new Student(name, firstName, studies, age));
            request.setAttribute("database", this.studentData);
            RequestDispatcher view = request.getRequestDispatcher("studentInfoOverzicht.jsp");
            view.forward(request, response);
        }
        else{
            request.setAttribute("Error", true);
            RequestDispatcher view = request.getRequestDispatcher("studentform.jsp");
            view.forward(request, response);
        }
    }
}
