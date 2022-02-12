
package TestandReport;

import Home.Login;
import TestandReport.ReportManagement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Test extends javax.swing.JFrame {

  
    public Test() {
        initComponents();
        showTableContents();
        testType.addItem("");
        //power.setIcon(new ImageIcon(new ImageIcon("resources/power.jpeg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
    }
    
    public static String rp[]=new String[7];

    public void showTableContents(){
        
        // get details to the table
        
        DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
        dt.setRowCount(0);
        String[] row=new String[7];
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select * from test;";
            
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                row[0]=rs.getString("test_id");
                row[1]=rs.getString("pid");
                row[2]=rs.getString("test_type");
                row[3]=rs.getString("sno");
                row[4]=rs.getString("stype");
                row[5]=rs.getString("location");
                row[6]=rs.getString("date");
                dt.addRow(row);
            }
            sno.setText("OP"+String.valueOf(Integer.valueOf(row[0])+1));
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            sno.setText("OP1");
            System.out.println(e.getMessage());
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tAddTestDetails = new javax.swing.JButton();
        tPatientReportsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tTestReportsButton = new javax.swing.JButton();
        tAddReportDetailsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        testType = new javax.swing.JComboBox<>();
        backbtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        location = new javax.swing.JTextField();
        stype = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(tPatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 80, 90));

        tTestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tTestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tTestReportsButton.setText("Test Reports");
        tTestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTestReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tTestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 310, 80));

        tAddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        tAddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddReportDetailsButton.setText("Add Test Results");
        tAddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tAddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 780));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Test");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Patient Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 30));

        pid.setEditable(false);
        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Test Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Speciment No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, 30));

        sno.setEditable(false);
        sno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoActionPerformed(evt);
            }
        });
        jPanel3.add(sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Speciment Type");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Location");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 120, 30));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Id", "Patient Id", "Test Type", "Speciment No", "Speciment Type", "Location", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        testTable.setRowHeight(30);
        testTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                testTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(testTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 810, 220));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 110, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 110, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 110, -1));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patient's Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 30));
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add\n New \nTest ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 170, 70));

        testType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTypeActionPerformed(evt);
            }
        });
        jPanel3.add(testType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 240, 30));

        backbtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 80, 60));

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "NIC"
            }
        ));
        pTable.setRowHeight(20);
        pTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(pTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 930, 110));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 40));

        location.setEditable(false);
        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 240, 30));

        stype.setEditable(false);
        jPanel3.add(stype, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 230, 40));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 10, 980, 770);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 780));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 1000, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tAddTestDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddTestDetailsActionPerformed
        
    }//GEN-LAST:event_tAddTestDetailsActionPerformed

    private void tPatientReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPatientReportsButtonActionPerformed
        //PATINETS TEST REPORTS
        Report tr=new Report();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tPatientReportsButtonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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

    private void snoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snoActionPerformed

    private void testTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testTableMousePressed

        //to get details into selected row of the test table
        for(int i=0;i<7;i++){
            rp[i] = (String) testTable.getValueAt(testTable.getSelectedRow() ,i);
            //System.out.println(rp[i]);
        }

        pid.setText(rp[1]);
        sno.setText(rp[3]);
        try {

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();

            String query="select first_name,last_name from patient where pid="+Integer.valueOf(pid.getText())+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            pname.setText(rs.getString("first_name")+" "+ rs.getString("last_name"));

            //specimen type
            //for(int i=1;i<stype.getItemCount();i++){
            //    if(stype.getItemAt(i).equals(rp[4])){
            //        stype.setSelectedIndex(i);
            //    }
            //}
            testType.removeAllItems();
            testType.addItem(rp[2]);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

  
    }//GEN-LAST:event_testTableMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //DELETE

        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to remove Test DetailsS?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if(input == JOptionPane.YES_OPTION){

                //create database connection
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();

                String query="delete from test where test_id="+Integer.valueOf(rp[0])+";";
                int rs=st.executeUpdate(query);

                //message
                JOptionPane.showMessageDialog(this,"Test  Details Removed");
                query="select id from test_types where acronym='"+testType.getSelectedItem()+"';";
                ResultSet r=st.executeQuery(query);
                r.next();
                query="update appointment set status='Pending' where patient_id="+pid.getText()+" and test_type_id="+r.getString("id")+";";
                rs=st.executeUpdate(query);
                query="delete from test_results where Test_ID="+rp[0]+";";
                rs=st.executeUpdate(query);
                query="delete from test_results where Test_ID="+rp[0]+";";
                rs=st.executeUpdate(query);
                //load  j table
                showTableContents();

                //set text box vlaues to blank
                pid.setText("");
                //testType.setSelectedIndex(0);
                //sno.setText("");
                stype.setText("");
                pname.setText("");
                location.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Remove Test DetailsS \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //INSERT

        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to add Test Details?");
            if(input == JOptionPane.YES_OPTION)
            {
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="select id from test_types where acronym='"+testType.getSelectedItem()+"';";
                ResultSet r2=st.executeQuery(query);
                r2.next();
                query="select status from appointment where patient_id="+pid.getText()+" and test_type_id="+r2.getString("id")+";";
                ResultSet r1=st.executeQuery(query);
                r1.next();
                if(!r1.getString("status").equals("Success")){
                    query="insert into test(pid,test_type,date,sno,stype,location) values("+Integer.valueOf(pid.getText())+",'"+(String)testType.getSelectedItem()+"',now(),'"+sno.getText()+"','"+(String)stype.getText()+"','"+(String)location.getText()+"');";
                    int rs=st.executeUpdate(query);

                    JOptionPane.showMessageDialog(this,"Test Details Added");
                    query="select id from test_types where acronym='"+testType.getSelectedItem()+"';";
                    ResultSet r=st.executeQuery(query);
                    r.next();
                    query="update appointment set status='Success' where patient_id="+pid.getText()+" and test_type_id="+r.getString("id")+";";
                    rs=st.executeUpdate(query);

                    //LOAD J TABLE
                    showTableContents();


                    pname.setText("");
                    for(int i=0;i<testType.getItemCount();i++){
                        if(testType.getItemAt(i).equals(testType.getSelectedItem())){
                            testType.removeItemAt(i);
                        }
                    }

                    pid.setText("");
                    stype.setText("");
                    location.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this,"This test already added!");
                }
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        /*//UPDATE

        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to update Test Details?");

            if(input == JOptionPane.YES_OPTION){

                //create database connection
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();

                String query="update test set pid="+Integer.valueOf(pid.getText())+",test_type='"+(String)testType.getSelectedItem()+"',sno='"+sno.getText()+"',stype='"+(String)stype.getSelectedItem()+"',location='"+location.getText()+"' where test_id="+Integer.valueOf(rp[0])+";";
                int rs=st.executeUpdate(query);

                //message
                JOptionPane.showMessageDialog(this,"Test Details Updated");

                //load values to jtable
                showTableContents();

                //set values to null
                pid.setText("");
                testType.removeAllItems();
                //sno.setText("");
                stype.setText("");
                pname.setText("");
                location.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Update Test Details \n Please Try Again!");
            System.out.println(e.getMessage());
        }*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //CLEAR

        pid.setText("");
        pname.setText("");
        stype.setText("");
        location.setText("");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TestType t=new TestType();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        //BACK BUTTON
        ReportManagement r=new ReportManagement();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String regx = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pname.getText());
        if(matcher.find()){
            try {
                DefaultTableModel dt =(DefaultTableModel)pTable.getModel();
                dt.setRowCount(0);
                String row[]=new String[3];
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query ="select pid,first_name,last_name,nic from patient where concat(first_name,' ',last_name) like '%"+pname.getText()+"%';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    row[0]=rs.getString("pid");
                    row[1]=rs.getString("first_name")+" "+rs.getString("last_name");
                    row[2]=rs.getString("nic");
                    dt.addRow(row);

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
        pid.setText((String) pTable.getValueAt(pTable.getSelectedRow() ,0));
        
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            
                /*String testCountQuery ="select count(*) from test t where t.pid="+Integer.valueOf(pid.getText());
                System.out.println(testCountQuery);
                ResultSet testDataRs =st.executeQuery(testCountQuery);
                 int count =0;
                if(testDataRs!= null && testDataRs.next()) {
                     count =testDataRs.getInt("count(*)");
                    System.out.println(count);
                
                }
            if(count == 0){ */
                Statement st1=con.createStatement();
                String query ="select test_type_id from appointment where patient_id="+pid.getText()+" and status='Pending';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    query ="select acronym from test_types where id="+rs.getString("test_type_id")+";";
                    ResultSet rs1=st1.executeQuery(query);
                    rs1.next();
                    testType.addItem(rs1.getString("acronym"));

                }
            //}else{
              //  JOptionPane.showMessageDialog(this,"Details already exsists!");
            //}
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
            
        
    }//GEN-LAST:event_pTableMousePressed

    private void testTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTypeActionPerformed
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query ="select location from test_types where acronym='"+testType.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            location.setText(rs.getString("location"));
            
            query ="select specimenType from test_types where acronym='"+testType.getSelectedItem()+"';";
            rs=st.executeQuery(query);
            rs.next();
            stype.setText(rs.getString("specimenType"));
 
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_testTypeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField location;
    private javax.swing.JTable pTable;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField sno;
    private javax.swing.JTextField stype;
    private javax.swing.JButton tAddReportDetailsButton;
    private javax.swing.JButton tAddTestDetails;
    private javax.swing.JButton tPatientReportsButton;
    private javax.swing.JButton tTestReportsButton;
    private javax.swing.JTable testTable;
    private javax.swing.JComboBox<String> testType;
    // End of variables declaration//GEN-END:variables
}
