package domain.model.commandHandelers;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConfirmRemoveStudentHandler extends CommandHandler{
    protected ConfirmRemoveStudentHandler() {
        super("confirmRemoveStudent");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB) throws ServletException, IOException {
        Student student = studentDB.getStudent(request.getParameter("naam"), request.getParameter("voornaam"));
        studentDB.removeStudent(student);
        Commands.ListStudents.getHandler().handle(request, response, studentDB);
    }
}
