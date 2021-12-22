/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Disease.Disease;
import Business.DoctorClass.Patient;
import Business.Variant.Variant;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bhuva
 */
public class LabTestWorkRequest extends WorkRequest {

    private String testResult;
    private Map<Disease, List<Variant>> diseaseListGenes;
    private Variant variant;
    private String patientName;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Map<Disease, List<Variant>> getDiseaseListGenes() {
        return diseaseListGenes;
    }

    public void setDiseaseListGenes(Map<Disease, List<Variant>> diseaseListGenes) {
        this.diseaseListGenes = diseaseListGenes;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    @Override
    public String toString() {
        return this.patientName;
    }

}
