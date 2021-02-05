package com.mycompany.app;
public class Transportation{
    public NationalAirTransportSystem national_air_transport_system;
    public String civil_aircraft_registration_country_code_prefix;
    public String airports;
    public AirportsWithPavedRunways airports_with_paved_runways;
    public AirportsWithUnpavedRunways airports_with_unpaved_runways;
    public String heliports;
    public String pipelines;
    public Railways railways;
    public String roadways;
    public String waterways;
    public MerchantMarine merchant_marine;
    public PortsAndTerminals ports_and_terminals;

    public NationalAirTransportSystem getNational_air_transport_system() {
        return national_air_transport_system;
    }

    public void setNational_air_transport_system(NationalAirTransportSystem national_air_transport_system) {
        this.national_air_transport_system = national_air_transport_system;
    }

    public String getCivil_aircraft_registration_country_code_prefix() {
        return civil_aircraft_registration_country_code_prefix;
    }

    public void setCivil_aircraft_registration_country_code_prefix(String civil_aircraft_registration_country_code_prefix) {
        this.civil_aircraft_registration_country_code_prefix = civil_aircraft_registration_country_code_prefix;
    }

    public String getAirports() {
        return airports;
    }

    public void setAirports(String airports) {
        this.airports = airports;
    }

    public AirportsWithPavedRunways getAirports_with_paved_runways() {
        return airports_with_paved_runways;
    }

    public void setAirports_with_paved_runways(AirportsWithPavedRunways airports_with_paved_runways) {
        this.airports_with_paved_runways = airports_with_paved_runways;
    }

    public AirportsWithUnpavedRunways getAirports_with_unpaved_runways() {
        return airports_with_unpaved_runways;
    }

    public void setAirports_with_unpaved_runways(AirportsWithUnpavedRunways airports_with_unpaved_runways) {
        this.airports_with_unpaved_runways = airports_with_unpaved_runways;
    }

    public String getHeliports() {
        return heliports;
    }

    public void setHeliports(String heliports) {
        this.heliports = heliports;
    }

    public String getPipelines() {
        return pipelines;
    }

    public void setPipelines(String pipelines) {
        this.pipelines = pipelines;
    }

    public Railways getRailways() {
        return railways;
    }

    public void setRailways(Railways railways) {
        this.railways = railways;
    }

    public String getRoadways() {
        return roadways;
    }

    public void setRoadways(String roadways) {
        this.roadways = roadways;
    }

    public String getWaterways() {
        return waterways;
    }

    public void setWaterways(String waterways) {
        this.waterways = waterways;
    }

    public MerchantMarine getMerchant_marine() {
        return merchant_marine;
    }

    public void setMerchant_marine(MerchantMarine merchant_marine) {
        this.merchant_marine = merchant_marine;
    }

    public PortsAndTerminals getPorts_and_terminals() {
        return ports_and_terminals;
    }

    public void setPorts_and_terminals(PortsAndTerminals ports_and_terminals) {
        this.ports_and_terminals = ports_and_terminals;
    }
}
