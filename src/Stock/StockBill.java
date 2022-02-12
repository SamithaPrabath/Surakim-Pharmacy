
package Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class StockBill extends javax.swing.JFrame {

    public StockBill() {
        initComponents();
        String r[]=new StockInItems().bill;
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            
            String query="select curdate() as date;";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            date.setText(rs.getString("date"));
            
            name.setText(r[0]);
            type.setText(r[1]);
            quantity.setText(r[2]);
            price.setText(r[3]);
            total.setText(r[5]);
            rby.setText(r[4]);
            
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        rby = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Surakim LAB Inventory");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, -1));

        quantity.setEditable(false);
        quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price X1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 120, -1));

        price.setEditable(false);
        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, 30));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total(Rs)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date :- ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Signature :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        jTextField6.setEditable(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Item Type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, -1));

        type.setEditable(false);
        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 240, 30));

        rby.setEditable(false);
        rby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rby, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 240, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Refferd By");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel10.setText("jLabel2");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 680, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rby;
    private javax.swing.JTextField total;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
