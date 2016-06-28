package authorization;

import java.awt.CardLayout;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel Havard
 */
public class SamuelHavardWeek7Fixed extends javax.swing.JFrame {

    /**
     * Creates new form SamuelHavardWeek6
     */
    public SamuelHavardWeek7Fixed() {
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

        cardPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        password_field = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        appPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lblWeek6 = new javax.swing.JLabel();
        appPanel2 = new javax.swing.JPanel();
        btnLogout1 = new javax.swing.JButton();
        lblWeek7 = new javax.swing.JLabel();
        appPanel3 = new javax.swing.JPanel();
        btnLogout2 = new javax.swing.JButton();
        lblWeek8 = new javax.swing.JLabel();
        appPanel4 = new javax.swing.JPanel();
        btnLogout3 = new javax.swing.JButton();
        lblWeek9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        loginPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password_field1 = new javax.swing.JTextField();
        btnSubmit1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        loginPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        username_field.setToolTipText("Enter Username");

        password_field.setToolTipText("Enter Password");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(jButton1))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        cardPanel.add(loginPanel, "loginCard");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblWeek6.setText("Logged Into SDEV 325 App Week 6 Panel 1");

        javax.swing.GroupLayout appPanel1Layout = new javax.swing.GroupLayout(appPanel1);
        appPanel1.setLayout(appPanel1Layout);
        appPanel1Layout.setHorizontalGroup(
            appPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout)
                    .addComponent(lblWeek6))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        appPanel1Layout.setVerticalGroup(
            appPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWeek6)
                .addGap(36, 36, 36)
                .addComponent(btnLogout)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        cardPanel.add(appPanel1, "appCard1");

        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });

        lblWeek7.setText("Logged Into SDEV 325 App Week 6 Panel 2");

        javax.swing.GroupLayout appPanel2Layout = new javax.swing.GroupLayout(appPanel2);
        appPanel2.setLayout(appPanel2Layout);
        appPanel2Layout.setHorizontalGroup(
            appPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout1)
                    .addComponent(lblWeek7))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        appPanel2Layout.setVerticalGroup(
            appPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWeek7)
                .addGap(36, 36, 36)
                .addComponent(btnLogout1)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        cardPanel.add(appPanel2, "appCard2");

        appPanel3.setPreferredSize(new java.awt.Dimension(600, 400));

        btnLogout2.setText("Logout");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });

        lblWeek8.setText("Logged Into SDEV 325 App Week 6 Panel 3");

        javax.swing.GroupLayout appPanel3Layout = new javax.swing.GroupLayout(appPanel3);
        appPanel3.setLayout(appPanel3Layout);
        appPanel3Layout.setHorizontalGroup(
            appPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout2)
                    .addComponent(lblWeek8))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        appPanel3Layout.setVerticalGroup(
            appPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWeek8)
                .addGap(36, 36, 36)
                .addComponent(btnLogout2)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        cardPanel.add(appPanel3, "appCard3");

        appPanel4.setPreferredSize(new java.awt.Dimension(600, 400));

        btnLogout3.setText("Logout");
        btnLogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout3ActionPerformed(evt);
            }
        });

        lblWeek9.setText("Logged Into SDEV 325 App Week 6 Panel 4");

        jButton2.setText("Launch Console");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appPanel4Layout = new javax.swing.GroupLayout(appPanel4);
        appPanel4.setLayout(appPanel4Layout);
        appPanel4Layout.setHorizontalGroup(
            appPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout3)
                .addContainerGap())
            .addGroup(appPanel4Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblWeek9)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        appPanel4Layout.setVerticalGroup(
            appPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblWeek9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(appPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        cardPanel.add(appPanel4, "appCard4");

        loginPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        loginPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        password_field1.setToolTipText("Enter Password");

        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblUsername.setText(" ");

        javax.swing.GroupLayout loginPanel1Layout = new javax.swing.GroupLayout(loginPanel1);
        loginPanel1.setLayout(loginPanel1Layout);
        loginPanel1Layout.setHorizontalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSubmit1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(password_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(93, 93, 93)
                        .addComponent(lblUsername)))
                .addGap(191, 191, 191))
        );
        loginPanel1Layout.setVerticalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit1)
                    .addComponent(jButton3))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        cardPanel.add(loginPanel1, "reAuth");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();

        String name = username_field.getText();
        String password = password_field.getText();

        UserAuth dbconn = new UserAuth(name, password);
        String msg = "There is an issue with your account, please contact your System Admin.";
        boolean access;
        int auth;

        try {
            access = dbconn.readDB();
            if (access) {
                auth = dbconn.getAuth();
                user = new User(name, auth);
                switch (user.getAuth()) {
                    case 1:
                        cardLayout.show(cardPanel, "appCard1");
                        break;
                    case 2:
                        cardLayout.show(cardPanel, "appCard2");
                        break;
                    case 3:
                        cardLayout.show(cardPanel, "appCard3");
                        break;
                    case 4:
                        cardLayout.show(cardPanel, "appCard4");
                        break;
                    default:
                        cardLayout.show(cardPanel, "loginCard");
                        JOptionPane.showMessageDialog(null, msg);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }
        } catch (SQLException | UnsupportedEncodingException e) {
            Logger.getLogger(SamuelHavardWeek7Fixed.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        logout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        logout();
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        logout();
    }//GEN-LAST:event_btnLogout2ActionPerformed

    private void btnLogout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout3ActionPerformed
        logout();
    }//GEN-LAST:event_btnLogout3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        String name = user.getUsername();
        if (user.getAuth() == 4) {
            cardLayout.show(cardPanel, "reAuth");
            lblUsername.setText(name);
            password_field1.setText("");   
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
         String password = password_field1.getText();
         UserAuth dbconn = new UserAuth(user.getUsername(), password);
         CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
         String msg = "There is an issue with your account, please contact your System Admin.";
         
        try {
            if (dbconn.readDB()){
                Runtime.getRuntime().exec("cmd.exe /c start");
                cardLayout.show(cardPanel, "appCard4");
            } else {
                JOptionPane.showMessageDialog(null, msg);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(SamuelHavardWeek7Fixed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SamuelHavardWeek7Fixed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SamuelHavardWeek7Fixed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, "appCard4");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SamuelHavardWeek7Fixed().setVisible(true);
        });
    }
    
    /**
     * logout moves the user from the current app screen to the login screen.
     */
    public void logout() {
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, "loginCard");
        username_field.setText("");
        password_field.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appPanel1;
    private javax.swing.JPanel appPanel2;
    private javax.swing.JPanel appPanel3;
    private javax.swing.JPanel appPanel4;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWeek6;
    private javax.swing.JLabel lblWeek7;
    private javax.swing.JLabel lblWeek8;
    private javax.swing.JLabel lblWeek9;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JTextField password_field;
    private javax.swing.JTextField password_field1;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
User user = null;
}
