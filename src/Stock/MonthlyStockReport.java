
package Stock;

import static Stock.StockInItems.rp;
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


public class MonthlyStockReport extends javax.swing.JFrame {


    public MonthlyStockReport() {
        initComponents();
        loadTableData();
    }
    static int m;
    static double tot=0;
    static double inc=0;
    static double prof;
    private void loadTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) inventoryStockTable.getModel();
        tableModel.setNumRows(0);
        
        try {
                tot=0;
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query ="select a.iSName,SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0)) AS tot,a.price,(SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0))*a.price) as amount from (select * from inventory_stock where month(isDate)=month(curdate())) a left join (select sum(wsQTy) as total,wsISID from withdrawn_stock where month(wsDate)=month(curdate()) group by wsISID) b on a.iSID=b.wsISID group by a.iSID;";
                int c=0;
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    rp[0]=rs.getString("iSName");
                    rp[1]=rs.getString("tot");
                    rp[2]=rs.getString("price");
                    rp[3]=rs.getString("amount");
                    tot+=Double.valueOf(rp[3]);
                    tableModel.addRow(rp);
                }
                exp.setText("Rs : "+String.valueOf(tot));
                query="select sum(amount) as sum from payment where month(date)=month(curdate()) and status='Full';";
                rs =st.executeQuery(query);
                rs.next();
                inc=Double.valueOf(rs.getString("sum"));
                income.setText("Rs : "+rs.getString("sum"));
                if(inc>tot){
                    prof=inc-tot;
                    details.setText("");
                }
                else{
                    prof=tot-inc;
                    details.setText("loss");
                }
                profit.setText("Rs : "+String.valueOf(prof));
                
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
                    

            }
            catch(Exception e){

                System.out.println(e.getMessage());

            } 
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addTestDetailsButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        AddReportDetailsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryStockTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        month = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        exp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        profit = new javax.swing.JTextField();
        income = new javax.swing.JTextField();
        details = new javax.swing.JLabel();
        year = new com.toedter.calendar.JYearChooser();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 80, 90));

        addTestDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        addTestDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addTestDetailsButton.setText("Stock In");
        addTestDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addTestDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 330, 80));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton9.setText("Stock Out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, 80));

        AddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        AddReportDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        AddReportDetailsButton.setText("Reports");
        AddReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReportDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backIcon.png"))); // NOI18N
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, -1, -1));

        inventoryStockTable.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        inventoryStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Total Quantity", "Price 1X (Rs)", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        inventoryStockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryStockTablesetSelectedItem(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryStockTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 770, 290));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Monthly Stock Report");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton1.setText("Genarate Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 130, 40));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel3.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 30));

        jLabel1.setText("Expenditure :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 80, -1));

        exp.setEditable(false);
        jPanel3.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 170, -1));

        jLabel5.setText("Income  :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 80, -1));

        jLabel6.setText("Profit  :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 80, -1));

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 80, 40));

        profit.setEditable(false);
        jPanel3.add(profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 160, -1));

        income.setEditable(false);
        jPanel3.add(income, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 160, -1));
        jPanel3.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 130, 20));
        jPanel3.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, 30));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 30));

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void addTestDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestDetailsButtonActionPerformed
        StockInItems t=new StockInItems();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTestDetailsButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        StockOutItems tdr = new StockOutItems();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void AddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReportDetailsButtonActionPerformed

    }//GEN-LAST:event_AddReportDetailsButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StockManagement tdr = new StockManagement();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inventoryStockTablesetSelectedItem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryStockTablesetSelectedItem
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) inventoryStockTable.getModel();
        for(int i=0;i<4;i++){
            rp[i] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,i);
            System.out.println(rp[i]);
        }
        
    }//GEN-LAST:event_inventoryStockTablesetSelectedItem

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<inventoryStockTable.getRowCount();i++){
            
              String type=(String) inventoryStockTable.getValueAt(i ,0);
              int amount=Integer.valueOf((String) inventoryStockTable.getValueAt(i ,1));
              dataset.setValue(amount, "Quantity", type);
            
        }
        

        

        JFreeChart chart = ChartFactory.createBarChart("Monthly Stock In", "Items","Quantity", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        DefaultTableModel dt =(DefaultTableModel)inventoryStockTable.getModel();
        dt.setRowCount(0);
        String[] r=new String[2];
        String query="";
        
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
            m=11;
            break;
            case("December"):
            m=12;
            break;
        }

        try {
            tot=0;
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();

            query ="select a.iSName,SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0)) AS tot,a.price,(SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0))*a.price) as amount from (select * from inventory_stock where month(isDate)="+m+" and year(isDate)="+year.getYear()+") a left join (select sum(wsQTy) as total,wsISID from withdrawn_stock where month(wsDate)="+m+") b on a.iSID=b.wsISID group by a.iSID;";
            ResultSet rs=st.executeQuery(query);
            //System.out.println(rs.getString("test_type"));
            while(rs.next()){
                rp[0]=rs.getString("iSName");
                    rp[1]=rs.getString("tot");
                    rp[2]=rs.getString("price");
                    rp[3]=rs.getString("amount");
                    tot+=Double.valueOf(rp[3]);
                    dt.addRow(rp);

            }
            exp.setText("Rs : "+String.valueOf(tot));
            try{
                query="select sum(amount) as sum from payment where month(date)="+m+" and status='Full';";
                rs =st.executeQuery(query);
                rs.next();
                inc=Double.valueOf(rs.getString("sum"));
                income.setText("Rs : "+rs.getString("sum"));
                if(inc>tot){
                    prof=inc-tot;
                    details.setText("");
                }
                else{
                    prof=tot-inc;
                    details.setText("Loss");
                }
                profit.setText("Rs : "+String.valueOf(prof));
            }
            catch(Exception e){
                income.setText("Rs : 0.0");
                profit.setText("Rs : 0.0");
                details.setText("Loss");
            }

        }
        catch(Exception e){
            income.setText("Rs : 0.0");
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_monthActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("month", String.valueOf(m));
            hm.put("exp", exp.getText());
            hm.put("income", income.getText());
            hm.put("profit", profit.getText());
            hm.put("type",details.getText());
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Stock/MonthlyStockReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\Stock\\MonthlyStockReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dt =(DefaultTableModel)inventoryStockTable.getModel();
        dt.setRowCount(0);
        String[] r=new String[2];
        String query="";
        try {
            tot=0;
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();

            query ="select a.iSName,SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0)) AS tot,a.price,(SUM(IFNULL(a.iSQTy, 0) + IFNULL(b.total, 0))*a.price) as amount from (select * from inventory_stock where month(isDate)="+m+" and year(isDate)="+year.getYear()+") a left join (select sum(wsQTy) as total,wsISID from withdrawn_stock where month(wsDate)="+m+") b on a.iSID=b.wsISID group by a.iSID;";
            ResultSet rs=st.executeQuery(query);
            //System.out.println(rs.getString("test_type"));
            while(rs.next()){
                rp[0]=rs.getString("iSName");
                    rp[1]=rs.getString("tot");
                    rp[2]=rs.getString("price");
                    rp[3]=rs.getString("amount");
                    tot+=Double.valueOf(rp[3]);
                    dt.addRow(rp);

            }
            exp.setText("Rs : "+String.valueOf(tot));
            try{
                query="select sum(amount) as sum from payment where month(date)="+m+" and status='Full';";
                rs =st.executeQuery(query);
                rs.next();
                inc=Double.valueOf(rs.getString("sum"));
                income.setText("Rs : "+rs.getString("sum"));
                if(inc>tot){
                    prof=inc-tot;
                    details.setText("");
                }
                else{
                    prof=tot-inc;
                    details.setText("Loss");
                }
                profit.setText("Rs : "+String.valueOf(prof));
            }
            catch(Exception e){
                income.setText("Rs : 0.0");
                profit.setText("Rs : 0.0");
                details.setText("Loss");
            }

        }
        catch(Exception e){
            income.setText("Rs : 0.0");
            JOptionPane.showMessageDialog(this,"Can't Add Test \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JLabel details;
    private javax.swing.JTextField exp;
    private javax.swing.JTextField income;
    private javax.swing.JTable inventoryStockTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField profit;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
