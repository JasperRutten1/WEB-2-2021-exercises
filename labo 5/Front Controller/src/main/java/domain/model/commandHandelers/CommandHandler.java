package domain.model.commandHandelers;

import domain.db.StudentDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class CommandHandler {
    protected String commandName;

    protected CommandHandler(String commandName){
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public abstract void handle(HttpServletRequest request, HttpServletResponse response, StudentDB studentDB)
            throws ServletException, IOException;
}
