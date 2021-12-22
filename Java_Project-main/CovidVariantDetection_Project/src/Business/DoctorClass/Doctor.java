/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorClass;

/**
 *
 * @author deepa
 */
public class Doctor {

    private String docotrName;
    private OrderList ordersList;
    private int docID = 2345;

    public Doctor() {
        ordersList = new OrderList();
    }

    public String getDocotrName() {
        return docotrName;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        docID++;
        this.docID = docID;
    }

    public void setDocotrName(String docotrName) {
        this.docotrName = docotrName;
    }

    public OrderList getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(OrderList ordersList) {
        this.ordersList = ordersList;
    }

}
