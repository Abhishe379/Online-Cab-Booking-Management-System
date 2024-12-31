/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.onlinecabbookingmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DriverSelection extends javax.swing.JFrame {

    /**
     * Creates new form DriverSelection
     */
    public DriverSelection() {
        initComponents();
        java.net.URL imgURL = getClass().getResource("C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\OnlineCabBookingManagementSystem\\src\\zone2.png");
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            jLabel9.setIcon(icon);
        } else {
            System.err.println("Couldn't find file:C:C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\OnlineCabBookingManagementSystem\\src\\zone2.png");
        }
    }

    int id=0;
int getId()
{
    ResultSet rs=null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/onlinecbmsystemdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL ";
Connection con=DriverManager.getConnection(url, "root","7217296337@abhi");

String sql="select max(id) from driverselection";
Statement st=con.createStatement();
rs=st.executeQuery(sql);

while(rs.next())
{
    id=rs.getInt(1);
id++;
}

    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
        return id;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtd_id = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        combozone = new javax.swing.JComboBox<>();
        txtemailid = new javax.swing.JTextField();
        txtpfield = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtcab = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Driver Selection");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\OnlineCabBookingManagementSystem\\src\\zone2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Driver Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Zone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Email_Id");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        btnsave.setBackground(new java.awt.Color(255, 51, 0));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 51, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(255, 51, 0));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        txtd_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtd_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtd_idActionPerformed(evt);
            }
        });

        txtuname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        combozone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        combozone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eastern", "Western", "Northern", "Southern", "Central" }));

        txtemailid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtpfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cab_Type");

        txtcab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(txtd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(combozone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324)
                        .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnsave)
                        .addGap(201, 201, 201)
                        .addComponent(btnclear)
                        .addGap(177, 177, 177)
                        .addComponent(btnback))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(324, 324, 324)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpfield, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtcab))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(combozone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtpfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtcab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsave)
                    .addComponent(btnclear)
                    .addComponent(btnback))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
    
        
        
        if (validateLogin() && Selection()) {
        insertData();
        
    } else {
        JOptionPane.showMessageDialog(this, "Invalid login credentials or form data.");
    }
    
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
      DriverLogin dl1 = new DriverLogin();
      dl1.show();
      this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
    txtd_id.setText("");
txtuname.setText("");
 combozone.setSelectedItem("");
txtemailid.setText("");
txtpfield.setText(""); 
txtcab.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtd_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtd_idActionPerformed
     fetchDriverData();   // TODO add your handling code here:
    }//GEN-LAST:event_txtd_idActionPerformed

  private void fetchDriverData() {
    String driverId = txtd_id.getText().trim(); // Get the driver ID from the text field
    if (driverId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Driver ID.");
        return;
    }

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/onlinecbmsystemdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
        con = DriverManager.getConnection(url, "root", "7217296337@abhi");

        String sql = "SELECT * FROM driverlogin WHERE Unique_Id = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, driverId);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            // Populate fields with the fetched data
            txtuname.setText(rs.getString("Username"));
           // combozone.setSelectedItem(rs.getString("Zone"));
            txtemailid.setText(rs.getString("Email_id"));
            txtpfield.setText(rs.getString("Password"));
            
        } else {
            JOptionPane.showMessageDialog(this, "No driver found with the given ID.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching driver data.");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

    
    
    String Driver_Id,Username,Zone,Email_Id,Password,Cab_Type;

      boolean validateLogin() {
          String Unique_Id=txtd_id.getText();
    String Email_Id = txtemailid.getText();
    String Password = new String(txtpfield.getPassword());

    if (Unique_Id.isEmpty() ||Email_Id.isEmpty() || Password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter unique id and  email and password.");
        return false;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/onlinecbmsystemdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
        Connection con = DriverManager.getConnection(url, "root", "7217296337@abhi");

        System.out.println("Database connection established");

        String sql = "SELECT * FROM driverlogin WHERE Unique_Id = ? AND Email_Id = ? AND Password = ? ";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, Unique_Id);
        st.setString(2, Email_Id);
        st.setString(3, Password);

        System.out.println("SQL query prepared: " + sql);

        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            System.out.println("Login successful for email: " + Email_Id);
            return true; // Login successful
        } else {
            JOptionPane.showMessageDialog(this, "Invalid  Unique_id ,email or password.");
            System.out.println("Invalid Unique_id , email or password for email: " + Email_Id);
            return false; // Login failed
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database connection error.");
        return false;
    }
}
    
    
   void insertData() {
    String Driver_Id = txtd_id.getText().trim();
    String Username = txtuname.getText().trim();
    String Zone = (String) combozone.getSelectedItem();
    String Email_id = txtemailid.getText().trim();
    String Password = new String(txtpfield.getPassword()).trim();
    String Cab_Type = txtcab.getText().trim(); // Get Cab_Type from text field

    // Debugging output
    System.out.println("Driver_Id: " + Driver_Id);
    System.out.println("Username: " + Username);
    System.out.println("Zone: " + Zone);
    System.out.println("Email_id: " + Email_id);
    System.out.println("Password: " + Password);
    System.out.println("Cab_Type: " + Cab_Type);

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/onlinecbmsystemdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
        Connection con = DriverManager.getConnection(url, "root", "7217296337@abhi");

        String sql = "INSERT INTO driverselection (id, Driver_Id, Username, Zone, Email_id, Password, Cab_Type) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, getId()); // Set the ID
        pst.setString(2, Driver_Id); // Set the unique ID
        pst.setString(3, Username);
        pst.setString(4, Zone);
        pst.setString(5, Email_id); // Set the email
        pst.setString(6, Password); // Set the password
        pst.setString(7, Cab_Type); // Set the Cab_Type

        int rowCount = pst.executeUpdate();
        if (rowCount > 0) {
            JOptionPane.showMessageDialog(this, "Record inserted successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Record insertion failed");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error inserting data.");
    }
}



    
    boolean Selection()
{
Driver_Id=txtd_id.getText();
Username=txtuname.getText();
Zone=(String) combozone.getSelectedItem();
Email_Id=txtemailid.getText();
Password=txtpfield.getText();

if(Driver_Id.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your driver id");
return false;
}
if(Username.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your name");
return false;
}
if(Zone.isEmpty())
{
JOptionPane.showMessageDialog(this,"enter your zone");
return false;
}
if(Email_Id.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your Registed Email  id");
return false;
}
if(Password.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your Password");
return false;
}
return true;
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
            java.util.logging.Logger.getLogger(DriverSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> combozone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcab;
    private javax.swing.JTextField txtd_id;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JPasswordField txtpfield;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}