/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Dubey
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Javaconnect {
    Connection conn;
    public static Connection ConncerDb()
    {
    
        try{
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin?zeroDateTimeBehavior=convertToNull","root","");
       return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
}
}
