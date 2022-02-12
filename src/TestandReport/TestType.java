
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gagani
 */
public class TestType extends javax.swing.JFrame {

    /**
     * Creates new form TestType
     */
    public TestType() {
        initComponents();
        showTableContents();
    }
    public static String[] rp=new String[6];
    
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)rpttable.getModel();
        dt.setRowCount(0);
        
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select * from test_types;";
            ResultSet rs=st.executeQuery(query);
            
            for(int i=0;rs.next();i++){
                rp[0]=rs.getString("id"); 
                rp[1]=rs.getString("acronym"); 
                rp[2]=rs.getString("name"); 
                rp[3]=rs.getString("location");
                rp[4]=rs.getString("price");
                rp[5]=rs.getString("specimenType");              
               
                dt.addRow(rp);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add report \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acc = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rpttable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        backbtn2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        specType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel1.setText("Lab Test Types");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 390, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Acronym");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 30));

        acc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accKeyTyped(evt);
            }
        });
        jPanel3.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 250, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 110, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 110, -1));

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
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 110, -1));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rpttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Id", "Acronym", "Name", "Location", "Price (Rs)", "Specimen Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rpttable.setRowHeight(30);
        rpttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rpttableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rpttableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(rpttable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 820, 290));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 30));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 70, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Go to Test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 170, 60));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ADD SUB TESTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 210, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Location");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        location.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Price (RS)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 250, 30));
        jPanel3.add(specType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Specimen Type");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 880, 750);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 10, 970, 700);

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
        jPanel1.add(tPatientReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 80, 90));

        tTestReportsButton.setBackground(new java.awt.Color(153, 204, 255));
        tTestReportsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tTestReportsButton.setText("Test Reports");
        tTestReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTestReportsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tTestReportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 310, 80));

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

    private void accKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accKeyTyped

    }//GEN-LAST:event_accKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //DELETE

        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to remove report?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if(input == JOptionPane.YES_OPTION){

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();

                String query="delete from test_types where id="+Integer.valueOf(rp[0])+";";
                int rs=st.executeUpdate(query);

                showTableContents();

                acc.setText("");
                location.setText("");
                name.setText("");
                price.setText("");
                specType.setText("");

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Remove Bill \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // INSERT
        //try {

            int input = JOptionPane.showConfirmDialog(this, "Do you want to add a report?");
            /* if(input == JOptionPane.YES_OPTION){
               Pattern resPattern=Pattern.compile("^[a-zA-Z]*$");
               Matcher a=resPattern.matcher(acc.getText());
               Matcher b=resPattern.matcher(name.getText());
               Matcher c=resPattern.matcher(location.getText());
               Pattern p=Pattern.compile("^[0-9.]*$");
               Matcher d=p.matcher(location.getText());
               if(a.find() && b.find() && c.find() && d.find()){ */
                   
                   try{
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                        Statement st=con.createStatement();

                        String query="insert into test_types (acronym,name,location,price,specimenType) values('"+acc.getText()+"','"+name.getText()+"','"+location.getText()+"','"+price.getText()+"','"+specType.getText()+"');";
                        int rs=st.executeUpdate(query);
                        JOptionPane.showMessageDialog(this,"Test Added");

                        showTableContents();
                   }
                   catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
                        System.out.println(e.getMessage());

                    }
                    
                    acc.setText("");
                    name.setText("");
                    location.setText("");
                    price.setText("");
                    specType.setText("");
                // }
                /*else{
                    JOptionPane.showMessageDialog(this,"Invalid Details!");
                }

                
            }*/

        //}
        //catch(Exception e){
          //  JOptionPane.showMessageDialog(this,"Can't Add report \n Please Try Again!");
            //System.out.println(e.getMessage());
        //}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       // try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to update report?");
            
        //    if(input == JOptionPane.YES_OPTION){
        //        Pattern resPattern=Pattern.compile("^[a-zA-Z]*$");
        //        Matcher a=resPattern.matcher(acc.getText());
        //        Matcher b=resPattern.matcher(name.getText());
        //        Matcher c=resPattern.matcher(location.getText());
        //        Pattern p=Pattern.compile("^[0-9.]*$");
        //        Matcher d=p.matcher(location.getText());
                
        //        if(a.find() && b.find() && c.find() && d.find()){
                    
                    try{
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                    Statement st=con.createStatement();

                    String query="update test_types set acronym='"+acc.getText()+"',name='"+name.getText()+"',location='"+location.getText()+"',price="+price.getText()+",specimenType='"+specType.getText()+"' where id="+Integer.valueOf(rp[0])+";";
                    int rs=st.executeUpdate(query);

                    showTableContents();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Can't Update Test \n Please Try Again!");
                        System.out.println(e.getMessage());
 
                    }

                    name.setText("");
                    acc.setText("");
                    location.setText("");
                    price.setText("");
                    specType.setText("");
        //        }
        //        else{
        //            JOptionPane.showMessageDialog(this,"Update cannot be done!");
        //        }
                

        //    }
        //}
        //catch(Exception e){
        //    JOptionPane.showMessageDialog(this,"Can't Update Test \n Please Try Again!");
        //    System.out.println(e.getMessage());
        //}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //CLEAR
        acc.setText("");
        location.setText("");
        name.setText("");
        price.setText("");
        specType.setText("");;

    }//GEN-LAST:event_jButton6ActionPerformed

    private void rpttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpttableMouseClicked

    }//GEN-LAST:event_rpttableMouseClicked

    private void rpttableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpttableMousePressed
        acc.setText("");
        location.setText("");
        name.setText("");
        price.setText("");
        specType.setText("");

        for(int i=0;i<5;i++){
            rp[i] = (String) rpttable.getValueAt(rpttable.getSelectedRow() ,i);
            System.out.println(rp[i]);
        }

        name.setText(rp[2]);
        acc.setText(rp[1]);
        location.setText(rp[3]);
        price.setText(rp[4]);
        specType.setText(rp[5]);

    }//GEN-LAST:event_rpttableMousePressed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        ReportManagement r=new ReportManagement();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SubTests s=new SubTests();
        this.dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try{
            if(price.getText().equals("")){
                double a=Double.valueOf(price.getText());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Update Test \n Please Try Again!");
            price.setText("");
        }
    }//GEN-LAST:event_priceKeyReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc;
    private javax.swing.JButton backbtn2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTable rpttable;
    private javax.swing.JTextField specType;
    private javax.swing.JButton tAddReportDetailsButton;
    private javax.swing.JButton tAddTestDetails;
    private javax.swing.JButton tPatientReportsButton;
    private javax.swing.JButton tTestReportsButton;
    // End of variables declaration//GEN-END:variables
}
