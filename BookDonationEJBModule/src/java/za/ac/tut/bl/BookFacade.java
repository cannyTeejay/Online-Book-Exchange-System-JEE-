/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Book;

/**
 *
 * @author selal
 */
@Stateless
public class BookFacade extends AbstractFacade<Book> implements BookFacadeLocal {

    @PersistenceContext(unitName = "BookDonatioEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    @Override
    public List<Book> findAvailableBooks() {
        String queryStr = "SELECT b FROM Book b WHERE b.status = :status";
        Query query = em.createQuery(queryStr);
        query.setParameter("status", "AVAILABLE");
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public List<Book> findByFaculty(String faculty) {
         String queryStr = "SELECT b FROM Book b WHERE LOWER(b.faculty) = ?1";
         Query query = em.createQuery(queryStr);
         query.setParameter(1, faculty.toLowerCase());
         List<Book> books = query.getResultList();
         return books;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        String queryStr = "SELECT b FROM Book b WHERE LOWER(b.title) = ?1";
        Query query = em.createQuery(queryStr);
        query.setParameter(1, title.toLowerCase());
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public List<Book> searchByTitleAndFaculty(String title, String faculty) {
        String queryStr = "SELECT b FROM Book b WHERE LOWER(b.title) = ?1 AND LOWER(b.faculty) = ?2";
        Query query = em.createQuery(queryStr);
        query.setParameter(1, title.toLowerCase());
        query.setParameter(2, faculty.toLowerCase());
        List<Book> books = query.getResultList();
        return books;
    }
}
