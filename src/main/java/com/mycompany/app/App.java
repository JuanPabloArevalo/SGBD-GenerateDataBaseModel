package com.mycompany.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static int idPais = 1;
    public static void main( String[] args ){





try {

    int idPais = 1;
    int idGeografia = 1;
    int idAgreements = 1;
    int idInternationalAgreements = 1;
    int idInternationalOrganization = 1;
    int idAgricultureProductsCountry = 1;
    int idAgricultureProducts = 1;
    int idIndustries = 1;
    int idIndustriesCountry = 1;
    int idLandBoundaries = 1;
    int idWaterBorder = 1;
    int idWaterBoundaries = 1;
    int idNaturalResource = 1;
    int idGeographyResource = 1;

    String path = "C:/Users/JuanArevaloBluetab/Downloads/co.json";
    File file = new File(path);
    BufferedReader br = new BufferedReader(new FileReader(file));
    String textFinal = "";
    String st;
    while ((st = br.readLine()) != null){
        System.out.println(st);
        textFinal = textFinal + st;
    }
    Gson g = new Gson();
    Root person = g.fromJson(textFinal, Root.class);


    ArrayList<String> inserts = new ArrayList<>();
    // Insert Country
    inserts.addAll(person.getInserts(idPais));
    //Geograpy
    inserts.addAll(person.getGeography().getGeographyInserts(1,idPais));
    //Natural Resources
    inserts.addAll(person.getGeography().getNaturalResourcesInserts(1));
    // Insert landBoundaries
    inserts.addAll(person.geography.land_boundaries.getInserts(idPais));
    // Insert waterBoundaries
    inserts.addAll(person.geography.getInserts());
    //Agreements
    inserts.addAll(person.geography.environment_international_agreements.getInserts());
    //International Organization
    inserts.addAll(person.getPeople_and_society().getGovernment().getInserts());
    //agricultureProducts
    inserts.addAll(person.getPeople_and_society().getEconomy().getInserts());
    //IndustryCountry
    inserts.addAll(person.getPeople_and_society().getEconomy().getInsertsIndustry());

    System.out.println("Acá comienza");
    for(int i=0; i<inserts.size(); i++){
        System.out.println(inserts.get(i)+";");
    }

    //System.out.println(person.name); //John

   // System.out.println(g.toJson(person)); // {"name":"John"}

}catch (Exception e){
    e.printStackTrace();
}

    }
}
