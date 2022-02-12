
package Appointment;

import Home.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddPatient extends javax.swing.JFrame {

    public AddPatient() {
        initComponents();
        showTableContent();
    }
    static String p[]=new String[8];
    void showTableContent(){
        DefaultTableModel dt =(DefaultTableModel)patientTable.getModel();
        dt.setRowCount(0);
        
        
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select * from patient;";
            ResultSet rs =st.executeQuery(query);
            while(rs.next()){
                p[0]=rs.getString("pid");
                p[1]=rs.getString("first_name");
                p[2]=rs.getString("last_name");
                p[3]=rs.getString("nic");
                p[4]=rs.getString("age");
                p[5]=rs.getString("gender");
                p[6]=rs.getString("mobile");
                p[7]=rs.getString("doctor_name");
                dt.addRow(p);
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        tpno = new javax.swing.JTextField();
        backbtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        doctor = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Patient Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("First Name        :-");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Last Name        :-");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("NIC                 :-");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Age                 :-");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Gender             :-");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 160, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Mobile Number   :-");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 30));

        patientTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "F.Name", "L.Name", "NIC", "Age", "Gender", "Mobile", "Doctor name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 680, 200));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 120, 50));

        jButton7.setBackground(new java.awt.Color(153, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 120, 50));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 332, 30));
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 332, 31));
        jPanel3.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 332, 28));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        jPanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 80, 28));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 117, 28));

        tpno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpnoActionPerformed(evt);
            }
        });
        tpno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpnoKeyReleased(evt);
            }
        });
        jPanel3.add(tpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 203, 31));

        backbtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backIcon.png"))); // NOI18N
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 120, 50));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 120, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Doctor Name      :-");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 180, 30));
        jPanel3.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 230, 30));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(110, 10, 820, 680);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204,80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 10, 1000, 700);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int input = JOptionPane.showConfirmDialog(this, "Do you want to Log out?","log out",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            this.dispose();
            Login login=new Login();
            login.setVisible(true);
        }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reports pr=new Reports();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddAppoinment p=new AddAppoinment();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        fname.setText("");
        lname.setText("");
        tpno.setText("");
        doctor.setText("");
        age.setText("");
        nic.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a patient?");
        if(input == JOptionPane.YES_OPTION){
            if(!fname.getText().equals("") && !lname.getText().equals("") && !tpno.getText().equals("") && !doctor.getText().equals("") && !age.getText().equals("") && !nic.getText().equals("")){
                Pattern patterntp=Pattern.compile("^0[0-9]{9}$");
                Pattern patternt=Pattern.compile("^[A-z.]*$");
                Pattern dpatternt=Pattern.compile("^[A-z\\s.]*$");
                
                Matcher tpmatcher=patterntp.matcher(tpno.getText());
                Matcher fmatcher=patternt.matcher(fname.getText());
                Matcher lmatcher=patternt.matcher(lname.getText());
                Matcher dmatcher=dpatternt.matcher(doctor.getText());
                if(fmatcher.find() && lmatcher.find() && dmatcher.find()){
                if(tpmatcher.find() && !tpno.getText().equals("0000000000")){
                    Pattern oldpattern=Pattern.compile("^[0-9]{9}v$");
                    Pattern newpattern=Pattern.compile("^[0-9]{12}$");
                    Matcher oldmatcher=oldpattern.matcher(nic.getText());
                    Matcher newmatcher=newpattern.matcher(nic.getText());
                    if(oldmatcher.find() || newmatcher.find()){
                        try{
                            boolean t=true;
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                            Statement st=con.createStatement();
                            String query="select nic from patient;";
                            ResultSet r=st.executeQuery(query);
                            while(r.next()){
                                if(r.getString("nic").equals(nic.getText())){
                                    t=false;
                                }
                            }
                            if(t){
                                query="insert into patient(first_name,last_name,nic,age,gender,mobile,doctor_name) values('"+fname.getText()+"','"+lname.getText()+"','"+nic.getText()+"',"+age.getText()+",'"+(String)gender.getSelectedItem()+"','"+tpno.getText()+"','"+doctor.getText()+"');";
                                int rs =st.executeUpdate(query);
                                JOptionPane.showMessageDialog(this,"Patient Added");
                                fname.setText("");
                                lname.setText("");
                                tpno.setText("");
                                doctor.setText("");
                                age.setText("");
                                nic.setText("");
                                showTableContent();
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"This patient already added(check nic number)");
                            }
                            
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this,"can't Add Patient");
                            System.out.println(e.getMessage());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Invalid Nic");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"please check phone number again!");
                }
                }
                else{
                   JOptionPane.showMessageDialog(this,"Invalid details!"); 
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"All Feilds mus be filled");  
            }
        }
        
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void tpnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpnoActionPerformed
        
    }//GEN-LAST:event_tpnoActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        AppoinmentManagement r=new AppoinmentManagement();
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update a patient details?");
        if(input == JOptionPane.YES_OPTION){
            if(!fname.getText().equals("") && !lname.getText().equals("") && !tpno.getText().equals("") && !doctor.getText().equals("") && !age.getText().equals("") && !nic.getText().equals("")){
                Pattern patterntp=Pattern.compile("^0[0-9]{9}$");
                Pattern patternt=Pattern.compile("^[A-z\\s.]*$");
                 Pattern dpatternt=Pattern.compile("^[A-z\\s.]*$");
                 
                Matcher tpmatcher=patterntp.matcher(tpno.getText());
                Matcher fmatcher=patternt.matcher(fname.getText());
                Matcher lmatcher=patternt.matcher(lname.getText());
                Matcher dmatcher=dpatternt.matcher(doctor.getText());
                if(fmatcher.find() && lmatcher.find() && dmatcher.find()){
                if(tpmatcher.find() && !tpno.getText().equals("0000000000")){
                    Pattern oldpattern=Pattern.compile("^[0-9]{9}v$");
                    Pattern newpattern=Pattern.compile("^[0-9]{12}$");
                    Matcher oldmatcher=oldpattern.matcher(nic.getText());
                    Matcher newmatcher=newpattern.matcher(nic.getText());
                    if(oldmatcher.find() || newmatcher.find()){
                        try{
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                            Statement st=con.createStatement();
                            String query="update patient set first_name='"+fname.getText()+"',last_name='"+lname.getText()+"',nic='"+nic.getText()+"',age="+age.getText()+",gender='"+(String)gender.getSelectedItem()+"',mobile='"+tpno.getText()+"',doctor_name='"+doctor.getText()+"' where pid="+p[0]+";";
                            int rs =st.executeUpdate(query);
                            JOptionPane.showMessageDialog(this,"Patient Updated");
                            fname.setText("");
                            lname.setText("");
                            tpno.setText("");
                            doctor.setText("");
                            age.setText("");
                            nic.setText("");
                            showTableContent();
                        }
                        
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this,"can't Update Patient");
                            System.out.println(e.getMessage());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Invalid Nic");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"please check phone number again!");
                }
                }
                else{
                   JOptionPane.showMessageDialog(this,"Invalid details!"); 
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"All Feilds mus be filled");  
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int input = JOptionPane.showConfirmDialog(this, "Do you want to remove patient?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
                Statement st=con.createStatement();
                String query="delete from  patient where pid="+p[0]+";";
                int rs =st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Patient Deleted");
                fname.setText("");
                lname.setText("");
                tpno.setText("");
                doctor.setText("");
                age.setText("");
                nic.setText("");
                showTableContent();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"can't Delete Patient");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked
        for(int i=0;i<8;i++){
            p[i] = (String) patientTable.getValueAt(patientTable.getSelectedRow() ,i);
            
        }
        fname.setText(p[1]);
        lname.setText(p[2]);
        tpno.setText(p[6]);
        doctor.setText(p[7]);
        age.setText(p[4]);
        nic.setText(p[3]);
        if(p[5].equals("Male")){
            gender.setSelectedIndex(0);
        }
        else{
            gender.setSelectedIndex(1);
        }
    }//GEN-LAST:event_patientTableMouseClicked

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
      
    }//GEN-LAST:event_ageActionPerformed

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
         try{
             if(!age.getText().equals("")){
                int a=Integer.valueOf(age.getText());
             }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"Invalid age type");
           age.setText("");
       }
    }//GEN-LAST:event_ageKeyReleased

    private void tpnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpnoKeyReleased
        try{
           int a=Integer.valueOf(tpno.getText());
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"Invalid phone number type");
           tpno.setText("");
       }
    }//GEN-LAST:event_tpnoKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton backbtn2;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nic;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField tpno;
    // End of variables declaration//GEN-END:variables
}
