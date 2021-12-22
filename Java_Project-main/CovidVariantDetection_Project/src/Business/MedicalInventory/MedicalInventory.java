/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalInventory;

import java.util.Date;

/**
 *
 * @author bhuva
 */
public class MedicalInventory {

    private String medName;
    private int rePurchaseCount;
    private int minAvail;
    private int maxAvail;
    private Date DOE;
    private String pharmCato;
    private int QtyAvail;
    private double buyPrice;
    private double sellPrice;
    private int prodID;
    private int rollNum;
    private int neededQty;
    private String rePurchaseStatus = "N";

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getRePurchaseCount() {
        return rePurchaseCount;
    }

    public void setRePurchaseCount(int rePurchaseCount) {
        this.rePurchaseCount = rePurchaseCount;
    }

    public int getMinAvail() {
        return minAvail;
    }

    public void setMinAvail(int minAvail) {
        this.minAvail = minAvail;
    }

    public int getMaxAvail() {
        return maxAvail;
    }

    public void setMaxAvail(int maxAvail) {
        this.maxAvail = maxAvail;
    }

    public Date getDOE() {
        return DOE;
    }

    public void setDOE(Date DOE) {
        this.DOE = DOE;
    }

    public String getPharmCato() {
        return pharmCato;
    }

    public void setPharmCato(String pharmCato) {
        this.pharmCato = pharmCato;
    }

    public int getQtyAvail() {
        return QtyAvail;
    }

    public void setQtyAvail(int QtyAvail) {
        this.QtyAvail = QtyAvail;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getNeededQty() {
        return neededQty;
    }

    public void setNeededQty(int neededQty) {
        this.neededQty = neededQty;
    }

    public String getRePurchaseStatus() {
        return rePurchaseStatus;
    }

    public void setRePurchaseStatus(String rePurchaseStatus) {
        this.rePurchaseStatus = rePurchaseStatus;
    }

    @Override
    public String toString() {
        return this.medName;
    }
}
