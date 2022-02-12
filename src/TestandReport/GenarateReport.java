package TestandReport;

import Home.Login;
import TestandReport.Report;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenarateReport extends javax.swing.JFrame {


    public GenarateReport() {
        initComponents();
        showReport();
    }
    static String tid;
    public void showReport(){
        String pp=new Report().pid;
        String rp[]=new Report().row;
        
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            String query="select test_id,test_type,pid,sno,stype,location,curdate() as date from test where test_type='"+rp[0]+"' and pid="+pp+";";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            tid=rs.getString("test_id");
            type.setText(rs.getString("test_type"));
            sno.setText(rs.getString("sno"));
            specimen.setText(rs.getString("stype"));
            location.setText(rs.getString("location"));
            date.setText(rs.getString("date"));
            String pid=rs.getString("pid");
            query="select a.*,b.reference_range from (select subtest_name,Result,unit from test_results where test_id="+rs.getString("test_id")+") a inner join (select reference_range,subtest_name from subtest) b on a.subtest_name=b.subtest_name;";
            rs=st.executeQuery(query);
            DefaultTableModel dt =(DefaultTableModel)resultTable.getModel();
            dt.setRowCount(0);
            String p[]=new String[4];
            while(rs.next()){
                p[0]=rs.getString("subtest_name");
                p[1]=rs.getString("Result");
                p[2]=rs.getString("unit");
                p[3]=rs.getString("reference_range");
                dt.addRow(p);
            }
            query="select first_name,last_name,age,gender,doctor_name from patient where pid="+pid+";";
            rs=st.executeQuery(query);
            rs.next();
            pname.setText(rs.getString("first_name")+" "+rs.getString("last_name"));
            age.setText(rs.getString("age"));
            gender.setText(rs.getString("gender"));
            doctor.setText(rs.getString("doctor_name"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Patient Id \n Please Try Again!");
            System.out.println(e.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        specimen = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        sno = new javax.swing.JTextField();
        doctor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        type = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Lab Test Results");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Specimen          :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Patient Name     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Specimen No     :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Refferred By      :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        specimen.setEditable(false);
        specimen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(specimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 260, -1));

        pname.setEditable(false);
        pname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 260, -1));

        sno.setEditable(false);
        sno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 260, -1));

        doctor.setEditable(false);
        doctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 260, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date                 :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Age                   :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        age.setEditable(false);
        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 260, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Location            :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        location.setEditable(false);
        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 260, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender              :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        gender.setEditable(false);
        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 260, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 940, 10));

        type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("Test Type");
        type.setToolTipText("");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 450, 940, -1));

        resultTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub Test name", "Result", "Unit", "Refference Range"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 840, 170));

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 690, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 940, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-2.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 210));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Address : 223 c,Galahitiyawa,\nGanemulla\nTelephone :033-226644516\nEmail :surakim@live.com");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 280, 110));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Surakim Medical Labortory");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("tid", tid);
            hm.put("name",pname.getText());
            hm.put("sno",sno.getText());
            hm.put("rby",doctor.getText());
            hm.put("specimen",specimen.getText());
            hm.put("age", age.getText());
            hm.put("location",location.getText());
            hm.put("gender",gender.getText());
            hm.put("date",date.getText());
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/TestandReport/TestReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Thaveeshi\\Desktop\\Surakim\\src\\TestandReport\\TestReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField date;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField pname;
    private javax.swing.JTable resultTable;
    private javax.swing.JTextField sno;
    private javax.swing.JTextField specimen;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
