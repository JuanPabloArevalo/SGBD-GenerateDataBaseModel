package com.mycompany.app;

import java.util.ArrayList;

public class EnvironmentInternationalAgreements{
    public String party_to;
    public String signed_but_not_ratified;

    public String getParty_to() {
        return party_to;
    }

    public void setParty_to(String party_to) {
        this.party_to = party_to;
    }

    public String getSigned_but_not_ratified() {
        return signed_but_not_ratified;
    }

    public void setSigned_but_not_ratified(String signed_but_not_ratified) {
        this.signed_but_not_ratified = signed_but_not_ratified;
    }

    public ArrayList<String> getInserts(){
        int idInterno = 1;
        int idRelacion = 1;
        int idPais = App.idPais;
        ArrayList<String> arreglo = new ArrayList();
        String cadena = party_to;
        String[] parts = cadena.split(",");
        String sentencia = "";
        String sentenciaRelacion = "";
        String name = "";
        for(int i=0; i<parts.length; i++){
            name = parts[i];
            sentencia = "INSERT INTO agreements (idAgreements, name) VALUES ("+idInterno+", '"+name+"')";
            sentenciaRelacion = "INSERT INTO internationalAgreements (idInternationalAgreements, idAgreements, idCountry) VALUES ("+idRelacion+", "+idInterno+", "+idPais+")";
            idInterno++;
            idRelacion++;
            System.out.println(sentencia);
            System.out.println(sentenciaRelacion);
            arreglo.add(sentencia);
            arreglo.add(sentenciaRelacion);
        }
        return arreglo;
    }
}
