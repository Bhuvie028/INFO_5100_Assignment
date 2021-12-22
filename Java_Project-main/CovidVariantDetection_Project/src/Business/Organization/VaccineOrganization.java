/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.VaccineRole;

import Business.Role.Role;
import Business.SampleInventory.SampleCompound;
import Business.VaccineInventory.VaccineMixture;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class VaccineOrganization extends Organization {

    private ArrayList<SampleCompound> sampleList;

    public VaccineOrganization() {
        super(Organization.Type.Vaccine.getValue());
        this.sampleList = new ArrayList<SampleCompound>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineRole());
        return roles;
    }

    public ArrayList<SampleCompound> getSampleList() {
        return sampleList;
    }

    public void setSampleList(ArrayList<SampleCompound> sampleList) {
        this.sampleList = sampleList;
    }

    public void addSample(SampleCompound vm) {

        sampleList.add(vm);

    }
}
