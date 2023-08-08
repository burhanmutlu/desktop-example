/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;

public class ParaCekmeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController{

    private ParaCekme paraCekmeObject = null;
            
    private int cekilecekMiktar = 0;
    
    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraCekmeEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(cekilecekMiktarText);
        TextAyarlari.setMaxLimit(cekilecekMiktarText, 4);
        this.paraCekmeHgLabel.setText(this.getHesapBilgileri().getAdSoyad());
        this.bakiye.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.cekilecekMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if(this.paraCekmeObject == null) {
            paraCekmeObject = new ParaCekme();
        }
        return paraCekmeObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        paraCekmeHgLabel = new javax.swing.JLabel();
        bilgilendirmeParaCekmeLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiye = new javax.swing.JLabel();
        cekeceginizMiktarLabel = new javax.swing.JLabel();
        cekilecekMiktarText = new javax.swing.JTextField();
        paraCekButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paraCekmeHgLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        paraCekmeHgLabel.setForeground(new java.awt.Color(255, 51, 51));
        paraCekmeHgLabel.setText("Sayın [Kullanıcı Adı]");

        bilgilendirmeParaCekmeLabel.setText("Tek seferde 5bin tl ve altı ekleyebilirsiniz.");

        toplamBakiyenizLabel.setText("Toplam Bakiyeniz: ");

        bakiye.setText("[Bakiye]");

        cekeceginizMiktarLabel.setText("Çekeceğiniz Miktar: ");

        paraCekButton.setText("Para Çek");
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon("D:\\gitRepo\\SweetBank\\src\\gui\\iconlar\\previousIcon.png")); // NOI18N
        geriIcon.setText(" ");

        javax.swing.GroupLayout paraCekmeEkraniPanelLayout = new javax.swing.GroupLayout(paraCekmeEkraniPanel);
        paraCekmeEkraniPanel.setLayout(paraCekmeEkraniPanelLayout);
        paraCekmeEkraniPanelLayout.setHorizontalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paraCekmeHgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bilgilendirmeParaCekmeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(paraCekButton)
                                            .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        paraCekmeEkraniPanelLayout.setVerticalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(28, 28, 28)
                .addComponent(paraCekmeHgLabel)
                .addGap(43, 43, 43)
                .addComponent(bilgilendirmeParaCekmeLabel)
                .addGap(37, 37, 37)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel)
                    .addComponent(bakiye))
                .addGap(23, 23, 23)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekeceginizMiktarLabel)
                    .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(paraCekButton)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        // TODO add your handling code here:
        
        if(this.bilgilerGecerliMi()) {
            this.paraCek();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
        
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraCek() {
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        
        if(getParaCekmeObject().paraCekildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para çekmek işlemi tamamlandı.\n"
                    + "Çekilen miktar:" + this.cekilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiye;
    private javax.swing.JLabel bilgilendirmeParaCekmeLabel;
    private javax.swing.JLabel cekeceginizMiktarLabel;
    private javax.swing.JTextField cekilecekMiktarText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JLabel paraCekmeHgLabel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
