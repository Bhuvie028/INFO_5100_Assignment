/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class MedicinesDirectory {

    private ArrayList<Medicine> medList;

    public MedicinesDirectory() {
        this.medList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedList() {
        if (medList == null) {
            ArrayList<Medicine> medList = new ArrayList<Medicine>();
            return medList;
        }
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }

    public Medicine addMedList(Medicine med1) {
        if (med1 == null) {
            Medicine med = new Medicine();
            medList.add(med);
            return med;
        }
        medList.add(med1);
        return med1;

    }

}
