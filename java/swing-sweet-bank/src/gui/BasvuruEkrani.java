/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {
    
    private KullaniciBasvuru kullaniciBasvuru = null;
    
    public BasvuruEkrani() {
        initComponents();
        getEdits();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        kisiselBilgilerLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        guvenlikBilgileriLabel = new javax.swing.JLabel();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox<>();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Başvuru Ekranı");

        basvuruEkraniPanel.setBackground(new java.awt.Color(204, 255, 153));

        kisiselBilgilerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kisiselBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel.setText("Kişisel Bilgiler");

        adSoyadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad:");

        adSoyadText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. No:");

        tcNoText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No:");

        telNoText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        guvenlikBilgileriLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guvenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgileriLabel.setText("Güvenlik Bilgileri");

        guvenlikSorusuLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvenlik Sorusu:");

        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "İlkokul soyadınızın adı nedir?", "Yaşamak istediğiniz yer neresidir?", "Ya da rastgele cümle girin (önerilir)." }));
        guvenlikSorusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guvenlikSorusuActionPerformed(evt);
            }
        });

        guvenlikCevapLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cevap:");

        guvenlikCevapText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        basvurButton.setBackground(new java.awt.Color(51, 255, 0));
        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kisiselBilgilerLabel)
                            .addComponent(guvenlikBilgileriLabel)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(basvurButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guvenlikBilgileriLabel, guvenlikCevapLabel, guvenlikSorusuLabel, kisiselBilgilerLabel});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adSoyadText, guvenlikCevapText, guvenlikSorusu, tcNoText});

        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(kisiselBilgilerLabel)
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoLabel)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(guvenlikBilgileriLabel)
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuLabel)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapLabel)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basvurButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadText, tcNoLabel, telNoLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);
    }
    
    public KullaniciBasvuru getKullaniciBasvuru() {
        if (this.kullaniciBasvuru == null) {
            kullaniciBasvuru = new KullaniciBasvuru();
        }
        return kullaniciBasvuru;
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPanel);
    }
    
    @Override
    public HesapBilgileri getHesapBilgileri() {
       return HesapBilgileri.getInstance();
    }
    

    private void guvenlikSorusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guvenlikSorusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guvenlikSorusuActionPerformed

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.black, Color.white);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        
        if (this.bilgilerGecerliMi()) {
            this.basvuruyuGerceklestir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
        
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void basvuruyuGerceklestir() {
       
        this.getKullaniciBasvuru().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciBasvuru().setTcNo(this.tcNoText.getText());
        this.getKullaniciBasvuru().setTelNo(this.telNoText.getText());
        
        this.getKullaniciBasvuru().setGuvenlikSorusu(String.valueOf(this.guvenlikSorusu.getSelectedItem()));
        this.getKullaniciBasvuru().setGuvenlikCevap(this.guvenlikCevapText.getText());
        
        this.getKullaniciBasvuru().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuru().setSifre(this.randomSifreAl());
        
        if (this.getKullaniciBasvuru().basvuruOnaylandiMi()) {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmiştir.\n"
                    + "Müşteri Numaranız: " + this.getKullaniciBasvuru().getMusteriNo()
                    + "\nŞifreniz: " + this.getKullaniciBasvuru().getSifre() );
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmemiştir.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
        
        
    }
    
    private String randomMusteriNoAl() {
        String musteriNo;
        do {
            musteriNo = String.valueOf(100000 + (int)(Math.random() * 9000000));
        } while(this.getKullaniciBasvuru().musteriNoTablodaVarMi());
         return musteriNo;
        
       
    }
    
    private String randomSifreAl() {
        String sifre;
        sifre = String.valueOf(1000 +(int)(Math.random() * 90000));
        return sifre;
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel guvenlikBilgileriLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JComboBox<String> guvenlikSorusu;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
