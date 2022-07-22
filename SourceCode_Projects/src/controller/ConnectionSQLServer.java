/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nampr
 */
public class ConnectionSQLServer {
    public static Connection getConnectionDB(){
        try {
            String URL = "jdbc:sqlserver://localhost:1433;databaseName=EMETRO";
            String user = "sa";
            String password = "sa";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(URL, user, password);
            System.out.println("Kết nối thành công");
            return con;
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }
        return null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection cn = ConnectionSQLServer.getConnectionDB();
    }
    
}
