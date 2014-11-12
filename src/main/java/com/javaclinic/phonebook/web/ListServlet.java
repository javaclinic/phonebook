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

@WebServlet("/list")
public class ListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(ListServlet.class.getCanonicalName());

    @EJB
    private PhonebookService service;

    public ListServlet() {
        LOGGER.finer("Instantiating ListServlet instance.");
    }

    @Override
    public void init() throws ServletException {
        LOGGER.finer("Initializing ListServlet instance.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LOGGER.finer("Processing ListServlet GET http request.");

        try {
            List<PhonebookEntry> list = service.getPhonebookEntries();
            request.setAttribute("LIST", list);
            request.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }

    }

}
