package TestandReport;

import Appointment.AppoinmentManagement;
import Stock.StockManagement;
import Home.HomePage;
import Home.Login;
import Payment.PaymentManagement;

public class ReportManagement extends javax.swing.JFrame {

    public ReportManagement() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PatientButton = new javax.swing.JButton("<html>Payment<br> Management</html>");
        TestReportsButton = new javax.swing.JButton("<html>Report<br> Management</html>");
        stockButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AppointmentPAtinetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatientReportsButton = new javax.swing.JButton();
        AddReportDetailsButton = new javax.swing.JButton();
        addTestDetailsButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientButton.setBackground(new java.awt.Color(153, 204, 255));
        PatientButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PatientButton.setText("Payment Managment");
        PatientButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PatientButton.setBorderPainted(false);
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PatientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 290, 90));

        TestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        TestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        TestReportsButton.setText("Report Management");
        TestReportsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TestReportsButton.setBorderPainted(false);
        TestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 290, 90));

        stockButton.setBackground(new java.awt.Color(153, 204, 255));
        stockButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        stockButton.setText("Stock Management");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });
        jPanel1.add(stockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 290, 90));

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 90));

        AppointmentPAtinetButton.setBackground(new java.awt.Color(153, 204, 255));
        AppointmentPAtinetButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        AppointmentPAtinetButton.setText("Appointment & Patient");
        AppointmentPAtinetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentPAtinetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AppointmentPAtinetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 290, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report Management");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 490, 130));

        PatientReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        PatientReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        PatientReportsButton.setText("Patient Reports");
        PatientReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientReportsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 380, 90));

        AddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        AddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        AddReportDetailsButton.setText("Add Test Reults");
        AddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(AddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 380, 80));

        addTestDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        addTestDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        addTestDetailsButton.setText("Add Test Details");
        addTestDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestDetailsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addTestDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 380, 100));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton9.setText("Test Reports");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 380, 80));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 680);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1080, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1060, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        if(new Login().role.equals("Nurse") || new Login().role.equals("Owner")){
            PaymentManagement pm=new PaymentManagement();
            this.dispose();
            pm.setVisible(true);
        }
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void TestReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestReportsButtonActionPerformed
       
    }//GEN-LAST:event_TestReportsButtonActionPerformed

    private void PatientReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientReportsButtonActionPerformed
        //ADD PATIENT REPORTS
        Report tr=new Report();
        this.dispose();
        tr.setVisible(true);
    }//GEN-LAST:event_PatientReportsButtonActionPerformed

    private void addTestDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestDetailsButtonActionPerformed
       // ADD TEST DETAILS
        Test t=new Test();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_addTestDetailsButtonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        if(new Login().role.equals("Stock keaper") || new Login().role.equals("Owner")){
            StockManagement tdr = new StockManagement();
            this.dispose();
            tdr.setVisible(true);
        }
    }//GEN-LAST:event_stockButtonActionPerformed

    private void AppointmentPAtinetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentPAtinetButtonActionPerformed
        if(new Login().role.equals("Nurse") || new Login().role.equals("Owner")){
            AppoinmentManagement ap=new AppoinmentManagement();
            this.dispose();
            ap.setVisible(true);
        }
    }//GEN-LAST:event_AppointmentPAtinetButtonActionPerformed

    private void AddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReportDetailsButtonActionPerformed
        // ADD REPORT DETAILS -ADD PATIENTS REPORT DETAILS
        TestResults ard = new TestResults();
        this.dispose();
        ard.setVisible(true);
    }//GEN-LAST:event_AddReportDetailsButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        TestDailyReport tdr = new TestDailyReport();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HomePage home=new HomePage();
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton AppointmentPAtinetButton;
    private javax.swing.JButton PatientButton;
    private javax.swing.JButton PatientReportsButton;
    private javax.swing.JButton TestReportsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton stockButton;
    // End of variables declaration//GEN-END:variables
}
