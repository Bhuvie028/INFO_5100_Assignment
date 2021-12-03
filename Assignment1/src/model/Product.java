/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
import javax.swing.*;

 


/**
 *
 * @author bhuva
 */
public class Product {
    
    private String name;
    private String address;
    private String dateOfBirth;
    private long phoneNumber;
    private long faxNumber;
    private String email;
    private long socialSecurityNumber;
    private int medicalRecordNumber;
    private int healthPlanBeneficiaryNumber;
    private long bankAccountNumber;
    private int licenseNumber;
    private int vehicleIdentifierNumber;
    private int deviceIdentifierNumber;
    private String linkedIn;
    private String ipAddress;
    private String fingerPrint;
    private String facialPhoto;
    private int pin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try{
        String regexName = "^[A-Za-z]\\w{5,29}$";
        Pattern namePattern = Pattern.compile(regexName);
        if ((name != null) && (namePattern.matcher(name).matches())) {
            this.name = name;
        }else {
            JOptionPane.showMessageDialog(null, "Please provide appropriate name!!");
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in provided Name!!");
        }
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        try{
            if (address.length()<=10){
            JOptionPane.showConfirmDialog(null, "Please provide valid address");
        }else{
        this.address = address;
        }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "ERROR!! Please provide valid address");
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        try{
            String strDate = dateOfBirth.substring(0,2);
            int intDate = Integer.parseInt(strDate);
            String strMonth = dateOfBirth.substring(3,5);
            int intMonth = Integer.parseInt(strMonth);
            String strYear = dateOfBirth.substring(6,10);
            int intYear = Integer.parseInt(strYear);
            if ((intDate <= 31)&&(intMonth <=12)&&(intYear>=1000)){
                this.dateOfBirth = dateOfBirth;
            } else {
                JOptionPane.showConfirmDialog(null, "Date of Birth should be in DD/MM/YYYY");
            }  
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error!! Date of Birth should be in DD/MM/YYYY");
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;   
    }
        

    public void setPhoneNumber(String phoneNumber) {
        try{
            long longPhoneNumber = Long.parseLong(phoneNumber);
            if((phoneNumber.length()==10) && (phoneNumber.matches("^[0-9]+$"))){
                this.phoneNumber = longPhoneNumber;
            } else {
                JOptionPane.showMessageDialog(null, "Phone Number should be 10 digits!");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in provided Phone Number!");
        }
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        try{
            long longFaxNumber = Long.parseLong(faxNumber);
            if(((faxNumber.length())==10) && (faxNumber.matches("^[0-9]+$"))){
                this.faxNumber = longFaxNumber;
            } else {
                JOptionPane.showMessageDialog(null, "FAX Number should be 10 digits!");
                        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type Numerical value in Fax Number!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try{
            String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                                "[a-zA-Z0-9_+&*-]+)*@" +
                                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                                "A-Z]{2,7}$";
            Pattern emailPattern = Pattern.compile(regexEmail);
            if(emailPattern.matcher(email).matches()){
                this.email = email;
            } else {
                JOptionPane.showMessageDialog(null, "Enter Valid Email Address!");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Email Address!");
        }
        
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        try{
            long longSocialSecurityNumber = Long.parseLong(socialSecurityNumber);
            String regex = "^(?!000|666)[0-8][0-9]{2}(?!00)[0-9]{2}(?!0000)[0-9]{4}$";
            Pattern pattern = Pattern.compile(regex);
            if (pattern.matcher(socialSecurityNumber).matches()){
                this.socialSecurityNumber = longSocialSecurityNumber;
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter 9 numerical Digits in Social Security Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Valid Social Security Number!");
        }
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        try{
            int intMedicalRecordNumber = Integer.parseInt(medicalRecordNumber);
            if (medicalRecordNumber.length() == 6){
                this.medicalRecordNumber = intMedicalRecordNumber;
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in Medical Record Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Medical Record Number!");
        }
    }

    public int getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
        try{
            int intHealthPlanBeneficiaryNumber = Integer.parseInt(healthPlanBeneficiaryNumber);
            if (healthPlanBeneficiaryNumber.length() == 6){
                this.healthPlanBeneficiaryNumber = intHealthPlanBeneficiaryNumber;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in Health Plan Beneficiary Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Health Plan Beneficiary Number!");
        }
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        try{
            long longBankAccountNumber = Long.parseLong(bankAccountNumber);
            if (bankAccountNumber.length() == 12){
                this.bankAccountNumber = longBankAccountNumber;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 12 numerical Characters in Bank Account Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Bank Account Number!");
        }
    }
    

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        try{
            int intLicenseNumber = Integer.parseInt(licenseNumber);
            if (licenseNumber.length() == 6){
                this.licenseNumber = intLicenseNumber;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in License Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided License Number!");
        }
    }

    public int getVehicleIdentifierNumber() {
        return vehicleIdentifierNumber;
    }

    public void setVehicleIdentifierNumber(String vehicleIdentifierNumber) {
        try{
            int intVehicleIdentifierNumber = Integer.parseInt(vehicleIdentifierNumber);
            if (vehicleIdentifierNumber.length() == 6){
                this.vehicleIdentifierNumber = intVehicleIdentifierNumber;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in Vehicle Identifier Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Vehicle Identifier Number!");
        }
        
    }

    public int getDeviceIdentifierNumber() {
        return deviceIdentifierNumber;
    }

    public void setDeviceIdentifierNumber(String deviceIdentifierNumber) {
        try{
            int intDeviceIdentifierNumber = Integer.parseInt(deviceIdentifierNumber);
            if (deviceIdentifierNumber.length() == 6){
                this.deviceIdentifierNumber = intDeviceIdentifierNumber;;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in Device Identifier Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Device Identifier Number!");
        }
        
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        try{
        if (linkedIn.contains("linkedin.com")){
            this.linkedIn = linkedIn;
        }else{
            JOptionPane.showMessageDialog(null, "Enter the linkedin URL to your profile!!");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR!! Enter the linkedin URL to your profile!!");
        }
        
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        try{
            String IpRegx =
                        "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
            Pattern IpPattern = Pattern.compile(IpRegx);
            if(IpPattern.matcher(ipAddress).matches()){
                this.ipAddress = ipAddress;
            }
            else {
                JOptionPane.showMessageDialog(null, "Enter Valid IP Address!");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in IP Address!");
            }
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getFacialPhoto() {
        return facialPhoto;
    }

    public void setFacialPhoto(String facialPhoto) {
        System.out.println(facialPhoto);
        this.facialPhoto = facialPhoto;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(String pin) {
        try{
            int intPersonalIdentityNumber = Integer.parseInt(pin);
            if (pin.length() == 6){
                this.pin = intPersonalIdentityNumber;                
            }else {
                JOptionPane.showMessageDialog(null,"Enter 6 numerical Characters in Personal Identity Number");
            }
        }    
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error in provided Personal Identity Number!");
        }
        }
    }
    

