package gui;

import javax.swing.*;
import model.*;

public class LoginP extends javax.swing.JDialog {

    public LoginP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameF = new javax.swing.JTextField();
        passwordF = new javax.swing.JPasswordField();
        logiinB = new javax.swing.JButton();
        qiutB = new javax.swing.JButton();
        NameL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facility Management");
        setAlwaysOnTop(true);
        setResizable(false);

        usernameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFActionPerformed(evt);
            }
        });

        passwordF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFActionPerformed(evt);
            }
        });

        logiinB.setText("Login");
        logiinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logiinBActionPerformed(evt);
            }
        });

        qiutB.setText("Quit");
        qiutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qiutBActionPerformed(evt);
            }
        });

        NameL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NameL.setText("Facility Management");
        NameL.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameF, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(passwordF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logiinB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qiutB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameL)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(usernameF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logiinB)
                    .addComponent(qiutB))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        usernameF.getAccessibleContext().setAccessibleName("");
        usernameF.getAccessibleContext().setAccessibleDescription("Username");
        passwordF.getAccessibleContext().setAccessibleDescription("Password");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFActionPerformed
        getContentPane().add(usernameF);
    }//GEN-LAST:event_usernameFActionPerformed

    private void passwordFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFActionPerformed
        getContentPane().add(passwordF);
    }//GEN-LAST:event_passwordFActionPerformed

    private void logiinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logiinBActionPerformed
        if (usernameF.getText().equals("mildsadz") && passwordF.getText().equals("mildza789")) {
            LocationP lp = new LocationP();
            lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
            lp.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Invalid", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_logiinBActionPerformed

    private void qiutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qiutBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_qiutBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginP dialog = new LoginP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameL;
    private javax.swing.JButton logiinB;
    private javax.swing.JPasswordField passwordF;
    private javax.swing.JButton qiutB;
    private javax.swing.JTextField usernameF;
    // End of variables declaration//GEN-END:variables
}
