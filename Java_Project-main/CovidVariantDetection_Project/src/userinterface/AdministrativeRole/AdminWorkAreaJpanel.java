/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author deepa
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJpanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    private static Logger log = Logger.getLogger(AdminWorkAreaJpanel.class);
    private static final String CLASS_NAME = AdminWorkAreaJpanel.class.getName();

    public AdminWorkAreaJpanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        valuelbl.setText(enterprise.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        valuelbl = new javax.swing.JLabel();
        manageEmployeebtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        manageOrganizationbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMINISTRATION");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 34, 512, -1));

        valuelbl.setForeground(new java.awt.Color(255, 255, 255));
        valuelbl.setText("<value>");
        add(valuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 64, -1, -1));

        manageEmployeebtn.setBackground(new java.awt.Color(0, 0, 255));
        manageEmployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeebtn.setText("Manage Employee");
        manageEmployeebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        manageEmployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeebtnActionPerformed(evt);
            }
        });
        add(manageEmployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 177, 44));

        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("ENTERPRISE:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 64, -1, -1));

        userbtn.setBackground(new java.awt.Color(0, 0, 255));
        userbtn.setForeground(new java.awt.Color(255, 255, 255));
        userbtn.setText("Manage User");
        userbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 177, 45));

        manageOrganizationbtn.setBackground(new java.awt.Color(0, 0, 255));
        manageOrganizationbtn.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationbtn.setText("Manage Organization");
        manageOrganizationbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        manageOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationbtnActionPerformed(evt);
            }
        });
        add(manageOrganizationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 177, 46));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organization.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 6, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employee.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 199, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/programmer.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 402, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/admin-2.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationbtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJpanel manageOrganizationJPanel = new ManageOrganizationJpanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise);
        log.debug("Enterprise admin creating Organization \t" + CLASS_NAME);
        userProcessContainer.add("manageOrganization", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationbtnActionPerformed

    private void manageEmployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeebtnActionPerformed
        // TODO add your handling code here:
        int Organisationcheck = 0;
        for (Organization o : enterprise.getOrganizationDirectory().getOrgList()) {
            Organisationcheck++;

        }
        if (Organisationcheck <= 0) {
            JOptionPane.showMessageDialog(null, "Organisation is Unavailable to create a Employee");
            return;
        }

        ManageEmployeeJpanel manageEmployeeJPanel = new ManageEmployeeJpanel(userProcessContainer, enterprise.getOrganizationDirectory());
        log.debug("Enterprise admin adding Employee \t" + CLASS_NAME);
        userProcessContainer.add("manageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeebtnActionPerformed

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
        // TODO add your handling code here:
        int employeecheck = 0;
        for (Organization o : enterprise.getOrganizationDirectory().getOrgList()) {
            for (Employee e : o.getED().getEmployeeList()) {
                employeecheck++;
            }

        }
        if (employeecheck <= 0) {
            JOptionPane.showMessageDialog(null, "No Employee is available to create a user account for them");
            return;
        }
        ManageUserAccountJpanel muajp = new ManageUserAccountJpanel(userProcessContainer, enterprise);
        log.debug("Enterprise admin adding users \t" + CLASS_NAME);
        userProcessContainer.add("ManageUserAccount", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton manageEmployeebtn;
    private javax.swing.JButton manageOrganizationbtn;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel valuelbl;
    // End of variables declaration//GEN-END:variables
}
