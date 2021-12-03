/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import model.ViewCarDetails;

/**
 *
 * @author bhuva
 */
public class PrimaryJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrimaryJFrame
     */
    ViewCarDetails details;
    
    public PrimaryJFrame() {
        initComponents();
        
        details = new ViewCarDetails();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneLeftRight = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAddCarDetails = new javax.swing.JButton();
        btnViewCarDetails = new javax.swing.JButton();
        workAreaPanel = new javax.swing.JPanel();
        lblNortheasternUniversity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(0, 0, 0));

        btnAddCarDetails.setText("Add Car");
        btnAddCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarDetailsActionPerformed(evt);
            }
        });

        btnViewCarDetails.setText("View Car");
        btnViewCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCarDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCarDetails)
                    .addComponent(btnViewCarDetails))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCarDetails, btnViewCarDetails});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnAddCarDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewCarDetails)
                .addContainerGap(846, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCarDetails, btnViewCarDetails});

        splitPaneLeftRight.setLeftComponent(controlPanel);

        workAreaPanel.setBackground(new java.awt.Color(0, 0, 0));
        workAreaPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.cyan), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 5, true)));

        lblNortheasternUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dcd1828no673.jpg"))); // NOI18N

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNortheasternUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 1325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNortheasternUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        splitPaneLeftRight.setRightComponent(workAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPaneLeftRight, javax.swing.GroupLayout.PREFERRED_SIZE, 1541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneLeftRight)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarDetailsActionPerformed
        // TODO add your handling code here:
        AddCarDetailsJPanel addCarDetailsJPanel = new AddCarDetailsJPanel(details);
        splitPaneLeftRight.setRightComponent(addCarDetailsJPanel);
    }//GEN-LAST:event_btnAddCarDetailsActionPerformed

    private void btnViewCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCarDetailsActionPerformed
        // TODO add your handling code here:
        ViewCarDetailsJPanel viewCarDetailsJPanel = new ViewCarDetailsJPanel(details);
        splitPaneLeftRight.setRightComponent(viewCarDetailsJPanel);
    }//GEN-LAST:event_btnViewCarDetailsActionPerformed

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
    private javax.swing.JButton btnAddCarDetails;
    private javax.swing.JButton btnViewCarDetails;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel lblNortheasternUniversity;
    private javax.swing.JSplitPane splitPaneLeftRight;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables
}