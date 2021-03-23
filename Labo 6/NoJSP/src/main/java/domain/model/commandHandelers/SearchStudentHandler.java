package domain.model.commandHandelers;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchStudentHandler extends CommandHandler{
    protected SearchStudentHandler() {
        super("searchStudent");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB) throws ServletException, IOException {
        String studentName = request.getParameter("naam");
        String studentFirstName = request.getParameter("voornaam");

        Student student = studentDB.getStudent(studentName, studentFirstName);

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
}
