/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DoctorClass.Patient;

/**
 *
 * @author bhuva
 */
public class VaccineWorkRequest extends WorkRequest {

    private String status;
    private String vaccineName;
    private int qty;
    private String TOD;
    private Patient patient;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTOD() {
        return TOD;
    }

    public void setTOD(String TOD) {
        this.TOD = TOD;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return vaccineName;
    }

}
