package domain.model.commandHandelers;

import domain.db.StudentDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeCommandHandler extends CommandHandler{
    protected HomeCommandHandler() {
        super("home");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB) throws ServletException, IOException {
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
