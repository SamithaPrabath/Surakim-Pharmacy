
package Stock;

import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CondemnedItems extends javax.swing.JFrame {


    public CondemnedItems() {
        initComponents();
        getDetails();
        issuedby.setText(new Login().name);
    }
    static String rp[]=new String[6];
    public void getDetails(){
        DefaultTableModel tableModel = (DefaultTableModel) withdrawTable.getModel();
        tableModel.setNumRows(0);
        try {
               
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                Statement st2=con.createStatement();
                String query ="select * from withdrawn_stock where type='D';";
                ResultSet rs=st.executeQuery(query);
                
                while(rs.next()){
                    rp[0]=rs.getString("wsID");
                    //rp[1]=rs.getString("wsISID");
                    rp[2]=rs.getString("wsQTy");
                    rp[3]=rs.getString("wsDate");
                    rp[4]=rs.getString("issued_by");
                    rp[5]=rs.getString("remarks");
                    System.out.println(rs.getString("wsISID"));
                    query ="select iSName from inventory_stock where iSID="+rs.getString("wsISID")+";";
                    ResultSet rs1=st2.executeQuery(query);
                    
                    rs1.next();
                    
                    rp[1]=rs1.getString("iSName");
                   
                    
                    
                    tableModel.addRow(rp);
                }
                    

            }
            catch(Exception e){
                System.out.println("1");
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        withdrawTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        types = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        availble = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        withdraw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        issuedby = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Condemned Items");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 310, 70));

        withdrawTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "D/Qty", "Date", "Issued By", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        withdrawTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                withdrawTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(withdrawTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 750, 200));

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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Item Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 220, -1));

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typesActionPerformed(evt);
            }
        });
        jPanel3.add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Item ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Available Quantity");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        availble.setEditable(false);
        availble.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(availble, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Condemned Quantity");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        withdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        withdraw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                withdrawKeyReleased(evt);
            }
        });
        jPanel3.add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Issued By");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        issuedby.setEditable(false);
        issuedby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(issuedby, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Remarks");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        remarks.setColumns(20);
        remarks.setRows(5);
        jScrollPane2.setViewportView(remarks);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 220, 80));

        jButton3.setBackground(new java.awt.Color(204, 0, 51));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 100, 40));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 100, 40));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 100, 40));

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 100, 40));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(100, 20, 820, 680);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1080, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1020, 710));

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

    }//GEN-LAST:event_jButton9ActionPerformed

    private void AddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReportDetailsButtonActionPerformed
        Reports ard = new Reports();
        ard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddReportDetailsButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StockManagement tdr = new StockManagement();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st2=con.createStatement();
            types.removeAllItems();
            String query ="select iSName from inventory_stock where iSName like '%"+name.getText()+"%' and item_type='Non-consumable Items';";
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

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();

            String query ="select iSQTy from inventory_stock where iSName='"+types.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            availble.setText(rs.getString("iSQTy"));
        }
        catch(Exception e){
            System.out.println("0");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_typesActionPerformed

    private void withdrawKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawKeyReleased
        try{
            if(!withdraw.getText().equals("")){
                int w=Integer.valueOf(withdraw.getText());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Integers only");
            withdraw.setText("");
        }
    }//GEN-LAST:event_withdrawKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove Withdraw DetailsS?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            try {

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                System.out.println(rp[0]);
                String query ="select wsISID from withdrawn_stock where wsID='"+rp[0]+"';";
                ResultSet rs1=st.executeQuery(query);
                rs1.next();
                int a=Integer.valueOf(availble.getText())+Integer.valueOf(withdraw.getText());
                query ="update inventory_stock set iSQTy="+a+" where iSID="+rs1.getString("wsISID")+";";
                int r=st.executeUpdate(query);
                query ="delete from withdrawn_stock where wsID='"+rp[0]+"';";
                r=st.executeUpdate(query);
                getDetails();
                name.setText("");
                types.removeAllItems();
                availble.setText("");
                withdraw.setText("");
                remarks.setText("");

            }
            catch(Exception e){
                System.out.println("0");
                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update Withdraw Details?");

        if(input == JOptionPane.YES_OPTION){
            try {

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query ="select iSID from inventory_stock where iSName='"+types.getSelectedItem()+"';";
                ResultSet rs=st.executeQuery(query);
                rs.next();
                String id=rs.getString("iSID");
                if(Integer.valueOf(withdraw.getText())<=(Integer.valueOf(availble.getText())+Integer.valueOf(rp[2]))){
                    query ="update withdrawn_stock set wsISID="+id+",wsQTy="+withdraw.getText()+",wsDate=curdate(),issued_by='"+issuedby.getText()+"',remarks='"+remarks.getText()+"' where wsID="+rp[0]+";";
                    int r=st.executeUpdate(query);
                    int a=Integer.valueOf(availble.getText())+Integer.valueOf(rp[2])-Integer.valueOf(withdraw.getText());
                    query ="update inventory_stock set iSQTy="+a+" where iSID="+id+";";
                    r=st.executeUpdate(query);
//                    WithdrawBill sb=new WithdrawBill();
//                    sb.setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(this,"Not enoguh Items");
                    withdraw.setText("");
                }
                getDetails();

            }
            catch(Exception e){

                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        name.setText("");
        types.removeAllItems();
        availble.setText("");
        withdraw.setText("");
        remarks.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add Condened Details?");
        if(input == JOptionPane.YES_OPTION){
            try {

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query ="select iSID from inventory_stock where iSName='"+types.getSelectedItem()+"';";
                ResultSet rs=st.executeQuery(query);
                rs.next();
                String id=rs.getString("iSID");
                if(Integer.valueOf(withdraw.getText())<=Integer.valueOf(availble.getText())){
                    query ="insert into withdrawn_stock(wsISID,wsQTy,wsDate,issued_by,remarks,type) values("+id+","+withdraw.getText()+",curdate(),'"+issuedby.getText()+"','"+remarks.getText()+"','D');";
                    int r=st.executeUpdate(query);
                    int a=Integer.valueOf(availble.getText())-Integer.valueOf(withdraw.getText());
                    query ="update inventory_stock set iSQTy="+a+" where iSID="+id+";";
                    r=st.executeUpdate(query);
//                    WithdrawBill sb=new WithdrawBill();
//                    sb.setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(this,"Not enoguh Items");
                    withdraw.setText("");
                }
                getDetails();

            }
            catch(Exception e){
                System.out.println("1");
                System.out.println(e.getMessage());

            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void withdrawTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawTableMousePressed
        types.removeAllItems();
        for(int i=0;i<withdrawTable.getColumnCount();i++){
               rp[i]=(String)withdrawTable.getValueAt(withdrawTable.getSelectedRow(),i);
           }
        types.addItem(rp[1]);
        withdraw.setText(rp[2]);
        issuedby.setText(rp[4]);
        remarks.setText(rp[5]);
    }//GEN-LAST:event_withdrawTableMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JTextField availble;
    private javax.swing.JTextField issuedby;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JTextField name;
    private javax.swing.JTextArea remarks;
    private javax.swing.JComboBox<String> types;
    private javax.swing.JTextField withdraw;
    private javax.swing.JTable withdrawTable;
    // End of variables declaration//GEN-END:variables
}
