/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineManufactureResearch;

import Business.Vaccine.VaccineDirectory;
import Business.DoctorClass.Patient;
import Business.Medicine.MedicinesDirectory;
import Business.Medicine.Medicine;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Variant.Variant;
import Business.Variant.VariantDirect;
import Business.Network.Network;
import Business.Organization.MedicineOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Lo
 *
 * @author kasai
 */
public class TestLabResultsJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private MedicineOrganization medicineOrganization;
    private MedicinesDirectory dl;
    private VariantDirect variantDirectory;
    private VaccineDirectory vaccineDirectory;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(TestLabResultsJpanel.class);
    private static final String CLASS_NAME = TestLabResultsJpanel.class.getName();

    /**
     * Creates new form LabResultsJpanel
     */
    public TestLabResultsJpanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, MedicineOrganization medicineOrganization, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.medicineOrganization = medicineOrganization;
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
        assignBtn = new javax.swing.JButton();
        txtDrugName = new javax.swing.JTextField();
        txtChemicalName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        relationTbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));

        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT NAME", "AGE", "GENDER", "MESSAGE", "SENDER", "VARIANT AND SAMPLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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
        jLabel1.setText("LAB AND CLINICAL TRIAL RESULTS");

        assignBtn.setBackground(new java.awt.Color(0, 0, 255));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("ASSIGN");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEDICINE ASSIGNED:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VACCINE ASSIGNED:");

        relationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MEDICINE", "VARIANT", "VACCINE"
            }
        ));
        jScrollPane2.setViewportView(relationTbl);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/test-results.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccine-4.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtChemicalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(384, 384, 384))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        System.out.println(medicineOrganization.getWQ().getWorkRequestList());

        for (WorkRequest request : medicineOrganization.getWQ().getWorkRequestList()) {
            System.out.println(request);
            System.out.println(medicineOrganization.getWQ().getWorkRequestList());
            System.out.println(((MedicineWorkRequest) request).getPatient());
            System.out.println(((MedicineWorkRequest) request).getPatient() != null);
            if (((MedicineWorkRequest) request).getPatient() != null) {
                System.out.println(((MedicineWorkRequest) request).getPatient());
                String vn = ((MedicineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
                System.out.println(vn);
//                System.out.println(vn.equals("ALPHA"));
//                System.out.println(!vn.equals("BETA"));
//                System.out.println(!vn.equals("GAMMA"));
//                System.out.println(!vn.equals("DELTA"));
//                System.out.println(!vn.equals("OMICRON"));
                if (!vn.equals("ALPHA")
                        && !vn.equals("BETA") && !vn.equals("GAMMA")
                        && !vn.equals("DELTA") && !vn.equals("OMICRON")) {
                    System.out.println(vn);
                    Object[] row = new Object[6];
                    row[0] = ((MedicineWorkRequest) request).getPatient();
                    row[1] = ((MedicineWorkRequest) request).getPatient().getAge();
                    row[2] = ((MedicineWorkRequest) request).getPatient().getSex();
                    row[3] = ((MedicineWorkRequest) request).getPatient().getTest();
                    row[4] = request.getEndUser().getEmployee().getName();
                    row[5] = vn;
                    model.addRow(row);
                }
            }
        }

    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicineManufactureWorkArea dwjp = (MedicineManufactureWorkArea) component;
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

     Patient patient = (Patient) workRequestJTable.getValueAt(selectedRow, 0);
        String VN = patient.getVariantHistory().getVariantHistory().getVariantName();
        String med = txtDrugName.getText();
        String chem = txtChemicalName.getText();
        
       
        
        Medicine m = new Medicine();
        m.setMedName(med);
        Variant g = new Variant();
        g.setVariantName(VN);
        m.setVariant(g);
        System.out.println(m.getVariant().getVariantName());
        Vaccine v=new Vaccine();
        v.setVaccineName(chem);
        m.getVaccineList().setVaccineName(chem);
        business.addtoListofM(m);
        System.out.println(m.getVaccineList().getVaccineName());
        System.out.println(m);
        
        JOptionPane.showMessageDialog(null, "Added medicine and vaccine for New variant. ");
        
        populateRelationTable();
//        populateNewVariant();

//        dl.addMedList(m);
//        
//        for(int i=0; i<dl.getMedList().size(); i++){populatedisplayTbl(dl.getMedList().get(i).getDrugName(),dl.getMedList().get(i).getVariant().getVariantName(),dl.getMedList().get(i).getChemicalList().getVaccineName() );}
//        
//        
//        
//        
//        Vaccine v=new Vaccine();
//        v.setVaccineName(chem);
//        m.setVaccineList(v);
//        
//        business.getMediList().getMedList().add(m);
//        populatedrelationTbl();
//    
//        JOptionPane.showMessageDialog(null, "Added medicine and vaccine for New variant. ");
//        
//        populateTable2(m.getVariant().getVariantName());
        
        
//         System.out.println(med);
//         System.out.println(chem);

//  ///      Variant g = new Variant();
// ///       g.setVariantName(VN);
//         System.out.println(g.getGeneName());  
//         g.setId(Integer.parseInt(geneID.getText()));
//         System.out.println(g.getId());
//         System.out.println(g);
//         variantDirectory.addGeneToDirectory(g);
//         
//         for(int i=0; i<geneDirectory.getGeneDirectory().size(); i++){
//         System.out.println(g);}

        //Chemical c=new Vaccine();
//        System.out.println("after c");
// ///       Medicine m = new Medicine();
//        System.out.println("after m");
//        patient.setNewDrug(med);
//        System.out.println(patient.getNewDrug());
    ////    m.setMedName(med);
//        System.out.println(m.getDrugName());
//        m.setVaccineList(c);    

     ////   m.getVaccineList().setVaccineName(chem);
//        System.out.println(m.getVaccineList().getVaccineName());
    ///    m.setVariant(g);
//        System.out.println(m.getGene());

//        c.setVaccineName(chem);
//        vaccineDirectory.addChemDirectory(c);
//        System.out.println(c.getVaccineName());
//        JOptionPane.showMessageDialog(null, "Added medicine and vaccine for New variant. ");

//  ********** NEEDED      dl.addMedList(m);
//        for(int i=0; i<dl.getMedList().size(); i++){
//        populatedisplayTbl(dl.getMedList().get(i).getDrugName(),dl.getMedList().get(i).getGene().getGeneName(),dl.getMedList().get(i).getVaccineList().getVaccineName()  );
//        
//        }
        //populateTable2(m.getVariant().getVariantName());

//        m.getMedId();
//        m.setGene(g);
//        m.setVaccineList(c);    
     //   System.out.println("end");
//        m.getVaccineList().setVaccineName(chem);
//        System.out.println(m.getVaccineList().getVaccineName());


    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable relationTbl;
    private javax.swing.JTextField txtChemicalName;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRelationTable(){
    DefaultTableModel model = (DefaultTableModel) relationTbl.getModel();
        model.setRowCount(0);
        
       for(int i=0; i<business.getListofM().size(); i++){
        
        Object[] row = new Object[3];
                row[0] = business.getListofM().get(i).getMedName();//g;//dl.getMedList().get(i).getGene().getGeneName();
                row[1] = business.getListofM().get(i).getVariant().getVariantName();//m; //dl.getMedList().get(i).getDrugName();
                row[2] = business.getListofM().get(i).getVaccineList().getVaccineName();//c; //dl.getMedList().get(i).getVaccineList().getVaccineName();
                model.addRow(row);
       }
        
        
    }
    
    
    
//    public void populateNewVariant() {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        model.setRowCount(0);
//        ArrayList<Medicine> mList=new ArrayList<Medicine>();
//        mList=business.getListofM();
//        
//        for (WorkRequest request : medicineOrganization.getWQ().getWorkRequestList()) {
//            if (((MedicineWorkRequest) request).getPatient() != null) {
//                String vn = ((MedicineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
//                if (!vn.equals("ALPHA")
//                        && !vn.equals("BETA") && !vn.equals("GAMMA")
//                        && !vn.equals("DELTA") && !vn.equals("OMICRON") && mList.contains(vn)) {
//                    Object[] row = new Object[6];
//                    row[0] = ((MedicineWorkRequest) request).getPatient();
//                    row[1] = ((MedicineWorkRequest) request).getPatient().getAge();
//                    row[2] = ((MedicineWorkRequest) request).getPatient().getSex();
//                    row[3] = ((MedicineWorkRequest) request).getPatient().getTest();
//                    row[4] = request.getEndUser().getEmployee().getName();
//                    row[5] = vn;
//                    model.addRow(row);
//                    populateRelationTable();
//                }
//            }
//        }
//     
//    }
    
    
    
    
//    public void populateTable2(String newgene) {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        model.setRowCount(0);
//
//        for (WorkRequest request : medicineOrganization.getWQ().getWorkRequestList()) {
////            System.out.println(request);
////            System.out.println(medicineOrganization.getWorkQueue().getWorkRequestList());
//            if (((MedicineWorkRequest) request).getPatient() != null) {
////                System.out.println(((MedicineWorkRequest) request).getPatient());
//                String vn = ((MedicineWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
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
