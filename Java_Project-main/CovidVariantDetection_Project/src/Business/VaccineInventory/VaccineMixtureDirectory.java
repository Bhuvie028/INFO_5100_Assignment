/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineInventory;

import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class VaccineMixtureDirectory {

    private ArrayList<VaccineMixture> vaccineList;

    public VaccineMixtureDirectory() {
        vaccineList = new ArrayList<VaccineMixture>();
    }

    public ArrayList<VaccineMixture> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<VaccineMixture> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public VaccineMixture addVaccine() {
        VaccineMixture vm = new VaccineMixture();
        vaccineList.add(vm);
        return vm;
    }

    public void deleteVaccine(VaccineMixture vid) {
        vaccineList.remove(vid);
    }

}
