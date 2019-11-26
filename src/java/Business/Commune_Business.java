/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.CommuneDAO;
import Modelo.City_Model;
import Modelo.Commune_Model;
import java.util.ArrayList;



/**
 *
 * @author paloma
 */
public class Commune_Business {
    private int id_commune;
    private String description;
    private int id_city;

    public Commune_Business() {
    }

    public Commune_Business(int id_commune, String description, int id_city) {
        this.id_commune = id_commune;
        this.description = description;
        this.id_city = id_city;
    }

    public int getId_commune() {
        return id_commune;
    }

    public void setId_commune(int id_commune) {
        this.id_commune = id_commune;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
    
     public ArrayList<Commune_Business> getCommune() {
        ArrayList<Commune_Business> salida = new ArrayList<>();
        CommuneDAO dao = new CommuneDAO();
        ArrayList<Commune_Model> modelo = dao.getCommune(this.id_city);
        for (Commune_Model model : modelo) {
            salida.add(new Commune_Business(
                    model.getId_commune(),
                    model.getDescription(),
                    model.getId_city()
            ));
        }
        return salida;
    }
    
    
}
