/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhuva
 */
    public class CarDetails {
    private String manufacturerName;
    private String modelName;
    private String modelNumber;
    private String manufacturerYear;
    private int unitsAvailable;
    private String carClassType;
    private int numberOfSeats;
    private String location;
    private String maintenanceCertificateDate;

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(String manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }

    public String getCarClassType() {
        return carClassType;
    }

    public void setCarClassType(String carClassType) {
        this.carClassType = carClassType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaintenanceCertificateDate() {
        return maintenanceCertificateDate;
    }

    public void setMaintenanceCertificateDate(String maintenanceCertificateDate) {
        this.maintenanceCertificateDate = maintenanceCertificateDate;
    }
    
    @Override
    public String toString(){
        return manufacturerName; 
    }    
}
