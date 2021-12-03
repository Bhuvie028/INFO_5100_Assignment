/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author bhuva
 */
public class ViewCarDetails {
    private ArrayList<CarDetails> details;
    
    public ViewCarDetails(){
        this.details = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<CarDetails> details) {
        this.details = details;
    }
    
    public CarDetails addNewCarDetails(){
        CarDetails newCarDetails = new CarDetails();
        details.add(newCarDetails);
        return newCarDetails;
    }
    
    
    public void deleteCarDetails(CarDetails cd){
        details.remove(cd);
        
    
}
}
