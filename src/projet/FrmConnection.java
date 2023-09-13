package projet;
import Services.ServiceConnection;
import connection.Connexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
public class FrmConnection extends javax.swing.JInternalFrame {
    
  
    public FrmConnection() {
        initComponents();
	setBounds(100, 100, 607, 270);
        ImageIcon img = new ImageIcon("images/cv1.png");
  		label.setBounds(0,0, 230, 230);	    
                label.setIcon(new ImageIcon(img.getImage().getScaledInstance(label.getWidth(),
                label.getHeight(),java.awt.Image.SCALE_SMOOTH)));
                erlog.setVisible(false);
                erpass.setVisible(false);
		    }
    
    
   

    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        tlog = new javax.swing.JTextField();
        tpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        erlog = new javax.swing.JLabel();
        erpass = new javax.swing.JLabel();

        setTitle("Connectez vous");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 214));

        tlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlogActionPerformed(evt);
            }
        });
        getContentPane().add(tlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 66, 260, 30));
        getContentPane().add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 136, 260, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Mot de passe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 114, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Connection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 177, 103, 50));

        erlog.setForeground(new java.awt.Color(204, 0, 0));
        erlog.setText("Required*");
        getContentPane().add(erlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 20));

        erpass.setForeground(new java.awt.Color(204, 0, 0));
        erpass.setText("Required*");
        getContentPane().add(erpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlogActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
erlog.setText("Required*");
ServiceConnection srv = new ServiceConnection();
erpass.setText("Required*");
erlog.setVisible(tlog.getText().equals(""));
erpass.setVisible(tpass.getText().equals(""));
if(!tpass.getText().equals("") && !tlog.getText().equals(""))
{   ServiceConnection.MyResult st = srv.loginTest(tlog.getText(),tpass.getText());
			    if(st.getFirst()!=-1 && st.getSecond()!=-1)
			    {
			    	Principale.admin = st.getFirst();
                                Principale.id = st.getSecond();
			    	dispose();
			    	
			    }
			    else
			    {
			    	tlog.setText("");
			    	tpass.setText("");
                                erlog.setVisible(st.getFirst()==-1);
                                erpass.setVisible(st.getSecond()==-1);
                                erlog.setText("Login Introuvable*");
                                erpass.setText("Mot de passe Introuvable*");

			    }
			   }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erlog;
    private javax.swing.JLabel erpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField tlog;
    private javax.swing.JPasswordField tpass;
    // End of variables declaration//GEN-END:variables
}
