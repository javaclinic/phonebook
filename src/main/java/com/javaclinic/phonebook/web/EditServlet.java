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

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(EditServlet.class.getCanonicalName());

    @EJB
    private PhonebookService service;

    public EditServlet() {
        LOGGER.finer("Instantiating EditServlet instance.");
    }

    @Override
    public void init() throws ServletException {
        LOGGER.finer("Initializing EditServlet instance.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.finer("Processing EditServlet GET http request.");
        try {
            Integer id = Integer.parseInt(request.getParameter("id"));
            PhonebookEntry found = service.getPhonebookEntry(id);
            if ( found == null ) throw new IllegalArgumentException("Could not find a phonebook entry with id: " + id);
            request.setAttribute("ENTRY", found);
            request.getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.finer("Processing EditServlet POST http request.");
        try {
            Integer id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String number = request.getParameter("number");
            String note = request.getParameter("note");
            PhonebookEntry pe = service.updatePhonebookEntry(id,name,number,note);
            request.setAttribute("ENTRY", pe);
            request.getRequestDispatcher("/WEB-INF/views/edited.jsp").forward(request, response);
        } catch (Exception e) {
            LOGGER.warning(e.getMessage());
            request.setAttribute("ERROR", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
    }

}
