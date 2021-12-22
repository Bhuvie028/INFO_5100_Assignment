/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DoctorClass.Order;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class DoctorOrganization extends Organization {

    private ArrayList<Order> orderList;

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());

        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }

    public void addPrescription(Order o) {

        orderList.add(o);

    }

}
