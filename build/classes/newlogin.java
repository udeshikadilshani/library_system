
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udesh
 */
public class newlogin extends javax.swing.JFrame {

    /**
     * Creates new form newlogin
     */
    public newlogin() {
        initComponents();
         try {
            Image icone =Toolkit.getDefaultToolkit().getImage("C:\\Users\\udesh\\Pictures\\loicone.jpg");
            setIconImage(icone);
        } catch (Exception e) {
        
        }
                 new Thread(new Runnable() {
            @Override
            public void run() {
                load();
            }
        }).start();
    }
    
     void load() {
        for (float f = 0; f <= 10; f++) {
            float f1 = f / 10;
            System.out.println(f1);
            com.sun.awt.AWTUtilities.setWindowOpacity(this, f1);

            try {
                Thread.sleep(80);
            } catch (InterruptedException ex) {
                System.out.println("");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtpw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtun = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        butb1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        butb2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        bacgroundPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);

        jLayeredPane2.setBackground(new java.awt.Color(51, 204, 0));
        jLayeredPane2.setForeground(new java.awt.Color(0, 255, 0));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        jLayeredPane2.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 340, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\udesh\\Pictures\\5550.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLayeredPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 170));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Password");
        jLayeredPane2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        txtun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunActionPerformed(evt);
            }
        });
        txtun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtunKeyPressed(evt);
            }
        });
        jLayeredPane2.add(txtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 340, 40));

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("User Name");
        jLayeredPane2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 40));

        butb1.setBackground(new java.awt.Color(0, 204, 204));
        butb1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        butb1.setText("Sing in ");
        butb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butb1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butb1MouseExited(evt);
            }
        });
        butb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butb1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(butb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 40));

        jLayeredPane3.add(jLayeredPane2);
        jLayeredPane2.setBounds(190, 140, 560, 340);

        jLabel3.setFont(new java.awt.Font("Agency FB", 3, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Library Manegment System");
        jLayeredPane3.add(jLabel3);
        jLabel3.setBounds(170, 30, 580, 70);

        msg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.add(msg);
        msg.setBounds(0, 500, 330, 20);

        butb2.setBackground(new java.awt.Color(153, 0, 0));
        butb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        butb2.setText("X");
        butb2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        butb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butb2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butb2MouseExited(evt);
            }
        });
        butb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butb2ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(butb2);
        butb2.setBounds(850, 0, 50, 30);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 153));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 102));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);
        jLayeredPane3.add(jProgressBar1);
        jProgressBar1.setBounds(0, 520, 900, 20);

        bacgroundPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lbp.png"))); // NOI18N
        jLayeredPane3.add(bacgroundPhoto);
        bacgroundPhoto.setBounds(0, 0, 900, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunActionPerformed
      
        txtpw.grabFocus();
    }//GEN-LAST:event_txtunActionPerformed

    private void butb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butb2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_butb2ActionPerformed

    private void butb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butb1ActionPerformed
           singin();
       
      
    }//GEN-LAST:event_butb1ActionPerformed

    private void butb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butb1MouseClicked
        
    }//GEN-LAST:event_butb1MouseClicked

    private void butb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butb1MouseEntered
       butb1.setBackground(Color.BLUE);
    }//GEN-LAST:event_butb1MouseEntered

    private void butb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butb1MouseExited
      butb1.setBackground(new Color(0,204,204));

    }//GEN-LAST:event_butb1MouseExited

    private void butb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butb2MouseEntered
         butb2.setBackground(Color.black);
    }//GEN-LAST:event_butb2MouseEntered

    private void butb2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butb2MouseExited
        butb2.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_butb2MouseExited

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
      singin();       
    }//GEN-LAST:event_txtpwActionPerformed

    private void txtunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunKeyPressed
    if(evt.getKeyCode()==10){
     txtpw.grabFocus();
    
    }
    }//GEN-LAST:event_txtunKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            try {
          UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        } catch (Exception e) {
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new newlogin().setVisible(true);
            

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bacgroundPhoto;
    private javax.swing.JButton butb1;
    private javax.swing.JButton butb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables

 private void loadingProgressBar() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
        for (int i = 0; i <= 100; i++) {
            jProgressBar1.setValue(i);
            if(i==5){
            msg.setText("Database Chexking...!");
          
            }
            if(i>=20 && i<= 30){
            msg.setText("DB Connected");
            Thread.sleep(100);
            continue;
            }
            if(i==100){
            new mainmenu().setVisible(true);
            dispose();
            }
            Thread.sleep(20);
        }
                } catch(Exception e){}
            }
        });
       t.start();
    }

    private void singin() {
         try {
            String userName = txtun.getText();
            String password = new String(txtpw.getPassword());
          System.out.println(MD5.getMd5(password));
            String sql ="select * from logindb where username=? and password=?";
            Connection con = db.getNewConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, MD5.getMd5(password));
             ResultSet serch=ps.executeQuery();
            if(serch.next()){
            boolean isActive = serch.getBoolean("stat");
            if(isActive){
           SystemData.setCurrentUser(userName);
           SystemData.setEmployee(serch.getString("empid"));
          loadingProgressBar();
        
            }else{
                JOptionPane.showMessageDialog(this, "This user inActive");
            }
            }else{
             JOptionPane.showMessageDialog(this, "Invalid user name or password");
            }
       } catch (Exception e) {
        }      
        
       
    }
 
 
}
