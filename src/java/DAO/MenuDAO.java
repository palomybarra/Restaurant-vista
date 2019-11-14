/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Menu_Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paloma
 */
public class MenuDAO {
    
    public ArrayList<Menu_Model> getMenu() {
        ArrayList<Menu_Model> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_MENU";
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                salida.add(new Menu_Model(
                        rs.getInt("ID_MENU"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("TIME_WAIT"),
                        rs.getInt("PRICE"),
                        0
                ));
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar" + e.getMessage());
        }
        return salida;
    }
}
