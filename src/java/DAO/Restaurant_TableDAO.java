/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Restaurant_table_Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paloma
 */
public class Restaurant_TableDAO {
    
    public ArrayList<Restaurant_table_Model> getTable(int cant) {
        ArrayList<Restaurant_table_Model> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_TABLE_DISPONIBLE WHERE QTY>="+cant;
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                salida.add(new Restaurant_table_Model(
                        rs.getInt("ID_RESTAURANT_TABLE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("ID_TABLE_STATE"),
                        rs.getInt("QTY")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar tabla" + e.getMessage());
        }
        return salida;
    }
}
