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
        PhonebookEntry toUpdate = em.find(PhonebookEntry.class, pe.getId());
        if ( toUpdate == null) throw new IllegalArgumentException("Could not find an entry with id: " + pe.getId());
        toUpdate.setName(pe.getName());
        toUpdate.setNote(pe.getNote());
        toUpdate.setNumber(pe.getNumber());
        em.merge(toUpdate);
        return toUpdate;
    }

    public List<PhonebookEntry> list() {
        TypedQuery<PhonebookEntry> query = em.createQuery("SELECT pe FROM PhonebookEntry pe", PhonebookEntry.class);
        return query.getResultList();
    }

    public PhonebookEntry find(Integer id) {
        return em.find(PhonebookEntry.class, id);
    }

}
