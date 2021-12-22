/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SampleInventory;
import Business.MedicalInventory.MedicalInventory;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class SampleCompoundList {
    
    private ArrayList<SampleCompound> sampleList;

    public SampleCompoundList() {
        sampleList =  new ArrayList<SampleCompound>();
    }

    public ArrayList<SampleCompound> getSampleList() {
        return sampleList;
    }

    public void setSampleList(ArrayList<SampleCompound> sampleList) {
        this.sampleList = sampleList;
    }
    
    public SampleCompound addSample()
    {
        SampleCompound ci = new SampleCompound();
        sampleList.add(ci);
        return ci;
    }
    
    public void deleteSample(SampleCompound cid){
     sampleList.remove(cid);
    }
    
    
    
}
