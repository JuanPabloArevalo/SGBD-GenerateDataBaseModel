package com.mycompany.app;
public class ElectricityAccess{
    public String population_without_electricity;
    public String electrification_total_population;
    public String electrification_urban_areas;
    public String electrification_rural_areas;


    public String getPopulation_without_electricity() {
        return population_without_electricity;
    }

    public void setPopulation_without_electricity(String population_without_electricity) {
        this.population_without_electricity = population_without_electricity;
    }

    public String getElectrification_total_population() {
        return electrification_total_population;
    }

    public void setElectrification_total_population(String electrification_total_population) {
        this.electrification_total_population = electrification_total_population;
    }

    public String getElectrification_urban_areas() {
        return electrification_urban_areas;
    }

    public void setElectrification_urban_areas(String electrification_urban_areas) {
        this.electrification_urban_areas = electrification_urban_areas;
    }

    public String getElectrification_rural_areas() {
        return electrification_rural_areas;
    }

    public void setElectrification_rural_areas(String electrification_rural_areas) {
        this.electrification_rural_areas = electrification_rural_areas;
    }
}
