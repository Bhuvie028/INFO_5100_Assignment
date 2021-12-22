/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class ClinicOrganization extends Organization {

    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicRole());
        return roles;
    }

}
