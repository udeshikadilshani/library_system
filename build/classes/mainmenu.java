
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udesh
 */
public class mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form mainmenu
     */
    public mainmenu() {
        initComponents();
        screensize();
        txtbi.setEditable(false);
        txtbc.setEditable(false);
         try {
            Image icone =Toolkit.getDefaultToolkit().getImage("C:\\Users\\udesh\\Pictures\\loicone.jpg");
            setIconImage(icone);
        } catch (Exception e) {
        }
       Toolkit tk = Toolkit.getDefaultToolkit();  
     int xSize = ((int) tk.getScreenSize().getWidth());  
     int ySize = ((int) tk.getScreenSize().getHeight());
             System.out.println(xSize);
               System.out.println(ySize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        txtbna = new javax.swing.JTextField();
        txtbi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbc = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbnaActionPerformed(evt);
            }
        });
        jLayeredPane3.add(txtbna, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 390, 30));

        txtbi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiActionPerformed(evt);
            }
        });
        jLayeredPane3.add(txtbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 390, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Book ID");
        jLabel10.setOpaque(true);
        jLayeredPane3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 200, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("BOOK NAME");
        jLabel11.setOpaque(true);
        jLayeredPane3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Avalable Book Count");
        jLabel12.setOpaque(true);
        jLayeredPane3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, 30));

        txtbc.setEditable(false);
        txtbc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbcActionPerformed(evt);
            }
        });
        jLayeredPane3.add(txtbc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 390, 30));

        jButton6.setBackground(new java.awt.Color(0, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, 40));

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("   Seach Book Count");
        jLabel9.setOpaque(true);
        jLayeredPane3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 580, 50));

        getContentPane().add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 750, 680));

        jLabel2.setBackground(new java.awt.Color(204, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("  SEWANA LIBRARY");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 70));

        jLabel7.setBackground(new java.awt.Color(0, 0, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("sewana@gmail.com");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Add Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 370, 40));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Book Issure");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 380, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("011-3322479 / 077-9781254");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 20));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Book Retrive");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 380, 40));

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Reprote");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 380, 40));

        jButton7.setBackground(new java.awt.Color(255, 0, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 0));
        jButton7.setText("LOGOUT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 100, 60));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Member Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 360, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO 100/A,Kaleliya,");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nittabuwa");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 210));

        jLabel8.setBackground(new java.awt.Color(0, 0, 102));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 750));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 56, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\udesh\\Pictures\\libmain.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -2, 1380, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new member_register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new ADDB().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new issuru_book().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new retrue().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbcActionPerformed
        txtbc.setEditable(false);

    }//GEN-LAST:event_txtbcActionPerformed

    private void txtbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiActionPerformed
        txtbi.setEditable(false);
    }//GEN-LAST:event_txtbiActionPerformed

    private void txtbnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbnaActionPerformed
        try {
            ResultSet serch = db.serch("select * from book_infro where name='"+txtbna.getText().toUpperCase()+"'");

            if(serch.next()){
               
                txtbi.setText(serch.getString("book_id"));
                txtbc.setText(serch.getString("qty"));
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }  
    }//GEN-LAST:event_txtbnaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtbna.setText(null);
        txtbi.setText(null);
        txtbc.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JTextField txtbc;
    private javax.swing.JTextField txtbi;
    private javax.swing.JTextField txtbna;
    // End of variables declaration//GEN-END:variables

    private void screensize() {
      
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
    
    

    }
}
