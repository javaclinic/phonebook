package com.javaclinic.phonebook.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.javaclinic.phonebook.model.PhonebookEntry;

@Stateless
public class PhonebookEntryDao {

    @PersistenceContext
    private EntityManager em;

    public PhonebookEntry save(PhonebookEntry pe) {
        em.persist(pe);
        return pe;
    }

    public PhonebookEntry delete(PhonebookEntry pe) {
        PhonebookEntry toRemove = em.find(PhonebookEntry.class, pe.getId());
        em.remove(toRemove);
        return toRemove;
    }

    public PhonebookEntry update(PhonebookEntry pe) {
        em.merge(pe);
        return pe;
    }

    public List<PhonebookEntry> list() {
        TypedQuery<PhonebookEntry> query = em.createQuery("SELECT pe FROM PhonebookEntry pe", PhonebookEntry.class);
        return query.getResultList();
    }

    public PhonebookEntry find(Integer id) {
        return em.find(PhonebookEntry.class, id);
    }

}
