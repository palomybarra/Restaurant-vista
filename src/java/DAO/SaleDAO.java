/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Sale_Model;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author paloma
 */
public class SaleDAO {
    public boolean addSale(Sale_Model com) throws SQLException {

        String fn = "{?=call erestaurant.FN_DO_PAY(?,?)}";
        try {
            CallableStatement cs = DbConnection.getConnection().prepareCall(fn);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setInt(2, com.getId_sale());
            cs.setInt(3, com.getPayment_id_payment());          
            
            //LOGGER.log(Level.INFO, "dv;  " + Character.toString(customer.getDocument_id_dv()));
            cs.execute();

            int result = cs.getInt(1);
            return true;

        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
