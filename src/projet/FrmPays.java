package projet;

import Services.ServicePays;
import javafx.scene.layout.BorderRepeat;
import org.jfree.chart.ChartPanel;

public class FrmPays extends javax.swing.JInternalFrame {

    ServicePays srv = new ServicePays();

    public final void refrech() {

    }

    public FrmPays() {
        initComponents();
        refrech();
        jPanel1.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(FrmPays.DISPOSE_ON_CLOSE);
        setTitle("Pays");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(836, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Total cas  par pays");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        jButton2.setText("Nouveaux cas Par date et pays");
        jButton2.setActionCommand("Nouvel cas Par date et pays");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        jPanel1.setAutoscrolls(true);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 610, 310));

        jButton3.setText("Total cas  par date et pays");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, -1));

        jButton4.setText("Nouveaux cas par date");
        jButton4.setActionCommand("Nouvels cas par pays");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, -1));

        jButton5.setText("Nouveaux cas par pays");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        jButton6.setText("Total cas  par date");
        jButton6.setActionCommand("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, -1));

        jButton7.setText("Total décès Par date et pays");
        jButton7.setActionCommand("Nouvel cas Par date et pays");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, -1));

        jButton8.setText("Total décès cas par date");
        jButton8.setActionCommand("Nouvels cas par pays");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, -1));

        jButton9.setText("Total décès par pays");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 200, -1));

        jButton10.setText("Nvl décès Par date et pays");
        jButton10.setActionCommand("Nouvel cas Par date et pays");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, -1));

        jButton11.setText("Nvl décès cas par date");
        jButton11.setActionCommand("Nouvels cas par pays");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, -1));

        jButton12.setText("Nvl décès par pays");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvels_cas_d_p();
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
             }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_cas_p();
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_cas_d_p();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_cas_d();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvels_cas_p();
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

       jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvels_cas_d();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_deces_d_p();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_deces_d();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    jPanel1.setVisible(false);
        ChartPanel Chart = srv.total_deces_p();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvel_deces_d_p();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvel_deces_d();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   jPanel1.setVisible(false);
        ChartPanel Chart = srv.nouvel_deces_p();
        Chart.setMouseWheelEnabled(true);
        jPanel1.removeAll();
        jPanel1.add(Chart, BorderRepeat.STRETCH);
        jPanel1.validate();
        Chart.setVisible(true);
        jPanel1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
