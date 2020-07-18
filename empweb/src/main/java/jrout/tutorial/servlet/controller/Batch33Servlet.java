package jrout.tutorial.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/batch33","/b3"})
public class Batch33Servlet extends HttpServlet {

    public Batch33Servlet(){
        System.out.println("Batch33 Servlet is been created...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("In Init Method");
    }
    // CRUD
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking Service Method...");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");

        // Hello Peter , welcome to batch33..
        resp.getWriter().println(String.format("Hello %s %s , welcome to Batch33", firstName, lastName));
        resp.getWriter().println("Time is "+ new java.util.Date());
    }

    @Override
    public void destroy() {
        System.out.println("I am been destroyed..");
    }
}
