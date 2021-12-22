/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Variant;

/**
 *
 * @author deepa
 */
public class Variant {

    private String variantName;
    private int ID;
    private static int count = 1;

    public Variant() {
        ID = count;
        count++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    @Override
    public String toString() {
        return "Variant{" + "variantName=" + variantName + ", ID=" + ID + '}';
    }

}
