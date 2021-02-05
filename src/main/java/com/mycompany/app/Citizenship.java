package com.mycompany.app;
public class Citizenship{
    public String citizenship_by_birth;
    public String citizenship_by_descent_only;
    public String dual_citizenship_recognized;
    public String residency_requirement_for_naturalization;

    public String getCitizenship_by_birth() {
        return citizenship_by_birth;
    }

    public void setCitizenship_by_birth(String citizenship_by_birth) {
        this.citizenship_by_birth = citizenship_by_birth;
    }

    public String getCitizenship_by_descent_only() {
        return citizenship_by_descent_only;
    }

    public void setCitizenship_by_descent_only(String citizenship_by_descent_only) {
        this.citizenship_by_descent_only = citizenship_by_descent_only;
    }

    public String getDual_citizenship_recognized() {
        return dual_citizenship_recognized;
    }

    public void setDual_citizenship_recognized(String dual_citizenship_recognized) {
        this.dual_citizenship_recognized = dual_citizenship_recognized;
    }

    public String getResidency_requirement_for_naturalization() {
        return residency_requirement_for_naturalization;
    }

    public void setResidency_requirement_for_naturalization(String residency_requirement_for_naturalization) {
        this.residency_requirement_for_naturalization = residency_requirement_for_naturalization;
    }
}
