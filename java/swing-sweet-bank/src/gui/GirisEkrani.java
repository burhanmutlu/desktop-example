
package gui;

import database.DbConnection;
import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciGiris kullaniciGirisObject = null;

    private final String KIMLIK_TEXT_ORIGINAL = "T.C. No / Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL = "**********";
    
    public GirisEkrani() {
        initComponents();
        getEdits();
        DbConnection dbConnection = new DbConnection();
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null); // ortada olması için
        girisEkraniPanel.setFocusable(true);// başka yere odak yapmasın
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);
        System.out.print(getClass().getResource("../../images/settingsIcon.png"));
    }

    @Override
    public boolean bilgilerGecerliMi() {

        return !(this.kimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
        
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if(this.kullaniciGirisObject == null) {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SweetBank Giriş Ekranı");

        girisEkraniPanel.setBackground(new java.awt.Color(153, 255, 153));

        hosgeldinizLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hosgeldinizLabel.setForeground(new java.awt.Color(255, 51, 51));
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("SWEET BANKAYA HOŞGELDİNİZ");

        kimlikText.setForeground(new java.awt.Color(102, 102, 102));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });
        kimlikText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimlikTextActionPerformed(evt);
            }
        });

        sifreText.setForeground(new java.awt.Color(102, 102, 102));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        girisButton.setBackground(new java.awt.Color(153, 255, 255));
        girisButton.setText("Giriş");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        soruLabel.setText("Halen müşterimiz değil misiniz?");

        basvurButton.setBackground(new java.awt.Color(255, 153, 204));
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

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisButton)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(soruLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(basvurButton)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikText, sifreText});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(girisButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel)
                    .addComponent(basvurButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {girisButton, kimlikText, sifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void kimlikTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimlikTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kimlikTextActionPerformed

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        ButtonAyarlari.setBgFg(girisButton, Color.cyan, Color.blue);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(girisButton);
    }//GEN-LAST:event_girisButtonMouseExited

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.magenta, Color.green);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
       TextAyarlari.chechTheTextFocusGained(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.chechTheTextFocusGained(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.chechTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.chechTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        
        if(this.bilgilerGecerliMi()) {
            String musteriKimlik = this.kimlikText.getText().trim();
            String sifre = String.valueOf(this.sifreText.getPassword());
            girisYap(musteriKimlik, sifre);
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
        
    }//GEN-LAST:event_girisButtonActionPerformed

    private void girisYap(String musteriKimlik, String sifre) {
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);
        
        if(getKullaniciGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Giriş bilgileri doğru değildir!\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
        
    }
    

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButton;
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
