package jrout.tutorial.servlet.controller;

import jrout.tutorial.servlet.domain.Customer;
import jrout.tutorial.servlet.service.DVDServiceImpl;
import jrout.tutorial.servlet.service.IDVDService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/dvdctrlservlet"})
public class DVDControllerServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("In Init Method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String typeValue = req.getParameter("typeValue");
        RequestDispatcher requestDispatcher = null;

        if(typeValue.equals("customerSearch")){
            String customerId = req.getParameter("customerId");
            String firstName = req.getParameter("firstName");

            IDVDService idvdService = new DVDServiceImpl();
            List<Customer> customers = new ArrayList<>();
            if(firstName != null && firstName.trim().length() > 1){
                customers = idvdService.searchCustomerByFirstName(firstName);
            }else if(customerId != null && customerId.trim().length() >= 1){
                int custId = Integer.parseInt(customerId);
                Customer customer = idvdService.searchCustomerById(custId);
                customers.add(customer);
            }
            req.setAttribute("customerResult", customers);
            requestDispatcher = req.getRequestDispatcher("customerResult.jsp");
            requestDispatcher.forward(req,resp);
        }else{
            System.out.println("Leaving for the students to implement...");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    // CRUD
    /*@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("finalPage.jsp");
        requestDispatcher.forward(req,resp);
    }*/

    @Override
    public void destroy() {
        System.out.println("I am been destroyed..");
    }
}
