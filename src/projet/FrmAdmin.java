/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class FrmAdmin extends javax.swing.JInternalFrame {

    private JButton btntunisie = new JButton();
    private JButton btnAdmin = new JButton();
    private JButton btnHopitaucx = new JButton();
    private JButton btngovernorat = new JButton();
    private JButton btnpays = new JButton();
    private JButton btncontinent = new JButton();
    
    public FrmAdmin() {
   initComponents();

   setLayout(new BorderLayout());
	
        JPanel north = new JPanel(new BorderLayout());
        north.add(createToolBar(), BorderLayout.PAGE_START);


        btntunisie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btntunisie.setEnabled(false);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
                btncontinent.setEnabled(true);
                btnAdmin.setEnabled(true);
            }

        });

        btncontinent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btncontinent.setEnabled(false);
                btntunisie.setEnabled(true);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
                btnAdmin.setEnabled(true);
            }
        });

        btnHopitaucx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHopitaucx.setEnabled(false);
                btntunisie.setEnabled(true);
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
                btncontinent.setEnabled(true);
                btnAdmin.setEnabled(true);
            }
        });

        btngovernorat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btngovernorat.setEnabled(false);
                btntunisie.setEnabled(true);
                btnHopitaucx.setEnabled(true);
                btnpays.setEnabled(true);
                btncontinent.setEnabled(true);
                btnAdmin.setEnabled(true);
            }
        });

        btnpays.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnpays.setEnabled(false);
                btntunisie.setEnabled(true);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                btncontinent.setEnabled(true);
                btnAdmin.setEnabled(true);
            }
        });

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAdmin.setEnabled(false);
                btntunisie.setEnabled(true);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
                btncontinent.setEnabled(true);
            }
        });
       
        getContentPane().setLayout(new BorderLayout());
        JToolBar menu = createToolBar();
        getContentPane().add(menu, BorderLayout.PAGE_START);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        }

        protected JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        
        JLabel background=new JLabel(new ImageIcon("images/back.jpg"));
	getContentPane().add(background);
	background.setLayout(new FlowLayout());  

        // Btn
        ImageIcon img;
        toolBar.add(btncontinent);
        img = new ImageIcon("images/mondel1.png");
        btncontinent.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btncontinent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btntunisie);
        img = new ImageIcon("images/tunisia1.png");
        btntunisie.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btntunisie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnHopitaucx);
        img = new ImageIcon("images/hospital1.png");
        btnHopitaucx.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnHopitaucx.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btngovernorat);
        img = new ImageIcon("images/government1.png");
        btngovernorat.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btngovernorat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnpays);
        img = new ImageIcon("images/pays1.png");
        btnpays.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        final Pane rightSpacer = new Pane();
        HBox.setHgrow(
                rightSpacer,
                Priority.SOMETIMES
        );
        btnpays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        toolBar.add(Box.createHorizontalStrut(320)); 
        affichedate(); 
        toolBar.add(datelab);  
   
        return toolBar;
    }
    private void affichedate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelab.setText(s.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datelab = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setDefaultCloseOperation(FrmAdmin.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        datelab.setForeground(new java.awt.Color(255, 0, 0));
        datelab.setText("01-01-2020");
        datelab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datelab.setName("datelab"); // NOI18N
        getContentPane().add(datelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, 45));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\projet\\images\\back.jpg")); // NOI18N
        background.setName("background"); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 854, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel datelab;
    // End of variables declaration//GEN-END:variables
}
