
package Payment;

import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GenerateBill extends javax.swing.JFrame {

    public GenerateBill() {
        initComponents();
        showTableContents();
        issuedBy.setText(new Login().name);
    }
    public static String row[]=new String[6];
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)billTable.getModel();
        dt.setRowCount(0);
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select * from bill;";
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                row[0]=rs.getString("bid");
                row[1]=rs.getString("pid");
                row[2]=rs.getString("amount");
                row[3]=rs.getString("issued_by");
                row[4]=rs.getString("date");
                row[5]=rs.getString("status");
                dt.addRow(row);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Bill \n Please Try Again!");
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
        pname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        pid = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        backbtn2 = new javax.swing.JButton();
        issuedBy = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bill");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 390, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Patient Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, 30));

        pname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnameKeyTyped(evt);
            }
        });
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Patient Id");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Amount (Rs)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 30));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 240, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 110, 40));

        addBtn.setBackground(new java.awt.Color(153, 255, 255));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel3.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, 40));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 110, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Issued By");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 120, 30));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Id", "Patient Id", "Amount (Rs)", "Issued by", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 770, 220));

        pid.setEditable(false);
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 90, 30));

        date.setEditable(false);
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 240, 30));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 80, 70));

        issuedBy.setEditable(false);
        jPanel3.add(issuedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 240, 30));

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Type", "Price (Rs)"
            }
        ));
        jScrollPane2.setViewportView(testTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 490, 100));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 80, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("NIC");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, 30));

        nic.setEditable(false);
        jPanel3.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 740);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 760));

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton7.setText("Genarate Bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 90));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton8.setText("Patients Payment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, 90));

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton9.setText("Payment Records");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 290, 90));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void billTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billTableMousePressed
        pname.setText("");
        amount.setText("");
        pid.setText("");
        date.setText("");
        for(int i=0;i<6;i++){
            row[i] = (String) billTable.getValueAt(billTable.getSelectedRow() ,i);
            System.out.println(row[i]);
        }
        addBtn.setEnabled(false);
        try {
            name.removeAllItems();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select concat(first_name,' ' ,last_name) as nm from patient where pid="+row[1]+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            //pname.setText(rs.getString("nm"));
            name.addItem(rs.getString("nm"));
            DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
            dt.setRowCount(0);
            amount.setText("");
            pid.setText("");
            double total=0;
            String r[]=new String[2];
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            st=con.createStatement();
            Statement st1=con.createStatement();
            query="select pid from patient where concat(first_name,' ' ,last_name) like '%"+pname.getText()+"%';";
            rs=st.executeQuery(query);
            rs.next();
            pid.setText(rs.getString("pid"));
            query="select test_type,test_id from test where pid="+pid.getText()+";";
            rs=st.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString("test_id"));
                r[0]=rs.getString("test_type");
                query="select price from test_types where acronym='"+rs.getString("test_type")+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                r[1]=rs1.getString("price");
                System.out.println(rs1.getString("price"));
                total+=Double.valueOf(r[1]);
                dt.addRow(r);


            }
            amount.setText(String.valueOf(total));
            query="select now() as date;";
            rs=st.executeQuery(query);
            rs.next();
            String s=rs.getString("date");
            date.setText(s);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Patient Id \n Please Try Again!");
            System.out.println(e.getMessage());
        }
        amount.setText(row[2]);
        
        date.setText(row[4]);
    }//GEN-LAST:event_billTableMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int input = JOptionPane.showConfirmDialog(this, "Do you want to remove bill?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if(input == JOptionPane.YES_OPTION){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="delete from bill where bid="+Integer.valueOf(row[0])+";";
                int rs=st.executeUpdate(query);
                query="update test set status='Pending',paid_date=NULL where pid="+row[1]+";";
                rs=st.executeUpdate(query);
                showTableContents();
                pname.setText("");
                amount.setText("");
                pid.setText("");
                date.setText("");
                DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
                dt.setRowCount(0);
                addBtn.setEnabled(true);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Remove Bill \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            
            int input = JOptionPane.showConfirmDialog(this, "Do you want to genarate bill?");
            if(input == JOptionPane.YES_OPTION){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                
//                String billingCountQuery ="select count(*) from bill b where b.pid="+Integer.valueOf(pid.getText());
//                System.out.println(billingCountQuery);
//                ResultSet billingRs =st.executeQuery(billingCountQuery);
//                 int count =0;
//                if(billingRs!= null && billingRs.next()) {
//                     count =billingRs.getInt("count(*)");
//                    System.out.println(count);
//                
//                }
                
                //if(count == 0) {
                    String query="insert into bill(pid,amount,date,issued_by) values("+Integer.valueOf(pid.getText())+",'"+amount.getText()+"',now(),'"+issuedBy.getText()+"');";
                    int rs=st.executeUpdate(query);
                    query="update test set status='Bill Added' where paid_date is NULL;";
                    rs=st.executeUpdate(query);
                    showTableContents();
                    printBill pb=new printBill();
                    pb.setVisible(true);
                //}
//                else{
//                    JOptionPane.showMessageDialog(this,"This bill record already exsisit!");
//                }       
                  
	   
                
            }    
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Bill \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pname.setText("");
        amount.setText("");
        pid.setText("");
        date.setText("");
        DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
        dt.setRowCount(0);
        nic.setText("");
        name.removeAllItems();
        addBtn.setEnabled(true);
        showTableContents();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void pnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyPressed

    }//GEN-LAST:event_pnameKeyPressed

    private void pnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyTyped

    }//GEN-LAST:event_pnameKeyTyped

    private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased
        
    }//GEN-LAST:event_pnameKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Payment p=new Payment();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PaymentReports pr=new PaymentReports();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        PaymentManagement r=new PaymentManagement();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            name.removeAllItems();
            Pattern resPattern=Pattern.compile("^[0-9]*$");
            Matcher resMatcher=resPattern.matcher(pname.getText());
                    
            if(!pname.getText().equals("") && !resMatcher.find()){
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                Statement st1=con.createStatement();
                String query="select concat(first_name,' ',last_name) as nm from patient where concat(first_name,' ',last_name) like '%"+pname.getText()+"%';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    name.addItem(rs.getString("nm"));
                }                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Patient Name!");
                DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
                dt.setRowCount(0);
                amount.setText("");
                pid.setText("");
                
            }
           
        }
        catch(Exception e){
    
            //JOptionPane.showMessageDialog(this,"Invalid Patient Id \n Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
       try{
           if(pname.getText().equals("")){
               addBtn.setEnabled(false);
           }
           else{
               addBtn.setEnabled(true);
           }
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            DefaultTableModel dt =(DefaultTableModel)testTable.getModel();
            dt.setRowCount(0);
            amount.setText("");
            pid.setText("");
            double total=0;
            String r[]=new String[2];
            String query="select pid,nic from patient where concat(first_name,' ',last_name)='"+name.getSelectedItem()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            nic.setText(rs.getString("nic"));
            pid.setText(rs.getString("pid"));
            query="select test_type,test_id from test where pid="+rs.getString("pid")+" and status='Pending';";
            rs=st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("test_id"));
                r[0]=rs.getString("test_type");
                query="select price from test_types where acronym='"+rs.getString("test_type")+"';";
                ResultSet rs1=st1.executeQuery(query);
                rs1.next();
                r[1]=rs1.getString("price");
                System.out.println(rs1.getString("price"));
                total+=Double.valueOf(r[1]);
                dt.addRow(r);


            }
            amount.setText(String.valueOf(total));
            query="select now() as date;";
            rs=st.executeQuery(query);
            rs.next();
            String s=rs.getString("date");
            date.setText(s);
            DefaultTableModel dt1 =(DefaultTableModel)billTable.getModel();
            dt1.setRowCount(0);
            try {

                query="select * from bill where pid="+pid.getText()+" and (status='Pending' or status='Half');";
                rs=st.executeQuery(query);
                for(int i=0;rs.next();i++){
                    row[0]=rs.getString("bid");
                    row[1]=rs.getString("pid");
                    row[2]=rs.getString("amount");
                    row[3]=rs.getString("issued_by");
                    row[4]=rs.getString("date");
                    row[5]=rs.getString("status");
                    dt1.addRow(row);
                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Add Bill \n Please Try Again!");
                System.out.println(e.getMessage());

            }
           
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amount;
    private javax.swing.JButton backbtn2;
    private javax.swing.JTable billTable;
    private javax.swing.JTextField date;
    private javax.swing.JTextField issuedBy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTable testTable;
    // End of variables declaration//GEN-END:variables
}
