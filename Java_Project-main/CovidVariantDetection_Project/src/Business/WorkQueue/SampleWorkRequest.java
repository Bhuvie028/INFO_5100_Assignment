/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author deepa
 */
public class SampleWorkRequest extends WorkRequest {

    private String status;
    private String sampleName;
    private int qty;
    private String TOD;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTOD() {
        return TOD;
    }

    public void setTOD(String TOD) {
        this.TOD = TOD;
    }

    @Override
    public String toString() {
        return sampleName;
    }
}
