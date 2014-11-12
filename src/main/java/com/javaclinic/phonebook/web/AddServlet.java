package com.javaclinic.phonebook.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaclinic.phonebook.model.PhonebookEntry;
import com.javaclinic.phonebook.services.PhonebookService;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(AddServlet.class.getCanonicalName());

    @EJB
    private PhonebookService service;

    public AddServlet() {
        LOGGER.finer("Instantiating AddServlet instance.");
    }

    @Override
    public void init() throws ServletException {
        LOGGER.finer("Initializing AddServlet instance.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.finer("Processing AddServlet GET http request.");
        request.getRequestDispatcher("/WEB-INF/views/add.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LOGGER.finer("Processing AddServlet POST http request.");

        try {
            String name = request.getParameter("name");
            String number = request.getParameter("number");
            String note = request.getParameter("note");
            PhonebookEntry pe = service.savePhonebookEntry(name,number,note);
            request.setAttribute("ENTRY", pe);
            request.getRequestDispatcher("/WEB-INF/views/added.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }

    }

}
