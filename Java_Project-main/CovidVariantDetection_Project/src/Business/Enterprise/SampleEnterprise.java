/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class SampleEnterprise extends Enterprise {

    public SampleEnterprise(String name) {
        super(name, EnterpriseType.Sample);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
