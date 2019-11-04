/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SportShoesHouse;

import javax.swing.JOptionPane;

/**
 *
 * @author eyya
 */
public class AdminStaffMenu extends javax.swing.JFrame {

    String user;
    /**
     * Creates new form AdminStaffMenu
     */
    public AdminStaffMenu() {
        initComponents();
    }
    
    public AdminStaffMenu(String USER)
    {
        user = USER;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBtnEmpRecord = new javax.swing.JPanel();
        jLabelEmpRecord = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBtnRegEmp = new javax.swing.JPanel();
        jLabelRegEmp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelusername = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));
        jPanel4.setToolTipText("SSHIMS");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));

        jLabelLogout.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(21, 198, 198));
        jLabelLogout.setText("Logout");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelLogout)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Authentic Shoes Inventory Management System");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 34, 830, 52));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 35)); // NOI18N
        jLabel4.setText("Staff Menu");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 35)); // NOI18N
        jLabel7.setText("Welcome");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel8.setText("(Admin)");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel10.setText("to");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 360));

        jBtnEmpRecord.setBackground(new java.awt.Color(249, 249, 249));
        jBtnEmpRecord.setToolTipText("View employee record");
        jBtnEmpRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEmpRecordMouseClicked(evt);
            }
        });
        jBtnEmpRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_100px.png"))); // NOI18N
        jLabelEmpRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmpRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEmpRecordMouseEntered(evt);
            }
        });
        jBtnEmpRecord.add(jLabelEmpRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel9.setText("Staff Record");
        jBtnEmpRecord.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 80));

        jPanel2.add(jBtnEmpRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 190, 190));

        jBtnRegEmp.setBackground(new java.awt.Color(249, 249, 249));
        jBtnRegEmp.setToolTipText("Add new employee");
        jBtnRegEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRegEmpMouseClicked(evt);
            }
        });
        jBtnRegEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_User_Group_Woman_Man_100px.png"))); // NOI18N
        jLabelRegEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegEmpMouseClicked(evt);
            }
        });
        jBtnRegEmp.add(jLabelRegEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 160, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel6.setText("Register New Staff");
        jBtnRegEmp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 80));

        jPanel2.add(jBtnRegEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 220, 190));

        jLabelusername.setText("Name admin login");
        jPanel2.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 90, 120, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_20px_3.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, 20));

        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_Arrow_40px.png"))); // NOI18N
        jLabelBack.setToolTipText("Previous page");
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(805, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        // TODO add your handling code here:
        {
            String ObjButtons[] = {"Yes","No"};
            int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to logout?","Sport Shoes House",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
            if(PromptResult==JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null, "User Log Out");
                 new LoginAdmin().setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jLabelEmpRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmpRecordMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabelEmpRecordMouseClicked

    private void jLabelRegEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegEmpMouseClicked
        // TODO add your handling code here:
        RegisterStaff r = new RegisterStaff();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegEmpMouseClicked

    private void jBtnRegEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRegEmpMouseClicked
        // TODO add your handling code here:
        RegisterStaff r = new RegisterStaff();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegEmpMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        // TODO add your handling code here:
        AdminHomepage m = new AdminHomepage(user);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jBtnEmpRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEmpRecordMouseClicked
        // TODO add your handling code here:
        StaffRecord s = new StaffRecord();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnEmpRecordMouseClicked

    private void jLabelEmpRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmpRecordMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEmpRecordMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLabelusername.setText(user);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AdminStaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStaffMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnEmpRecord;
    private javax.swing.JPanel jBtnRegEmp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelEmpRecord;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelRegEmp;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
