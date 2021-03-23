package domain.model.commandHandelers;

import domain.db.StudentDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListStudentsHandler extends CommandHandler{
    protected ListStudentsHandler() {
        super("listStudents");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB) throws ServletException, IOException {
        request.setAttribute("database", studentDB);
        RequestDispatcher view = request.getRequestDispatcher("studentInfoOverzicht.jsp");
        view.forward(request, response);
    }
}
