
package Payment;

import static Payment.DailyPaymentReport.row;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
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

public class MonthlyPaymentReport extends javax.swing.JFrame {


    public MonthlyPaymentReport() {
        initComponents();
        showTableContents();
        System.out.println(year.getYear());
    }
    static int m=0;
    
    public static String row[]=new String[2];
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        double amount=0;
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();                                    
            String query="select test_type,count(test_id) as count from test where month(paid_date)=month(curdate()) group by test_type;";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                row[0]=rs.getString("test_type"); //1
                int c=Integer.valueOf(rs.getString("count"));
                query="select price from test_types where acronym='"+row[0]+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                row[1]=String.valueOf(Double.valueOf(rs1.getString("price"))*c); //2
                amount +=Double.valueOf(row[1]);
                dt.addRow(row);
            }
            query="select month(curdate()) as month;";
                rs =st.executeQuery(query);
                rs.next();
                m=Integer.valueOf(rs.getString("month"));
                switch(m){
                    case(1):
                        month.setSelectedItem("January");
                        break;
                    case(2):
                        month.setSelectedItem("February");
                        break;
                    case(3):
                        month.setSelectedItem("March");
                        break;
                    case(4):
                        month.setSelectedItem("April");
                        break;
                    case(5):
                        month.setSelectedItem("May");
                        break;
                    case(6):
                        month.setSelectedItem("June");
                        break;
                    case(7):
                        month.setSelectedItem("July");
                        break;
                    case(8):
                        month.setSelectedItem("August");
                        break;
                    case(9):
                        month.setSelectedItem("September");
                        break;
                    case(10):
                        month.setSelectedItem("Octomber");
                        break;
                    case(11):
                        month.setSelectedItem("November");
                        break;
                    case(12):
                        month.setSelectedItem("December");
                        break;
                }
            total.setText("Rs : "+String.valueOf(amount));
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        year = new com.toedter.calendar.JYearChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monthly Payment Report");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 110, 40));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 630, 220, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 160, 30));

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Type", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(billTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 840, 390));

        jButton1.setText("Genarate Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));

        jButton3.setText("Print Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, -1));

        year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearMouseClicked(evt);
            }
        });
        jPanel2.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 140, 30));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        String[] r=new String[2];
        String query="";
        double amount=0;
        switch((String)month.getSelectedItem()){
            case("January"):
                m=1;
                break;
            case("February"):
                m=2;
                break;
            case("March"):
                m=3;
                break;    
            case("April"):
                m=4;
                break;
            case("May"):
                m=5;
                break;
            case("June"):
                m=6;
                break;
            case("July"):
                m=7;
                break;
            case("August"):
                m=8;
                break;
            case("September"):
                m=9;
                break;    
            case("Octomber"):
                m=10;
                break;
            case("November"):
                m=111;
                break;
            case("December"):
                m=12;
                break;
        }
        
    
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            
            query="select test_type,count(test_id) as count from test where month(paid_date)="+m+" and year(paid_date)="+year.getYear()+" group by test_type;";
            ResultSet rs=st.executeQuery(query);
            //System.out.println(rs.getString("test_type"));
            while(rs.next()){
                r[0]=rs.getString("test_type"); //1
                System.out.println(r[0]);
                int c=Integer.valueOf(rs.getString("count"));
                query="select price from test_types where acronym='"+r[0]+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                r[1]=String.valueOf(Double.valueOf(rs1.getString("price"))*c); //2    
                amount+=Double.valueOf(r[1]);
                dt.addRow(r);
                
            }
            
             total.setText("Rs : "+amount);
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
        
         //total.setText("");
    }//GEN-LAST:event_monthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<billTable.getRowCount();i++){
            
              String type=(String) billTable.getValueAt(i ,0);
              double amount=Double.valueOf((String) billTable.getValueAt(i ,1));
              dataset.setValue(amount, "Amount", type);
            
        }
        

        JFreeChart chart = ChartFactory.createBarChart("Monthly Tests - "+month.getSelectedItem(), "Test Types","Amount", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("month",String.valueOf(m));
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Payment/MonthlyPaymentReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\Payment\\MonthlyPaymentReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearMouseClicked
        System.out.println(year.getYear());
    }//GEN-LAST:event_yearMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
            dt.setRowCount(0);
            String[] r=new String[2];
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            double amount=0;
            String query="select test_type,count(test_id) as count from test where month(paid_date)="+m+" and year(paid_date)="+year.getYear()+" group by test_type;";
            ResultSet rs=st.executeQuery(query);
            //System.out.println(rs.getString("test_type"));
            while(rs.next()){
                r[0]=rs.getString("test_type"); //1
                System.out.println(r[0]);
                int c=Integer.valueOf(rs.getString("count"));
                query="select price from test_types where acronym='"+r[0]+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                r[1]=String.valueOf(Double.valueOf(rs1.getString("price"))*c); //2
                amount+=Double.valueOf(r[1]);
                dt.addRow(r);
                
            }
            
                 total.setText("Rs : "+amount);
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
        
         //total.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField total;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
