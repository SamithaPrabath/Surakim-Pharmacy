
package Payment;

import static Payment.MonthlyPaymentReport.row;
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


public class DailyPaymentReport extends javax.swing.JFrame {

    public DailyPaymentReport() {
        initComponents();
        showTableContents();
    }
    public static String row[]=new String[2];
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        double amount=0;
        try {
            Date d=new Date();
            date.setDate(d);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();                                    
            String query="select test_type,count(test_id) as count from test where paid_date=curdate() group by test_type;";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daily Payment Report");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
        billTable.setRowHeight(30);
        billTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(billTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 930, 460));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 110, 40));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 220, -1));

        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 270, 40));

        jButton1.setText("Genarate Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jButton3.setText("Print Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void billTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTableMousePressed

    }//GEN-LAST:event_billTableMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<billTable.getRowCount();i++){
            
              String type=(String) billTable.getValueAt(i ,0);
              double amount=Double.valueOf((String) billTable.getValueAt(i ,1));
              dataset.setValue(amount, "Amount", type);
            
        }
        

        JFreeChart chart = ChartFactory.createBarChart("Daily Tests - "+date.getDate(), "Test Types","Amount", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        
    }//GEN-LAST:event_dateMousePressed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        
    }//GEN-LAST:event_dateMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        String[] r=new String[2];
        
        try {
            Date d=date.getDate();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dat = dcn.format(date.getDate());
            System.out.println(dat);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            double amount=0;
            String query="select test_type,count(test_id) as count from test where paid_date='"+dat+"' group by test_type;";
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
                amount +=Double.valueOf(r[1]);
                dt.addRow(r);
                
            }
            total.setText("Rs : "+amount);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Date d=date.getDate();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dat = dcn.format(date.getDate());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("date", dat);
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Payment/DailyPaymentReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\Payment\\DailyPaymentReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
