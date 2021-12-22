/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sample;

import Business.Sample.*;

/**
 *
 * @author varadha
 */
public class Sample {

    private String sampleName;
    private int ID;
    private static int count = 1;

    public Sample() {
        ID = count;
        count++;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Sample{" + "sampleName=" + sampleName + ", id=" + ID + '}';
    }

}
