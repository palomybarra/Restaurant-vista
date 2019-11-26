/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.City_Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paloma
 */
public class CityDAO {
    
    public ArrayList<City_Model> getCity() {
        ArrayList<City_Model> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_GET_CITY";
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                salida.add(new City_Model(
                        rs.getInt("ID_CITY"),
                        rs.getString("DESCRIPTION")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar ciudad" + e.getMessage());
        }
        return salida;
    }
}
