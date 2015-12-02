/*
 * Copyright Jack Landry and Lexa Grasz 2015
 */
package graszlandry.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jack Landry and Lexa Grasz
 */
public class DBUtil {

    /**
     * 
     * @param s 
     * This method closes the statement. 
     * 
     */
    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method closes the prepared statement
     * @param ps 
     */
    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method closes the result set.
     * @param rs 
     */
    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}