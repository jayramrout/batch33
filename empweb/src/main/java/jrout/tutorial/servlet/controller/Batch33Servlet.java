package jrout.tutorial.servlet.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/batch33","/b3"} , loadOnStartup = 1)
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("finalPage.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("I am been destroyed..");
    }
}
