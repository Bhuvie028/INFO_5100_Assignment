/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhuva
 */
public class Managerestdashboard extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization restOrganization;

    public Managerestdashboard(JPanel userProcessContainer, EcoSystem system, Organization restOrganization) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.restOrganization = restOrganization;
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RestManagetable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btaddrest = new javax.swing.JButton();
        btnDeleteRestaurant = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 709, 44));

        RestManagetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Restaurant Address", "Manager Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RestManagetable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 73, 511, 95));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 209, -1, -1));

        btaddrest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btaddrest.setText("Add Restaurant");
        btaddrest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btaddrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddrestActionPerformed(evt);
            }
        });
        add(btaddrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 211, -1, -1));

        btnDeleteRestaurant.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeleteRestaurant.setText("Delete");
        btnDeleteRestaurant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRestaurantActionPerformed(evt);
            }
        });
        add(btnDeleteRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 211, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nine.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel defaulrestmodel = (DefaultTableModel) RestManagetable.getModel();
        defaulrestmodel.setRowCount(0);        
        for(Restaurant res : system.getRestaurantDirectory().getRestaurantList()) {
            Object row[] = new Object[5];
            row[0] = res.getName();
            row[1] = res.getAddress();
            row[2] = res.getManager();
            defaulrestmodel.addRow(row);
        }
    }
    private void btaddrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddrestActionPerformed
        AddRestaurantPanel addRestaurantpanel = new AddRestaurantPanel(userProcessContainer, system, restOrganization);
        userProcessContainer.add("CreateRestaurant", addRestaurantpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_btaddrestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] component = this.userProcessContainer.getComponents();
        for(Component comp : component){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree(); 
            }
        }
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRestaurantActionPerformed
        try{
        int selectedRow = RestManagetable.getSelectedRow();   
        if (selectedRow >= 0) {
//            System.out.println(RestManagetable.getValueAt(selectedRow, 0));
            Restaurant restaurant = (Restaurant) RestManagetable.getValueAt(selectedRow, 0);
            system.getRestaurantDirectory().deleteRestaurant(restaurant);
            populateTable();
        }
        }
        catch(Exception e){
            DefaultTableModel model = (DefaultTableModel)RestManagetable.getModel();
            model.removeRow(RestManagetable.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RestManagetable;
    private javax.swing.JButton btaddrest;
    private javax.swing.JButton btnDeleteRestaurant;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
