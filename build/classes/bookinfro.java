
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udesh
 */
public class bookinfro extends javax.swing.JFrame {

    /**
     * Creates new form bookinfro
     */
    public bookinfro() {
        initComponents();
        tableSetins();
        screensize();
        $bi.setText("BI");
        loadtable();
         try {
            Image icone =Toolkit.getDefaultToolkit().getImage("C:\\Users\\udesh\\Pictures\\loicone.jpg");
            setIconImage(icone);
        } catch (Exception e) {
        }
    }
 private void screensize() {
      
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      

    }
 
 private void tableSetins(){
    jTable1.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
  jTable1 .getTableHeader().setOpaque(false);
    jTable1.getTableHeader().setBackground(Color.YELLOW);
    jTable1.getTableHeader().setForeground(Color.BLACK);
    jTable1.setRowHeight(50);
    jTable1.setFont(new Font ("Arial",Font.BOLD,13));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        $bi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1090, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 371, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 255, 0));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Categary", "Auther", "Price", "QRT", "save_date"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 1120, 410));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Load Book Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 50));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Remove Select Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 280, 50));

        jButton3.setBackground(new java.awt.Color(255, 0, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Seach Book Detail Use Book ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 360, 50));

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Remove All Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 280, 50));

        jButton5.setBackground(new java.awt.Color(153, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1093, 600, 240, 50));

        $bi.setBackground(new java.awt.Color(0, 204, 51));
        $bi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        $bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                $biActionPerformed(evt);
            }
        });
        $bi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                $biKeyTyped(evt);
            }
        });
        getContentPane().add($bi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 270, 40));

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\udesh\\Pictures\\s.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
     ResultSet rs = db.serch("select * from book_infro where book_id='"+$bi.getText().toUpperCase()+"'");
         DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
         dtm.setRowCount(0);
         while(rs.next()){
         Vector v =new Vector ();
          v.add(rs.getString("book_id"));
         v.add(rs.getString("name"));
          v.add(rs.getString("price"));
           v.add(rs.getString("auther"));
            v.add(rs.getString("catorgray"));
            v.add(rs.getString("qty"));
             v.add(rs.getString("register_date"));
            dtm.addRow(v);
         
         }
         $bi.setText(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       try {
      ResultSet rs = db.serch("select * from book_infro");
         DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
         dtm.setRowCount(0);
         while(rs.next()){
         Vector v =new Vector ();
         v.add(rs.getString("book_id"));
         v.add(rs.getString("name"));
          v.add(rs.getString("price"));
           v.add(rs.getString("auther"));
            v.add(rs.getString("catorgray"));
            v.add(rs.getString("qty"));
             v.add(rs.getString("register_date"));
            dtm.addRow(v);
         
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void $biActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_$biActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_$biActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new ADDB().setVisible(true);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
             DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
           int selectedRow =  jTable1.getSelectedRow();
           dtm.removeRow(selectedRow);
             
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void $biKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_$biKeyTyped
         if($bi.getText().length()==7){
        evt.consume();
      }
       if($bi.getText().toUpperCase().contains("BI")){
           char keyChar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keyChar);
        if(!isDigit){
        evt.consume();
        }
      }
    }//GEN-LAST:event_$biKeyTyped

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
            java.util.logging.Logger.getLogger(bookinfro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookinfro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookinfro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookinfro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookinfro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField $bi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
         try {
      ResultSet rs = db.serch("select * from book_infro");
         DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
         dtm.setRowCount(0);
         while(rs.next()){
         Vector v =new Vector ();
         v.add(rs.getString("book_id"));
         v.add(rs.getString("name"));
          v.add(rs.getString("price"));
           v.add(rs.getString("auther"));
            v.add(rs.getString("catorgray"));
            v.add(rs.getString("qty"));
             v.add(rs.getString("register_date"));
            dtm.addRow(v);
         
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
