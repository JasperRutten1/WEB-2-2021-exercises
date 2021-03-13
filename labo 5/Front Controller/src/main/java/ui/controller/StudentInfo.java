package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;
import domain.model.commandHandelers.Commands;

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
        handle(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handle(request, response);
    }

    private void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = "listStudents";
        if(request.getParameter("command") != null){
            command = request.getParameter("command");
        }
        Commands commands = Commands.getCommand(command);
        if(commands == null) commands = Commands.ListStudents;
        commands.getHandler().handle(request, response, studentData);
    }
}
