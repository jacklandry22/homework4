/*
 * Copyright Jack Landry and Lexa Grasz 2015
 */
package graszlandry.data;

import graszlandry.business.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jack landry and lexa grasz
 */
public class UserDB {
    
    /**
     * 
     * @param user
     * @return 
     * This method inserts a user object into the library table using an instance
     * of the connection pool.
     */
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO library (FirstName, LastName, EmailAddress, BookTitle, DueDate) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getBook());
            java.sql.Date date = new java.sql.Date(user.getDueDate().getTime());
            ps.setDate(5, date);
            //ps.setString(6, u     ser.getOverdue());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    /**
     * This method checks in a book returned by a user, removing the user's 
     * information from the library table
     * 
     * @param user
     * @return 
     */
    public static int checkIn(User user) {
        //fix
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection connection = pool.getConnection();
            PreparedStatement ps = null;

            String query = "DELETE FROM library "
                    + "WHERE BookTitle = ?";
            try {
                ps = connection.prepareStatement(query);
                ps.setString(1, user.getBook());

                return ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
                return 0;
            } finally {
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }
        }
    
    /**
     * 
     * @param book
     * @return user
     * THis method takes the book title and then finds this book in the library
     * table. Then the table finds the first name, last name, email address, and 
     * due date associated with this book and returns the user.
     */
    public static User selectUser(String book) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM library "
                + "WHERE BookTitle = ?";
         User user = new User();
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, book);
            rs = ps.executeQuery();
           
            // user.setBook(book);
            if (rs.next()) {
                user = new User();
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setEmail(rs.getString("EmailAddress"));
                user.setBook(rs.getString("BookTitle"));
                java.util.Date date = new java.util.Date(rs.getDate("DueDate").getTime());
                //java.sql.Date date = new java.sql.Date(user.getDueDate().getTime());
                user.setDueDate(date);
                
                //user.setDueDate(rs.getDate("DueDate"));
                
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    /**
     * This method creates an array list of users and returns all the users in 
     * the library table.
     * 
     * @return 
     */
    public static ArrayList<User> selectUsers() {
       ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM library ";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           ArrayList<User> users = new ArrayList<>();
           User user = null;
            while (rs.next()) {
                user = new User();
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setEmail(rs.getString("EmailAddress"));
                user.setBook(rs.getString("BookTitle"));
                java.util.Date date = new java.util.Date(rs.getDate("DueDate").getTime());
                //java.sql.Date date = new java.sql.Date(user.getDueDate().getTime());
                user.setDueDate(date);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }    


    
}
