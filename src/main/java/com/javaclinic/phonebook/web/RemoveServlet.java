package com.javaclinic.phonebook.web;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaclinic.phonebook.model.PhonebookEntry;
import com.javaclinic.phonebook.services.PhonebookService;

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(RemoveServlet.class.getCanonicalName());

    @EJB
    private PhonebookService service;

    public RemoveServlet() {
        LOGGER.finer("Instantiating RemoveServlet instance.");
    }

    @Override
    public void init() throws ServletException {
        LOGGER.finer("Initializing RemoveServlet instance.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.finer("Processing RemoveServlet GET http request.");
        try {
            Integer id = Integer.parseInt(request.getParameter("id"));
            PhonebookEntry pe = service.deletePhonebookEntry(id);
            request.setAttribute("ENTRY", pe);
            request.getRequestDispatcher("/WEB-INF/views/removed.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
    }

}
