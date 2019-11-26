/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.CityDAO;
import Modelo.City_Model;
import java.util.ArrayList;


/**
 *
 * @author paloma
 */
public class City_Business {
    private int id_city;
    private String description;

    public City_Business() {
    }

    public City_Business(int id_city, String description) {
        this.id_city = id_city;
        this.description = description;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public ArrayList<City_Business> getCity() {
        ArrayList<City_Business> salida = new ArrayList<>();
        CityDAO dao = new CityDAO();
        ArrayList<City_Model> modelo = dao.getCity();
        for (City_Model model : modelo) {
            salida.add(new City_Business(
                    model.getId_city(),
                    model.getDescription()
            ));
        }
        return salida;
    }
    
}
