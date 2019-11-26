/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Commune_Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paloma
 */
public class CommuneDAO {
    public ArrayList<Commune_Model> getCommune(int id_city) {
        ArrayList<Commune_Model> salida = new ArrayList<>();
        String query = "SELECT * FROM VIEW_GET_COMMUNE WHERE";
        try {
            PreparedStatement pst = DbConnection.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                salida.add(new Commune_Model(
                        rs.getInt("ID_COMMUNE"),
                        rs.getString("DESCRIPTION"),
                        rs.getInt("ID_CITY")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Problema al listar ciudad" + e.getMessage());
        }
        return salida;
    }
}
