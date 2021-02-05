package com.mycompany.app;

import java.util.ArrayList;

public class Geography{
    public String location;
    public String geographic_coordinates;
    public String map_references;
    public Area area;
    public String area_comparative;
    public LandBoundaries land_boundaries;
    public String coastline;
    public MaritimeClaims maritime_claims;
    public String climate;
    public String terrain;
    public Elevation elevation;
    public String natural_resources;
    public LandUse land_use;
    public String irrigated_land;
    public String population_distribution;
    public String natural_hazards;
    public String environment_current_issues;
    public EnvironmentInternationalAgreements environment_international_agreements;
    public String geography_note;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGeographic_coordinates() {
        return geographic_coordinates;
    }

    public void setGeographic_coordinates(String geographic_coordinates) {
        this.geographic_coordinates = geographic_coordinates;
    }

    public String getMap_references() {
        return map_references;
    }

    public void setMap_references(String map_references) {
        this.map_references = map_references;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getArea_comparative() {
        return area_comparative;
    }

    public void setArea_comparative(String area_comparative) {
        this.area_comparative = area_comparative;
    }

    public LandBoundaries getLand_boundaries() {
        return land_boundaries;
    }

    public void setLand_boundaries(LandBoundaries land_boundaries) {
        this.land_boundaries = land_boundaries;
    }

    public String getCoastline() {
        return coastline;
    }

    public void setCoastline(String coastline) {
        this.coastline = coastline;
    }

    public MaritimeClaims getMaritime_claims() {
        return maritime_claims;
    }

    public void setMaritime_claims(MaritimeClaims maritime_claims) {
        this.maritime_claims = maritime_claims;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Elevation getElevation() {
        return elevation;
    }

    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

    public String getNatural_resources() {
        return natural_resources;
    }

    public void setNatural_resources(String natural_resources) {
        this.natural_resources = natural_resources;
    }

    public LandUse getLand_use() {
        return land_use;
    }

    public void setLand_use(LandUse land_use) {
        this.land_use = land_use;
    }

    public String getIrrigated_land() {
        return irrigated_land;
    }

    public void setIrrigated_land(String irrigated_land) {
        this.irrigated_land = irrigated_land;
    }

    public String getPopulation_distribution() {
        return population_distribution;
    }

    public void setPopulation_distribution(String population_distribution) {
        this.population_distribution = population_distribution;
    }

    public String getNatural_hazards() {
        return natural_hazards;
    }

    public void setNatural_hazards(String natural_hazards) {
        this.natural_hazards = natural_hazards;
    }

    public String getEnvironment_current_issues() {
        return environment_current_issues;
    }

    public void setEnvironment_current_issues(String environment_current_issues) {
        this.environment_current_issues = environment_current_issues;
    }

    public EnvironmentInternationalAgreements getEnvironment_international_agreements() {
        return environment_international_agreements;
    }

    public void setEnvironment_international_agreements(EnvironmentInternationalAgreements environment_international_agreements) {
        this.environment_international_agreements = environment_international_agreements;
    }

    public String getGeography_note() {
        return geography_note;
    }

    public void setGeography_note(String geography_note) {
        this.geography_note = geography_note;
    }


    public ArrayList<String> getInserts(){
        int idInterno = 1;
        int idRelacion = 1;
        int idPais = App.idPais;
        ArrayList<String> arreglo = new ArrayList();
        String cadena = coastline;

        System.out.println("Cadena Antes:"+cadena);
        String cadenaLimites = cadena.replaceAll("\\d", "")
                .replaceAll(", km", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "");
        String[] parts = cadenaLimites.split(",");
        String sentencia = "";
        String sentenciaRelacion = "";
        String name = "";
        for(int i=0; i<parts.length; i++){
            name = parts[i];
            sentencia = "INSERT INTO waterBorder (idWaterBorder, name) VALUES ("+idInterno+", '"+name+"')";
            sentenciaRelacion = "INSERT INTO waterBoundaries (idWaterBoundaries, idCountry, idWaterBorder) VALUES ("+idRelacion+", "+idPais+", "+idInterno+")";
            idInterno++;
            idRelacion++;
            System.out.println(sentencia);
            System.out.println(sentenciaRelacion);
            arreglo.add(sentencia);
            arreglo.add(sentenciaRelacion);
        }
        return arreglo;
    }

    public ArrayList<String> getGeographyInserts(int idGeography, int idCountry){

        ArrayList<String> arreglo = new ArrayList();
        String insert = "INSERT INTO Geography (IdGeography, idCountry, location, geographicCoordinates, mapReferences, landArea, waterArea, climate) " +
                "VALUES ("+idGeography+", "+idCountry+", '"+getLocation()+"', '"+getGeographic_coordinates()+"', '"+getMap_references()+"'," +
                ""+getArea().getRealLand()+", "+getArea().getRealWater()+", '"+getClimate()+"')";
        System.out.println(insert);
        arreglo.add(insert);
        return arreglo;
    }


    public ArrayList<String> getNaturalResourcesInserts(int idGeography){
        int idInterno = 1;
        int idRelacion = 1;
        ArrayList<String> arreglo = new ArrayList();
        String cadena = natural_resources;
        String[] parts = cadena.split(",");
        String sentencia = "";
        String sentenciaRelacion = "";
        String name = "";
        for(int i=0; i<parts.length; i++){
            name = parts[i];
            sentencia = "INSERT INTO naturalResource (idNaturalResource, name) VALUES ("+idInterno+", '"+name+"')";
            sentenciaRelacion = "INSERT INTO geographyResource (idGeographyResource, idNaturalResource, idGeography) VALUES ("+idRelacion+", "+idInterno+", "+idGeography+")";
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
