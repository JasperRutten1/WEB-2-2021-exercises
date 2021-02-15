package ui.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@WebServlet(name = "EersteServlet", value = "/DynamischePagina")
public class EersteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Eerste Pagina</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<h1>Dynamishe Pagina</h1>");
        out.println("<nav>");
        out.println("<ul>");
        out.println("<li><a href=\"index.html\">Eerste pagina</a></li>");
        out.println("<li><a href=\"DynamischePagina\">Dynamishe Pagina</a></li>");
        out.println("</ul>");
        out.println("</nav>");
        out.println("</header>");
        out.println("<main>");
        out.println("<p>" + UUID.randomUUID().toString() + "</p>");
        out.println("</main>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
