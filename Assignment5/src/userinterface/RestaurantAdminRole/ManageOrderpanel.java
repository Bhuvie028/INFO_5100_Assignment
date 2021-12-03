/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhuva
 */
    public class ManageOrderpanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private String restaurant;
    private Order orders; 
    String name;
    String address;
    String type ;

    public ManageOrderpanel(JPanel userProcessContainer, EcoSystem system, String restaurant) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.restaurant = restaurant;
        initComponents();
        jPanel1.setVisible(false);
        populateOrderList();
        getDeliveryManList();
        populateOrderList();
    }

    public void populateOrderList(){
        DefaultTableModel defaultordertable = (DefaultTableModel) manageordertable.getModel();
        defaultordertable.setRowCount(0);
        for(Order orders : system.getOrderDirectory().getOrderhist()){
            if(orders.getRestaurant().getName().equals(restaurant)){
            Object row[] = new Object[5];
                row[0] = orders.getOrderID();
                row[1] = orders.getMenuDirectory().getMenu().get(0).getItemName();
                row[2] = orders.getMenuDirectory().getMenu().get(0).getItemPrice();
                row[3] = orders.getMenuDirectory().getMenu().get(0).getQuantity();
                row[4] = orders;
                defaultordertable.addRow(row);
            }
        }
    }
    
    public void getDeliveryManList(){
        for(DeliveryMan dm : system.getDeliveryManDirectory().getDeliveryMan()){
        deliverycombobox.addItem(dm.getDeliveryManName());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deliverycombobox = new javax.swing.JComboBox<>();
        btassign = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageordertable = new javax.swing.JTable();
        acceptordbt = new javax.swing.JButton();
        assigndelbt = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List of Delivery Man Active");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Select Delivery Man");

        deliverycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Delivery Man" }));

        btassign.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btassign.setText("Assign");
        btassign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btassignActionPerformed(evt);
            }
        });

        jSeparator2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addGap(86, 86, 86)
                .addComponent(deliverycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btassign))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(deliverycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(btassign))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 312, 740, 230));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 858, 42));

        manageordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Item Name", "Item Price", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageordertable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 127, 543, 96));

        acceptordbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acceptordbt.setText("Accept Order");
        acceptordbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        acceptordbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptordbtActionPerformed(evt);
            }
        });
        add(acceptordbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        assigndelbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assigndelbt.setText("Assign Deliverymen");
        assigndelbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assigndelbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigndelbtActionPerformed(evt);
            }
        });
        add(assigndelbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 241, -1, -1));

        btback.setBackground(new java.awt.Color(204, 204, 204));
        btback.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btback.setText("Back");
        btback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });
        add(btback, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 858, 5));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seven.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btbackActionPerformed

    private void assigndelbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigndelbtActionPerformed
        int selectedRow = manageordertable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        orders = (Order)manageordertable.getValueAt(selectedRow,4);
        jPanel1.setVisible(true);
        populateOrderList();
    }//GEN-LAST:event_assigndelbtActionPerformed

    private void acceptordbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptordbtActionPerformed
        int selectedRow = manageordertable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        orders = (Order)manageordertable.getValueAt(selectedRow,4);
        orders.setOrderStatus("Accepted");
        populateOrderList();
    }//GEN-LAST:event_acceptordbtActionPerformed

    private void btassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btassignActionPerformed
        DeliveryMan deliveryman = system.getDeliveryManDirectory().findDeliveryMan(String.valueOf(deliverycombobox.getSelectedItem()));
        orders.setDeliveryMan(deliveryman);
        JOptionPane.showMessageDialog(null,"Delivery Man Assigned", "Delivery Man Assigned", JOptionPane.INFORMATION_MESSAGE);
        populateOrderList();
    }//GEN-LAST:event_btassignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptordbt;
    private javax.swing.JButton assigndelbt;
    private javax.swing.JButton btassign;
    private javax.swing.JButton btback;
    private javax.swing.JComboBox<String> deliverycombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable manageordertable;
    // End of variables declaration//GEN-END:variables
}
