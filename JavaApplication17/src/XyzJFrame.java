/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author anarky
 */
import java.util.Date;
import javax.swing.JFrame;
public class XyzJFrame extends javax.swing.JFrame {
    
    

    

    /**
     * Creates new form XyzJFrame
     */
    public XyzJFrame() {
        
      
        
     
        initComponents();
      
        
     
        setExtendedState(JFrame.NORMAL);

        // Maximize the frame
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
      
       
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Total4 = new javax.swing.JLabel();
        BackToHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RoomC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RoomA = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        RoomB = new javax.swing.JButton();
        RoomD = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Total1 = new javax.swing.JLabel();
        Total3 = new javax.swing.JLabel();
        Total2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Room for 2 adults");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1080, 350, 210, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Available Rooms");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 140, 419, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Room #1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 310, 210, 30);

        Total4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Total4.setText("Total price: ");
        getContentPane().add(Total4);
        Total4.setBounds(1090, 710, 260, 30);

        BackToHome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BackToHome.setText("Back to Home");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(BackToHome);
        BackToHome.setBounds(1458, 120, 179, 39);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Room #4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1090, 560, 210, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Room for 1 Family");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1090, 610, 210, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Price per night: 3200 PHP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 680, 210, 30);

        RoomC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RoomC.setText("Book");
        RoomC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCActionPerformed(evt);
            }
        });
        getContentPane().add(RoomC);
        RoomC.setBounds(1120, 470, 122, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Room #3");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1080, 310, 210, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Room for 1 adult");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(550, 350, 210, 30);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Price per night: 3200 PHP");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1080, 390, 210, 30);

        RoomA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RoomA.setText("Book");
        RoomA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomAActionPerformed(evt);
            }
        });
        getContentPane().add(RoomA);
        RoomA.setBounds(550, 480, 122, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Room #2");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 570, 118, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Room for 2 adults");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 610, 179, 30);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Price per night: 5200 PHP");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1090, 680, 210, 30);

        RoomB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RoomB.setText("Book");
        RoomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomBActionPerformed(evt);
            }
        });
        getContentPane().add(RoomB);
        RoomB.setBounds(570, 760, 122, 30);

        RoomD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RoomD.setText("Book");
        RoomD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomDActionPerformed(evt);
            }
        });
        getContentPane().add(RoomD);
        RoomD.setBounds(1100, 760, 122, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Price per night: 2000 PHP");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 390, 260, 30);

        Total1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Total1.setText("Total price: ");
        getContentPane().add(Total1);
        Total1.setBounds(550, 420, 260, 30);

        Total3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Total3.setText("Total price: ");
        getContentPane().add(Total3);
        Total3.setBounds(1080, 430, 260, 30);

        Total2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Total2.setText("Total price: ");
        getContentPane().add(Total2);
        Total2.setBounds(550, 710, 260, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
 this.dispose();

    // Open the MainJFrame
    MainJFrame mainJFrame = new MainJFrame();
    mainJFrame.setVisible(true);        
        // TODO add your handling code here
      
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void RoomCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCActionPerformed
        // TODO add your handling code here:
        ThirdJFrame thirdJFrame = new ThirdJFrame("Room 3", "2 adults", "3200 PHP");
    thirdJFrame.setVisible(true);
     dispose(); 
    }//GEN-LAST:event_RoomCActionPerformed

    private void RoomAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomAActionPerformed
        // TODO add your handling code here:
       // Redirect to ThirdJFrame with room information
    ThirdJFrame thirdJFrame = new ThirdJFrame("Room 1", "1 adult", "2000 PHP");
    thirdJFrame.setVisible(true);
    
    this.dispose();
        
    }//GEN-LAST:event_RoomAActionPerformed

    private void RoomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomBActionPerformed
        // TODO add your handling code here:
         ThirdJFrame thirdJFrame = new ThirdJFrame("Room 2", "2 adults", "3200 PHP");
    thirdJFrame.setVisible(true);
     dispose(); 
    }//GEN-LAST:event_RoomBActionPerformed

    private void RoomDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomDActionPerformed
        // TODO add your handling code here:
         ThirdJFrame thirdJFrame = new ThirdJFrame("Room 4", "1 Family", "5200 PHP");
    thirdJFrame.setVisible(true);
     dispose(); 
    }//GEN-LAST:event_RoomDActionPerformed

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
            java.util.logging.Logger.getLogger(XyzJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XyzJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XyzJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XyzJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XyzJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton RoomA;
    private javax.swing.JButton RoomB;
    private javax.swing.JButton RoomC;
    private javax.swing.JButton RoomD;
    private javax.swing.JLabel Total1;
    private javax.swing.JLabel Total2;
    private javax.swing.JLabel Total3;
    private javax.swing.JLabel Total4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
