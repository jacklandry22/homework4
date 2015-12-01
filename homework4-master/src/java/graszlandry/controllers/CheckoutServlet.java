
package graszlandry.controllers;

import graszlandry.business.User;
import graszlandry.data.UserDB;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
*
* @author Jack
*/

public class CheckoutServlet extends HttpServlet{

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String url = "/index.jsp";
        // ServletContext sc = getServletContext();
        
        //Get current action 
        String action = request.getParameter("action");
        
        if (action == null){
            action = "remain";
        }
        
        if (action.equals("remain")){
            // url = "/index.jsp";
            //Get current users
            ArrayList<User> users = UserDB.selectUsers();
            request.setAttribute("users", users);
        }
        else if (action.equals("checkout")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String book = request.getParameter("book");
            String date = request.getParameter("date");
                   User user = (User) session.getAttribute("user");
                   if (user == null){
                       user = new User();
                   }
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setBook(book);
            user.setDueDate(date);
            UserDB.insert(user);
            
            // user = UserDB.selectUser(book);
            // session.setAttribute("user", user);   
            
            url = "/thankYou.jsp";
        
        }
        
//        else if (action.equals("view_database")){
//            String firstName = request.getParameter("firstName");
//            String lastName = request.getParameter("lastName");
//            String email = request.getParameter("email");
//            String book = request.getParameter("book");
//            User user = UserDB.selectUser(email);
//            session.setAttribute("user", user);
//            url="/checkedOutBooks.jsp";
//        }
        
        else if (action.equals("checkin_user")) {
            String book = request.getParameter("book");
            User user = UserDB.selectUser(book);
            UserDB.checkIn(user);
            
            ArrayList<User> users = UserDB.selectUsers();
            request.setAttribute("users", users);
            
            // url="/index.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    

}