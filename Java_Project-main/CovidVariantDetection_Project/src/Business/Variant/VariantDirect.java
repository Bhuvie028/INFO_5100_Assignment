/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Variant;

import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class VariantDirect {

    private ArrayList<Variant> variantDirectory;

    public VariantDirect() {
        variantDirectory = new ArrayList();
    }

    public ArrayList<Variant> getVariantDirectory() {
        return variantDirectory;
    }

    public void setVariantDirectory(ArrayList<Variant> variantDirectory) {
        this.variantDirectory = variantDirectory;
    }

    public ArrayList<Variant> addVariantToDirectory(Variant variant) {
        System.out.println(variant);
        if (variantDirectory == null) {
            System.out.println("null");
            ArrayList<Variant> varDirectory = new ArrayList<>();
            varDirectory.add(variant);
        }
        System.out.println("out of if null");
        ArrayList<Variant> varDirectory = new ArrayList<>();
        varDirectory.add(variant);

        return varDirectory;
    }

}
