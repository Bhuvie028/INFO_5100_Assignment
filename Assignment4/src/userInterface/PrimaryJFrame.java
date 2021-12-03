/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author bhuva
 */
public class PrimaryJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrimaryJFrame
     */
    PersonDirectory person;
    PatientDirectory patient;
    public PrimaryJFrame() {
        initComponents();
        person = new PersonDirectory();
        patient = new PatientDirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseJSplitPane = new javax.swing.JSplitPane();
        leftSideJPanel = new javax.swing.JPanel();
        btnPerson = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        rightSideJPanel = new javax.swing.JPanel();
        primaryPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftSideJPanel.setBackground(new java.awt.Color(0, 204, 204));
        leftSideJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });
        leftSideJPanel.add(btnPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        leftSideJPanel.add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, -1, -1));

        baseJSplitPane.setLeftComponent(leftSideJPanel);

        rightSideJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primaryPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/primary Image.jpg"))); // NOI18N
        rightSideJPanel.add(primaryPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 900));

        baseJSplitPane.setRightComponent(rightSideJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseJSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseJSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel personDetails = new PersonJPanel(person,patient);
        baseJSplitPane.setRightComponent(personDetails);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientJPanel patientDetails = new PatientJPanel(patient,person);
        baseJSplitPane.setRightComponent(patientDetails);
    }//GEN-LAST:event_btnPatientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrimaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimaryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane baseJSplitPane;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JPanel leftSideJPanel;
    private javax.swing.JLabel primaryPic;
    private javax.swing.JPanel rightSideJPanel;
    // End of variables declaration//GEN-END:variables
}