/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.CartModel;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author paloma
 */
public class CartDAO {
    
    public boolean addCart(CartModel cart) 
    {

        String fn = "{?=call erestaurant.FN_INSERT_CART(?,?,?,?,?)}";
        try 
        {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, cart.getCustomer_id());
            cs.setInt(3, cart.getQty());
            cs.setInt(4, cart.getId_menu());   
            cs.setString(5, cart.getDescription());   
            cs.setInt(6, cart.getPrice());              

            //LOGGER.log(Level.INFO, "dv;  " + Character.toString(customer.getDocument_id_dv()));
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
    public ArrayList<CartModel> getCart(int id_customer) {
        ArrayList<CartModel> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_GET_CART WHERE CUSTOMER_ID="+id_customer;
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                salida.add(new CartModel(
                        rs.getInt("CART_ID"),
                        rs.getInt("CUSTOMER_ID"),
                        rs.getInt("QTY"),
                        rs.getInt("ID_MENU"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("PRICE")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar" + e.getMessage());
        }
        return salida;
    }
}
