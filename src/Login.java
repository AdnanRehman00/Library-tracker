/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * This class creates a login window for the application using Swing.
 * It contains text fields for the username and password, and a button to submit the login information.
 * The class is extended from javax.swing.JFrame to create a window-based application.
 * 
 * @author Addy
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     * Purpose: Initializes the login window and its components.
     */
    public Login() {
        initComponents();  // Initialize the components (UI elements)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Create and initialize UI components (labels, text fields, button)
        jLabel1 = new javax.swing.JLabel();  // Login title label
        jLabel2 = new javax.swing.JLabel();  // Username label
        jLabel3 = new javax.swing.JLabel();  // Password label
        USER = new javax.swing.JTextField();  // Username input field
        Password = new javax.swing.JPasswordField();  // Password input field
        jButton1 = new javax.swing.JButton();  // Login button

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  // Close the application when the window is closed

        // Set up the properties of the labels
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18));  // Set font for the title label
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  // Center the text
        jLabel1.setText("LOGIN");  // Set the text for the title label

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 12));  // Set font for the username label
        jLabel2.setText("USERNAME");  // Set the text for the username label

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 12));  // Set font for the password label
        jLabel3.setText("PASSWORD");  // Set the text for the password label

        // Add action listeners for username and password fields (handling user input)
        USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERActionPerformed(evt);  // Call method when user hits Enter after typing username
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);  // Call method when user hits Enter after typing password
            }
        });

        // Set up the login button
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 12));  // Set font for the login button
        jButton1.setText("LOGIN");  // Set the button text to "LOGIN"
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);  // Call method when the login button is clicked
            }
        });

        // Layout setup for the UI components (arranging them within the window)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)  // Title label
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)  // Username label
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))  // Username text field
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)  // Password label
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))  // Password text field
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)  // Login button
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)  // Display title label
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)  // Username field
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))  // Username label
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)  // Password field
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))  // Password label
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)  // Login button
                .addGap(17, 17, 17))
        );

        pack();  // Adjust the size of the window to fit the components
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method handles the event when the user hits Enter after entering a username.
     * It can be used to trigger additional actions (e.g., validation).
     * 
     * @param evt the event triggered by the user action
     */
    private void USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERActionPerformed
        // TODO add your handling code here:
        // Handle user input in the username field (optional)
    }//GEN-LAST:event_USERActionPerformed

    /**
     * This method handles the event when the user hits Enter after entering a password.
     * It can be used to trigger additional actions (e.g., validation).
     * 
     * @param evt the event triggered by the user action
     */
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        // Handle user input in the password field (optional)
    }//GEN-LAST:event_PasswordActionPerformed

    /**
     * This method handles the event when the login button is clicked.
     * It can be used to perform the login authentication or validation.
     * 
     * @param evt the event triggered by the user clicking the login button
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Handle login button click here (perform authentication or validation)
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * The main method for running the login window.
     * It sets up the look and feel and creates the login form.
     * 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);  // Display the login window
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;  // Password field
    private javax.swing.JTextField USER;  // Username field
    private javax.swing.JButton jButton1;  // Login button
    private javax.swing.JLabel jLabel1;  // Title label
    private javax.swing.JLabel jLabel2;  // Username label
    private javax.swing.JLabel jLabel3;  // Password label
    // End of variables declaration//GEN-END:variables
}
