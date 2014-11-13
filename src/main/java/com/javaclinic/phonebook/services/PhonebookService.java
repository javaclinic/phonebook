package com.javaclinic.phonebook.services;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.javaclinic.phonebook.dao.PhonebookEntryDao;
import com.javaclinic.phonebook.model.PhonebookEntry;

@Stateless
public class PhonebookService {

    private static final Logger LOGGER = Logger.getLogger(PhonebookService.class.getCanonicalName());

    @EJB
    private PhonebookEntryDao dao;

    public PhonebookService() {
        LOGGER.finer("Instantiating PhonebookService instance.");
    }

    @PostConstruct
    public void init() {
        LOGGER.finer("Initializing PhonebookService instance.");
    }

    @PreDestroy
    public void finalize() {
        LOGGER.finer("Finalizing PhonebookService instance.");
    }

    public List<PhonebookEntry> getPhonebookEntries() {
        LOGGER.finer("Servicing PhonebookService.getPhonebookEntries() business request.");
        return dao.list();
    }

    public PhonebookEntry getPhonebookEntry(Integer id) {
        LOGGER.finer("Servicing PhonebookService.getPhonebookEntry(id) business request.");
        return dao.find(id);
    }

    public PhonebookEntry savePhonebookEntry(String name, String number, String note) {
        LOGGER.finer("Servicing PhonebookService.savePhonebookEntry(name,number,note) business request.");
        PhonebookEntry pe = new PhonebookEntry(null,name,number,note);
        return dao.save(pe);
    }

    public PhonebookEntry updatePhonebookEntry(Integer id, String name, String number, String note) {
        LOGGER.finer("Servicing PhonebookService.updatePhonebookEntry(id,name,number,note) business request.");
        PhonebookEntry pe = new PhonebookEntry(id,name,number,note);
        return dao.update(pe);
    }

    public PhonebookEntry deletePhonebookEntry(Integer id) {
        LOGGER.finer("Servicing PhonebookService.deletePhonebookEntry(id) business request.");
        PhonebookEntry pe = new PhonebookEntry(id,null,null,null);
        return dao.delete(pe);
    }

}
