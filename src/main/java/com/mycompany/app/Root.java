package com.mycompany.app;

import java.util.ArrayList;

public class Root{
    public String name;
    public String code;
    public String publish_date;
    public Introduction introduction;
    public Geography geography;
    public PeopleAndSociety people_and_society;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public Introduction getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Introduction introduction) {
        this.introduction = introduction;
    }

    public Geography getGeography() {
        return geography;
    }

    public void setGeography(Geography geography) {
        this.geography = geography;
    }

    public PeopleAndSociety getPeople_and_society() {
        return people_and_society;
    }

    public void setPeople_and_society(PeopleAndSociety people_and_society) {
        this.people_and_society = people_and_society;
    }

    public ArrayList<String> getInserts(int idPais){
        String insert = "INSERT INTO Country (idCountry, name, code, introduction, population, nationality, officialLenguage, religions, " +
                "capital, administrativeDivisions, chiefState, nationalSymbol) VALUES " +
                "("+idPais+", '"+getName()+"', '"+getCode()+"', '"+getIntroduction().getBackground()+"', "+getPeople_and_society().getRealPopulation()+"," +
                "'"+getPeople_and_society().getNationality().getNoun()+"', '"+getPeople_and_society().getLanguages()+"', '"+getPeople_and_society().getReligions()+"'," +
                "'"+getPeople_and_society().getGovernment().getCapital().getName()+"', '"+getPeople_and_society().getGovernment().getAdministrative_divisions()+"'," +
                "'"+getPeople_and_society().getGovernment().getExecutive_branch().getChief_of_state()+"', '"+getPeople_and_society().getGovernment().getNational_symbol_s()+"')";
        ArrayList<String> inserts = new ArrayList<>();
        inserts.add(insert);

        System.out.println(insert);
        return inserts;
    }
}
