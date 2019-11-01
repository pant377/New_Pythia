
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stini
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        AdminPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adminLogoutButton = new javax.swing.JButton();
        addProf = new javax.swing.JButton();
        addStd = new javax.swing.JButton();
        FoiththsPage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        foiththsLogoutButton = new javax.swing.JButton();
        KathigitisPage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kathigitisLogoutButton = new javax.swing.JButton();
        newStdPage = new javax.swing.JPanel();
        stdUsername = new javax.swing.JTextField();
        stdPassword = new javax.swing.JTextField();
        stdMail = new javax.swing.JTextField();
        stdOnomaEponymo = new javax.swing.JTextField();
        stdAM = new javax.swing.JTextField();
        stdTmhma = new javax.swing.JTextField();
        stdEksamino = new javax.swing.JTextField();
        stdDieythinsi = new javax.swing.JTextField();
        stdIdiotita = new javax.swing.JTextField();
        stdThlefwno = new javax.swing.JTextField();
        stdNewSubmit = new javax.swing.JButton();
        newProfPage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jPasswordField1)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        jLabel1.setText("Admin Page");

        adminLogoutButton.setText("LogOut");
        adminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutButtonActionPerformed(evt);
            }
        });

        addProf.setText("Add Professor");

        addStd.setText("Add Student");
        addStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPageLayout = new javax.swing.GroupLayout(AdminPage);
        AdminPage.setLayout(AdminPageLayout);
        AdminPageLayout.setHorizontalGroup(
            AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPageLayout.createSequentialGroup()
                .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPageLayout.createSequentialGroup()
                        .addContainerGap(323, Short.MAX_VALUE)
                        .addComponent(adminLogoutButton))
                    .addGroup(AdminPageLayout.createSequentialGroup()
                        .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addStd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AdminPageLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1))
                                .addGroup(AdminPageLayout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(addProf))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AdminPageLayout.setVerticalGroup(
            AdminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(addProf)
                .addGap(28, 28, 28)
                .addComponent(addStd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(adminLogoutButton)
                .addContainerGap())
        );

        getContentPane().add(AdminPage, "card3");

        jLabel2.setText("Φοιτητής ");

        foiththsLogoutButton.setText("LogOut");
        foiththsLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foiththsLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FoiththsPageLayout = new javax.swing.GroupLayout(FoiththsPage);
        FoiththsPage.setLayout(FoiththsPageLayout);
        FoiththsPageLayout.setHorizontalGroup(
            FoiththsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoiththsPageLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FoiththsPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foiththsLogoutButton)
                .addContainerGap())
        );
        FoiththsPageLayout.setVerticalGroup(
            FoiththsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoiththsPageLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(foiththsLogoutButton)
                .addContainerGap())
        );

        getContentPane().add(FoiththsPage, "card4");

        jLabel3.setText("Καθηγητής");

        kathigitisLogoutButton.setText("LogOut");
        kathigitisLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kathigitisLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KathigitisPageLayout = new javax.swing.GroupLayout(KathigitisPage);
        KathigitisPage.setLayout(KathigitisPageLayout);
        KathigitisPageLayout.setHorizontalGroup(
            KathigitisPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KathigitisPageLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KathigitisPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kathigitisLogoutButton)
                .addContainerGap())
        );
        KathigitisPageLayout.setVerticalGroup(
            KathigitisPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KathigitisPageLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(kathigitisLogoutButton)
                .addContainerGap())
        );

        getContentPane().add(KathigitisPage, "card5");

        stdUsername.setText("jTextField2");

        stdPassword.setText("jTextField3");

        stdMail.setText("jTextField4");

        stdOnomaEponymo.setText("jTextField4");

        stdAM.setText("jTextField4");

        stdTmhma.setText("jTextField4");

        stdEksamino.setText("jTextField4");

        stdDieythinsi.setText("jTextField4");

        stdIdiotita.setText("jTextField4");

        stdThlefwno.setText("jTextField4");

        stdNewSubmit.setText("Submit");
        stdNewSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdNewSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newStdPageLayout = new javax.swing.GroupLayout(newStdPage);
        newStdPage.setLayout(newStdPageLayout);
        newStdPageLayout.setHorizontalGroup(
            newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStdPageLayout.createSequentialGroup()
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newStdPageLayout.createSequentialGroup()
                        .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newStdPageLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(stdUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStdPageLayout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stdAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stdIdiotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stdEksamino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(258, 258, 258)))
                        .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stdThlefwno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stdPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newStdPageLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(stdMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stdOnomaEponymo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newStdPageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stdDieythinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stdTmhma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStdPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(stdNewSubmit)
                .addGap(34, 34, 34))
        );
        newStdPageLayout.setVerticalGroup(
            newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStdPageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdOnomaEponymo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdThlefwno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdIdiotita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdTmhma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(newStdPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newStdPageLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(stdDieythinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newStdPageLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(stdEksamino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(stdNewSubmit)
                .addGap(36, 36, 36))
        );

        getContentPane().add(newStdPage, "card6");

        javax.swing.GroupLayout newProfPageLayout = new javax.swing.GroupLayout(newProfPage);
        newProfPage.setLayout(newProfPageLayout);
        newProfPageLayout.setHorizontalGroup(
            newProfPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        newProfPageLayout.setVerticalGroup(
            newProfPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(newProfPage, "card7");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Account admin = new Admin("it174890", "633818", "it174890@it.teithe.gr", "Γιώργος Στίνης", "2310574479");
//        Account kathigitis = new Kathigitis("daddy", "keftedaki", "dad@it.teithe.gr", "SallaDaddy", "6948855476", "Μαθηματικός", "Μηχανικών Πληροφορικής");
//        Account foithths = new Foititis("ego", "555", "ego@gmail.com", "ego memena", "", 174891, "Διοικηση", 5, "Λαχανά 22");
        try {
//            FileOutputStream f = new FileOutputStream(new File("myAccounts.txt"));
//            ObjectOutputStream o = new ObjectOutputStream(f);
//            o.writeObject(admin);
//            o.writeObject(kathigitis);
//            o.writeObject(foithths);
//            o.close();
//            f.close();
            FileInputStream fi = new FileInputStream(new File("myAccounts.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Account a1;
            String usernameTextfield = jTextField1.getText();
            char[] passwordTextfield = jPasswordField1.getPassword();
            clearLoginFields();
            while (true){
                a1=(Account)oi.readObject();
                char[] passwordArray = a1.getPassword().toCharArray();
                if(Arrays.equals(passwordTextfield, passwordArray) && a1.getUsername().equals(usernameTextfield)){
                    getContentPane().removeAll();
                    getContentPane().repaint();
                    getContentPane().revalidate();
                    switch (a1.getIdiotita()) {
                        case "Administrator":
                            getContentPane().add(AdminPage);
                            break;
                        case "Professor":
                            getContentPane().add(KathigitisPage);
                            break;
                        case "Student":
                            getContentPane().add(FoiththsPage);
                            break;
                        default:
                            break;
                    }
                    getContentPane().repaint();
                    getContentPane().revalidate();
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            System.out.println("Lathos Stoixeia");
        } catch (ClassNotFoundException ex) {
            System.out.println("Geia");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kathigitisLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kathigitisLogoutButtonActionPerformed
        goToHomePage();
    }//GEN-LAST:event_kathigitisLogoutButtonActionPerformed

    private void foiththsLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foiththsLogoutButtonActionPerformed
        goToHomePage();
    }//GEN-LAST:event_foiththsLogoutButtonActionPerformed

    private void adminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutButtonActionPerformed
        goToHomePage();
    }//GEN-LAST:event_adminLogoutButtonActionPerformed

    private void addStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStdActionPerformed
        getContentPane().removeAll();
        getContentPane().repaint();
        getContentPane().revalidate();
        getContentPane().add(newStdPage);
        getContentPane().repaint();
        getContentPane().revalidate();
    }//GEN-LAST:event_addStdActionPerformed

    private void stdNewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdNewSubmitActionPerformed
        String usernameStd = stdUsername.getText();
        String passStd = stdPassword.getText();
        String mailStd = stdMail.getText();
        String onomateponumoStd = stdOnomaEponymo.getText();
        String idiotitaStd = stdIdiotita.getText();
        String thlefwnoStd = stdThlefwno.getText();
    }//GEN-LAST:event_stdNewSubmitActionPerformed
    public void clearLoginFields(){
        jPasswordField1.setText("");
        jTextField1.setText("");
    }
    public void goToHomePage(){
        getContentPane().removeAll();
        getContentPane().repaint();
        getContentPane().revalidate();
        getContentPane().add(jPanel1);
        getContentPane().repaint();
        getContentPane().revalidate();
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPage;
    private javax.swing.JPanel FoiththsPage;
    private javax.swing.JPanel KathigitisPage;
    private javax.swing.JButton addProf;
    private javax.swing.JButton addStd;
    private javax.swing.JButton adminLogoutButton;
    private javax.swing.JButton foiththsLogoutButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kathigitisLogoutButton;
    private javax.swing.JPanel newProfPage;
    private javax.swing.JPanel newStdPage;
    private javax.swing.JTextField stdAM;
    private javax.swing.JTextField stdDieythinsi;
    private javax.swing.JTextField stdEksamino;
    private javax.swing.JTextField stdIdiotita;
    private javax.swing.JTextField stdMail;
    private javax.swing.JButton stdNewSubmit;
    private javax.swing.JTextField stdOnomaEponymo;
    private javax.swing.JTextField stdPassword;
    private javax.swing.JTextField stdThlefwno;
    private javax.swing.JTextField stdTmhma;
    private javax.swing.JTextField stdUsername;
    // End of variables declaration//GEN-END:variables
}
