/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhuva
 */
public class EncounterHistory {
 private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
 public Encounter addNewEncounterDetails(){
        Encounter newEncounterDetails = new Encounter();
        encounterHistory.add(newEncounterDetails);
        return newEncounterDetails;
    }
}
