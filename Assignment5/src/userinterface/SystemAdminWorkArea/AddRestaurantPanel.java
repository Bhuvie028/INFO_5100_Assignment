/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhuva
 */
public class AddRestaurantPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddRestaurantPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private Restaurant restaurant;
        String name;
        String address;
        String type ;

    public AddRestaurantPanel(JPanel userProcessContainer, EcoSystem system, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization = organization;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        restnametxt = new javax.swing.JTextField();
        restaddresstxt = new javax.swing.JTextField();
        btaddrest = new javax.swing.JButton();
        backbt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        managernametxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        managerpasstxt = new javax.swing.JPasswordField();
        managerusertxt = new javax.swing.JTextField();
        addmanagerbt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1109, 856));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1290, 44));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Restaurant Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 89, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Restaurant Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 189, -1, -1));
        add(restnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 91, 346, -1));
        add(restaddresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 156, 346, 90));

        btaddrest.setText("Add Restaurant");
        btaddrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddrestActionPerformed(evt);
            }
        });
        add(btaddrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 287, -1, -1));

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });
        add(backbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 287, -1, -1));

        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 1290, 5));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manager Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 373, 1270, 35));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 446, -1, -1));
        add(managernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 448, 200, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("Manager Username:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 496, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Manager Password:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 557, -1, -1));
        add(managerpasstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 559, 200, -1));
        add(managerusertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 498, 200, -1));

        addmanagerbt.setText("Add Manager");
        addmanagerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmanagerbtActionPerformed(evt);
            }
        });
        add(addmanagerbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 615, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Second.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 980));
    }// </editor-fold>//GEN-END:initComponents

    private void btaddrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddrestActionPerformed
        try{
        if (restnametxt.getText().isEmpty() || restaddresstxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please add the value");
        }
        name= restnametxt.getText();
        address= restaddresstxt.getText();
        JOptionPane.showMessageDialog(null, "Restaurant has been added");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Restaurant not added. Please check the provided value");
        }
         
    }//GEN-LAST:event_btaddrestActionPerformed

    private void addmanagerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmanagerbtActionPerformed
        try{
        if(managernametxt.getText().equals("")||managerusertxt.getText().equals("")||managerpasstxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Manager not added. Please check the provided value");
        }
        String managerName = managernametxt.getText();
        String username = managerusertxt.getText();
        String password = managerpasstxt.getText();
        restaurant = system.getRestaurantDirectory().createRestaurant(name, address, type, managerName);
        Employee emp = system.getEmployeeDirectory().createEmployee(managerName);
        system.getUserAccountDirectory().createUserAccount(username, password, emp, new AdminRole());
        JOptionPane.showMessageDialog(null, "Manager added Successfully");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Manager not added. Please check the provided value");
        }
    }//GEN-LAST:event_addmanagerbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof Managerestdashboard){
               Managerestdashboard manageRestDashboard= (Managerestdashboard) comp;
               manageRestDashboard.populateTable(); 
            }
        }
    }//GEN-LAST:event_backbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmanagerbt;
    private javax.swing.JButton backbt;
    private javax.swing.JButton btaddrest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField managernametxt;
    private javax.swing.JPasswordField managerpasstxt;
    private javax.swing.JTextField managerusertxt;
    private javax.swing.JTextField restaddresstxt;
    private javax.swing.JTextField restnametxt;
    // End of variables declaration//GEN-END:variables
}
