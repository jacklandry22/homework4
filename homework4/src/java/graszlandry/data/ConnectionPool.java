/*
 * Copyright Jack Landry and Lexa Grasz 2015
 */
package graszlandry.data;

/**
 *
 * @author Jack Landry and Lexa Grasz
 */
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ConnectionPool {

    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    /**
     * This method gives the data source an initial context lookup of our 
     * database.
     */
    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/MySQLDS");
        } catch (NamingException e) {
            System.out.println(e);
        }
    }
/**
 * 
 * @return connection
 * this method returns an instance of a connection pool 
 */
    public static synchronized ConnectionPool getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }

    /**
     * 
     * @return connection
     * this method gets a connection
     */
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * 
     * @param c 
     * Using a connection parameter, this method closes the connection.
     */
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
