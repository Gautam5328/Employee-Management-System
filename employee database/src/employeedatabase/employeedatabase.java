/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import java.sql.*;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author GAUTAM
 */
public class employeedatabase extends javax.swing.JFrame {

    
         Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        DefaultTableModel model= new DefaultTableModel();
        
    public employeedatabase() {
        initComponents();
        
        conn=employeedatabase.ConnectDb();
        
        Object col[]= {"Empid","NInum","Firstname","Surname","Gender","DOB","Age","Salary" };
        model.setColumnIdentifiers(col);
        jTable1.setModel(model);
        updateTable();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxteid = new javax.swing.JTextField();
        jbtnprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxtni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtfirst = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtsurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtgender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtdob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtsalary = new javax.swing.JTextField();
        jbtnadddata = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jbtncleardata = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jtxteid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxteidActionPerformed(evt);
            }
        });
        getContentPane().add(jtxteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 140, -1));

        jbtnprint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnprint.setText("Print");
        jbtnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprintActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp id", "NI num", "Firstname", "Surname", "Gender", "DOB", "Age", "Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 790, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("NI number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jtxtni.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("First name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jtxtfirst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Surname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jtxtsurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jtxtgender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jtxtdob.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Age");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jtxtage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jtxtsalary.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jtxtsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 140, -1));

        jbtnadddata.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnadddata.setText("Add Data");
        jbtnadddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnadddataActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnadddata, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 120, -1));

        jbtncleardata.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtncleardata.setText("Clear Data");
        jbtncleardata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncleardataActionPerformed(evt);
            }
        });
        getContentPane().add(jbtncleardata, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("Employee Database Management System");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static Connection ConnectDb()
    {
        try
        {
          Class.forName("org.sqlite.JDBC");
          Connection conn=DriverManager.getConnection("jdbc:sqlite:employee.db");
          return conn;
          
            
        }
        
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
         return null;
            
        }
        
        
    }
    
    
    private void jtxteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxteidActionPerformed

    
    private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog( frame,"Confirm if you want to exit","Employee Database Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtncleardataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncleardataActionPerformed
        // TODO add your handling code here:
        jtxteid.setText(null);
        jtxtni.setText(null);
        jtxtfirst.setText(null);
        jtxtsurname.setText(null);
        
        jtxtgender.setText(null);
        jtxtdob.setText(null);
        jtxtsalary.setText(null);
        jtxtage.setText(null);
    }//GEN-LAST:event_jbtncleardataActionPerformed

    private void jbtnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprintActionPerformed
        // TODO add your handling code here:
        MessageFormat header=new MessageFormat("Printing in progess");
        MessageFormat footer=new MessageFormat("Page {0,number,integer}");
        try
        {
          jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
         System.err.format("No printer Found", e.getMessage());
        }
        
    }//GEN-LAST:event_jbtnprintActionPerformed

    private void jbtnadddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnadddataActionPerformed
        // TODO add your handling code here:
        String sql="INSERT INTO employee(Empid,NInum,Firstname,Surname,Gender,DOB,Age,Salary)VALUES(?,?,?,?,?,?,?,?)";
        try
        {
         pst=conn.prepareStatement(sql);
         pst.setString(1,jtxteid.getText());
            pst.setString(2,jtxtni.getText());
            pst.setString(3,jtxtfirst.getText());
            pst.setString(4,jtxtsurname.getText());
            pst.setString(5,jtxtgender.getText());
            pst.setString(6,jtxtdob.getText());
            pst.setString(7,jtxtage.getText());
            pst.setString(8,jtxtsalary.getText());
        
            pst.execute();
            JOptionPane.showMessageDialog(null, "System update Completed");
            
            rs.close();
            pst.close();
            
        }
        catch( Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTable();
        
    }//GEN-LAST:event_jbtnadddataActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void updateTable()
    {
        conn=employeedatabase.ConnectDb();
        if(conn!=null)
        {
             String sql="Select Empid,NInum,Firstname,Surname,Gender,DOB,Age,Salary from employee";
             
             try
             {
              pst=conn.prepareStatement(sql);
              rs=pst.executeQuery();
              Object[] columnData=new Object[8];
                      
              while(rs.next())
              {
                  columnData[0] = rs.getString("Empid");
                   columnData[1] = rs.getString("NInum");
                    columnData[2] = rs.getString("Firstname");
                     columnData[3] = rs.getString("Surname");
                      columnData[4] = rs.getString("Gender");
                       columnData[5] = rs.getString("DOB");
                        columnData[6] = rs.getString("Age");
                         columnData[7] = rs.getString("Salary");
                  
                         model.addRow(columnData);
              }
             }
             
             catch(Exception e)
             {
              JOptionPane.showMessageDialog(null, e);
             }
            
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(employeedatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeedatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeedatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeedatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeedatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnadddata;
    private javax.swing.JButton jbtncleardata;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnprint;
    private javax.swing.JTextField jtxtage;
    private javax.swing.JTextField jtxtdob;
    private javax.swing.JTextField jtxteid;
    private javax.swing.JTextField jtxtfirst;
    private javax.swing.JTextField jtxtgender;
    private javax.swing.JTextField jtxtni;
    private javax.swing.JTextField jtxtsalary;
    private javax.swing.JTextField jtxtsurname;
    // End of variables declaration//GEN-END:variables
}
