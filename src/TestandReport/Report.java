
package TestandReport;

import Home.Login;
import TestandReport.TestResults;
import TestandReport.Test;
import TestandReport.ReportManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Report extends javax.swing.JFrame {


    public Report() {
        initComponents();
        showTableContents();
    }
    static String pid="";
    public static String row[]=new String[4];
    
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)rptTable.getModel();
        dt.setRowCount(0);
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
      
        }
        catch(Exception e){
           
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        generateReportButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rptTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        backbtn2 = new javax.swing.JButton();
        testType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tAddTestDetails = new javax.swing.JButton();
        tPatientReportsButton = new javax.swing.JButton();
        tTestReportsButton = new javax.swing.JButton();
        tAddReportDetailsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton7.setText("Test");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 120));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton8.setText("Reports");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 300, 120));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close-window.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 80, 90));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 390, 80));

        generateReportButton.setBackground(new java.awt.Color(153, 255, 255));
        generateReportButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });
        jPanel3.add(generateReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 180, 50));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 180, 50));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Result No", "Test Id", "Sub Test", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rptTable.setRowHeight(30);
        rptTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rptTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(rptTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 760, 300));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Test Type Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, -1));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 80, 70));

        testType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTypeActionPerformed(evt);
            }
        });
        jPanel3.add(testType, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 240, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patient's Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 40));

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "NIC"
            }
        ));
        pTable.setRowHeight(20);
        pTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(pTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 500, 110));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 740);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 760));

        jPanel5.setBackground(new java.awt.Color(57, 96, 179));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAddTestDetails.setBackground(new java.awt.Color(153, 204, 255));
        tAddTestDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddTestDetails.setText("Add Test Details");
        tAddTestDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddTestDetailsActionPerformed(evt);
            }
        });
        jPanel5.add(tAddTestDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 80));

        tPatientReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tPatientReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tPatientReportsButton.setText("Patient  Reports");
        tPatientReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPatientReportsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(tPatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 80));

        tTestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tTestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tTestReportsButton.setText("Test Reports");
        tTestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTestReportsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(tTestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 310, 80));

        tAddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        tAddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddReportDetailsButton.setText("Add Test Results");
        tAddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(tAddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 80, 90));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        GenarateReport ad=new GenarateReport();
        ad.setVisible(true);
    }//GEN-LAST:event_generateReportButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pname.setText("");
        testType.removeAllItems();
        DefaultTableModel dt =(DefaultTableModel)pTable.getModel();
        dt.setRowCount(0);
        DefaultTableModel dt2 =(DefaultTableModel)rptTable.getModel();
        dt2.setRowCount(0);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rptTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rptTableMousePressed
        
        try {
           
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
                 
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_rptTableMousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //TEST BUTTON
        Test t=new Test();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        //BACK BUTTON
        ReportManagement r=new ReportManagement();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void tAddTestDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddTestDetailsActionPerformed
        Test t=new Test();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_tAddTestDetailsActionPerformed

    private void tPatientReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPatientReportsButtonActionPerformed
        //PATINETS TEST REPORTS
        Report tr=new Report();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tPatientReportsButtonActionPerformed

    private void tTestReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTestReportsButtonActionPerformed
        TestDailyReport tdr = new TestDailyReport();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_tTestReportsButtonActionPerformed

    private void tAddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddReportDetailsButtonActionPerformed
        // TODO add your handling code here:
        TestResults ards = new TestResults();
        ards.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tAddReportDetailsButtonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Login login=new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String regx = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pname.getText());
        if(matcher.find()){
            try {
                testType.removeAllItems();
                DefaultTableModel dt =(DefaultTableModel)pTable.getModel();
                dt.setRowCount(0);
                String row[]=new String[3];
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                String query ="select pid,first_name,last_name,nic from patient where concat(first_name,' ',last_name) like '%"+pname.getText()+"%';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    query="select test_id from test where pid="+rs.getString("pid")+";";
                    ResultSet rs1=st1.executeQuery(query);
                    while(rs1.next()){
                        query="select resultno from test_results where test_id="+rs1.getString("test_id")+";";
                        ResultSet rs2=st2.executeQuery(query);
                        if(rs2.next()){
                            row[0]=rs.getString("pid");
                            row[1]=rs.getString("first_name")+" "+rs.getString("last_name");
                            row[2]=rs.getString("nic");
                            dt.addRow(row);
                            break;
                        }
                    }
                        
                    

                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
                System.out.println(e.getMessage());

            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid name");
            pname.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTableMousePressed
        testType.removeAllItems();
        pid=(String) pTable.getValueAt(pTable.getSelectedRow() ,0);
        System.out.println(pid);
        try {

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String query ="select test_type_id from appointment where patient_id="+pid+";";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                query ="select acronym from test_types where id="+rs.getString("test_type_id")+";";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                testType.addItem(rs1.getString("acronym"));

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }

    }//GEN-LAST:event_pTableMousePressed

    private void testTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTypeActionPerformed
        try {
            row[0]=(String)testType.getSelectedItem();
            DefaultTableModel dt =(DefaultTableModel)rptTable.getModel();
            dt.setRowCount(0);
            String r[]=new String[5];
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String query ="select test_id from test where pid="+pid+" and test_type='"+testType.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            System.out.println(rs.getString("test_id"));
            query ="select * from test_results where Test_ID="+rs.getString("test_id")+";";
            rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("2");
                r[0]=rs.getString("resultno");
                r[1]=rs.getString("Test_ID");
                r[2]=rs.getString("subtest_name");
                r[3]=rs.getString("Result");
                r[4]=rs.getString("unit");
                dt.addRow(r);

            }

        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_testTypeActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn2;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pTable;
    private javax.swing.JTextField pname;
    private javax.swing.JTable rptTable;
    private javax.swing.JButton tAddReportDetailsButton;
    private javax.swing.JButton tAddTestDetails;
    private javax.swing.JButton tPatientReportsButton;
    private javax.swing.JButton tTestReportsButton;
    private javax.swing.JComboBox<String> testType;
    // End of variables declaration//GEN-END:variables
}
