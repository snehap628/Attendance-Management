/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Iqbal-Asi
 */
public class AdminFrame extends javax.swing.JFrame {
ConnectClass c;
    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        c = new ConnectClass();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/attendancems_with_prepared22/Project_Images/Logo.png")));
        setResizable(false);
        
        setTitle("Admin Panel");
        
        DateFormat dateFormat = new SimpleDateFormat("EEEE',' dd MMMMMM yyyy");
        //get current date with Date()
        Date date = new Date();
        jLabeldate.setText(dateFormat.format(date).toString());
        
        Thread t = new Thread(){
        
            /**
             * @override
             */
            public void run() {
              for (;;){
                  try {
                      sleep(1000);
                  } catch (InterruptedException ex) {
                      System.out.println(ex.toString());
                  }
                  SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
                  Calendar cal = Calendar.getInstance();
                  jLabeltime.setText(time.format(cal.getTime()));
                  
              }
          }  
        };
        
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Vertical_Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        Horizontal_Panel = new javax.swing.JPanel();
        jLabeldate = new javax.swing.JLabel();
        jLabeltime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(990, 550));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(990, 550));

        jPanel1.setLayout(null);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/StudentButton.png"))); // NOI18N
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(520, 50, 260, 230);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/teacherButton.png"))); // NOI18N
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(260, 50, 260, 230);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/BatchButton.png"))); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(260, 280, 260, 230);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/reportButton.png"))); // NOI18N
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(520, 280, 260, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(990, 550));
        jLabel2.setMinimumSize(new java.awt.Dimension(990, 550));
        jLabel2.setPreferredSize(new java.awt.Dimension(990, 550));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 990, 550);

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 550);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(200, 100, 990, 550);

        Vertical_Panel.setBackground(new java.awt.Color(0, 102, 102));
        Vertical_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Vertical_Panel.setMaximumSize(new java.awt.Dimension(800, 100));
        Vertical_Panel.setMinimumSize(new java.awt.Dimension(800, 100));
        Vertical_Panel.setPreferredSize(new java.awt.Dimension(800, 100));
        Vertical_Panel.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Panel");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Vertical_Panel.add(jLabel5);
        jLabel5.setBounds(50, 20, 90, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton4);
        jButton4.setBounds(30, 390, 140, 40);

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton11.setText("DASHBOARD");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton11);
        jButton11.setBounds(30, 60, 140, 40);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton12.setText("TEACHER");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton12);
        jButton12.setBounds(30, 150, 140, 40);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton13.setText("STUDENT");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton13);
        jButton13.setBounds(30, 210, 140, 40);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton14.setText("BATCH");
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton14);
        jButton14.setBounds(30, 270, 140, 40);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton15.setText("REPORT");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Vertical_Panel.add(jButton15);
        jButton15.setBounds(30, 330, 140, 40);

        getContentPane().add(Vertical_Panel);
        Vertical_Panel.setBounds(0, 100, 200, 550);

        Horizontal_Panel.setBackground(new java.awt.Color(0, 102, 102));
        Horizontal_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Horizontal_Panel.setLayout(null);

        jLabeldate.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(255, 255, 255));
        Horizontal_Panel.add(jLabeldate);
        jLabeldate.setBounds(1000, 70, 190, 30);

        jLabeltime.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabeltime.setForeground(new java.awt.Color(255, 255, 255));
        Horizontal_Panel.add(jLabeltime);
        jLabeltime.setBounds(1080, 40, 110, 30);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance Management System");
        Horizontal_Panel.add(jLabel1);
        jLabel1.setBounds(270, 20, 700, 70);

        getContentPane().add(Horizontal_Panel);
        Horizontal_Panel.setBounds(0, 0, 1190, 100);

        setSize(new java.awt.Dimension(1206, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ReportInternalFrame rif = new ReportInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(rif);
        rif.show();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            int response = JOptionPane.showConfirmDialog(null, "You have clicked Exit. \n Do you want to close the window?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if (response == JOptionPane.YES_OPTION) {

                LoginFrame lf = new LoginFrame();
                lf.show();
                this.dispose();
            } else if (response == JOptionPane.NO_OPTION) {
            } else if (response == JOptionPane.CLOSED_OPTION) {
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        NewJStudentInternalFrame  std = new NewJStudentInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(std);
        std.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        NewTeacherInternalFrame ttdf = new NewTeacherInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ttdf);
        ttdf.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        NewBatchInternalFrame btdf = new NewBatchInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(btdf);
        btdf.show();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.add(jPanel1);
        jPanel1.show();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         NewTeacherInternalFrame ttdf = new NewTeacherInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ttdf);
        ttdf.show();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        NewJStudentInternalFrame  std = new NewJStudentInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(std);
        std.show();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        NewBatchInternalFrame btdf = new NewBatchInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(btdf);
        btdf.show();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        ReportInternalFrame rif = new  ReportInternalFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(rif);
        rif.show();
    }//GEN-LAST:event_jButton15ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //Default Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Horizontal_Panel;
    private javax.swing.JPanel Vertical_Panel;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabeltime;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
