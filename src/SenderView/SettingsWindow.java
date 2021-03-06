/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SenderView;
import SenderController.*;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

/**
 *
 * @author igor
 */
public class SettingsWindow extends javax.swing.JFrame {
private String[] Settings = new String[5];
private SenderController controller = SenderController.getController();
    /**
     * Creates new form SettingsWindow
     */
    public SettingsWindow() {
        initComponents();
        loginField.setText("zakaz.artmebel01@mail.ru"); passwordField.setText("QWE789qwe");
        smtpField.setText("smtp.mail.ru"); portField.setText("465");
        senderField.setText("Art-Mebel 01<zakaz.artmebel01@mail.ru>");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        serviceComboBox = new javax.swing.JComboBox();
        postService = new javax.swing.JLabel();
        smtpName = new javax.swing.JLabel();
        smtpField = new javax.swing.JTextField();
        port = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        saveSettings = new javax.swing.JButton();
        cancelSettings = new javax.swing.JButton();
        senderField = new javax.swing.JTextField();
        sender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setText("Логин");

        password.setText("Пароль");

        serviceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mail.ru", "gmail.com", "hotmail.com", "другое" }));

        postService.setText("Почтовый сервис");

        smtpName.setText("имя smtp сервера");

        port.setText("Port");

        saveSettings.setText("Сохранить");
        saveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSettingsActionPerformed(evt);
            }
        });

        cancelSettings.setText("Отмена");
        cancelSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSettingsActionPerformed(evt);
            }
        });

        sender.setText("Отправитель");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smtpField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(postService)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(serviceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(senderField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(smtpName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(port)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smtpName)
                .addGap(3, 3, 3)
                .addComponent(smtpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSettings)
                    .addComponent(cancelSettings))
                .addContainerGap())
        );

        loginField.getAccessibleContext().setAccessibleName("loginField");
        passwordField.getAccessibleContext().setAccessibleName("pasField");
        serviceComboBox.getAccessibleContext().setAccessibleName("mailService");
        smtpField.getAccessibleContext().setAccessibleName("host");
        smtpField.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void readSettings(){
       this.Settings[0]=loginField.getText(); //Login
       this.Settings[1]=passwordField.getText(); //Password
       this.Settings[2]=serviceComboBox.getSelectedItem().toString(); //mail server
       this.Settings[3]=smtpField.getText(); //host
       this.Settings[4]=portField.getText(); //port
      // this.jButton2.addAncestorListener(null);
    }
    
    public String getSettings(int n){
        return this.Settings[n];
    }
    private void saveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSettingsActionPerformed
           controller.setSettings(senderField.getText(),this.loginField.getText(), this.passwordField.getText(),
             this.smtpField.getText(),"mail", this.portField.getText());
           setVisible(false);
    }//GEN-LAST:event_saveSettingsActionPerformed

    private void cancelSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSettingsActionPerformed
       setVisible(true);
    }//GEN-LAST:event_cancelSettingsActionPerformed

    public javax.swing.JButton ButtonClicked(){
    return saveSettings;
}
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
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelSettings;
    private javax.swing.JLabel login;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel port;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel postService;
    private javax.swing.JButton saveSettings;
    private javax.swing.JLabel sender;
    private javax.swing.JTextField senderField;
    private javax.swing.JComboBox serviceComboBox;
    private javax.swing.JTextField smtpField;
    private javax.swing.JLabel smtpName;
    // End of variables declaration//GEN-END:variables
}
