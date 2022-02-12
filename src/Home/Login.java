
package Home;


import Payment.GenerateBill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    public static String name;
    public static String role;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        logInBtn = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("LogIn");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("User Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, 30));
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 230, 30));

        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 110, 40));

        logInBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        jPanel2.add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 120, 40));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Surakim Laboratary ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 390, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 780, 590));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpeg"))); // NOI18N
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        user.setText("");
        password.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surakim_db","root","");
            Statement st=con.createStatement();
            
            //String pw=new String(password.getPassword());
            String query="select * from user where uname='"+user.getText()+"' and password='"+new String(password.getPassword())+"';";
            
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                
                name=rs.getString("name");
                role=rs.getString("role");
                
                HomePage t=new HomePage();
                this.dispose();
                t.setVisible(true);
                
               
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect Username Or Password Please Try Again!");
                System.out.println(new String(password.getPassword()));
                System.out.println(user.getText());
                user.setText("");
                password.setText("");
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Incorrect Username Or Password Please Try Again!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
