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
 * @author bhuva
 */
public class MedicineEnterprise extends Enterprise {

    public MedicineEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Medicine);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
