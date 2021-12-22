/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DoctorClass;

import java.util.Date;

/**
 *
 * @author deepa
 */
public class Order {

    private int FreqInADay;
    private int daysTotal;
    private String issue;
    private String medName;
    private String email;

    private Date orderDate;
    private String networkName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getFreqInADay() {
        return FreqInADay;
    }

    public void setFreqInADay(int FreqInADay) {
        this.FreqInADay = FreqInADay;
    }

    public int getDaysTotal() {
        return daysTotal;
    }

    public void setDaysTotal(int daysTotal) {
        this.daysTotal = daysTotal;
    }

}
