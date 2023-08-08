package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
//ctrl+shift+i importları ekliyor 
//alt+shift+f kodları düzenliyor

public class TextAyarlari {

    private static String originalText;
    private static Color originalFgColor;

    public static void chechTheTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }

        textField.setForeground(Color.blue);
    }

    public static void chechTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.black);
        }
    }

    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();// geçersiz kılar karakteri
                }
            }

        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)) {
                    e.consume();// geçersiz kılar karakteri
                }
            }

        });
    }

    private static int limit;

    public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) return;
                if((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a);
                }
            }
        });
    }
    
    public static boolean uzunlukSundanKucukMu(int length, String str) {
        return (str.length() < length);
    }
    
    
    public static boolean textAlanlariDolumu(JPanel panel) {
        Component[] components = panel.getComponents();
        
        for(Component c:components) {
            if(c instanceof JTextField) {
                JTextField textField = (JTextField)c;
                if(textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }

}
