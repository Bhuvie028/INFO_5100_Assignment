/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorClass;

import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class OrderList {

    private ArrayList<Order> oList;

    public OrderList() {
        oList = new ArrayList<Order>();
    }

    public ArrayList<Order> getoList() {
        return oList;
    }

    public void setoList(ArrayList<Order> oList) {
        this.oList = oList;
    }

    public Order addPrescription() {
        Order o = new Order();
        oList.add(o);
        return o;

    }
}
