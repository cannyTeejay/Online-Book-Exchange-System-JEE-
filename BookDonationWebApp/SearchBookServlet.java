/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.BookFacadeLocal;
import za.ac.tut.bl.UserFacadeLocal;
import za.ac.tut.entities.Book;

/**
 *
 * @author selal
 */
public class SearchBookServlet extends HttpServlet {
    @EJB
    private BookFacadeLocal bfl;
    private UserFacadeLocal ufl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String search = request.getParameter("search");
        String title = request.getParameter("bookName");
        
        if(search.equalsIgnoreCase("title")){
            List<Book> books = bfl.searchByTitle(search);
            request.setAttribute(search, bfl);
        }
        
    }

}
