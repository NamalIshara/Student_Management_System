
package INS;

import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class MainFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public MainFrame() {
        initComponents();
        con = (Connection) DBconnect.connect();
        tableLoad();
    }
    
    public void tableLoad(){
    
        try {
            String sql = "SELECT ID AS Id,Name,Age,Grade FROM student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
    
    public void tableData(){
    
        int r = Table1.getSelectedRow();
        
        String id = Table1.getValueAt(r, 0).toString();
        String name = Table1.getValueAt(r, 1).toString();
        String age = Table1.getValueAt(r, 2).toString();
        String grade = Table1.getValueAt(r,3).toString();
        
        IDBox.setText(id);
        nameBox.setText(name);
        ageBox.setText(age);
        gradeBox.setSelectedItem(grade);
        
        
    }
    
    public void search(){
        
        String search = searchBox.getText();
        
        try {
            String sql = "SELECT ID,Name,Age,Grade FROM student WHERE Name LIKE '%"+search+"%' OR ID LIKE '%"+search+"%' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void update(){
    
         String id = IDBox.getText().toString();
         String name = nameBox.getText().toString();
         String age = ageBox.getText().toString();
         String grade = gradeBox.getSelectedItem().toString();
         
         try {
            String sql = "UPDATE student SET Name='"+name+"',Age='"+age+"',Grade='"+grade+"' WHERE ID='"+id+"' ";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                
                 
    }
    
    public void clear(){
        searchBox.setText("");
        IDBox.setText("");
        nameBox.setText("");
        ageBox.setText("");
        gradeBox.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nameBox = new javax.swing.JTextField();
        ageBox = new javax.swing.JTextField();
        gradeBox = new javax.swing.JComboBox<>();
        insertBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IDBox = new javax.swing.JTextField();
        searchBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        clearBox = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        insertBtn1.setBackground(new java.awt.Color(0, 0, 0));
        insertBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertBtn1.setText("Insert");
        insertBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameBox.setBackground(new java.awt.Color(204, 204, 255));
        nameBox.setForeground(new java.awt.Color(0, 0, 0));
        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });
        jPanel1.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, -1));

        ageBox.setBackground(new java.awt.Color(204, 204, 255));
        ageBox.setForeground(new java.awt.Color(0, 0, 0));
        ageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ageBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, -1));

        gradeBox.setBackground(new java.awt.Color(204, 204, 255));
        gradeBox.setForeground(new java.awt.Color(0, 0, 0));
        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        gradeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBoxActionPerformed(evt);
            }
        });
        jPanel1.add(gradeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, -1));

        insertBtn.setBackground(new java.awt.Color(0, 0, 0));
        insertBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertBtn.setForeground(new java.awt.Color(255, 255, 255));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Age:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Grade:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Table1.setBackground(new java.awt.Color(204, 204, 204));
        Table1.setForeground(new java.awt.Color(0, 0, 0));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        Table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 310, 250));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 170, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        IDBox.setBackground(new java.awt.Color(204, 204, 255));
        IDBox.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(IDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, -1));

        searchBox.setBackground(new java.awt.Color(204, 204, 255));
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });
        jPanel1.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 272, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Search");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 276, 60, 20));

        deleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 30));

        clearBox.setBackground(new java.awt.Color(0, 0, 0));
        clearBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBox.setForeground(new java.awt.Color(255, 255, 255));
        clearBox.setText("Clear");
        clearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBoxActionPerformed(evt);
            }
        });
        jPanel1.add(clearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, 30));

        exitBtn.setBackground(new java.awt.Color(0, 0, 0));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeBoxActionPerformed

    private void ageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageBoxActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        String name;
        int age;
        int grade;
        
        name = nameBox.getText();
        age = Integer.parseInt(ageBox.getText());
        grade = Integer.parseInt(gradeBox.getSelectedItem().toString());
        
        try {
            String sql = "INSERT INTO student(Name,Age,Grade) VALUES('"+name+"','"+age+"','"+grade+"')";
            
            pst = con.prepareStatement(sql);
            pst.execute();
            tableLoad();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        tableData();
    }//GEN-LAST:event_Table1MouseClicked

    private void Table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table1KeyReleased
        tableData();
    }//GEN-LAST:event_Table1KeyReleased

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameBoxActionPerformed

    private void insertBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertBtn1ActionPerformed

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_searchBoxKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        update();
        tableLoad();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        
        if(check==0){
            String id = IDBox.getText().toString();
            try {
                String sql = "DELETE FROM student WHERE ID ='"+id+"' ";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        tableLoad();
        clear();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBoxActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearBoxActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDBox;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField ageBox;
    private javax.swing.JButton clearBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton insertBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
