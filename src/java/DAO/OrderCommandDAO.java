/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Order_Command_Model;
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
public class OrderCommandDAO {

    public boolean addCommand(Order_Command_Model com) throws SQLException {

        String fn = "{?=call erestaurant.FN_INSERT_COMMAND(?,?,?,?)}";
        try {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, com.getId_customer());
            cs.setInt(3, com.getId_sale());
            cs.setInt(4, com.getId_restaurant_table());
            cs.setInt(5, com.getId_sale());
            

            //LOGGER.log(Level.INFO, "dv;  " + Character.toString(customer.getDocument_id_dv()));
            cs.execute();

            int result = cs.getInt(1);
            com.setId_sale(result);
            return true;

        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Order_Command_Model> getCommand(int id_sale) {
        ArrayList<Order_Command_Model> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_COMMAND WHERE SALE_ID="+id_sale;
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Order_Command_Model order=new Order_Command_Model();
                order.setCantidad(rs.getInt("CANT"));
                order.setPrice(rs.getInt("PRICE"));
                order.setId_sale(rs.getInt("SALE_ID"));
                order.setDescription(rs.getString("DESCRIPTION"));
                salida.add(order);  
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar" + e.getMessage());
        }
        return salida;
    }
    
}
