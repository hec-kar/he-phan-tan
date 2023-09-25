/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexcercise;

import java.awt.event.KeyEvent;

/**
 *
 * @author Jack Phong
 */
public class Ex1Form extends javax.swing.JFrame {
    
    // declare global var
    
    long s1 = 0, s2 = 0, s = 0;
    boolean kt1 = false, kt2 = false;
    
    public class Tuyen extends Thread {
        int td;
        int[] arr;
        public Tuyen (int td, int[] arr ) {
            this.td = td;
            this.arr = arr;
        }
        
        public void run() {
            if (td == 1) {
                int n = arr.length;
                for (int i = 0; i < n/2; i++) {
                    s1 = s1 + arr[i];
                }
                firstThreadtxt.setText(String.valueOf(s1));
                kt1 = true;
            }
            if (td == 2) {
                int n = arr.length;
                for (int i = n/2; i < n; i++) {
                    s2 = s2 + arr[i];
                }
                secondThreadtxt.setText(String.valueOf(s2));
                kt2 = true;
            }
            if (td == 3) {
                while (true) {                    
                    if (kt1 == true && kt2 == true) {
                        s = s1 + s2;
                        resultTxt.setText(String.valueOf(s));
                        break;
                    }
                }
            }
        }
        
    }
    /**
     * Creates new form Ex1Form
     */
    public Ex1Form() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputArraytxt = new javax.swing.JTextField();
        firstThreadtxt = new javax.swing.JTextField();
        secondThreadtxt = new javax.swing.JTextField();
        resultTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tổng các phần tử");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 30));

        jLabel2.setText("Nhập vào một mảng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 30));

        jLabel3.setText("Kết quả của tuyến đoạn 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 30));

        jLabel4.setText("Kết quả của tuyến đoạn 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        inputArraytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputArraytxtKeyPressed(evt);
            }
        });
        getContentPane().add(inputArraytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 330, -1));

        firstThreadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstThreadtxtActionPerformed(evt);
            }
        });
        firstThreadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstThreadtxtKeyPressed(evt);
            }
        });
        getContentPane().add(firstThreadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 330, -1));
        getContentPane().add(secondThreadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 330, -1));
        getContentPane().add(resultTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 330, -1));

        jButton1.setText("Tính");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstThreadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstThreadtxtActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_firstThreadtxtActionPerformed

    private void firstThreadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstThreadtxtKeyPressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_firstThreadtxtKeyPressed

    private void inputArraytxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputArraytxtKeyPressed
       
    }//GEN-LAST:event_inputArraytxtKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String str = inputArraytxt.getText();
        String[] inputArr = str.split(";");
        int[] newIntArr = new int[inputArr.length];
        for (int i = 0 ;i < inputArr.length; i++) {
            newIntArr[i] = Integer.parseInt(inputArr[i]);
        }
        
        for (int i = 1; i <= 3; i++) {
            Tuyen t = new Tuyen(i, newIntArr);
            t.start();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ex1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex1Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstThreadtxt;
    private javax.swing.JTextField inputArraytxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JTextField secondThreadtxt;
    // End of variables declaration//GEN-END:variables
}