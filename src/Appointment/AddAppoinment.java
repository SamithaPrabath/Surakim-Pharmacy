
package Appointment;


import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddAppoinment extends javax.swing.JFrame {

 
    public AddAppoinment() {
        initComponents();
        getTestTypes();
        Date da = new Date();
        date.setDate(da);
        //System.out.println(date.getDate());
        showTableContent();
    }
    static String id="";
    static String p[]=new String[6];
    void showTableContent(){
        DefaultTableModel dt =(DefaultTableModel)appointmentsTable.getModel();
        dt.setRowCount(0);
        
        
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select * from appointment;";
            ResultSet rs =st.executeQuery(query);
            while(rs.next()){
                p[0]=rs.getString("appointment_id");
                p[1]=rs.getString("patient_id");
                p[2]=rs.getString("testType");
                p[3]=rs.getString("date");
                p[4]=rs.getString("time");
                p[5]=rs.getString("status");
               
                dt.addRow(p);
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void getTestTypes(){
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select acronym from test_types;";
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                testType.addItem(rs.getString("acronym"));
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        testType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        time = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        availability = new javax.swing.JTextField();
        backbtn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        count = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        pid = new javax.swing.JTextField();
        name = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

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

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton4.setText("Add Patient");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, 80));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton5.setText("Add Appoinment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 80));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jButton3.setText("Reports");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 330, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Create Appointment");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 520, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Patient ID         :-");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 178, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("       Test Type         :-");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 221, 200, 30));

        testType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTypeActionPerformed(evt);
            }
        });
        jPanel3.add(testType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText(" Date                :-");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 271, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Time                :-");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, 30));

        jButton21.setBackground(new java.awt.Color(153, 255, 255));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("Clear");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 120, 40));

        jButton22.setBackground(new java.awt.Color(153, 255, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setText("Add");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 120, 40));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Availability");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 100, -1));

        availability.setEditable(false);
        availability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 110, 30));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, -1, -1));

        appointmentsTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "App No", "Patient ID", "Test Type", "Date", "Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appointmentsTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 780, 220));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Available count");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, 30));

        count.setEditable(false);
        jPanel3.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 50, 30));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 120, 40));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 120, 40));

        jButton6.setText("Check Available Test");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("     Patient Name     :-");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, -1));

        pname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, 30));

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 90, 30));

        pid.setEditable(false);
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 700);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel11.setText("jLabel2");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddPatient ap=new AddPatient();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reports pr=new Reports();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Date date1=new Date();
        name.removeAllItems();
        date.setDate(date1);
        availability.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a new appointment?");
        if(input == JOptionPane.YES_OPTION){
            try {
                Date d=date.getDate();
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                String dat = dcn.format(date.getDate());
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="select curdate() where curdate() <= '"+dat+"';";
                ResultSet rs1=st.executeQuery(query);
                if(rs1.next()){
                    query="insert into appointment(patient_id,date,time,test_type_id,testType) values("+pid.getText()+",'"+dat+"','"+time.getSelectedItem()+"',"+id+",'"+testType.getSelectedItem()+"');";
                    int rs=st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Appoinment Added");
                    name.removeAllItems();

                    //date.setDate(date1);
                    availability.setText("");
                    showTableContent();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Date");
                }
                //System.out.println(da);
                //Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(date.get()));
                
                



            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        checkAvalability();
    }//GEN-LAST:event_timeActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        AppoinmentManagement r=new AppoinmentManagement();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void appointmentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsTableMouseClicked
        name.removeAllItems();
        for(int i=0;i<6;i++){
                p[i] = (String) appointmentsTable.getValueAt(appointmentsTable.getSelectedRow() ,i);

            }
        try{
           name.removeAllItems();
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
           Statement st=con.createStatement();
           String query="select concat(first_name,' ',last_name) as nm from patient where pid="+p[1]+";";
           ResultSet rs=st.executeQuery(query);
           while(rs.next()){
               name.addItem(rs.getString("nm"));
           }
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        
        for(int i=0;i<testType.getItemCount();i++){
            if(testType.getItemAt(i).equals(p[2])){
                testType.setSelectedIndex(i);
            }
        }
        for(int i=0;i<time.getItemCount();i++){
            if(time.getItemAt(i).equals(p[4])){
                time.setSelectedIndex(i);
            }
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date da = df.parse(p[3].toString());
            date.setDate(da);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_appointmentsTableMouseClicked

    private void testTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTypeActionPerformed
        checkAvalability();
    }//GEN-LAST:event_testTypeActionPerformed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        checkAvalability();
    }//GEN-LAST:event_dateMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove appointment?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="delete from appointment where appointment_id="+p[0]+" and status='Pending';";
                int r=st.executeUpdate(query);
                if(r>0){
                    JOptionPane.showMessageDialog(this,"Appoinment Deleted");
                    showTableContent();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Can't delete success appointment");
                }
                
                

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update a appointment details?");
        if(input == JOptionPane.YES_OPTION){
            try {
                Date d=date.getDate();
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                String dat = dcn.format(date.getDate());
                //System.out.println(da);
                //Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(date.get()));
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                 String query="select curdate() where curdate() <= '"+dat+"';";
                ResultSet rs1=st.executeQuery(query);
                if(rs1.next()){
                    query="update appointment set patient_id="+pid.getText()+",date='"+dat+"',time='"+time.getSelectedItem()+"',test_type_id="+id+",testType='"+testType.getSelectedItem()+"' where appointment_id="+p[0]+";";
                    int rs=st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Appoinment Updated");
                    name.removeAllItems();

                    //date.setDate(date1);
                    availability.setText("");
                    showTableContent();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Date");
                }



            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Report2 dp =new Report2();
       this.dispose();
       dp.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       try{
           name.removeAllItems();
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
           Statement st=con.createStatement();
           String query="select concat(first_name,' ',last_name) as nm from patient where concat(first_name,' ',last_name) like '%"+pname.getText()+"%';";
           ResultSet rs=st.executeQuery(query);
           while(rs.next()){
               name.addItem(rs.getString("nm"));
           }
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        try{
          
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
           Statement st=con.createStatement();
           String query="select pid from patient where concat(first_name,' ',last_name)='"+name.getSelectedItem()+"';";
           ResultSet rs=st.executeQuery(query);
           while(rs.next()){
               pid.setText(rs.getString("pid"));
           }
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_nameActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    void checkAvalability(){
        try {
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dat = dcn.format(date.getDate());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            String query="select id from test_types where acronym='"+testType.getSelectedItem()+"';";
            
            ResultSet rs=st.executeQuery(query);
            rs.next();
            id=rs.getString("id");
            query="select count(appointment_id) as count from appointment where test_type_id='"+rs.getString("id")+"' and time='"+time.getSelectedItem()+"' and date='"+dat+"';";
            rs=st.executeQuery(query);
            rs.next();
            int c=30-Integer.valueOf(rs.getString("count"));
            if(c<=0){
                availability.setText(" Not Available");
                count.setText("0");
            }
            else{
                availability.setText("Available");
                count.setText(String.valueOf(c));
            }
            
            
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JTextField availability;
    private javax.swing.JButton backbtn2;
    private javax.swing.JTextField count;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JComboBox<String> testType;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
