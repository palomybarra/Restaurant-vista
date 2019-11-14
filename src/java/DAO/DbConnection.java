/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author paloma
 */
public class DbConnection {
    private static Connection connection;

    public static Connection getConnection() {
        if(connection==null)
        {
            try {
                
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String url="jdbc:oracle:thin:@131.221.35.229:1521:xe";
                String user="erestaurant";
                String pass="1234";
                //String driver="com.mysql.jdbc.Driver";                
                connection=DriverManager.getConnection(url,user,pass);
                System.out.println("Conexion correcta lptm");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("No se puedo conectar"+e.getMessage());
            }
        }
        return connection;
    }
    public static void main(String[] args) {
    DbConnection conexion = new DbConnection();
    
    conexion.getConnection();
}
}

