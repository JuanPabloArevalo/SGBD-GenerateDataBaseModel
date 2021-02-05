package com.mycompany.app;

import java.util.ArrayList;

public class Government{
    public CountryName country_name;
    public String government_type;
    public Capital capital;
    public String administrative_divisions;
    public String independence;
    public String national_holiday;
    public Constitution constitution;
    public String legal_system;
    public String international_law_organization_participation;
    public Citizenship citizenship;
    public String suffrage;
    public ExecutiveBranch executive_branch;
    public LegislativeBranch legislative_branch;
    public JudicialBranch judicial_branch;
    public String political_parties_and_leaders;
    public String international_organization_participation;
    public DiplomaticRepresentationInTheUs diplomatic_representation_in_the_us;
    public DiplomaticRepresentationFromTheUs diplomatic_representation_from_the_us;
    public String flag_description;
    public String national_symbol_s;
    public NationalAnthem national_anthem;

    public CountryName getCountry_name() {
        return country_name;
    }

    public void setCountry_name(CountryName country_name) {
        this.country_name = country_name;
    }

    public String getGovernment_type() {
        return government_type;
    }

    public void setGovernment_type(String government_type) {
        this.government_type = government_type;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public String getAdministrative_divisions() {
        return administrative_divisions;
    }

    public void setAdministrative_divisions(String administrative_divisions) {
        this.administrative_divisions = administrative_divisions;
    }

    public String getIndependence() {
        return independence;
    }

    public void setIndependence(String independence) {
        this.independence = independence;
    }

    public String getNational_holiday() {
        return national_holiday;
    }

    public void setNational_holiday(String national_holiday) {
        this.national_holiday = national_holiday;
    }

    public Constitution getConstitution() {
        return constitution;
    }

    public void setConstitution(Constitution constitution) {
        this.constitution = constitution;
    }

    public String getLegal_system() {
        return legal_system;
    }

    public void setLegal_system(String legal_system) {
        this.legal_system = legal_system;
    }

    public String getInternational_law_organization_participation() {
        return international_law_organization_participation;
    }

    public void setInternational_law_organization_participation(String international_law_organization_participation) {
        this.international_law_organization_participation = international_law_organization_participation;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    public String getSuffrage() {
        return suffrage;
    }

    public void setSuffrage(String suffrage) {
        this.suffrage = suffrage;
    }

    public ExecutiveBranch getExecutive_branch() {
        return executive_branch;
    }

    public void setExecutive_branch(ExecutiveBranch executive_branch) {
        this.executive_branch = executive_branch;
    }

    public LegislativeBranch getLegislative_branch() {
        return legislative_branch;
    }

    public void setLegislative_branch(LegislativeBranch legislative_branch) {
        this.legislative_branch = legislative_branch;
    }

    public JudicialBranch getJudicial_branch() {
        return judicial_branch;
    }

    public void setJudicial_branch(JudicialBranch judicial_branch) {
        this.judicial_branch = judicial_branch;
    }

    public String getPolitical_parties_and_leaders() {
        return political_parties_and_leaders;
    }

    public void setPolitical_parties_and_leaders(String political_parties_and_leaders) {
        this.political_parties_and_leaders = political_parties_and_leaders;
    }

    public String getInternational_organization_participation() {
        return international_organization_participation;
    }

    public void setInternational_organization_participation(String international_organization_participation) {
        this.international_organization_participation = international_organization_participation;
    }

    public DiplomaticRepresentationInTheUs getDiplomatic_representation_in_the_us() {
        return diplomatic_representation_in_the_us;
    }

    public void setDiplomatic_representation_in_the_us(DiplomaticRepresentationInTheUs diplomatic_representation_in_the_us) {
        this.diplomatic_representation_in_the_us = diplomatic_representation_in_the_us;
    }

    public DiplomaticRepresentationFromTheUs getDiplomatic_representation_from_the_us() {
        return diplomatic_representation_from_the_us;
    }

    public void setDiplomatic_representation_from_the_us(DiplomaticRepresentationFromTheUs diplomatic_representation_from_the_us) {
        this.diplomatic_representation_from_the_us = diplomatic_representation_from_the_us;
    }

    public String getFlag_description() {
        return flag_description;
    }

    public void setFlag_description(String flag_description) {
        this.flag_description = flag_description;
    }

    public String getNational_symbol_s() {
        return national_symbol_s;
    }

    public void setNational_symbol_s(String national_symbol_s) {
        this.national_symbol_s = national_symbol_s;
    }

    public NationalAnthem getNational_anthem() {
        return national_anthem;
    }

    public void setNational_anthem(NationalAnthem national_anthem) {
        this.national_anthem = national_anthem;
    }

    public ArrayList<String> getInserts(){
        int idInterno = 1;
        int idRelacion = 1;
        int idPais = App.idPais;
        ArrayList<String> arreglo = new ArrayList();
        String cadena = international_organization_participation;
        String[] parts = cadena.split(",");
        String sentencia = "";
        String sentenciaRelacion = "";
        String name = "";
        for(int i=0; i<parts.length; i++){
            name = parts[i];
            sentencia = "INSERT INTO internationalOrganization (IdInternationalOrganization, name) VALUES ("+idInterno+", '"+name+"')";
            sentenciaRelacion = "INSERT INTO internationalOrganizationParticipation (idInternationalOrganizationParticipation, idinternationalOrganization, idCountry) VALUES ("+idRelacion+", "+idInterno+", "+idPais+")";
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
