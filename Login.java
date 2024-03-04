
package INS;

import INS.MainFrame; 

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        uNameBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passBox = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        OKbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Login Form");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, -1));

        uNameBox.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(uNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("User Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, -1));

        passBox.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(passBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 78, -1));

        OKbtn1.setBackground(new java.awt.Color(0, 204, 153));
        OKbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OKbtn1.setForeground(new java.awt.Color(0, 0, 0));
        OKbtn1.setText("OK");
        OKbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(OKbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtn1ActionPerformed
        String uName;
        String pass;
        
        uName = uNameBox.getText();
        pass = passBox.getText();
        
        if(uName.equals("Namal") && pass.equals("123")){
            MainFrame m1 = new MainFrame();
            m1.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_OKbtn1ActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKbtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passBox;
    private javax.swing.JTextField uNameBox;
    // End of variables declaration//GEN-END:variables
}
