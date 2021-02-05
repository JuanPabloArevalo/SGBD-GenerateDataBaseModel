package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

public class LandBoundaries{
    public String total;
    public String border_countries;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBorder_countries() {
        return border_countries;
    }

    public void setBorder_countries(String border_countries) {
        this.border_countries = border_countries;
    }

    public ArrayList<String> getInserts(int idPais){
        int idInterno = 1;
        ArrayList<String> arreglo = new ArrayList();
        String cadena = border_countries;
        String[] parts = cadena.split(",");
        String sentencia = "";
        String name = "";
        String longitud = "";
        for(int i=0; i<parts.length; i++){
            name = parts[i].replaceAll("\\d", "")
                    .replaceAll("km", "");
            longitud = parts[i].replaceAll("[a-zA-z]", "")
                    .replaceAll(" ", "");
            sentencia = "INSERT INTO landBoundaries (idLandBoundaries, idCountry, name, length) VALUES ("+idInterno+", "+idPais+", '"+name+"', "+longitud+")";
            idInterno++;
            System.out.println(sentencia);
            arreglo.add(sentencia);
        }
        return arreglo;
    }
}
