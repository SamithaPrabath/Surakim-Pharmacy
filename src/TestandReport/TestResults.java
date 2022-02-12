
package TestandReport;

import Home.Login;
import TestandReport.ReportManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TestResults extends javax.swing.JFrame {

    /**
     * Creates new form TestAddReportDetails
     */
    public TestResults() {
        initComponents();
        showTableContents();
        descript.addItem("");
    }
public static String row[]=new String[5];

        //LOAD J TABLE
        public void showTableContents(){
            DefaultTableModel dt =(DefaultTableModel)addrepdetails.getModel();
            dt.setRowCount(0);
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
            
                String query="select * from test_results;";
                ResultSet rs=st.executeQuery(query);
            
                for(int i=0;rs.next();i++){
                    row[0]=rs.getString("resultno");
                    row[1]=rs.getString("Test_ID");
                    row[2]=rs.getString("subtest_name");
                    row[3]=rs.getString("Result");
                    row[4]=rs.getString("unit");
                    dt.addRow(row);
                }
            }
            catch(Exception e){
      
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        spn = new javax.swing.JTextField();
        typ = new javax.swing.JTextField();
        rest = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addrepdetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        descript = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        backbtn1 = new javax.swing.JButton();
        unit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tAddTestDetails = new javax.swing.JButton();
        tPatientReportsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tTestReportsButton = new javax.swing.JButton();
        tAddReportDetailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Test Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patient ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Specimen No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Test Type");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Sub Test Type");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        tid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tidKeyReleased(evt);
            }
        });
        jPanel3.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 180, 30));

        pid.setEditable(false);
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 180, 40));

        spn.setEditable(false);
        jPanel3.add(spn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 180, 40));

        typ.setEditable(false);
        jPanel3.add(typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 180, 40));
        jPanel3.add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 170, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Result");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        addButton.setBackground(new java.awt.Color(153, 255, 255));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 100, 30));

        clearButton.setBackground(new java.awt.Color(153, 255, 255));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 100, -1));

        deleteButton.setBackground(new java.awt.Color(153, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 100, 30));

        updateButton.setBackground(new java.awt.Color(153, 255, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 100, 30));

        addrepdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Result No", "Test ID", "Sub Test ", "Result", "Units"
            }
        ));
        addrepdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addrepdetailsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(addrepdetails);
        if (addrepdetails.getColumnModel().getColumnCount() > 0) {
            addrepdetails.getColumnModel().getColumn(0).setPreferredWidth(5);
            addrepdetails.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 790, 230));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Report Details");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        descript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptActionPerformed(evt);
            }
        });
        jPanel3.add(descript, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Units");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 60, 30));

        backbtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 80, 70));

        unit.setEditable(false);
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        jPanel3.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(100, 10, 820, 720);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 770);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 710));

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAddTestDetails.setBackground(new java.awt.Color(153, 204, 255));
        tAddTestDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddTestDetails.setText("Add Test Details");
        tAddTestDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddTestDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(tAddTestDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 80));

        tPatientReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tPatientReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tPatientReportsButton.setText("Patient Reports");
        tPatientReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPatientReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tPatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 80, 90));

        tTestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tTestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tTestReportsButton.setText("Test Reports");
        tTestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTestReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tTestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 310, 80));

        tAddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        tAddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddReportDetailsButton.setText("Add Test Results");
        tAddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tAddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        //BACK BUTTON
        ReportManagement r=new ReportManagement();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtn1ActionPerformed

    private void tAddTestDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddTestDetailsActionPerformed
        //TEST BUTTON
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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //LOGIN
        Login login=new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void tTestReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTestReportsButtonActionPerformed
        //DAILY TEST REPORT 
        TestDailyReport tdr = new TestDailyReport();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_tTestReportsButtonActionPerformed

    private void tAddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddReportDetailsButtonActionPerformed
        //TEST RESULTS BUTTON
        TestResults ards = new TestResults();
        ards.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tAddReportDetailsButtonActionPerformed

    private void tidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tidKeyReleased
        //VALIDATION OF TEST ID
        if(!tid.getText().equals("")){
            
            
                try {
                    int a=Integer.valueOf(tid.getText());
                    pid.setText("");
                    spn.setText("");
                    typ.setText("");
                    descript.removeAllItems();
                    try{
                    //GETTING DATABASE CONNECTION
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                    Statement st=con.createStatement();

                    //GETTING PATIENT ID
                    String query="select pid from test where test_id="+tid.getText()+";";
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    pid.setText(rs.getString("pid"));

                    //GETTING SPECIMEN NO
                    query=" select sno from test where test_id= "+tid.getText()+";";
                    rs=st.executeQuery(query);
                    rs.next();
                    spn.setText(rs.getString("sno"));

                    //GETTING TEST ID'S
                    query=" select test_type from test where test_id = "+tid.getText()+";";
                    rs=st.executeQuery(query);
                    rs.next();
                    typ.setText(rs.getString("test_type"));

                    query=" select id from test_types where acronym = '"+typ.getText()+"';";
                    rs=st.executeQuery(query);
                    rs.next();

                    query=" select subtest_name from subtest where test_type_id = "+rs.getString("id")+";";
                    rs=st.executeQuery(query);
                    while(rs.next()){
                        descript.addItem(rs.getString("subtest_name"));
                    }
                    }
                    catch(Exception e){
                        
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Invalid Test Id Please Try Again!");
                    System.out.println(e.getMessage());
                    tid.setText("");
                }
            
        }
    }//GEN-LAST:event_tidKeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // INSERT
        if(!rest.getText().equals("")){
            int input = JOptionPane.showConfirmDialog(this, "Do you want to add a report detail?");
            if(input == JOptionPane.YES_OPTION){
            
                try {
                    Pattern resPattern=Pattern.compile("^[a-zA-Z0-9.<>]*$");
                    Matcher resMatcher=resPattern.matcher(rest.getText());
                    if(resMatcher.find()){
                        boolean t=true;
                        //GETTING DB CONNECTION
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                        Statement st=con.createStatement();
                        String query="select Test_ID,subtest_name from test_results;";
                        ResultSet rs1= st.executeQuery(query);
                        while(rs1.next()){
                            if(rs1.getString("Test_ID").equals(tid.getText()) && rs1.getString("subtest_name").equals((String)descript.getSelectedItem())){
                                t=false;
                            }
                        }
                   
                        if(t){                        
                            query="INSERT INTO test_results(Test_ID,subtest_name,Result,unit) VALUES ("+Integer.valueOf(tid.getText())+",'"+descript.getSelectedItem()+"','"+rest.getText()+"','"+unit.getText()+"');";
                            int rs=st.executeUpdate(query);
                            rest.setText("");
                            unit.setText("");
                            for(int i=0;i<descript.getItemCount();i++){
                                if(descript.getItemAt(i).equals(descript.getSelectedItem())){
                                    descript.removeItemAt(i);
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Test result already added! please update");
                        }

                        //LOAD J TABLE
                        showTableContents();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Invalid Test Results! Please check again!");
                    }

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Can't Add Test Results \n Please Try Again!");
                    System.out.println(e.getMessage());
                }
            }
             else{
                JOptionPane.showMessageDialog(this,"Invalid Result");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Can't add test results \n Please Try Again!(Enter result)");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        //CLEAR
        tid.setText("");
        pid.setText("");
        spn.setText("");
        typ.setText("");
        rest.setText("");
        descript.removeAllItems();
        descript.addItem("");
        unit.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        // DELETE

        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to remove report details?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if(input == JOptionPane.YES_OPTION){
                
                //getting db connection
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();

                String query="delete from test_results where resultno="+Integer.valueOf(row[0])+";";
                int rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Test results deleted");
                // load j table
                showTableContents();

                // setting text box to null value
                tid.setText("");
                pid.setText("");
                spn.setText("");
                typ.setText("");
                //descript.setText("");
                rest.setText("");
                descript.removeAllItems();
                descript.addItem("");
                unit.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Remove report details \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        //UPDATE
        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to update a report detail?");
            if(input == JOptionPane.YES_OPTION){

                //CREATING THE DATABASE CONNECTION
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                Pattern resPattern=Pattern.compile("^[a-zA-Z0-9.<>]*$");
                Matcher resMatcher=resPattern.matcher(rest.getText());
                if(resMatcher.find()){
                    boolean t=false;
                    
                    try{
                        
                        String query="select Test_ID,subtest_name from test_results;";
                        ResultSet rs1= st.executeQuery(query);
                        while(rs1.next()){
                            if(rs1.getString("Test_ID").equals(tid.getText()) && rs1.getString("subtest_name").equals((String)descript.getSelectedItem())){
                                t=true;
                            }
                        }
                        if(t){
                            query="update test_results set Test_ID="+Integer.valueOf(tid.getText())+",subtest_name='"+descript.getSelectedItem()+"',Result='"+rest.getText()+"',unit='"+unit.getText()+"' where resultno="+Integer.valueOf(row[0])+";";
                            int rs=st.executeUpdate(query);
                            tid.setText("");
                            pid.setText("");
                            spn.setText("");
                            typ.setText("");
                            rest.setText("");
                            descript.removeAllItems();
                            descript.addItem("");
                            unit.setText("");
                            JOptionPane.showMessageDialog(this,"updated");
                        }
                        
                        else{
                            JOptionPane.showMessageDialog(this,"can't update this test please add first");
                        }
                    }
                    catch(Exception e){
                        
                        System.out.println(e.getMessage());
                    }
                        
                        
                    //LOAD J TABLE
                    showTableContents();
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Cannot Update! Invalid Update Test Results!");
                }    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Update report details \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addrepdetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addrepdetailsMousePressed

        descript.removeAllItems();
        
        for(int i=0;i<5;i++){
            row[i] = (String) addrepdetails.getValueAt(addrepdetails.getSelectedRow() ,i);
            System.out.println(row[i]);
        }
        unit.setText(row[4]);
        
        tid.setText(row[1]);
        descript.addItem(row[2]);
        try {

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();

            String query="select pid from test where test_id="+Integer.valueOf(tid.getText())+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            pid.setText(rs.getString("pid"));

            // getting specimen no
            query="select sno from test where test_id="+Integer.valueOf(tid.getText())+";";
            rs=st.executeQuery(query);
            rs.next();
            spn.setText(rs.getString("sno"));

            // getting test ids
            query="select test_type from test where test_id="+Integer.valueOf(tid.getText())+";";
            rs=st.executeQuery(query);
            rs.next();
            typ.setText(rs.getString("test_type"));

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        rest.setText(row[3]);

    }//GEN-LAST:event_addrepdetailsMousePressed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void descriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptActionPerformed
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query=" select unit from subtest where subtest_name ='"+descript.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            unit.setText(rs.getString("unit"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_descriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable addrepdetails;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> descript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField rest;
    private javax.swing.JTextField spn;
    private javax.swing.JButton tAddReportDetailsButton;
    private javax.swing.JButton tAddTestDetails;
    private javax.swing.JButton tPatientReportsButton;
    private javax.swing.JButton tTestReportsButton;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField typ;
    private javax.swing.JTextField unit;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
