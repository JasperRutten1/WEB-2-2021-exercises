package domain.model.commandHandelers;

import domain.db.StudentDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveStudentHandler extends CommandHandler{
    protected RemoveStudentHandler() {
        super("removeStudent");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB) throws ServletException, IOException {
        request.setAttribute("name", request.getParameter("naam"));
        request.setAttribute("firstName", request.getParameter("voornaam"));
        RequestDispatcher view = request.getRequestDispatcher("verwijderStudent.jsp");
        view.forward(request, response);
    }
}
