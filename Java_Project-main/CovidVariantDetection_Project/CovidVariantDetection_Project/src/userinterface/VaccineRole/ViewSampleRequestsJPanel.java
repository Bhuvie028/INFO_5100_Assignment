/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Business.SampleInventory.SampleCompound;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.VaccineOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SampleWorkRequest;
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
public class ViewSampleRequestsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private VaccineOrganization drugOrganization ;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(ViewSampleRequestsJPanel.class);
    private static final String CLASS_NAME = ViewSampleRequestsJPanel.class.getName();

    /**
     * Creates new form ViewChemicalRequestsJPanel
     */
    public ViewSampleRequestsJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise, VaccineOrganization drugOrganization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.drugOrganization = drugOrganization;
        this.enterprise = enterprise;
        this.network = network;
        reorderTable();
        this.setSize(1920,1080);
    }
   
    public void reorderTable(){
        int rowCount = reorderTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)reorderTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
      for(SampleCompound mi : drugOrganization.getSampleList()){
            Object row[] = new Object[6];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2]= mi.getAvailQuantity();
            row[3]=mi.getRequiredQuantity();
            row[4]= mi.getReorderStatus();
            //row[5]=mi.getReorderStatus();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        reorderTable = new javax.swing.JTable();
        addMedicineButton = new javax.swing.JButton();
        viewRequestsButton = new javax.swing.JButton();
        viewDetailsButton1 = new javax.swing.JButton();
        statusCheckButton = new javax.swing.JButton();
        serialNumLabel = new javax.swing.JLabel();
        serialNumberTextField = new javax.swing.JTextField();
        medicineNameLabel = new javax.swing.JLabel();
        chemicalNameTextField = new javax.swing.JTextField();
        availQuantityLabel = new javax.swing.JLabel();
        availQuantityTextField = new javax.swing.JTextField();
        reqQuantityLabel = new javax.swing.JLabel();
        reqQuantityTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));

        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SAMPLE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reorderTable.setRowHeight(30);
        jScrollPane1.setViewportView(reorderTable);

        addMedicineButton.setBackground(new java.awt.Color(0, 0, 255));
        addMedicineButton.setForeground(new java.awt.Color(255, 255, 255));
        addMedicineButton.setText("ADD SAMPLE");
        addMedicineButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });

        viewRequestsButton.setBackground(new java.awt.Color(0, 0, 255));
        viewRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRequestsButton.setText("VIEW REQUEST STATUS");
        viewRequestsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsButtonActionPerformed(evt);
            }
        });

        viewDetailsButton1.setBackground(new java.awt.Color(0, 0, 255));
        viewDetailsButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsButton1.setText("VIEW SAMPLE DETAILS");
        viewDetailsButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButton1ActionPerformed(evt);
            }
        });

        statusCheckButton.setBackground(new java.awt.Color(0, 0, 255));
        statusCheckButton.setForeground(new java.awt.Color(255, 255, 255));
        statusCheckButton.setText("RE-ORDER SAMPLES");
        statusCheckButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        statusCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckButtonActionPerformed(evt);
            }
        });

        serialNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        serialNumLabel.setText("SERIAL NUMBER: ");

        medicineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        medicineNameLabel.setText("SAMPLE NAME: ");

        availQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        availQuantityLabel.setText("AVAILABLE QUANTITY:");

        reqQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        reqQuantityLabel.setText("REQUIRED QUANTITY:");

        reqQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantityTextFieldActionPerformed(evt);
            }
        });

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
        jLabel1.setText("SAMPLE REQUESTS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chemistry-2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blood-sample-2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialNumLabel)
                                    .addComponent(medicineNameLabel)
                                    .addComponent(availQuantityLabel)
                                    .addComponent(reqQuantityLabel))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serialNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(chemicalNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(availQuantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(reqQuantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(addMedicineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(138, 138, 138)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(statusCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewRequestsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewDetailsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewDetailsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumLabel)
                            .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicineNameLabel)
                            .addComponent(chemicalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availQuantityLabel)
                            .addComponent(availQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reqQuantityLabel)
                            .addComponent(reqQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(addMedicineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        // TODO add your handling code here:

        SampleCompound m=new SampleCompound();
        String name=chemicalNameTextField.getText().trim();      
        if(name.isEmpty())
        {
         JOptionPane.showMessageDialog(null,"Chemical Name is empty");
            return;   
        }
        m.setSampleName(chemicalNameTextField.getText());
        try
        {
        int availableQuantity= Integer.parseInt(availQuantityTextField.getText());
        m.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"available quantity must be a integer");
            return;   
        }
        try
        {
        int serialNumber= Integer.parseInt(serialNumberTextField.getText());
        m.setSerialNumber(serialNumber);
        }
         catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null,"Serial number  must be a integer");
            return;   
        }
        try{
        int requiredQuantity= Integer.parseInt(reqQuantityTextField.getText());
        m.setRequiredQuantity(requiredQuantity);
        }
         catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null,"Required quantity must be integer!");
            return;
        }
//        ArrayList<String> chemicalCheck = new ArrayList<>();
//        for(SampleCompound mi : drugOrganization.getSampleList())
//        {
//            chemicalCheck.add(mi.getChemicalName().toLowerCase());
//        }
//        if(chemicalCheck.contains(name.toLowerCase()))
//        {
//            JOptionPane.showMessageDialog(null, "chemical name already existed please update the quantity by clicking on view details");
//            return;
//        }
        drugOrganization.addSample(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm =(DefaultTableModel) reorderTable.getModel();

        dtm.setRowCount(0);
        for(SampleCompound mi : drugOrganization.getSampleList()){
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2]= mi.getAvailQuantity();
            row[3]=mi.getRequiredQuantity();
            row[4]= mi.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "vaccine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        serialNumberTextField.setText("");
        chemicalNameTextField.setText("");
        availQuantityTextField.setText("");
        reqQuantityTextField.setText("");
        log.debug(userAccount+" "+"added chemical"+name);
        
    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void viewRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       userProcessContainer.add("ViewRequestsSampleJPanel", new ViewRequestsSampleJPanel( userProcessContainer, userAccount, enterprise, drugOrganization));
        layout.next(userProcessContainer);
        log.debug("entering view chemical requests page");

    }//GEN-LAST:event_viewRequestsButtonActionPerformed

    private void viewDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButton1ActionPerformed
        // TODO add your handling code here:
        int row = reorderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SampleCompound mi = (SampleCompound)reorderTable.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new ViewSampleDetailsJPanel(userProcessContainer, userAccount, enterprise,mi));
        layout.next(userProcessContainer);
        log.debug(userAccount+" "+"entering view chemical details page");
    }//GEN-LAST:event_viewDetailsButton1ActionPerformed

    private void statusCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckButtonActionPerformed
        // TODO add your handling code here:
        int i=0;
        for(SampleCompound mi : drugOrganization.getSampleList()){
            i++;
            
        }
        if(i<=0)
        {
            JOptionPane.showMessageDialog(null,"No chemicals are present for invetory check  ");
            return;
        }
      for(SampleCompound mi : drugOrganization.getSampleList()){

            if(mi.getAvailQuantity()<=mi.getRequiredQuantity()){
                if(!mi.getReorderStatus().equals("Y")){
                    SampleWorkRequest request=new SampleWorkRequest();

                    mi.setReorderStatus("Y");
                    request.setSampleName(mi.getSampleName());
                    request.setQty(mi.getRequiredQuantity());
                    request.setEndUser(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList() ){
                        System.out.println("***** Organization Name:" +enterprise.getName());
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrgList()){
                            System.out.println("***** Organization Name:" +organization.getName());
                            if(organization.getName().equals("Sample Organization")){
                                System.out.println("True");

                                System.out.println("***** organization Name"+organization.getName());

                                organization.getWQ().getWorkRequestList().add(request);
                                log.debug("chemical request has been sent to chemical organization");
                            }
                        }

                    }

                }

            }
        } 
        JOptionPane.showMessageDialog(null, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
       reorderTable();
    }//GEN-LAST:event_statusCheckButtonActionPerformed

    private void reqQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqQuantityTextFieldActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JLabel availQuantityLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineNameLabel;
    private javax.swing.JTable reorderTable;
    private javax.swing.JLabel reqQuantityLabel;
    private javax.swing.JTextField reqQuantityTextField;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JButton statusCheckButton;
    private javax.swing.JButton viewDetailsButton1;
    private javax.swing.JButton viewRequestsButton;
    // End of variables declaration//GEN-END:variables
}