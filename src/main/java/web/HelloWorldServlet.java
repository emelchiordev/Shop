package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("Bonjour OpenClassRooms !");
        resp.getWriter().println("Ceci est ma première page HTTP");
        resp.getWriter().println("Géré par un Servlet JAVA EE");
        resp.getWriter().println("Merci Jetty !");
    }
}
