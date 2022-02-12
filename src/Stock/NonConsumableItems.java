
package Stock;

import Home.Login;
import static Stock.ConsumableItems.bill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NonConsumableItems extends javax.swing.JFrame {

    public NonConsumableItems() {
        initComponents();
        showTableContents();
        reffered.setText(new Login().name);
    }
    public void showTableContents(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) inventoryStockTable.getModel();
            tableModel.setRowCount(0);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();

            String query ="select * from inventory_stock where item_type='Non-consumable Items';";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                rp[0]=rs.getString("iSID");
                rp[1]=rs.getString("iSName");                
                rp[6]=rs.getString("iSQTy");
                rp[3]=rs.getString("iSDate");
                rp[4]=rs.getString("price");
                rp[5]=rs.getString("refferd_by");
                rp[7]=rs.getString("using");
                rp[2]=String.valueOf(Integer.valueOf(rp[6])+Integer.valueOf(rp[7]));
                              
                tableModel.addRow(rp);
                
            }
        }
        catch(Exception e){
            System.out.println("0");
            System.out.println(e.getMessage());

        }
    }
    static String id="";
    static String rp[]=new String[8];
    
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
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        iName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryStockTable = new javax.swing.JTable();
        nameLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nameLabel5 = new javax.swing.JLabel();
        availble = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        nameLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        nameLabel4 = new javax.swing.JLabel();
        reffered = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
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
        addTestDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        addTestDetailsButton.setText("Stock In");
        addTestDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestDetailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addTestDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 330, 80));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton9.setText("Stock Out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, 80));

        AddReportDetailsButton.setBackground(new java.awt.Color(153, 204, 255));
        AddReportDetailsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
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

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Non-consumable Items");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 520, -1));

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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jLabel5.setText("Item Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));
        jPanel3.add(iName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, -1));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        inventoryStockTable.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        inventoryStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Item Name", "Total Qty", "Added Date", "Price", "Refferd By", "Availble Qty", "Using Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryStockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryStockTablesetSelectedItem(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryStockTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 730, 230));

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel1.setText("Item Name");
        jPanel3.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 30));

        name.setEditable(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 310, 30));

        nameLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel5.setText("Total Quantity");
        jPanel3.add(nameLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 30));

        availble.setEditable(false);
        availble.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availble.setText("0");
        availble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availbleActionPerformed(evt);
            }
        });
        jPanel3.add(availble, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 310, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 140, 20));

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 310, 30));

        updateBtn.setBackground(new java.awt.Color(153, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 110, 40));

        clearBtn.setBackground(new java.awt.Color(153, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel3.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 110, 40));

        nameLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel3.setText("Price");
        jPanel3.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 130, 30));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 310, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Amount(RS.)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 310, 30));

        nameLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel4.setText("Reffered By");
        jPanel3.add(nameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 130, 30));

        reffered.setEditable(false);
        reffered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refferedActionPerformed(evt);
            }
        });
        jPanel3.add(reffered, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 310, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Genarate Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 110, 40));

        deleteBtn.setBackground(new java.awt.Color(204, 0, 51));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 110, 40));

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
        StockInItems tdr = new StockInItems();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_addTestDetailsButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        StockOutItems tdr = new StockOutItems();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void AddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReportDetailsButtonActionPerformed

        Reports ard = new Reports();
        ard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddReportDetailsButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StockInItems tdr = new StockInItems();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!iName.getText().equals("")){
            String row[]=new String[7];
            DefaultTableModel dt =(DefaultTableModel)inventoryStockTable.getModel();
            dt.setRowCount(0);
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                Statement st1=con.createStatement();
                String query="select * from inventory_stock where iSName like '%"+iName.getText()+"%' and item_type='Non-consumable Items';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                rp[0]=rs.getString("iSID");
                rp[1]=rs.getString("iSName");                
                rp[2]=rs.getString("iSQTy");
                rp[3]=rs.getString("iSDate");
                rp[4]=rs.getString("price");
                rp[5]=rs.getString("refferd_by");
                try{
                    query ="select sum(wsQTy) as withdraw from withdrawn_stock where wsISID="+rs.getString("iSID")+" and type='W' group by wsISID;";
                    ResultSet rs1=st1.executeQuery(query);
                    rs1.next();
                    rp[2]=String.valueOf(Integer.valueOf(rp[2])+Integer.valueOf(rs1.getString("withdraw")));
                }
                catch(Exception e){

                }                
                dt.addRow(rp);
                
            }

            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
                System.out.println(e.getMessage());

            }
        }
        else{
            showTableContents();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inventoryStockTablesetSelectedItem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryStockTablesetSelectedItem

        DefaultTableModel dt = (DefaultTableModel) inventoryStockTable.getModel();
        for(int i=0;i<dt.getColumnCount();i++){
            rp[i] = (String) inventoryStockTable.getValueAt(inventoryStockTable.getSelectedRow() ,i);
            System.out.println(rp[i]);
        }
        name.setText(rp[1]);
        
        availble.setText(rp[2]);
        price.setText(rp[4]);
        //reffered.setText(rp[5]);

        id=rp[0];
    }//GEN-LAST:event_inventoryStockTablesetSelectedItem

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void availbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availbleActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed

    }//GEN-LAST:event_quantityActionPerformed

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        try{
            if(!quantity.getText().equals("")){
                getAmount();
                int a=Integer.valueOf(quantity.getText());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Enter Integers only");
            quantity.setText("");
        }
    }//GEN-LAST:event_quantityKeyReleased

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update Item Details?");

        if(input == JOptionPane.YES_OPTION){
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                //Date d=exdate.getDate();

                int x=Integer.valueOf(quantity.getText())+Integer.valueOf(availble.getText());
                String query="update inventory_stock set iSName='"+name.getText()+"',iSQTy="+x+",iSDate=curdate(),price="+price.getText()+",refferd_by='"+reffered.getText()+"' where iSID="+id+";";
                int rs=st.executeUpdate(query);

                showTableContents();
                setBill();
                //Clear();

            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        Clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed

    }//GEN-LAST:event_priceActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try{
            if(!price.getText().equals("")){
                getAmount();
                int a=Integer.valueOf(price.getText());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Enter Integers only");
            price.setText("");
        }
    }//GEN-LAST:event_priceKeyReleased

    private void refferedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refferedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refferedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!name.getText().equals("") && !quantity.getText().equals("")){
            StockBill sb=new StockBill();
            sb.setVisible(true);    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove Item DetailsS?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();

                String query="delete from inventory_stock where iSID="+id+";";
                int rs=st.executeUpdate(query);
                
                query="delete from withdrawn_stock where wsISID="+id+";";
                rs=st.executeUpdate(query);

                showTableContents();
                Clear();

            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    void getAmount(){
        if(!quantity.getText().equals("") && !price.getText().equals("")){
            try{
                double am=Double.valueOf(quantity.getText())*Double.valueOf(price.getText());
                amount.setText(String.valueOf(am));
            }
            catch(Exception ex){
                amount.setText("0.0");
                
            }
        }
    }
    
    void Clear(){
        name.setText("");
        
        amount.setText("");
        price.setText("");
        quantity.setText("");
        
        reffered.setText(new Login().name);
        
    }
    void setBill(){
        new StockInItems().bill[0]=name.getText();
        new StockInItems().bill[2]=quantity.getText();
        new StockInItems().bill[3]=price.getText();
        new StockInItems().bill[4]=reffered.getText();
        new StockInItems().bill[5]=amount.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField availble;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField iName;
    private javax.swing.JTable inventoryStockTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JLabel nameLabel5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField reffered;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
