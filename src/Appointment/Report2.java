
package Appointment;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Report2 extends javax.swing.JFrame {


    public Report2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        dateTo = new com.toedter.calendar.JDateChooser();
        dateFrom = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dateCount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 96, 179));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 80, 90));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton4.setText("Add Patient");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, 80));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton5.setText("Add Appoinment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 80));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton3.setText("Reports");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 330, 80));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 1000, 700));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Test Details Summery Report");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 780, 70));

        patientTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Session", "Test Type", "Recieved Test Count", "Available Test Count", "Session Test Limit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.getTableHeader().setReorderingAllowed(false);
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 770, 260));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("From");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 30));
        jPanel4.add(dateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 110, 30));
        jPanel4.add(dateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("To");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 150, 20, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Duration:-");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 110, 30));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 80, 30));

        dateCount.setEditable(false);
        jPanel4.add(dateCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 50, 30));

        jButton2.setText("Generate Evening Session Chart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, -1, 40));

        jButton6.setText("Print Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, 40));

        jButton7.setText("Generate Morning Session Chart");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 230, 40));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backIcon.png"))); // NOI18N
        jButton8.setAlignmentY(0.0F);
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 20, 860, 670);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 880, 700));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 890, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddPatient ap=new AddPatient();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         AddAppoinment p=new AddAppoinment();
        this.dispose();
         p.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reports p=new Reports();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked

    }//GEN-LAST:event_patientTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String row[]=new String[6];
            DefaultTableModel dt =(DefaultTableModel)patientTable.getModel();
            dt.setRowCount(0);
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dateF = dcn.format(dateFrom.getDate());
            String dateT = dcn.format(dateTo.getDate());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select date,time,testType,count(test_type_id) as count from appointment where date between '"+dateF+"' and '"+dateT+"' group by date,time,testType;";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                row[0]=rs.getString("date");
                row[1]=rs.getString("time");
                row[2]=rs.getString("testType");
                row[3]=rs.getString("count");
                row[4]=String.valueOf(30-Integer.valueOf(row[3]));
                row[5]="30";
                dt.addRow(row);
            }
            query="select (day('"+dateT+"')-day('"+dateF+"')) as count;";
            rs=st.executeQuery(query);
            rs.next();
            dateCount.setText(rs.getString("count"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String datTo = dcn.format(dateTo.getDate());
            String datFrom = dcn.format(dateFrom.getDate());
            System.out.println(datTo+","+datFrom);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("dateFrom", datFrom);
            hm.put("dateTo", datTo);
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Appointment/AppointmentReport2.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\Appointment"
                    + "\\AppointmentReport2.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        try{
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dateT = dcn.format(dateTo.getDate());
            String dateF= dcn.format(dateFrom.getDate());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select testType,count(test_type_id) as count from appointment where date between '"+dateF+"' and '"+dateT+"' and time='Evening' group by date,time,testType;";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                String type=rs.getString("testType");
                int amount=Integer.valueOf(rs.getString("count"));
                dataset.setValue(amount, "Count", type);
            }
            JFreeChart chart = ChartFactory.createBarChart("Recived Count Of Test Type Evening Session - "+dateF+"to"+dateT, "Test Types","Count", dataset, PlotOrientation.VERTICAL,false,true,false);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        try{
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dateT = dcn.format(dateTo.getDate());
            String dateF= dcn.format(dateFrom.getDate());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select testType,count(test_type_id) as count from appointment where date between '"+dateF+"' and '"+dateT+"' and time='Morning' group by date,time,testType;";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                String type=rs.getString("testType");
                int amount=Integer.valueOf(rs.getString("count"));
                dataset.setValue(amount, "Count", type);
            }
            JFreeChart chart = ChartFactory.createBarChart("Recived Count Of Test Type Morning Session - "+dateF+"to"+dateT, "Test Types","Count", dataset, PlotOrientation.VERTICAL,false,true,false);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        

        

        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Reports tdr = new Reports();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateCount;
    private com.toedter.calendar.JDateChooser dateFrom;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}
