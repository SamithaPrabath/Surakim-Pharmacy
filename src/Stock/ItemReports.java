
package Stock;

import Home.Login;


public class ItemReports extends javax.swing.JFrame {


    public ItemReports() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addTestDetailsButton = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        AddReportDetailsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 96, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/power-icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 80, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jLabel1.setText("Reports");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 240, -1));

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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton1.setText("Non-consiumable Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 580, 70));

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton4.setText("Consiumable Item Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 580, 70));

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reports tdr = new Reports();
        this.dispose();
        tdr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NonConsumableItemReport ms=new NonConsumableItemReport();
        this.dispose();
        ms.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConsiumableItemReport it=new ConsiumableItemReport();
        this.dispose();
        it.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReportDetailsButton;
    private javax.swing.JButton addTestDetailsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
