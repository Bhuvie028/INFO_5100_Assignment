/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineInventory;

import java.util.Date;

/**
 *
 * @author deepa
 */
public class VaccineMixture {

    private String vaccineName;
    private int rePurchaseCount;
    private int minAvail;
    private int maxAvail;
    private Date DOE;
    private String pharmCatog;
    private int QtyAvail;
    private double purchPrice;
    private double sellPrice;
    private int vaccineID;
    private int RollNum;
    private int neededQty;
    private String PurchaseStatus = "N";

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
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

    public String getPharmCatog() {
        return pharmCatog;
    }

    public void setPharmCatog(String pharmCatog) {
        this.pharmCatog = pharmCatog;
    }

    public int getQtyAvail() {
        return QtyAvail;
    }

    public void setQtyAvail(int QtyAvail) {
        this.QtyAvail = QtyAvail;
    }

    public double getPurchPrice() {
        return purchPrice;
    }

    public void setPurchPrice(double purchPrice) {
        this.purchPrice = purchPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    public int getRollNum() {
        return RollNum;
    }

    public void setRollNum(int RollNum) {
        this.RollNum = RollNum;
    }

    public int getNeededQty() {
        return neededQty;
    }

    public void setNeededQty(int neededQty) {
        this.neededQty = neededQty;
    }

    public String getPurchaseStatus() {
        return PurchaseStatus;
    }

    public void setPurchaseStatus(String PurchaseStatus) {
        this.PurchaseStatus = PurchaseStatus;
    }

    @Override
    public String toString() {
        return this.vaccineName;
    }

}
