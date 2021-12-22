/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Vaccine.Vaccine;
import Business.DoctorClass.Patient;
import Business.Medicine.Medicine;
import Business.Variant.Variant;
import java.util.List;
import java.util.Map;

/**
 *
 * @author deepa
 */
public class MedicineWorkRequest extends WorkRequest {

    private String medName;
    private int qty;
    private String TOD;
    private Patient patient;
    private Map<Variant, Vaccine> geneChemical;
    private Map<Medicine, List<Vaccine>> drugChemical;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
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

    public Map<Variant, Vaccine> getGeneChemical() {
        return geneChemical;
    }

    public void setGeneChemical(Map<Variant, Vaccine> geneChemical) {
        this.geneChemical = geneChemical;
    }

    public Map<Medicine, List<Vaccine>> getDrugChemical() {
        return drugChemical;
    }

    public void setDrugChemical(Map<Medicine, List<Vaccine>> drugChemical) {
        this.drugChemical = drugChemical;
    }

    @Override
    public String toString() {
        return this.medName;
    }

}
