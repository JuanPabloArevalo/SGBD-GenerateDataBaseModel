package com.mycompany.app;
public class PeopleAndSociety{
    public String population;
    public Nationality nationality;
    public String ethnic_groups;
    public String languages;
    public String religions;
    public String demographic_profile;
    public AgeStructure age_structure;
    public DependencyRatios dependency_ratios;
    public MedianAge median_age;
    public String population_growth_rate;
    public String birth_rate;
    public String death_rate;
    public String net_migration_rate;
    public String population_distribution;
    public Urbanization urbanization;
    public String major_urban_areas_population;
    public SexRatio sex_ratio;
    public String mother_s_mean_age_at_first_birth;
    public String maternal_mortality_rate;
    public InfantMortalityRate infant_mortality_rate;
    public LifeExpectancyAtBirth life_expectancy_at_birth;
    public Government government;
    public Economy economy;
    public Energy energy;
    public Communications communications;
    public MilitaryAndSecurity military_and_security;
    public Transportation transportation;
    public Terrorism terrorism;
    public TransnationalIssues transnational_issues;

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getEthnic_groups() {
        return ethnic_groups;
    }

    public void setEthnic_groups(String ethnic_groups) {
        this.ethnic_groups = ethnic_groups;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getReligions() {
        return religions;
    }

    public void setReligions(String religions) {
        this.religions = religions;
    }

    public String getDemographic_profile() {
        return demographic_profile;
    }

    public void setDemographic_profile(String demographic_profile) {
        this.demographic_profile = demographic_profile;
    }

    public AgeStructure getAge_structure() {
        return age_structure;
    }

    public void setAge_structure(AgeStructure age_structure) {
        this.age_structure = age_structure;
    }

    public DependencyRatios getDependency_ratios() {
        return dependency_ratios;
    }

    public void setDependency_ratios(DependencyRatios dependency_ratios) {
        this.dependency_ratios = dependency_ratios;
    }

    public MedianAge getMedian_age() {
        return median_age;
    }

    public void setMedian_age(MedianAge median_age) {
        this.median_age = median_age;
    }

    public String getPopulation_growth_rate() {
        return population_growth_rate;
    }

    public void setPopulation_growth_rate(String population_growth_rate) {
        this.population_growth_rate = population_growth_rate;
    }

    public String getBirth_rate() {
        return birth_rate;
    }

    public void setBirth_rate(String birth_rate) {
        this.birth_rate = birth_rate;
    }

    public String getDeath_rate() {
        return death_rate;
    }

    public void setDeath_rate(String death_rate) {
        this.death_rate = death_rate;
    }

    public String getNet_migration_rate() {
        return net_migration_rate;
    }

    public void setNet_migration_rate(String net_migration_rate) {
        this.net_migration_rate = net_migration_rate;
    }

    public String getPopulation_distribution() {
        return population_distribution;
    }

    public void setPopulation_distribution(String population_distribution) {
        this.population_distribution = population_distribution;
    }

    public Urbanization getUrbanization() {
        return urbanization;
    }

    public void setUrbanization(Urbanization urbanization) {
        this.urbanization = urbanization;
    }

    public String getMajor_urban_areas_population() {
        return major_urban_areas_population;
    }

    public void setMajor_urban_areas_population(String major_urban_areas_population) {
        this.major_urban_areas_population = major_urban_areas_population;
    }

    public SexRatio getSex_ratio() {
        return sex_ratio;
    }

    public void setSex_ratio(SexRatio sex_ratio) {
        this.sex_ratio = sex_ratio;
    }

    public String getMother_s_mean_age_at_first_birth() {
        return mother_s_mean_age_at_first_birth;
    }

    public void setMother_s_mean_age_at_first_birth(String mother_s_mean_age_at_first_birth) {
        this.mother_s_mean_age_at_first_birth = mother_s_mean_age_at_first_birth;
    }

    public String getMaternal_mortality_rate() {
        return maternal_mortality_rate;
    }

    public void setMaternal_mortality_rate(String maternal_mortality_rate) {
        this.maternal_mortality_rate = maternal_mortality_rate;
    }

    public InfantMortalityRate getInfant_mortality_rate() {
        return infant_mortality_rate;
    }

    public void setInfant_mortality_rate(InfantMortalityRate infant_mortality_rate) {
        this.infant_mortality_rate = infant_mortality_rate;
    }

    public LifeExpectancyAtBirth getLife_expectancy_at_birth() {
        return life_expectancy_at_birth;
    }

    public void setLife_expectancy_at_birth(LifeExpectancyAtBirth life_expectancy_at_birth) {
        this.life_expectancy_at_birth = life_expectancy_at_birth;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }

    public Economy getEconomy() {
        return economy;
    }

    public void setEconomy(Economy economy) {
        this.economy = economy;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public Communications getCommunications() {
        return communications;
    }

    public void setCommunications(Communications communications) {
        this.communications = communications;
    }

    public MilitaryAndSecurity getMilitary_and_security() {
        return military_and_security;
    }

    public void setMilitary_and_security(MilitaryAndSecurity military_and_security) {
        this.military_and_security = military_and_security;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public Terrorism getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(Terrorism terrorism) {
        this.terrorism = terrorism;
    }

    public TransnationalIssues getTransnational_issues() {
        return transnational_issues;
    }

    public void setTransnational_issues(TransnationalIssues transnational_issues) {
        this.transnational_issues = transnational_issues;
    }


    public String getRealPopulation(){
        int position = population.indexOf("(");

        return population.substring(0, position)
                .replaceAll(",", "")
                .replaceAll(" ", "");
    }
}
