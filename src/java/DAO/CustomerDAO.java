/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Commune_Model;
import Modelo.Customer_Model;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

/**
 *
 * @author paloma
 */
public class CustomerDAO {

    public boolean addCustomer(Customer_Model customer) 
    {

        String fn = "{?=call erestaurant.FN_CREATE_CUSTOMER(?,?,?,?,?,?,?,?,?,?,?,?)}";
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, customer.getEmail());
            cs.setInt(3, customer.getDocument_id());
            cs.setString(4, Character.toString(customer.getDocument_id_dv()));

            LOGGER.log(Level.INFO, "dv;  " + Character.toString(customer.getDocument_id_dv()));
            cs.setString(5, customer.getName());
            cs.setString(6, customer.getLast_name());
            cs.setInt(7, Integer.parseInt(customer.getPhone()));
            cs.setString(8, customer.getDob());
            cs.setString(9, customer.getAddress());
            cs.setInt(10, customer.getId_city());
            cs.setInt(11, customer.getId_commune());
            cs.setInt(12, customer.getId_country());
            cs.setString(13, customer.getPassword());
            cs.execute();

            int result = cs.getInt(1);

            if (result == 1)
            {
                return true;
            } else {
                return false;
            }

        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public int loginCustomer(Customer_Model customer) 
    {
        String fn = "{?=call erestaurant.FN_LOGIN_CUSTOMER(?,?)}";
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, customer.getEmail());
            cs.setString(3, customer.getPassword());
            cs.execute();
            int result = cs.getInt(1);
            return result;            
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return 3;//otro error
        }

    }
    public int loadCustomer(Customer_Model customer) 
    {
        //funcion con el fin de obtener ciertos datos del cliente
        String fn = "{?=call erestaurant.FN_LOAD_CUSTOMER(?,?,?,?,?)}";
        int id=0;
        String nombre="";
        String apellido="";
        String email="";
        
        
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, customer.getEmail());
            cs.registerOutParameter(3,Types.INTEGER);
            cs.registerOutParameter(4,Types.VARCHAR);
            cs.registerOutParameter(5,Types.VARCHAR);
            cs.registerOutParameter(6,Types.VARCHAR);
            cs.execute();
            customer.setEmail(cs.getString(4));
            customer.setName(cs.getString(5));
            customer.setLast_name(cs.getString(6));
            customer.setId_customer(cs.getInt(3));
            LOGGER.log(Level.INFO, "nombre dao;  " + customer.getName());
            int result=cs.getInt(1);
            return result;      
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return 3;//otro error
        }

    }
    public int ReadCustomer(Customer_Model customer) 
    {
        //funcion con el fin de obtener ciertos datos del cliente
        String fn = "{?=call erestaurant.FN_READ_CUSTOMER(?,?,?,?,?,?,?,?,?,?,?)}";
               
        
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);//RETURN
            cs.setInt(2, customer.getId_customer());//ID
            cs.registerOutParameter(3,Types.INTEGER);//RUT
            cs.registerOutParameter(4,Types.VARCHAR);//RUT_DV
            cs.registerOutParameter(5,Types.VARCHAR);//NOMBRE
            cs.registerOutParameter(6,Types.VARCHAR);//APELLIDO
            cs.registerOutParameter(7,Types.VARCHAR);//TELEFONO
            cs.registerOutParameter(8,Types.VARCHAR);//DOB
            cs.registerOutParameter(9,Types.VARCHAR);//DIRECCION
            cs.registerOutParameter(10,Types.INTEGER);//CITY
            cs.registerOutParameter(11,Types.INTEGER);//COMUNA
            cs.registerOutParameter(12,Types.INTEGER);//PAIS
            cs.registerOutParameter(13,Types.VARCHAR);//EMAIL            
            cs.execute();
            
            customer.setDocument_id(cs.getInt(3));
            customer.setDocument_id_dv(cs.getString(4).charAt(0));
            customer.setName(cs.getString(5));
            customer.setLast_name(cs.getString(6));
            customer.setPhone(cs.getString(7));
            customer.setDob(cs.getDate(8).toString());
            customer.setAddress(cs.getString(9));
            customer.setId_city(cs.getInt(10));
            customer.setId_commune(cs.getInt(11));
            customer.setId_country(cs.getInt(12));
            customer.setEmail(cs.getString(13));
            
            LOGGER.log(Level.INFO, "nombre dao;  " + customer.getName());
            int result=cs.getInt(1);
            return result;            
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return 3;//otro error
        }

    }
    
    public int UpdateCustomer(Customer_Model customer) 
    {
        //funcion con el fin de obtener ciertos datos del cliente
        String fn = "{?=call erestaurant.FN_UPDATE_CUSTOMER(?,?,?,?,?,?,?,?,?,?,?,?)}";              
        
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);//RETURN
            cs.setInt(2, customer.getId_customer());//ID
            cs.setInt(3, customer.getDocument_id());//RUT
            cs.setString(4,Character.toString(customer.getDocument_id_dv()));//RUT_DV
            cs.setString(5,customer.getName());//NOMBRE
            cs.setString(6,customer.getLast_name());//APELLIDO
            cs.setString(7,customer.getPhone());//TELEFONO
            cs.setString(8,customer.getDob());//DOB
            cs.setString(9, customer.getAddress());//DIRECCION
            cs.setString(10, null);//ACTIVIDAD
            cs.setInt(11, customer.getId_commune());//COMUNA
            cs.setInt(12, customer.getId_country());//PAIS
            cs.setString(13, customer.getPassword());//EMAIL 
            //PASS
            cs.execute();        
            
            //LOGGER.log(Level.INFO, "nombre dao;  " + customer.getName());
            int result=cs.getInt(1);
            return result;            
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return 0;//otro error
        }
    }
    
}
