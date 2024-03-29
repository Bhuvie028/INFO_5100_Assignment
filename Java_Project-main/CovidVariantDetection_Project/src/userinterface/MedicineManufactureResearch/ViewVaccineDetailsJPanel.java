/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineManufactureResearch;

import Business.VaccineInventory.VaccineMixture;
import Business.Enterprise.Enterprise;
import Business.MedicalInventory.MedicalInventoryList;
import Business.Organization.MedicineOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author varadha
 */
public class ViewVaccineDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVaccineDetailsJPanel
     */
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList medInvList;
    private MedicineOrganization medOrg;
    private VaccineMixture vaccineMix;
    private static Logger log = Logger.getLogger(ViewVaccineDetailsJPanel.class);
    private static final String CLASS_NAME = ViewVaccineDetailsJPanel.class.getName();

    public ViewVaccineDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, VaccineMixture mix) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.medOrg = medOrg;
        this.vaccineMix = mix;
        serialNumTextField.setText(String.valueOf(mix.getRollNum()));
        availQuantityTextField.setText(String.valueOf(mix.getQtyAvail()));
        chemicalNameTextField.setText(mix.getVaccineName());
        try {
            String phone = JOptionPane.showInputDialog(null, "Please enter phone number.");
            String opt = JOptionPane.showInputDialog(null, "Please enter the generated OTP.");
            if (opt.equalsIgnoreCase("12697") || opt.equalsIgnoreCase("30897") || opt.equalsIgnoreCase("28596") || opt.equalsIgnoreCase("15067")) {
                serialNumTextField.setEnabled(true);
                chemicalNameTextField.setEnabled(true);
                availQuantityTextField.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No Update Access.");
                serialNumTextField.setEnabled(false);
                chemicalNameTextField.setEnabled(false);
                availQuantityTextField.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Update Access.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNumLabel = new javax.swing.JLabel();
        serialNumTextField = new javax.swing.JTextField();
        drugLabel = new javax.swing.JLabel();
        chemicalNameTextField = new javax.swing.JTextField();
        availLabel = new javax.swing.JLabel();
        availQuantityTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serialNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        serialNumLabel.setText("SERIAL NUMBER:");
        add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 224, -1, -1));

        serialNumTextField.setEditable(false);
        add(serialNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 172, -1));

        drugLabel.setForeground(new java.awt.Color(255, 255, 255));
        drugLabel.setText("VACCINE NAME:");
        add(drugLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 255, -1, -1));

        chemicalNameTextField.setEditable(false);
        add(chemicalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 172, -1));

        availLabel.setForeground(new java.awt.Color(255, 255, 255));
        availLabel.setText("AVAILABILITY:");
        add(availLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 286, -1, -1));

        availQuantityTextField.setEditable(false);
        availQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availQuantityTextFieldActionPerformed(evt);
            }
        });
        add(availQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 172, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 255));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText(" BACK");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 329, 88, 33));

        saveButton.setBackground(new java.awt.Color(0, 0, 255));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SAVE");
        saveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 380, 127, 32));

        updateButton.setBackground(new java.awt.Color(0, 0, 255));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 329, 127, 33));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VACCINE DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 146, 286, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 28, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor-4.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 146, -1, 297));
    }// </editor-fold>//GEN-END:initComponents

    private void availQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availQuantityTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PlaceVaccineRequestsJPanel me = (PlaceVaccineRequestsJPanel) component;
        me.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (chemicalNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "chemical name is empty");
            return;
        }
        vaccineMix.setVaccineName(chemicalNameTextField.getText());

        try {
            int availableQuantity = Integer.parseInt(availQuantityTextField.getText());
            vaccineMix.setQtyAvail(availableQuantity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;
        }
        try {
            int serialNumber = Integer.parseInt(serialNumTextField.getText());
            vaccineMix.setRollNum(serialNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Serial number must be integer");
            return;
        }

        saveButton.setEnabled(false);
        updateButton.setEnabled(true);
        chemicalNameTextField.setEditable(false);
        serialNumTextField.setEditable(false);
        availQuantityTextField.setEditable(false);

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug(userAccount + " " + "updated chemical details successfully");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        chemicalNameTextField.setEditable(true);
        serialNumTextField.setEditable(true);
        availQuantityTextField.setEditable(true);
        updateButton.setEnabled(false);
        saveButton.setEnabled(true);
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel drugLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
