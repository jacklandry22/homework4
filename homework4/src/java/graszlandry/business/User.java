/*
 * Copyright Jack Landry and Lexa Grasz 2015
 */
package graszlandry.business;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Jack landry and Lexa Grasz
 * The User class creates a user object that stores the first name, last name, 
 * and email address of a user as well as the name of the book they check out
 * and the due date of this book.
 */
public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String book;
    private Date dueDate;
    private String overdue;
    private String formattedDate;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
        book = "";
        calculateDate();
        formatDate();
        isOverdue();
 
    }

    /** 
     * Creates a user object that stores the first name, last name, email address,
     * and book title of a user.
     * @param firstName
     * the input first name
     * @param lastName
     * the input last name
     * @param email
     * the input email address 
     * @param book 
     * the input book title
     */
    public User(String firstName, String lastName, String email, String book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.book = book;
        // this.dueDate = dueDate;
        // this.overdue = overdue;
    }
/**
 * 
 * @return email
 * returns user email
 */
    public String getEmail() {
        return email;
    }
/**
 * 
 * @param email 
 * sets the user email
 */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * @return  dueDate
     * returns the due date of the book
     */
    public Date getDueDate(){
        return dueDate;
    }
    
    /**
     * 
     * @param dueDate 
     * sets the due date of the book
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    /**
     * 
     * @return book
     * returns the book title of the book
     */
     public String getBook() {
        return book;
    }
/**
 * 
 * @param book 
 * sets the book title of the book
 */
    public void setBook(String book) {
        this.book = book;
    }
    
    /**
     * 
     * @return firstName
     * returns the first name of the user object
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName 
     * sets the first name of the user object
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return lastName
     * returns the last name of the user object
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     * sets the last name of the user object
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * 
     * @return dueDate
     * takes the date the user checked the book out and adds 14 days to it to
     * determine the due date
     */
    public Date calculateDate() {
        
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 14);
        dueDate = calendar.getTime();
        return dueDate;
    }
    
    
    /**
     * 
     * @return  formattedDate
     * formats the date into mm/dd/yyyy format
     */
    public String formatDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        formattedDate = dateFormat.format(dueDate);
        System.out.println(formattedDate);
        return formattedDate;
    }
    
    /**
     * 
     * @return overdue
     * compares the current date to the due date. If the current date is after 
     * the due date, then the book is overdue. If not, then this method returns
     * a empty string because the book is not overdue.
     */
    public String isOverdue() {
       
         Calendar calendar = Calendar.getInstance();
        Date current = calendar.getTime();
        if(current.after(dueDate)) {
            overdue = "overdue";
            
        }
        else {
            overdue = "";
        }
        return overdue;
    }

    /**
     * @return the overdue
     */
    public String getOverdue() {
        return overdue;
    }

    /**
     * @param overdue the overdue to set
     */
    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    /**
     * @return the formattedDate
     */
    public String getFormattedDate() {
        return formattedDate;
    }

    /**
     * @param formattedDate the formattedDate to set
     */
    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }
            
}
