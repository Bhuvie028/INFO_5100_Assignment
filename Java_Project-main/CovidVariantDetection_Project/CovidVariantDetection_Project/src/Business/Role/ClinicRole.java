/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClinicalTrial.ClinicAssistantWorkAreaJPanel;

/**
 *
 * @author deepa
 */
public class ClinicRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ClinicAssistantWorkAreaJPanel(userProcessContainer, account, (ClinicOrganization) organization, enterprise, business, network);
    }

}
