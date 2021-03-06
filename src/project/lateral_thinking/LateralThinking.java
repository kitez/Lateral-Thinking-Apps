/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lateral_thinking;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kitez
 */
public class LateralThinking extends javax.swing.JFrame {

    /**
     * Creates new form LateralThinkingAppsUI
     */
    public LateralThinking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKocok = new javax.swing.JButton();
        mnBar = new javax.swing.JMenuBar();
        mnAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKocok.setText("Kocok Gan");
        btnKocok.setToolTipText("Kocok kata-kata yang ada di text file");
        btnKocok.setName("btnKocok"); // NOI18N
        btnKocok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKocokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnKocok)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnKocok, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        mnAbout.setText("About");
        mnAbout.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnAboutMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        mnBar.add(mnAbout);

        setJMenuBar(mnBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKocokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKocokActionPerformed
        try {
            KocokKata();
        } catch (FileNotFoundException ex) {
            formatException(this, ex);
        }
    }//GEN-LAST:event_btnKocokActionPerformed

    private void mnAboutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnAboutMenuSelected
        JOptionPane.showMessageDialog(this, "Aplikasi ini dibuat sebagai implementasi dari Lateral Thinking."
                + "Info lebih lanjut silahkan lihat di http://bugelmas.com", "Tentang Aplikasi", 1);
    }//GEN-LAST:event_mnAboutMenuSelected

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
            java.util.logging.Logger.getLogger(LateralThinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LateralThinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LateralThinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LateralThinking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LateralThinking().setVisible(true);
            }
        });
    }
    
    //method print error ke JOptionPane
    public static void formatException (Component component, Exception ex) {
        StringBuilder sb = new StringBuilder("Error: ");
            sb.append(ex.getMessage());
            sb.append("\n");
            for (StackTraceElement ste : ex.getStackTrace()) {
                sb.append(ste.toString());
                sb.append("\n");
            }
            JTextArea jta = new JTextArea(sb.toString());
            JScrollPane jsp = new JScrollPane(jta){
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(480, 320);
                }
            };
            JOptionPane.showMessageDialog(
                null, jsp, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /** show an Exception in a modal dialog 
    public static void showExceptionMessage(Component component,Exception ex)
    {
        StringWriter stringWriter=new StringWriter();
        PrintWriter printWriter=new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        JOptionPane.showMessageDialog(component,stringWriter.toString().replace('\t',' ').replace('\r',' '),"Internal Error",JOptionPane.ERROR_MESSAGE);
    }*/
    
    /**
     *Method untuk mengacak kata yang ada di text file
     */
    public void KocokKata() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Resource/words.txt")));
        List<String> lines = new ArrayList<String>();
        try {
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null) {
                lines.add(sCurrentLine);
                sCurrentLine = br.readLine();
            }
        } catch (IOException e) {
            formatException(this, e);
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                formatException(this, ex);
            }
        }
        Random r = new Random();
        String randomString = lines.get(r.nextInt(lines.size()));
        JOptionPane.showMessageDialog(this, randomString);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKocok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnAbout;
    private javax.swing.JMenuBar mnBar;
    // End of variables declaration//GEN-END:variables
}
