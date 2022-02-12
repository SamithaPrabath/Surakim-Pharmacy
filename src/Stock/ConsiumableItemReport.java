
package Stock;

import Home.Login;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFrame;
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
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


public class ConsiumableItemReport extends javax.swing.JFrame {


    public ConsiumableItemReport() {
        initComponents();
        getDetails();
    }

    String rp[]=new String[7];
    void getDetails(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) inventoryStockTable.getModel();
            tableModel.setRowCount(0);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();

            String query ="select * from inventory_stock where item_type='Consumable Items';";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                rp[0]=rs.getString("iSName");
                rp[1]=rs.getString("iSDate");
                
                rp[2]=rs.getString("iSQTy");
                
                try{
                    query ="select sum(wsQTy) as withdraw from withdrawn_stock where wsISID="+rs.getString("iSID")+" and type='W' group by wsISID;";
                    ResultSet rs1=st1.executeQuery(query);
                    rs1.next();
                    rp[3]=rs1.getString("withdraw");
                    rp[4]=String.valueOf(Integer.valueOf(rp[2])+Integer.valueOf(rp[3]));
                }
                catch(Exception e){
                    rp[3]="0";
                    rp[4]=String.valueOf(Integer.valueOf(rp[2])+Integer.valueOf(rp[3]));
                }
                
                
                tableModel.addRow(rp);
                
            }
        }
        catch(Exception e){
            System.out.println("0");
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryStockTable = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        types = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Consumable Item Report");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jButton1.setText("WidthDrw Item Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, 40));

        inventoryStockTable.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        inventoryStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Added Date", "Available Qty", "Withdraw Qunatity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 770, 360));

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Item Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Item ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 30));

        types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typesActionPerformed(evt);
            }
        });
        jPanel3.add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 30));

        jButton3.setText("Total Item Chart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 40));

        jButton4.setText("Availble Item Chart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, 40));

        jButton5.setText("Condemned Item Chart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, 40));

        jButton6.setText("Print Full Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

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
        Login login=new Login();
        login.setVisible(true);
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
        ItemReports tdr = new ItemReports();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<inventoryStockTable.getRowCount();i++){

            String type=(String) inventoryStockTable.getValueAt(i ,0);
            int count=Integer.valueOf((String) inventoryStockTable.getValueAt(i ,3));
            dataset.setValue(count, "Items", type);

        }

        JFreeChart chart = ChartFactory.createBarChart("Withdraw Item Total", "Item","Withdraw", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inventoryStockTablesetSelectedItem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryStockTablesetSelectedItem
        DefaultPieDataset dataset=new DefaultPieDataset();;
        
        rp[0] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,0);
        rp[1] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,2);
        rp[2] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,3);
        rp[3] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,4);
        dataset.setValue("Condemned", Integer.valueOf(rp[3]));
        dataset.setValue("Withdraw", Integer.valueOf(rp[2]));
        
        dataset.setValue("Availbel", Integer.valueOf(rp[1]));
       
        JFreeChart chart = ChartFactory.createPieChart( rp[0],dataset,true,true,false);
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("Item {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));  
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator); 
        ChartPanel panel = new ChartPanel(chart); 
        JFrame f=new JFrame();
        f.add(panel);
        f.setVisible(true);
        f.setSize(650,550);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        

    }//GEN-LAST:event_inventoryStockTablesetSelectedItem

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st2=con.createStatement();
            types.removeAllItems();
            String query ="select iSName from inventory_stock where iSName like '%"+name.getText()+"%' and item_type='Consumable Items';";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                types.addItem(rs.getString("iSName"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typesActionPerformed

        try {
            DefaultTableModel tableModel = (DefaultTableModel) inventoryStockTable.getModel();
            tableModel.setRowCount(0);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();

            String query ="select * from inventory_stock where iSName='"+types.getSelectedItem()+"' and item_type='Consumable Items';";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                rp[0]=rs.getString("iSName");
                rp[1]=rs.getString("iSDate");
                
                rp[2]=rs.getString("iSQTy");
                
                try{
                    query ="select sum(wsQTy) as withdraw from withdrawn_stock where wsISID="+rs.getString("iSID")+" and type='W' group by wsISID;";
                    rs=st.executeQuery(query);
                    rs.next();
                    rp[3]=rs.getString("withdraw");
                }
                catch(Exception e){
                    rp[3]="0";
                    rp[4]=String.valueOf(Integer.valueOf(rp[2])+Integer.valueOf(rp[3]));
                }
                
                
                tableModel.addRow(rp);
                
            }
        }
        catch(Exception e){
            System.out.println("0");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_typesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<inventoryStockTable.getRowCount();i++){

            String type=(String) inventoryStockTable.getValueAt(i ,0);
            int count=Integer.valueOf((String) inventoryStockTable.getValueAt(i ,4));
            dataset.setValue(count, "Items", type);

        }

        JFreeChart chart = ChartFactory.createBarChart("Item Total", "Item","Total", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<inventoryStockTable.getRowCount();i++){

            String type=(String) inventoryStockTable.getValueAt(i ,0);
            int count=Integer.valueOf((String) inventoryStockTable.getValueAt(i ,2));
            dataset.setValue(count, "Items", type);

        }

        JFreeChart chart = ChartFactory.createBarChart("Availble Item Total", "Item","Availble", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<inventoryStockTable.getRowCount();i++){

            String type=(String) inventoryStockTable.getValueAt(i ,0);
            int count=Integer.valueOf((String) inventoryStockTable.getValueAt(i ,4));
            dataset.setValue(count, "Items", type);

        }

        JFreeChart chart = ChartFactory.createBarChart("Damage Item Total", "Item","Damage", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Stock/ItemReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\Stock\\ItemReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JTable inventoryStockTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> types;
    // End of variables declaration//GEN-END:variables
}
