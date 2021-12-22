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
public class VariantHistory {

    private Variant variant;

    public VariantHistory() {
        variant = new Variant();
    }

    public Variant getVariantHistory() {
        if (variant == null) {
            variant = new Variant();
        }
        return variant;
    }

    public void setVariantHistory(Variant variant) {
        this.variant = variant;
    }

}
