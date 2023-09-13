/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public final class Principale extends javax.swing.JFrame {

    private final JDesktopPane jDesktopPane1 = new JDesktopPane();
    private JButton btnDisconnect = new JButton();
    private JButton btntunisie = new JButton();
    private JButton btnAdmin = new JButton();
    private JButton btnHopitaucx = new JButton();
    private JButton btngovernorat = new JButton();
    private JButton btnpays = new JButton();
    private JButton btnAbout = new JButton();
    private JButton btncontinent = new JButton();

    private int connected = 0;
    public static int admin;
    public static int id;

    public void setConnected() {
        connected = 1;
        btntunisie.setEnabled(true);
        btnHopitaucx.setEnabled(true);
        btngovernorat.setEnabled(true);
        btnpays.setEnabled(true);
        btncontinent.setEnabled(true);
        btnDisconnect.setEnabled(true);

        if (admin == 1) {
            btnAdmin.setEnabled(true);
        }

        ImageIcon img = new ImageIcon("images/power-off.png");
        btnDisconnect.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    }

    public void setDisconnected() {
        connected = 0;
        btntunisie.setEnabled(false);
        btnHopitaucx.setEnabled(false);
        btnAdmin.setEnabled(false);
        btngovernorat.setEnabled(false);
        btnpays.setEnabled(false);
        btncontinent.setEnabled(false);
        btnDisconnect.setEnabled(false);

        ImageIcon img = new ImageIcon("images/power-on.png");
        btnDisconnect.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));

    }

    public Principale() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel north = new JPanel(new BorderLayout());
        north.add(createToolBar(), BorderLayout.PAGE_START);

        setDisconnected();

        createConnectFrame();

        btnDisconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDisconnect.setEnabled(false);
                if (connected == 0) {
                    createConnectFrame();
                } else {
                    setDisconnected();
                }
            }
        });

        btntunisie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btntunisie.setEnabled(false);
                btnHopitaucx.setEnabled(true);
                btngovernorat.setEnabled(true);
                btnpays.setEnabled(true);
                btncontinent.setEnabled(true);
                btnAdmin.setEnabled(true);
                btnAbout.setEnabled(true);
                createTunisieFrame();
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
                btnAbout.setEnabled(true);
                createContinentFrame();
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
                btnAbout.setEnabled(true);
                createHospitalFrame();
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
                btnAbout.setEnabled(true);
                createGovernoratFrame();
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
                btnAbout.setEnabled(true);
                createPaysFrame();
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
                btnAbout.setEnabled(true);
                createAdminFrame();
            }
        });

        btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (connected == 1) {
                    btnAbout.setEnabled(false);
                    btntunisie.setEnabled(true);
                    btnHopitaucx.setEnabled(true);
                    btngovernorat.setEnabled(true);
                    btnpays.setEnabled(true);
                    btncontinent.setEnabled(true);
                    btnDisconnect.setEnabled(true);
                }
                createAboutFrame();
            }
        });

        JFrame frame = new JFrame("Gestion de la pandemie...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(north, "North");
        frame.getContentPane().add(jDesktopPane1);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0, 0, screenSize.width, screenSize.height);
        frame.setVisible(true);

    }

    protected JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        ImageIcon img;

        // Btn
        toolBar.add(btnDisconnect);
        img = new ImageIcon("images/login.png");
        btnDisconnect.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btncontinent);
        img = new ImageIcon("images/monde.png");
        btncontinent.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btncontinent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btntunisie);
        img = new ImageIcon("images/tunisia.png");
        btntunisie.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btntunisie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnHopitaucx);
        img = new ImageIcon("images/hospital.png");
        btnHopitaucx.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnHopitaucx.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btngovernorat);
        img = new ImageIcon("images/government.png");
        btngovernorat.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btngovernorat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnpays);
        img = new ImageIcon("images/pays.png");
        btnpays.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnpays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    
        toolBar.add(btnAdmin);
        img = new ImageIcon("images/login.png");
        btnAdmin.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        toolBar.addSeparator();
        toolBar.addSeparator();
        btnAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        toolBar.add(btnAbout);
        img = new ImageIcon("images/about.png");
        btnAbout.setIcon(new ImageIcon(img.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        btnAbout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAdmin.setVisible(false);
        return toolBar;
    }

    protected void createAboutFrame() {
        FrmAbout fr = new FrmAbout();
        fr.setVisible(true);
        jDesktopPane1.add(fr);
        fr.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {

                btnAbout.setEnabled(true);
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameOpened(InternalFrameEvent arg0) {
            }
        });
    }

    protected void createAdminFrame() {
        FrmAdmin fr = new FrmAdmin();
        fr.setVisible(true);
        jDesktopPane1.add(fr);
        fr.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {

                btnAdmin.setEnabled(true);
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameOpened(InternalFrameEvent arg0) {
            }
        });
    }

    protected void createConnectFrame() {

        FrmConnection cnt = new FrmConnection();
        cnt.setLocation(463, 180);
        cnt.setVisible(true);
        jDesktopPane1.add(cnt);
        try {
            cnt.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        cnt.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        cnt.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                setConnected();

                if (admin == 1) {
                    btnAdmin.setVisible(true);
                } else {
                    btnAdmin.setVisible(false);
                }

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            cnt.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

    }

    protected void createContinentFrame() {
        FrmContinent fr = new FrmContinent();
        fr.setVisible(true);
        jDesktopPane1.add(fr);
        fr.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {

                btncontinent.setEnabled(true);
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent arg0) {
            }

            @Override
            public void internalFrameOpened(InternalFrameEvent arg0) {
            }
        });
    }

    protected void createGovernoratFrame() {
        FrmGouvernorat tn = new FrmGouvernorat();
        tn.setLocation(463, 180);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btngovernorat.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void createHospitalFrame() {
        FrmHopitale tn = new FrmHopitale();
        tn.setLocation(463, 180);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btnHopitaucx.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void createPaysFrame() {
        FrmPays tn = new FrmPays();
        tn.setLocation(463, 180);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btnpays.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    protected void createTunisieFrame() {
        FrmTunisie tn = new FrmTunisie();
        tn.setLocation(463, 180);
        tn.setVisible(true);
        jDesktopPane1.add(tn);
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }

        tn.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);

        tn.addInternalFrameListener(new InternalFrameListener() {

            @Override
            public void internalFrameOpened(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(final InternalFrameEvent e) {
                btntunisie.setEnabled(true);

            }

            @Override
            public void internalFrameIconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(final InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(final InternalFrameEvent e) {
            }
        });
        try {
            tn.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new NimbusLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                }
                new Principale();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
