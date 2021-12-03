/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhuva
 */
public class PatientDirectory {
        private ArrayList<Patient> patient = new ArrayList();
    
    public PatientDirectory(){
        this.patient = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
    public Patient addNewPatientDetails(){
        Patient addPatientDetails = new Patient();
        patient.add(addPatientDetails);
        return addPatientDetails;
    }
    public void deletePersonDetails(Person pa){
        patient.remove(pa);
    }
}
