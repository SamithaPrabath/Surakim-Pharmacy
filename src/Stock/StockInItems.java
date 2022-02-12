
package Stock;


import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StockInItems extends javax.swing.JFrame {

    
    public StockInItems() {
        initComponents();
        reffered.setText(new Login().name);
        
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
        jButton2 = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        nameLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        nameLabel3 = new javax.swing.JLabel();
        itemType = new javax.swing.JComboBox<>();
        nameLabel4 = new javax.swing.JLabel();
        reffered = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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
        jLabel1.setText("Stock In");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 170, -1));

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

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel1.setText("Item Name");
        jPanel3.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 310, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 140, 20));

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
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 310, 30));

        addBtn.setBackground(new java.awt.Color(153, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel3.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 110, 40));

        clearBtn.setBackground(new java.awt.Color(153, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel3.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 110, 40));

        nameLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel2.setText("Item Type");
        jPanel3.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Genarate Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 110, 40));

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
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 310, 30));

        nameLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel3.setText("Price(Rs)");
        jPanel3.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 30));

        itemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-consumable Items", "Consumable Items" }));
        jPanel3.add(itemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 30));

        nameLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel4.setText("Reffered By");
        jPanel3.add(nameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 130, 30));

        reffered.setEditable(false);
        reffered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refferedActionPerformed(evt);
            }
        });
        jPanel3.add(reffered, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 310, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Amount(RS.)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 303, 310, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("View Non-consumable Items");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("View Consumable Items");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, 50));

        jButton3.setText("Re-Adding");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 110, 30));

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
    static String id="";
    static String rp[]=new String[8];
    static String bill[]=new String[6];
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void AddReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReportDetailsButtonActionPerformed
        
        Reports ard = new Reports();
        ard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddReportDetailsButtonActionPerformed

    private void addTestDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestDetailsButtonActionPerformed
        
    }//GEN-LAST:event_addTestDetailsButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        StockOutItems tdr = new StockOutItems();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StockManagement tdr = new StockManagement();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        
    }//GEN-LAST:event_priceActionPerformed

    private void refferedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refferedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refferedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!name.getText().equals("") && !quantity.getText().equals("")){
            StockBill sb=new StockBill();
            sb.setVisible(true);    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       int input = JOptionPane.showConfirmDialog(this, "Do you want to add Item Details?");
       if(input == JOptionPane.YES_OPTION){
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                //Date d=exdate.getDate();
                
                
      
                String query="select * from inventory_stock where iSName='"+name.getText()+"'";
                ResultSet rs1=st.executeQuery(query);
                if(!rs1.next()){
                    query="insert into inventory_stock(iSName,iSQTy,iSDate,price,item_type,refferd_by) values('"+name.getText()+"',"+quantity.getText()+",curdate(),"+price.getText()+",'"+itemType.getSelectedItem()+"','"+reffered.getText()+"')";
                    int rs=st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Item added");
                    setBill();
                }
                else{
                    JOptionPane.showMessageDialog(this,"The item is already added");
                }
                    

                    
                //Clear();

            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
                System.out.println(e.getMessage());

            }
       }
    }//GEN-LAST:event_addBtnActionPerformed

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

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        Clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConsumableItems c=new ConsumableItems();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NonConsumableItems c=new NonConsumableItems();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ReAdding c=new ReAdding();
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
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
        bill[0]=name.getText();
        bill[1]=(String)itemType.getSelectedItem();
        bill[2]=quantity.getText();
        bill[3]=price.getText();
        bill[4]=reffered.getText();
        bill[5]=amount.getText();
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JTextField amount;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox<String> itemType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField reffered;
    // End of variables declaration//GEN-END:variables
}
