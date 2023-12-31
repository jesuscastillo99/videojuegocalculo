/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Leonardo Coronado
 */
public class Nivel4v6 extends javax.swing.JFrame {
FondoPanel fondo= new FondoPanel();
    /**
     * Creates new form Nivel4v6
     */
    public Nivel4v6() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Nivel 4: Derivadas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jtxt1_n4v6 = new javax.swing.JTextField();
        b1_n4v6 = new javax.swing.JButton();
        jtxt2_n4v6 = new javax.swing.JTextField();
        jtxt3_n4v6 = new javax.swing.JTextField();
        jtxt4_n4v6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt1_n4v6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt1_n4v6ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt1_n4v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 30));

        b1_n4v6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        b1_n4v6.setText("FINALIZAR EJERCICIO");
        jPanel1.add(b1_n4v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 310, 44));
        jPanel1.add(jtxt2_n4v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, 30));
        jPanel1.add(jtxt3_n4v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 100, 30));
        jPanel1.add(jtxt4_n4v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nivel4/Nivel4v6.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt1_n4v6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt1_n4v6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt1_n4v6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Nivel4v6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel4v6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel4v6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel4v6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel4v6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b1_n4v6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jtxt1_n4v6;
    public javax.swing.JTextField jtxt2_n4v6;
    public javax.swing.JTextField jtxt3_n4v6;
    public javax.swing.JTextField jtxt4_n4v6;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen=new ImageIcon(getClass().getResource("/Nivel1/nivel1fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
