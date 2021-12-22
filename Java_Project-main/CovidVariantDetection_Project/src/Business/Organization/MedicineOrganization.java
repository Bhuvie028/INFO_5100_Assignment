/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.VaccineInventory.VaccineMixture;
import Business.Role.MedicineRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class MedicineOrganization extends Organization {

    private ArrayList<VaccineMixture> vaccineList;

    public MedicineOrganization() {

        super(Organization.Type.Medicine.getValue());
        vaccineList = new ArrayList<VaccineMixture>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicineRole());
        return roles;
    }

    public ArrayList<VaccineMixture> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<VaccineMixture> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public void addChemical(VaccineMixture vm) {

        vaccineList.add(vm);

    }

}
