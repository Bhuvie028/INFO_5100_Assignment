/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.Vaccine.Vaccine;
import Business.Variant.Variant;

/**
 *
 * @author deepa
 */
public class Medicine {

    private int medID;
    private String medName;
    private Vaccine vaccine;
    private Variant variant;
    private static int counter = 0;

    public Medicine() {
        vaccine = new Vaccine();
        variant = new Variant();
        medID = counter;
        ++counter;

    }

    public int getMedId() {
        return medID;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Vaccine getVaccineList() {
        return vaccine;
    }

    public void setVaccineList(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    @Override
    public String toString() {
        return this.medName;
    }

}
