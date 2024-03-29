/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;



/**
 *
 * @author bhuva
 */
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    PersonDirectory person;
    PatientDirectory patient;
    ArrayList<Person> personList;
    ArrayList<Patient> patientList;
    public PersonJPanel(PersonDirectory person,PatientDirectory patient) {
        initComponents();
        this.person = person;
        this.personList = person.getPerson();
        this.patient = patient;
        this.patientList = patient.getPatient();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonInformation = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblPersonAge = new javax.swing.JLabel();
        lblPersonCity = new javax.swing.JLabel();
        lblPersonCommunity = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        txtPersonAge = new javax.swing.JTextField();
        txtPersonCity = new javax.swing.JTextField();
        txtPersonCommunity = new javax.swing.JTextField();
        txtPersonAddress = new javax.swing.JTextField();
        btnPersonCreate = new javax.swing.JButton();
        scrlPersonInformationTable = new javax.swing.JScrollPane();
        tblPersonInformation = new javax.swing.JTable();
        btnViewOrEditPersonInformation = new javax.swing.JButton();
        btnDeletePersonInformation = new javax.swing.JButton();
        lblAddressView = new javax.swing.JLabel();
        txtPersonNameView = new javax.swing.JTextField();
        txtPersonAgeView = new javax.swing.JTextField();
        txtPersonCityView = new javax.swing.JTextField();
        txtPersonCommunityView = new javax.swing.JTextField();
        txtPersonAddressView = new javax.swing.JTextField();
        lblPersonNameview = new javax.swing.JLabel();
        btnPersonInformationSave = new javax.swing.JButton();
        lblPersonAgeView = new javax.swing.JLabel();
        lblPersonCityView = new javax.swing.JLabel();
        lblPersonCommunityView = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();
        txtPatientIDAddPatient = new javax.swing.JTextField();
        txtDoctorNameAddPatient = new javax.swing.JTextField();
        lblPersonNameview1 = new javax.swing.JLabel();
        lblPersonAgeView1 = new javax.swing.JLabel();
        btnPersonInformationSave1 = new javax.swing.JButton();
        lblPersonInformation1 = new javax.swing.JLabel();
        lblPersonInformation2 = new javax.swing.JLabel();
        lblPersonNameAddPatient = new javax.swing.JLabel();
        txtPersonNameAddPatient = new javax.swing.JTextField();
        btnImportPerson = new javax.swing.JButton();
        lblPerson = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPersonInformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPersonInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonInformation.setText("Person Information");
        add(lblPersonInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 44, 1385, 81));

        lblPersonName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonName.setText("Name :");
        add(lblPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 175, -1, -1));

        lblPersonAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonAge.setText("Age :");
        add(lblPersonAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 201, -1, -1));

        lblPersonCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonCity.setText("City :");
        add(lblPersonCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 279, -1, -1));

        lblPersonCommunity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonCommunity.setText("Community :");
        add(lblPersonCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 227, -1, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddress.setText("Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 253, -1, -1));

        txtPersonName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonNameKeyTyped(evt);
            }
        });
        add(txtPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 173, 201, -1));

        txtPersonAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonAgeActionPerformed(evt);
            }
        });
        txtPersonAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonAgeKeyTyped(evt);
            }
        });
        add(txtPersonAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 199, 201, -1));

        txtPersonCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonCityKeyTyped(evt);
            }
        });
        add(txtPersonCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 277, 201, -1));

        txtPersonCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonCommunityKeyTyped(evt);
            }
        });
        add(txtPersonCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 225, 201, -1));

        txtPersonAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonAddressKeyTyped(evt);
            }
        });
        add(txtPersonAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 251, 201, -1));

        btnPersonCreate.setText("Create");
        btnPersonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonCreateActionPerformed(evt);
            }
        });
        add(btnPersonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 315, -1, -1));

        scrlPersonInformationTable.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        tblPersonInformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblPersonInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "City", "Community", "Address"
            }
        ));
        scrlPersonInformationTable.setViewportView(tblPersonInformation);

        add(scrlPersonInformationTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 173, 687, 93));

        btnViewOrEditPersonInformation.setText("View / Edit");
        btnViewOrEditPersonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrEditPersonInformationActionPerformed(evt);
            }
        });
        add(btnViewOrEditPersonInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 294, -1, -1));

        btnDeletePersonInformation.setText("Delete");
        btnDeletePersonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonInformationActionPerformed(evt);
            }
        });
        add(btnDeletePersonInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 294, -1, -1));

        lblAddressView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddressView.setText("Address :");
        add(lblAddressView, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 551, -1, -1));

        txtPersonNameView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonNameViewKeyTyped(evt);
            }
        });
        add(txtPersonNameView, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 465, 160, -1));

        txtPersonAgeView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonAgeViewKeyTyped(evt);
            }
        });
        add(txtPersonAgeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 491, 160, -1));

        txtPersonCityView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonCityViewKeyTyped(evt);
            }
        });
        add(txtPersonCityView, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 577, 160, -1));

        txtPersonCommunityView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonCommunityViewKeyTyped(evt);
            }
        });
        add(txtPersonCommunityView, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 517, 160, -1));

        txtPersonAddressView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonAddressViewActionPerformed(evt);
            }
        });
        txtPersonAddressView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonAddressViewKeyTyped(evt);
            }
        });
        add(txtPersonAddressView, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 549, 160, -1));

        lblPersonNameview.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonNameview.setText("Name :");
        add(lblPersonNameview, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 467, -1, -1));

        btnPersonInformationSave.setText("Save");
        btnPersonInformationSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonInformationSaveActionPerformed(evt);
            }
        });
        add(btnPersonInformationSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 608, -1, -1));

        lblPersonAgeView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonAgeView.setText("Age :");
        add(lblPersonAgeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 493, -1, -1));

        lblPersonCityView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonCityView.setText("City :");
        add(lblPersonCityView, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 579, -1, -1));

        lblPersonCommunityView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonCommunityView.setText("Community :");
        add(lblPersonCommunityView, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 519, -1, -1));

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 294, -1, -1));

        txtPatientIDAddPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatientIDAddPatientKeyTyped(evt);
            }
        });
        add(txtPatientIDAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 494, 136, -1));

        txtDoctorNameAddPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoctorNameAddPatientKeyTyped(evt);
            }
        });
        add(txtDoctorNameAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, 136, -1));

        lblPersonNameview1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonNameview1.setText("Patient ID :");
        add(lblPersonNameview1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 496, -1, -1));

        lblPersonAgeView1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonAgeView1.setText("Doctor Name :");
        add(lblPersonAgeView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 522, -1, -1));

        btnPersonInformationSave1.setText("Save Patient Info");
        btnPersonInformationSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonInformationSave1ActionPerformed(evt);
            }
        });
        add(btnPersonInformationSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 548, -1, -1));

        lblPersonInformation1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPersonInformation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonInformation1.setText("Add Patient");
        add(lblPersonInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 407, 140, 47));

        lblPersonInformation2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPersonInformation2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonInformation2.setText("View / Edit");
        add(lblPersonInformation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 407, 140, 47));

        lblPersonNameAddPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPersonNameAddPatient.setText("Patient Name :");
        add(lblPersonNameAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(988, 470, -1, -1));

        txtPersonNameAddPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonNameAddPatientKeyTyped(evt);
            }
        });
        add(txtPersonNameAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 468, 136, -1));

        btnImportPerson.setText("Import");
        btnImportPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportPersonActionPerformed(evt);
            }
        });
        add(btnImportPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 315, -1, -1));

        lblPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Person Image_1.jpg"))); // NOI18N
        add(lblPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonCreateActionPerformed
        // TODO add your handling code here:
    short chkName = 0;   //Value 0 means the value passed is appropriate
    short chkAge = 0; 
    short chkAddress = 0; 
    short chkCommunity = 0; 
    short chkCity = 0;
    try{
        if (txtPersonName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Name Details");
            txtPersonName.setText("");
            chkName = 1;
        }
        if (txtPersonAge.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Age Details");
            txtPersonAge.setText("");
            chkAge = 1;
        }
        if (txtPersonAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Address Details");
            txtPersonAddress.setText("");
            chkAddress = 1;
        }
        if (txtPersonCommunity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Community Details");
            txtPersonCommunity.setText("");
            chkCommunity = 1;
        }
        if (txtPersonCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided City Details");
            txtPersonCity.setText("");
            chkCity = 1;
        }
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in provided Details");
            }
    if (((chkName == 0) && (chkAge == 0) && (chkAddress == 0) && (chkCommunity == 0) && (chkCity == 0))){
            Person pr = person.addNewPersonDetails();
            pr.setName(txtPersonName.getText());
            pr.setAge(Integer.parseInt(txtPersonAge.getText()));
            pr.setAddress(txtPersonAddress.getText());
            pr.setCommunity(txtPersonCommunity.getText());
            pr.setCity(txtPersonCity.getText());
            populatePersonTable();
    } else {
        JOptionPane.showMessageDialog(null, "Error in provided Details");
    }   
    }//GEN-LAST:event_btnPersonCreateActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonInformation.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select a row to add as a Patient");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
        Person selectedPersonDetails = (Person)model.getValueAt(selectedRowIndex, 0);
        txtPersonNameAddPatient.setText(selectedPersonDetails.getName());
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewOrEditPersonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrEditPersonInformationActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonInformation.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select a row to add as a Patient");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
        Person selectedPersonDetails = (Person)model.getValueAt(selectedRowIndex, 0);
        txtPersonNameView.setText(selectedPersonDetails.getName());
        txtPersonAgeView.setText(String.valueOf(selectedPersonDetails.getAge()));
        txtPersonCommunityView.setText(selectedPersonDetails.getCommunity());
        txtPersonAddressView.setText(selectedPersonDetails.getAddress());
        txtPersonCityView.setText(selectedPersonDetails.getCity());
    }//GEN-LAST:event_btnViewOrEditPersonInformationActionPerformed

    private void btnPersonInformationSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonInformationSaveActionPerformed
        // TODO add your handling code here:
    int selectedRowIndex = tblPersonInformation.getSelectedRow();
    if (selectedRowIndex <0){
        JOptionPane.showMessageDialog(this, "Please Select a row to add as a Patient");
        return;
    }
    short chkName = 0;   //Value 0 means the value passed is appropriate
    short chkAge = 0; 
    short chkAddress = 0; 
    short chkCommunity = 0; 
    short chkCity = 0;
    try{
        if (txtPersonNameView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Name Details");
            txtPersonName.setText("");
            chkName = 1;
        }
        if (txtPersonAgeView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Age Details");
            txtPersonAge.setText("");
            chkAge = 1;
        }
        if (txtPersonCommunityView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Address Details");
            txtPersonAddress.setText("");
            chkAddress = 1;
        }
        if (txtPersonAddressView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Community Details");
            txtPersonCommunity.setText("");
            chkCommunity = 1;
        }
        if (txtPersonCityView.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided City Details");
            txtPersonCity.setText("");
            chkCity = 1;
        }
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in provided Details");
            }
        
        if (((chkName == 0) && (chkAge == 0) && (chkAddress == 0) && (chkCommunity == 0) && (chkCity == 0))){
        DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
        for (int i =0; i<personList.size();i++){
            System.out.println(String.valueOf(model.getValueAt(selectedRowIndex,0)));
            System.out.println(Integer.parseInt(String.valueOf(model.getValueAt(selectedRowIndex,1))));
            System.out.println(String.valueOf(model.getValueAt(selectedRowIndex,2)));
            System.out.println(String.valueOf(model.getValueAt(selectedRowIndex,4)));
            if(((personList.get(i).getName().equals(String.valueOf(model.getValueAt(selectedRowIndex,0)))) && 
                            (personList.get(i).getAge()== Integer.parseInt(String.valueOf(model.getValueAt(selectedRowIndex,1))))&&
                            (personList.get(i).getAddress().equals(String.valueOf(model.getValueAt(selectedRowIndex,2)))) &&
                            (personList.get(i).getCommunity().equals(String.valueOf(model.getValueAt(selectedRowIndex,3)))) &&
                            (personList.get(i).getCity().equals(String.valueOf(model.getValueAt(selectedRowIndex,4)))))){
                                personList.get(i).setName(txtPersonNameView.getText());
                                personList.get(i).setAge(Integer.parseInt(txtPersonAgeView.getText()));
                                personList.get(i).setCommunity(txtPersonCommunityView.getText());
                                personList.get(i).setAddress(txtPersonAddressView.getText());
                                personList.get(i).setCity(txtPersonCityView.getText());
                                JOptionPane.showMessageDialog(null, "Person Details Updated");
                            }
        }
        populatePersonTable();
        }
    }//GEN-LAST:event_btnPersonInformationSaveActionPerformed

    private void btnPersonInformationSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonInformationSave1ActionPerformed
        // TODO add your handling code here:
    int selectedRowIndex = tblPersonInformation.getSelectedRow();
    if (selectedRowIndex <0){
        JOptionPane.showMessageDialog(this, "Please Select a row to add as a Patient");
        return;
    }
    byte chkPatientName = 0;   //Value 0 means the value passed is appropriate
    byte chkPatientID = 0; 
    byte chkDoctorName = 0; 
    try{
        if (txtPersonNameAddPatient.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Name Details");
            txtPersonName.setText("");
            chkPatientName = 1;
        }
        if (txtPatientIDAddPatient.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided patient ID Details");
            txtPersonAge.setText("");
            chkPatientID = 1;
        }
        if (txtDoctorNameAddPatient.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error in provided Doctor Name Details");
            txtPersonAddress.setText("");
            chkDoctorName = 1;
        }
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in provided Details");
            }
        DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
        Person selectedPersonDetails = (Person)model.getValueAt(selectedRowIndex, 0);
        if (((chkPatientName == 0) && (chkPatientID == 0) && (chkDoctorName == 0))){
            Patient pa = patient.addNewPatientDetails();
            pa.setName(selectedPersonDetails.getName());
            pa.setAddress(selectedPersonDetails.getAddress());
            pa.setAge(selectedPersonDetails.getAge());
            pa.setCommunity(selectedPersonDetails.getCommunity());
            pa.setCity(selectedPersonDetails.getCity());
            pa.setPatientID(Integer.parseInt(txtPatientIDAddPatient.getText()));
            pa.setDoctorName(txtDoctorNameAddPatient.getText());
            JOptionPane.showMessageDialog(null, "Patient Details Added");
        }
    }//GEN-LAST:event_btnPersonInformationSave1ActionPerformed

    private void btnDeletePersonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonInformationActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonInformation.getSelectedRow();
        if (selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
        Person selectedCarDetails = (Person)model.getValueAt(selectedRowIndex, 0);
        person.deletePersonDetails(selectedCarDetails);
        JOptionPane.showMessageDialog(this, "Person Details Deleted");
        populatePersonTable();
    }//GEN-LAST:event_btnDeletePersonInformationActionPerformed

    private void txtPersonNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonNameKeyTyped

    private void txtPersonAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonAgeKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonAgeKeyTyped

    private void txtPersonCommunityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonCommunityKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonCommunityKeyTyped

    private void txtPersonAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonAddressKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonAddressKeyTyped

    private void txtPersonCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonCityKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonCityKeyTyped

    private void txtPersonNameViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameViewKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonNameViewKeyTyped

    private void txtPersonAgeViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonAgeViewKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonAgeViewKeyTyped

    private void txtPersonCommunityViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonCommunityViewKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonCommunityViewKeyTyped

    private void txtPersonAddressViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonAddressViewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonAddressViewKeyTyped

    private void txtPersonCityViewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonCityViewKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonCityViewKeyTyped

    private void txtPersonNameAddPatientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameAddPatientKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPersonNameAddPatientKeyTyped

    private void txtPatientIDAddPatientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIDAddPatientKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isDigit(value))||(Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPatientIDAddPatientKeyTyped

    private void txtDoctorNameAddPatientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorNameAddPatientKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((Character.isDigit(value))||(!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtDoctorNameAddPatientKeyTyped

    private void txtPersonAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonAgeActionPerformed

    private void txtPersonAddressViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonAddressViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonAddressViewActionPerformed

    private void btnImportPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportPersonActionPerformed
        // TODO add your handling code here:
                JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
   //         String path = "C:\\Users\\bhuva\\OneDrive\\Desktop\\Java Assignment 1 photos\\Car Datacsv.csv";
            String line = "";
            try{
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null) {
                    String [] values = line.split(",");   
                    String name = String.valueOf(values[0]);
                    int age = Integer.parseInt(String.valueOf(values[1]));
                    String  address= String.valueOf(values[2]);
                    String community = String.valueOf(values[3]);
                    String city = String.valueOf(values[4]);
                    Person pr = person.addNewPersonDetails();
                    pr.setName(name);
                    pr.setAge(age);
                    pr.setAddress(address);
                    pr.setCommunity(community);
                    pr.setCity(city);
                    populatePersonTable();
                }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                }
        }
    }//GEN-LAST:event_btnImportPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnDeletePersonInformation;
    private javax.swing.JButton btnImportPerson;
    private javax.swing.JButton btnPersonCreate;
    private javax.swing.JButton btnPersonInformationSave;
    private javax.swing.JButton btnPersonInformationSave1;
    private javax.swing.JButton btnViewOrEditPersonInformation;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressView;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JLabel lblPersonAge;
    private javax.swing.JLabel lblPersonAgeView;
    private javax.swing.JLabel lblPersonAgeView1;
    private javax.swing.JLabel lblPersonCity;
    private javax.swing.JLabel lblPersonCityView;
    private javax.swing.JLabel lblPersonCommunity;
    private javax.swing.JLabel lblPersonCommunityView;
    private javax.swing.JLabel lblPersonInformation;
    private javax.swing.JLabel lblPersonInformation1;
    private javax.swing.JLabel lblPersonInformation2;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPersonNameAddPatient;
    private javax.swing.JLabel lblPersonNameview;
    private javax.swing.JLabel lblPersonNameview1;
    private javax.swing.JScrollPane scrlPersonInformationTable;
    private javax.swing.JTable tblPersonInformation;
    private javax.swing.JTextField txtDoctorNameAddPatient;
    private javax.swing.JTextField txtPatientIDAddPatient;
    private javax.swing.JTextField txtPersonAddress;
    private javax.swing.JTextField txtPersonAddressView;
    private javax.swing.JTextField txtPersonAge;
    private javax.swing.JTextField txtPersonAgeView;
    private javax.swing.JTextField txtPersonCity;
    private javax.swing.JTextField txtPersonCityView;
    private javax.swing.JTextField txtPersonCommunity;
    private javax.swing.JTextField txtPersonCommunityView;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtPersonNameAddPatient;
    private javax.swing.JTextField txtPersonNameView;
    // End of variables declaration//GEN-END:variables

    private void populatePersonTable() {
       DefaultTableModel model = (DefaultTableModel) tblPersonInformation.getModel();
       model.setRowCount(0);
       
       for (Person pr : personList){
           Object[] row = new Object[5];
           row[0] = pr;
           row[1] = pr.getAge();
           row[2] = pr.getAddress();
           row[3] = pr.getCommunity();
           row[4] = pr.getCity();
           model.addRow(row);
       }
    }
}
