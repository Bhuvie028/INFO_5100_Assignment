/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sample;

import java.util.ArrayList;

/**
 *
 * @author varadha
 */
public class SampleDirectory {

    private ArrayList<Sample> SampleList;
    private ArrayList<Sample> SampleDirectory;
    private Sample newSample;

    public SampleDirectory() {
        this.SampleList = new ArrayList<Sample>();
    }

    public ArrayList<Sample> getSampleList() {
        return SampleList;
    }

    public void setSampleList(ArrayList<Sample> chemList) {
        this.SampleList = chemList;
    }

    public Sample getNewSample() {
        return newSample;
    }

    public void setNewSample(Sample newSample) {
        this.newSample = newSample;
    }

    public ArrayList<Sample> getSampleDirectory() {
        return SampleDirectory;
    }

    public void setSampleDirectory(ArrayList<Sample> SampleDirectory) {
        this.SampleDirectory = SampleDirectory;
    }

    public ArrayList<Sample> addSampleDirectory(Sample c) {
        ArrayList<Sample> sampleDirectory = new ArrayList<Sample>();
        sampleDirectory.add(c);
        return sampleDirectory;
    }

    public Sample addSampleList() {
        Sample c = new Sample();
        SampleList.add(c);
        return c;

    }
}
