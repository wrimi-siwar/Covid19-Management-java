/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Admin
 */
public class FrmAbout extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAbout
     */
    public FrmAbout() {
		 super("CORONAVIRUS PANDEMIC TRACKER " , 
                 true, //resizable
                 true, //closable
                 true, //maximizable
                 false);//iconifiable
	setBounds(100, 100, 700, 260);
		getContentPane().setLayout(null);
		JTextArea txt = new JTextArea();
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12,12, 200, 200); 
                ImageIcon img = new ImageIcon("images/isg.gif");
		lblNewLabel.setIcon(new ImageIcon(img.getImage().getScaledInstance(lblNewLabel.getWidth(), 
		lblNewLabel.getHeight(),java.awt.Image.SCALE_SMOOTH)));
                txt.setBounds(235,12, 417, 200); 
                txt.setAutoscrolls(true);
                txt.setEditable(false);
                Color c = new Color(200, 173, 127,100);
                txt.setBackground(c);

        txt.setText(
                       "La pandémie de Coronavirus de 2019-2020 est une pandémie d'une\n"
                     + "maladie infectieuse émergente, appelée Covid-19 et provoquée\n"
                     + "par le coronavirus SARS-CoV-2. Elle est apparue dans la ville\n"
                     + "de Wuhan, en Chine centrale au début du mois de décembre 2019. \n"
                     + "Des mesures spéciales sont entrain d’être actuellement mises en oeuvre\n"
                     + "par le gouvernement, dont la procédure de confinement général.Dans \n"
                     + "ce contexte, on souhaite développer une application de suivi détaillé\n"
                     + "de l’évolution de cette pandémie dans notre pays avec un suivi général\n"
                     + "de son évolution au niveau mondial.\n" );
		getContentPane().add(lblNewLabel);
		getContentPane().add(txt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setDefaultCloseOperation(FrmAbout.DISPOSE_ON_CLOSE);
        setTitle("About");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
