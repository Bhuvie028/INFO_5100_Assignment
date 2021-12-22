/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class OrganizationDirectory {

    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new PharmacyOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Medicine.getValue())) {
            organization = new MedicineOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Vaccine.getValue())) {
            organization = new VaccineOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Sample.getValue())) {
            organization = new SampleOrganization();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Clinic.getValue())) {
            organization = new ClinicOrganization();
            orgList.add(organization);
        }
        return organization;
    }
}
