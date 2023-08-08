/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;

/**
 *
 * @author Burhan Mutlu
 */
public final class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    /**
     * Creates new form HesapEkrani
     */
    public HesapEkrani() {
        initComponents();
        getEdits();
        this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText( String.valueOf(getHesapBilgileri().getBakiye()) );
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
    
        return HesapBilgileri.getInstance();
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        turkLirasiIcon = new javax.swing.JLabel();
        hosgeldinLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        paraCekIcon = new javax.swing.JLabel();
        paraCekButton = new javax.swing.JButton();
        paraYatırIcon = new javax.swing.JLabel();
        paraYatırButton = new javax.swing.JButton();
        havaleIcon = new javax.swing.JLabel();
        havaleButton = new javax.swing.JButton();
        odemelerIcon = new javax.swing.JLabel();
        odemelerButton = new javax.swing.JButton();
        ayarlarLabel = new javax.swing.JLabel();
        cikisLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hesapEkraniPanel.setBackground(new java.awt.Color(0, 204, 204));
        hesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        turkLirasiIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\turkishLiraIcon.png")); // NOI18N
        hesapEkraniPanel.add(turkLirasiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 170, -1));

        hosgeldinLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(204, 255, 255));
        hosgeldinLabel.setText("HOŞGELDİN");
        hesapEkraniPanel.add(hosgeldinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 139, 51));

        bakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(153, 0, 51));
        bakiyeLabel.setText("280000");
        hesapEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 130, 178, 125));

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");
        hesapEkraniPanel.add(kullaniciAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 306, -1));

        paraCekIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\withdrawIcon.png")); // NOI18N
        paraCekIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapEkraniPanel.add(paraCekIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 301, -1, -1));

        paraCekButton.setBackground(new java.awt.Color(102, 255, 255));
        paraCekButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraCekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 444, 125, -1));

        paraYatırIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\depositIcon.png")); // NOI18N
        paraYatırIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapEkraniPanel.add(paraYatırIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 301, -1, -1));

        paraYatırButton.setBackground(new java.awt.Color(102, 255, 255));
        paraYatırButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paraYatırButton.setText("Para Yatır");
        paraYatırButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatırButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatırButtonMouseExited(evt);
            }
        });
        paraYatırButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatırButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraYatırButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 444, 125, -1));

        havaleIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\transferIcon.png")); // NOI18N
        havaleIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapEkraniPanel.add(havaleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 301, -1, -1));

        havaleButton.setBackground(new java.awt.Color(102, 255, 255));
        havaleButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        havaleButton.setText("Havale");
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(havaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 444, 125, -1));

        odemelerIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\paymentsIcon.png")); // NOI18N
        odemelerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hesapEkraniPanel.add(odemelerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 301, -1, -1));

        odemelerButton.setBackground(new java.awt.Color(102, 255, 255));
        odemelerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        odemelerButton.setText("Ödemeler");
        odemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseExited(evt);
            }
        });
        odemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemelerButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(odemelerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 444, 125, -1));

        ayarlarLabel.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\settingsIcon.png")); // NOI18N
        ayarlarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayarlarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayarlarLabelMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(ayarlarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 70, 70));

        cikisLabel.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\logoutIcon.png")); // NOI18N
        cikisLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikisLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisLabelMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(cikisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton)c, Color.black, Color.white);
    }
    
    
    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(paraCekIcon, "withdrawIcon2");
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(paraCekIcon);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatırButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatırButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(paraYatirIcon, "depositIcon2");
    }//GEN-LAST:event_paraYatırButtonMouseEntered

    private void paraYatırButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatırButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(paraYatirIcon);
    }//GEN-LAST:event_paraYatırButtonMouseExited

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(havaleIcon);
    }//GEN-LAST:event_havaleButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(havaleIcon, "transferIcon2");
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void odemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(odemlerIcon, "paymentsIcon2");
    }//GEN-LAST:event_odemelerButtonMouseEntered

    private void odemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(odemelerIcon);
    }//GEN-LAST:event_odemelerButtonMouseExited

    
    
    private void paraYatırButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatırButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_paraYatırButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void odemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemelerButtonActionPerformed
        ActionAyarlari.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_odemelerButtonActionPerformed

    private void ayarlarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayarlarLabelMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_ayarlarLabelMouseClicked

    private void cikisLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisLabelMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_cikisLabelMouseClicked


    
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayarlarLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel cikisLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JButton odemelerButton;
    private javax.swing.JLabel odemelerIcon;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCekIcon;
    private javax.swing.JButton paraYatırButton;
    private javax.swing.JLabel paraYatırIcon;
    private javax.swing.JLabel turkLirasiIcon;
    // End of variables declaration//GEN-END:variables
}
