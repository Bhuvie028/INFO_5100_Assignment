/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author bhuva
 */
public class VaccineDirectory {

    private ArrayList<Vaccine> vaccineList;
    private ArrayList<Vaccine> vaccineDirectory;
    private Vaccine newvaccine;

    public VaccineDirectory() {
        this.vaccineList = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public Vaccine getNewVaccine() {
        return newvaccine;
    }

    public void setNewVaccine(Vaccine newvaccine) {
        this.newvaccine = newvaccine;
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public ArrayList<Vaccine> addVaccineDirectory(Vaccine c) {
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<Vaccine>();
        vaccineDirectory.add(c);
        return vaccineDirectory;
    }

    public Vaccine addVaccineToList() {
        Vaccine c = new Vaccine();
        vaccineList.add(c);
        return c;

    }
}
