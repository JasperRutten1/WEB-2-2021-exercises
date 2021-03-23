package domain.model.commandHandelers;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentHandler extends CommandHandler{
    protected AddStudentHandler() {
        super("addStudent");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB)
            throws ServletException, IOException
    {
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
            studentDB.addStudent(new Student(name, firstName, studies, age));
            Commands.ListStudents.getHandler().handle(request, response, studentDB);
        }
        else{
            request.setAttribute("Error", true);
            RequestDispatcher view = request.getRequestDispatcher("studentform.jsp");
            view.forward(request, response);
        }
    }
}
