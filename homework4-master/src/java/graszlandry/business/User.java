/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graszlandry.business;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Jack
 */
public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String book;
    private String dueDate;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
        book = "";
        dueDate = "";
    }

    public User(String firstName, String lastName, String email, String book, String dueDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.book = book;
        this.dueDate = dueDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
     public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String calculateDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        dueDate = dateFormat.format(date);
        return dueDate;
    }
            
}
