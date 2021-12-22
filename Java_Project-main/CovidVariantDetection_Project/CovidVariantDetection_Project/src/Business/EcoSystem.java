/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Medicine.Medicine;
import Business.Vaccine.VaccineDirectory;
import Business.Medicine.MedicinesDirectory;
import Business.Variant.VariantHistory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.Vaccine;
import Business.Variant.Variant;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private VaccineDirectory vaccineList;
    private MedicinesDirectory medList;
    private VariantHistory variantList;
    private Medicine medicine;
    private Vaccine vaccine;
    private Variant variant;
    private ArrayList<Medicine> listofM=new ArrayList<Medicine>();
    
     

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean UniqueUserCheck(String userName) {
        if (!this.getUAD().UniqueUsernameCheck(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    public MedicinesDirectory getMediList() {
        if (medList == null) {
            MedicinesDirectory mL = new MedicinesDirectory();
            return mL;
        }

        return medList;
    }

    public void setMediList(MedicinesDirectory medList) {
        this.medList = medList;
    }

    public VaccineDirectory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineDirectory vaccineList) {
        this.vaccineList = vaccineList;
    }

    public VariantHistory getVariantList() {
        return variantList;
    }

    public void setVariantList(VariantHistory variantList) {
        this.variantList = variantList;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public ArrayList<Medicine> getListofM() {
        return listofM;
    }

    public void setListofM(ArrayList<Medicine> listofM) {
        this.listofM = listofM;
    }

    public ArrayList<Medicine> addtoListofM(Medicine m) {
        if(m==null){
         ArrayList<Medicine> listofM=new ArrayList<Medicine>();
        listofM.add(m);
        return listofM;}
        else{listofM.add(m);
        return listofM;}
    }
}
