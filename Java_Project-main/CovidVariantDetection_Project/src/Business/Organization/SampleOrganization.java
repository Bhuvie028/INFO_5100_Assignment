/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SampleRole;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class SampleOrganization extends Organization {

    public SampleOrganization() {
        super(Organization.Type.Sample.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SampleRole());
        return roles;
    }

}
