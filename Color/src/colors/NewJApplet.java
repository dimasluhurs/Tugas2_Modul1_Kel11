/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author DIMAS
 */

    
    public class NewJApplet extends javax.swing.JApplet {
    ImageIcon i;
    ImageIcon j;
    Boolean cek = true;
       public NewJApplet() {
   
       initComponents();
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dimas.jpg")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);

        ImageIcon myimage1=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mona.jpg")));
        Image img3=myimage1.getImage();
        Image img4=img3.getScaledInstance(jLabel2.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        j=new ImageIcon(img4);
        jLabel1.setIcon(i);
        jLabel2.setIcon(j);
        
    }
        /**
     * Creates new form NewJApplet
     */


    /**
     * Initializes the applet NewJApplet
     */
    @Override
    public void init() {
        
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
            java.util.logging.Logger.getLogger(NewJApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
  
    }
    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colors1 = new colors.Colors();
        colors21 = new colors2.Colors2();
        colors31 = new colors3.Colors3();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(null);
        getContentPane().add(colors1);
        colors1.setBounds(460, 510, 100, 100);
        getContentPane().add(colors21);
        colors21.setBounds(340, 510, 99, 99);
        getContentPane().add(colors31);
        colors31.setBounds(580, 510, 99, 99);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIMAS\\Pictures\\di.jpg")); // NOI18N
        jLabel2.setText("dimas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 40, 350, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Kuliah\\Semester 7\\Prak RSBK\\Modul 1\\Color\\src\\colors\\mona.jpg")); // NOI18N
        jLabel1.setText("mona");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 40, 360, 370);

        jButton2.setBackground(new java.awt.Color(255, 51, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pencet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                jButton2ActionPerformed1(evt);
                jButton2ActionPerformed2(evt);
                jButton2ActionPerformed3(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 600, 110, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIMAS\\Pictures\\sssss.jpg")); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1010, 655);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel1.setVisible(isVisible());
        colors1.change();
       colors21.change();
       colors31.change();
        if (cek){
            jLabel1.setIcon(i);
            jLabel2.setIcon(j);
            cek = false;
        }
        else {
            jLabel1.setIcon(j);
            jLabel2.setIcon(i);
            cek = true;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed1
        colors21.change();
    }//GEN-LAST:event_jButton2ActionPerformed1

    private void jButton2ActionPerformed2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed2
        colors31.change();
    }//GEN-LAST:event_jButton2ActionPerformed2

    private void jButton2ActionPerformed3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed3
        jLabel2.setVisible(isVisible());
    }//GEN-LAST:event_jButton2ActionPerformed3


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colors.Colors colors1;
    private colors2.Colors2 colors21;
    private colors3.Colors3 colors31;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}