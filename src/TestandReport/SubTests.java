
package TestandReport;


import Home.Login;
import static TestandReport.TestResults.row;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SubTests extends javax.swing.JFrame {

    /**
     * Creates new form SubTests
     */
    static String[] row=new String[5];
    public SubTests() {
        initComponents();
        showTableContents();
        testType.addItem("");
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select acronym from test_types";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                testType.addItem(rs.getString("acronym"));
            }
            
        }
        catch(Exception e){
           // JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
        
    }

    void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)subTestTable.getModel();
        dt.setRowCount(0);
        
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String query="select * from subtest";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                row[0]=rs.getString("subset_id");              
                row[2]=rs.getString("subtest_name"); 
                row[3]=rs.getString("unit");
                row[4]=rs.getString("reference_range");
                
                query="select acronym from test_types where id="+rs.getString("test_type_id")+";";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                row[1]=rs1.getString("acronym"); 
                
                dt.addRow(row);
            }
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        backbtn2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        subName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        range = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subTestTable = new javax.swing.JTable();
        testType = new javax.swing.JComboBox<>();
        unit = new javax.swing.JComboBox<>();
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

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sub Test Types");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 390, 110));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 110, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 110, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 110, -1));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 110, -1));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 70, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Go to Test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 170, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Test Type Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        tid.setEditable(false);
        tid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        jPanel3.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Test Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        subName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subNameActionPerformed(evt);
            }
        });
        jPanel3.add(subName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("SubTest Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Unit");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        range.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        range.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeActionPerformed(evt);
            }
        });
        jPanel3.add(range, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Range");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        subTestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Test Type", "Sub Test name", "Unit", "Range"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        subTestTable.setRowHeight(20);
        subTestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subTestTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(subTestTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 640, 200));

        testType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        testType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTypeActionPerformed(evt);
            }
        });
        jPanel3.add(testType, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 250, -1));

        unit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Unit", "Unit 1", "Unit 2", "Unit 3", "Unit 4" }));
        jPanel3.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 240, -1));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 740);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 760));

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
        jPanel1.add(tPatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 310, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 80, 90));

        tTestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tTestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tTestReportsButton.setText("Test Reports");
        tTestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTestReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tTestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, 80));

        tAddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        tAddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tAddReportDetailsButton.setText("Add Test Results");
        tAddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tAddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove Sub Test DetailsS?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="delete from subtest where subset_id="+row[0]+";";
                int rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Deleted!");
                showTableContents();

            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
                System.out.println(e.getMessage());

            }


            testType.setSelectedIndex(0);
            unit.setSelectedIndex(0);
            subName.setText("");
            range.setText("");
            tid.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update SubTest Details?");

        if(input == JOptionPane.YES_OPTION){
            Pattern resPattern=Pattern.compile("^[a-zA-Z]*$");
            Matcher resMatcher=resPattern.matcher(subName.getText());
            Pattern ranPattern=Pattern.compile("^[a-zA-Z0-9<>.-]*$");
            Matcher ranMatcher=ranPattern.matcher(subName.getText());
            if(resMatcher.find() && ranMatcher.find()){
            
                try {
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                    Statement st=con.createStatement();
                    String query="update subtest set test_type_id="+tid.getText()+",subtest_name='"+subName.getText()+"',unit='"+unit.getSelectedItem()+"',reference_range='"+range.getText()+"' where subset_id="+row[0]+";";
                    int rs=st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Updated!");
                    showTableContents();

                }
                catch(Exception e){
                    //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
                    System.out.println(e.getMessage());

                }
                testType.setSelectedIndex(0);
                unit.setSelectedIndex(0);
                subName.setText("");
                range.setText("");
                tid.setText("");
            }
            else{
              JOptionPane.showMessageDialog(this,"Invalid Details!");
            }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        testType.setSelectedIndex(0);
        unit.setSelectedIndex(0);
        subName.setText("");
        range.setText("");
        tid.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        TestType r=new TestType();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Test t=new Test();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add SubTest Details?");
            if(input == JOptionPane.YES_OPTION)
            {
                Pattern resPattern=Pattern.compile("^[a-zA-Z]*$");
                Matcher resMatcher=resPattern.matcher(subName.getText());
                Pattern ranPattern=Pattern.compile("^[a-zA-Z0-9<>.-]*$");
                Matcher ranMatcher=ranPattern.matcher(subName.getText());
                if(resMatcher.find() && ranMatcher.find()){
                    try {
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                        Statement st=con.createStatement();

                        String query="insert into subtest(test_type_id,subtest_name,unit,reference_range) values("+tid.getText()+",'"+subName.getText()+"','"+unit.getSelectedItem()+"','"+range.getText()+"');";
                        int rs=st.executeUpdate(query);
                        JOptionPane.showMessageDialog(this,"Subtest Added");

                        tid.setText("");
                        showTableContents();

                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
                        System.out.println(e.getMessage());

                    }
                    testType.setSelectedIndex(0);
                    unit.setSelectedIndex(0);
                    subName.setText("");
                    range.setText("");
                    tid.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Details!");
                }
            }
    
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void subNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subNameActionPerformed

    private void rangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangeActionPerformed

    private void testTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTypeActionPerformed
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select id from test_types where acronym='"+testType.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            tid.setText(rs.getString("id"));
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_testTypeActionPerformed

    private void subTestTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subTestTableMousePressed
        for(int i=0;i<5;i++){
            row[i] = (String) subTestTable.getValueAt(subTestTable.getSelectedRow() ,i);
        }
        subName.setText(row[2]);
        range.setText(row[4]);
        for(int i=0;i<unit.getItemCount();i++){
            if(unit.getItemAt(i).equals(row[3])){
                unit.setSelectedIndex(i);
            }
        }
        for(int i=0;i<testType.getItemCount();i++){
            if(testType.getItemAt(i).equals(row[1])){
                testType.setSelectedIndex(i);
            }
        }
        
    }//GEN-LAST:event_subTestTableMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField range;
    private javax.swing.JTextField subName;
    private javax.swing.JTable subTestTable;
    private javax.swing.JButton tAddReportDetailsButton;
    private javax.swing.JButton tAddTestDetails;
    private javax.swing.JButton tPatientReportsButton;
    private javax.swing.JButton tTestReportsButton;
    private javax.swing.JComboBox<String> testType;
    private javax.swing.JTextField tid;
    private javax.swing.JComboBox<String> unit;
    // End of variables declaration//GEN-END:variables
}
