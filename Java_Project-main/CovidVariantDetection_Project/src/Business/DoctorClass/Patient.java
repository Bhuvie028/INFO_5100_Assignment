/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorClass;

import Business.Vaccine.VaccineDirectory;
import Business.Medicine.Medicine;
import Business.Variant.Variant;
import Business.Variant.VariantHistory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deepa
 */
public class Patient {

    private int patientID;
    private String patientName;
    private int age;
    private String Gender;
    private String email;
    private String Test;
    private VariantHistory variantHistory;
    private String sex;
    private String newMedicine;
    private String clinicalStatus;
    private VariantHistory newVariantHistory;
    private VaccineDirectory newVaccineList;
    private Medicine newMed;

    public Patient() {

        variantHistory = new VariantHistory();
        newVariantHistory = new VariantHistory();
        newVaccineList = new VaccineDirectory();
        newMed = new Medicine();
    }

    public String getClinicalStatus() {
        return clinicalStatus;
    }

    public void setClinicalStatus(String clinicalStatus) {
        this.clinicalStatus = clinicalStatus;
    }

    public String getNewMedicine() {
        return newMedicine;
    }

    public void setNewMedicine(String newMedicine) {
        this.newMedicine = newMedicine;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public VariantHistory getVariantHistory() {
        return variantHistory;
    }

    public void setVariantHistory(VariantHistory variantHistory) {
        this.variantHistory = variantHistory;
    }

    public VariantHistory getNewVariantHistory() {
        return newVariantHistory;
    }

    public void setNewVariantHistory(VariantHistory newVariantHistory) {
        this.newVariantHistory = newVariantHistory;
    }

    public VaccineDirectory getNewVaccineList() {
        return newVaccineList;
    }

    public void setNewVaccineList(VaccineDirectory newVaccineList) {
        this.newVaccineList = newVaccineList;
    }

    public Medicine getNewMed() {
        return newMed;
    }

    public void setNewMed(Medicine newMed) {
        this.newMed = newMed;
    }

    @Override
    public String toString() {
        return this.patientName;
    }

}
