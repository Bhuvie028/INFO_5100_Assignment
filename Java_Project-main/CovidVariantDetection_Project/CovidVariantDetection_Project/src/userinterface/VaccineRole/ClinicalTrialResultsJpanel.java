/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Business.Vaccine.VaccineDirectory;
import Business.Medicine.MedicinesDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Variant.VariantDirect;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;
import Business.Organization.VaccineOrganization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalTrialWorkRequest;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.VaccineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author kasai
 */
public class ClinicalTrialResultsJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private VaccineOrganization vaccineOrganization;
    private MedicinesDirectory dl;
    private VariantDirect variantDirectory;
    private VaccineDirectory vaccineDirectory;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(ClinicalTrialResultsJpanel.class);
    private static final String CLASS_NAME = ClinicalTrialResultsJpanel.class.getName();

    /**
     * Creates new form LabResultsJpanel
     */
    public ClinicalTrialResultsJpanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, VaccineOrganization vaccineOrganization, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.vaccineOrganization = vaccineOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.dl = dl;
        populateTable();
        this.setSize(1920, 1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 255));

        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Sender", "Status", "Sample"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        jScrollPane1.setViewportView(workRequestJTable);

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COVID-19 LAB TEST AND CLINICAL TRIAL RESULTS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DrugLabResults.jpg"))); // NOI18N

        assignBtn.setBackground(new java.awt.Color(0, 0, 255));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("ASSIGN");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1278, 1278, 1278))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        
        System.out.println(vaccineOrganization.getWQ().getWorkRequestList());
        System.out.println(vaccineOrganization.getWQ());
        System.out.println(vaccineOrganization);
        for (WorkRequest request : vaccineOrganization.getWQ().getWorkRequestList()) {
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
        System.out.println(userAccount.getWorkQueue());
        System.out.println(userAccount);
            if (request instanceof ClinicalTrialWorkRequest) {
                Object[] row = new Object[8];
                row[0] = ((ClinicalTrialWorkRequest) request);
                System.out.println(((ClinicalTrialWorkRequest) request));
                row[1] = ((ClinicalTrialWorkRequest) request).getPatient().getAge();
                System.out.println(((ClinicalTrialWorkRequest) request).getPatient().getAge());
                row[2] = ((ClinicalTrialWorkRequest) request).getPatient().getSex();
                System.out.println(((ClinicalTrialWorkRequest) request).getPatient().getSex());
                row[3] = request.getMessage();
                System.out.println(request.getMessage());
                row[4] = request.getReceiver();
                System.out.println(request.getReceiver());
                row[5] = request.getStatus();
                System.out.println(request.getStatus());
                String result = ((ClinicalTrialWorkRequest) request).getPatient().getNewVariantHistory().getVariantHistory().getVariantName();
                System.out.println(result);
                if (request.getReceiver() == null || request.getReceiver().equals("Processing")) {
                    row[6] = null;
                } else {
                    row[6] = ((ClinicalTrialWorkRequest) request).getPatient().getNewVariantHistory().getVariantHistory().getVariantName();
                }

                model.addRow(row);
            }
        }
        
        
        
       
        
        
//         model.setRowCount(0);
//
////        System.out.println(medicineOrganization.getWQ().getWorkRequestList());
//
//        for (WorkRequest request : vaccineOrganization.getWQ().getWorkRequestList()) {
////            System.out.println(request);
////            System.out.println(medicineOrganization.getWQ().getWorkRequestList());
////            System.out.println(((MedicineWorkRequest) request).getPatient());
////            System.out.println(((MedicineWorkRequest) request).getPatient() != null);
//            if (((VaccineWorkRequest) request).getPatient() != null) {
////                System.out.println(((MedicineWorkRequest) request).getPatient());
//                String vn = ((MedicineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
////                System.out.println(vn);
////                System.out.println(vn.equals("ALPHA"));
////                System.out.println(!vn.equals("BETA"));
////                System.out.println(!vn.equals("GAMMA"));
////                System.out.println(!vn.equals("DELTA"));
////                System.out.println(!vn.equals("OMICRON"));
//                if (!vn.equals("ALPHA")
//                        && !vn.equals("BETA") && !vn.equals("GAMMA")
//                        && !vn.equals("DELTA") && !vn.equals("OMICRON")) {
////                    System.out.println(vn);
//                    Object[] row = new Object[6];
//                    row[0] = ((MedicineWorkRequest) request).getPatient();
//                    row[1] = ((MedicineWorkRequest) request).getPatient().getAge();
//                    row[2] = ((MedicineWorkRequest) request).getPatient().getSex();
//                    row[3] = ((MedicineWorkRequest) request).getPatient().getTest();
//                    row[4] = request.getEndUser().getEmployee().getName();
//                    row[5] = vn;
//                    model.addRow(row);
//                }
//            }
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        

//        for (WorkRequest request : vaccineOrganization.getWorkQueue().getWorkRequestList()) {
//
//            if (((VaccineWorkRequest) request).getPatient() != null) {
//
//                String sn=((VaccineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getGeneName();
//
//                Object[] row = new Object[6];
//                row[0] = ((VaccineWorkRequest) request).getPatient();
//                row[1] = ((VaccineWorkRequest) request).getPatient().getAge();
//                row[2] = ((VaccineWorkRequest) request).getPatient().getSex();
//                row[3] = ((VaccineWorkRequest) request).getPatient().getTest();
//                row[4] = request.getSender().getEmployee().getName();
//                row[5] = sn;
//                model.addRow(row);
//        }
//        }
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineWorkArea dwjp = (VaccineWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }


        
        
        
        
        
        
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables


//    public void populateTable2(String newgene) {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//
//        model.setRowCount(0);
//
//        for (WorkRequest request : vaccineOrganization.getWQ().getWorkRequestList()) {
////            System.out.println(request);
////            System.out.println(drugOrganization.getWorkQueue().getWorkRequestList());
//            if (((MedicineWorkRequest) request).getPatient() != null) {
////                System.out.println(((MedicineWorkRequest) request).getPatient());
//                String vn = ((MedicineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
////                System.out.println(vn);
////                System.out.println(vn.equals("ALPHA"));
////                System.out.println(!vn.equals("BETA"));
////                System.out.println(!vn.equals("GAMMA"));
////                System.out.println(!vn.equals("DELTA"));
////                System.out.println(!vn.equals("OMICRON"));
//                if (!vn.equals("ALPHA")
//                        && !vn.equals("BETA") && !vn.equals("GAMMA")
//                        && !vn.equals("DELTA") && !vn.equals("OMICRON") && !vn.equals(newgene)) {
////                System.out.println(vn);
//                    Object[] row = new Object[6];
//                    row[0] = ((MedicineWorkRequest) request).getPatient();
//                    row[1] = ((MedicineWorkRequest) request).getPatient().getAge();
//                    row[2] = ((MedicineWorkRequest) request).getPatient().getSex();
//                    row[3] = ((MedicineWorkRequest) request).getPatient().getTest();
//                    row[4] = request.getEndUser().getEmployee().getName();
//                    row[5] = vn;
//                    model.addRow(row);
//                }
//            }
//        }
//
//    }
}