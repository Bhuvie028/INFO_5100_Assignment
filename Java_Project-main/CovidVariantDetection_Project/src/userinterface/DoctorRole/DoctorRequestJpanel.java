/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DoctorClass.Patient;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalTrialWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author deepa
 */
public class DoctorRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRequestJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private DoctorOrganization docOrganization;
    private Enterprise enterprise;

    private Network network;
    private EcoSystem system;
    private Enterprise.EnterpriseType enterpriseType;
    private static Logger log = Logger.getLogger(DoctorRequestJpanel.class);
    private static final String CLASS_NAME = DoctorRequestJpanel.class.getName();

    public DoctorRequestJpanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.docOrganization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        valueLbl.setText(enterprise.getName());
        populateRequestTable();
        populateClinicalRequestTable();
     

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) doctorRequestTbl.getModel();

        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request instanceof LabTestWorkRequest) {
                Object[] row = new Object[7];
                row[0] = ((LabTestWorkRequest) request);
                row[1] = ((LabTestWorkRequest) request).getPatient().getAge();
                row[2] = ((LabTestWorkRequest) request).getPatient().getSex();
                row[3] = request.getMessage();

                row[4] = request.getReceiver();
                row[5] = request.getStatus();
                String result = ((LabTestWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
                if (request.getReceiver() == null || request.getReceiver().equals("Processing")) {
                    row[6] = null;
                } else {
                    row[6] = result;
                }

                model.addRow(row);
            }
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

        resultsLbl = new javax.swing.JLabel();
        enterpriseLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();
        requestTestBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorRequestTbl = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        sexLbl = new javax.swing.JLabel();
        testTxtField = new javax.swing.JTextField();
        diagnosisLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        viewResultsbtn = new javax.swing.JButton();
        sexcomboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnClinicalTrial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorClinicRequestTbl = new javax.swing.JTable();
        resultsLbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patientEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultsLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        resultsLbl.setForeground(new java.awt.Color(255, 255, 255));
        resultsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsLbl.setText("COVID-19 LAB TEST RESULTS");
        add(resultsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 615, 22));

        enterpriseLbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        enterpriseLbl.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLbl.setText("HELLO!");
        add(enterpriseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, 41));

        valueLbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLbl.setForeground(new java.awt.Color(255, 255, 255));
        valueLbl.setText("<value>");
        add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 41));

        refreshbtn.setBackground(new java.awt.Color(0, 0, 255));
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("REFRESH");
        refreshbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 321, 32));

        requestTestBtn.setBackground(new java.awt.Color(0, 0, 255));
        requestTestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestTestBtn.setText("REQUEST TEST");
        requestTestBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        requestTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestBtnActionPerformed(evt);
            }
        });
        add(requestTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 321, 33));

        doctorRequestTbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        doctorRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Receiver", "Status", "Variant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorRequestTbl.setRowHeight(25);
        jScrollPane1.setViewportView(doctorRequestTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 615, 160));

        backJButton.setBackground(new java.awt.Color(0, 0, 255));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("BACK");
        backJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 69, 30));

        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setText("NAME:");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 162, -1));

        sexLbl.setForeground(new java.awt.Color(255, 255, 255));
        sexLbl.setText("GENDER:");
        add(sexLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        add(testTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 168, -1));

        diagnosisLbl.setForeground(new java.awt.Color(255, 255, 255));
        diagnosisLbl.setText("TEST NAME:");
        add(diagnosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        ageLbl.setForeground(new java.awt.Color(255, 255, 255));
        ageLbl.setText("AGE:");
        add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 162, -1));

        viewResultsbtn.setBackground(new java.awt.Color(0, 0, 255));
        viewResultsbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewResultsbtn.setText("VIEW RESULTS");
        viewResultsbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewResultsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsbtnActionPerformed(evt);
            }
        });
        add(viewResultsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 321, 34));

        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MALE", "FEMALE" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new-normality.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 582, -1, -1));

        btnClinicalTrial.setBackground(new java.awt.Color(0, 0, 255));
        btnClinicalTrial.setForeground(new java.awt.Color(255, 255, 255));
        btnClinicalTrial.setText("ADVANCED CLINICAL TRIALS");
        btnClinicalTrial.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnClinicalTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicalTrialActionPerformed(evt);
            }
        });
        add(btnClinicalTrial, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 321, 30));

        doctorClinicRequestTbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        doctorClinicRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Receiver", "Status", "Sample"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorClinicRequestTbl.setRowHeight(25);
        jScrollPane2.setViewportView(doctorClinicRequestTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 615, 160));

        resultsLbl1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        resultsLbl1.setForeground(new java.awt.Color(255, 255, 255));
        resultsLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultsLbl1.setText("ADVANCED CLINICAL TRIAL RESULTS");
        add(resultsLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 615, 22));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/safety-suit.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 11, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new-normality.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 205, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/safety-suit.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 394, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-MAIL:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 196, -1, -1));
        add(patientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 191, 161, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshbtnActionPerformed

    private void requestTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestBtnActionPerformed

        String message = testTxtField.getText().trim();
        String patientName = nameTxtField.getText();
        String sex = sexcomboBox.getSelectedItem().toString();
        String email = patientEmail.getText();
        boolean flag = true;
        if (sexcomboBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Please select the sex");
            return;
        }
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Write the test need to be performed");
            return;
        }
        int age;
        try {
            age = Integer.parseInt(ageTxtField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be integer!");
            return;
        }
                String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if(!patientEmail.getText().isEmpty()){
        Matcher matcher = pattern.matcher(patientEmail.getText());
            if(matcher.matches()){
            }else{
                JOptionPane.showMessageDialog(null, "Email is not in proper format");
                flag = false;
                return;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Email cannot be empty");
            flag = false;
            return;
        }
        if(flag = true){
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(message);
        request.setEndUser(account);
        request.setStatus("Sent");
        request.setPatientName(patientName);
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setAge(age);
        patient.setTest(message);
        patient.setSex(sex);
        patient.setEmail(email);
        request.setPatient(patient);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
            if (organization instanceof LabOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWQ().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            log.debug("Sent request to Lab");
        }
        populateRequestTable();
        JOptionPane.showMessageDialog(null, "Test has been requested successfully");
        nameTxtField.setText("");
        ageTxtField.setText("");
        sexcomboBox.setSelectedIndex(0);
        testTxtField.setText("");
         patientEmail.setText("");
        }
    }//GEN-LAST:event_requestTestBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewResultsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsbtnActionPerformed
        int selectedRow = doctorRequestTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select a row to view results");
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest) doctorRequestTbl.getValueAt(selectedRow, 0);
        System.out.println(doctorRequestTbl.getValueAt(selectedRow, 5));
        System.out.println(!(doctorRequestTbl.getValueAt(selectedRow, 5).toString().toLowerCase().equalsIgnoreCase("completed")));

        if (doctorRequestTbl.getValueAt(selectedRow, 6) == null) {
            JOptionPane.showMessageDialog(null, "Results need to be generated by lab assistant");
            return;
        }
        int flag = 0;
        if ((doctorRequestTbl.getValueAt(selectedRow, 5).toString().equalsIgnoreCase("completed"))) {

            flag++;

        }

        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "Lab results are  not yet returned");
            return;
        }

        DoctorLabTestResultsJpanel processWorkRequestJPanel = new DoctorLabTestResultsJpanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        log.debug("adding request to lab assistant");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewResultsbtnActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed

    private void btnClinicalTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicalTrialActionPerformed
        // TODO add your handling code here:

        String message = testTxtField.getText().trim();
        String patientName = nameTxtField.getText();
        String sex = sexcomboBox.getSelectedItem().toString();
        String email=patientEmail.getText();
        boolean flag = true;
        if (sexcomboBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Please select the sex");
            return;
        }
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Write the test need to be performed");
            return;
        }
        int age;
        try {
            age = Integer.parseInt(ageTxtField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be integer!");
            return;
        }

                String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if(!patientEmail.getText().isEmpty()){
        Matcher matcher = pattern.matcher(patientEmail.getText());
            if(matcher.matches()){
            }else{
                JOptionPane.showMessageDialog(null, "Email is not in proper format");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Email cannot be empty");
        }
        if(flag = true){
        ClinicalTrialWorkRequest request = new ClinicalTrialWorkRequest();
        request.setMessage(message);
        request.setEndUser(account);
        request.setStatus("Sent");
        request.setPatientName(patientName);
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setAge(age);
        patient.setTest(message);
        patient.setSex(sex);
        patient.setEmail(email);
        request.setPatient(patient);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
            if (organization instanceof ClinicOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWQ().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            log.debug("Sent request to Clinic");
        }
        populateClinicalRequestTable();
        JOptionPane.showMessageDialog(null, "Test has been requested successfully");
        nameTxtField.setText("");
        ageTxtField.setText("");
        sexcomboBox.setSelectedIndex(0);
        testTxtField.setText("");
        patientEmail.setText("");
        }
    }//GEN-LAST:event_btnClinicalTrialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnClinicalTrial;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JTable doctorClinicRequestTbl;
    private javax.swing.JTable doctorRequestTbl;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField patientEmail;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton requestTestBtn;
    private javax.swing.JLabel resultsLbl;
    private javax.swing.JLabel resultsLbl1;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> sexcomboBox;
    private javax.swing.JTextField testTxtField;
    private javax.swing.JLabel valueLbl;
    private javax.swing.JButton viewResultsbtn;
    // End of variables declaration//GEN-END:variables
    public void populateClinicalRequestTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) doctorClinicRequestTbl.getModel();

            model.setRowCount(0);
            for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                if (request instanceof ClinicalTrialWorkRequest) {
                    Object[] row = new Object[7];
                    row[0] = ((ClinicalTrialWorkRequest) request);
                    row[1] = ((ClinicalTrialWorkRequest) request).getPatient().getAge();
                    row[2] = ((ClinicalTrialWorkRequest) request).getPatient().getSex();
                    row[3] = request.getMessage();

                    row[4] = request.getReceiver();
                    row[5] = request.getStatus();
                    String result = ((ClinicalTrialWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
                    if (request.getReceiver() == null || request.getReceiver().equals("Processing")) {
                        row[6] = null;
                    } else {
                        row[6] = result;
                    }

                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println("doctor request panel table yet to populate");
        }
    }

}
