/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniSyllabus;

/**
 *
 * @author Israt Jahan
 */
public class CSE122 extends javax.swing.JFrame {

    /**
     * Creates new form CSE122
     */
    public CSE122() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        backToCover = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        firstSem = new javax.swing.JLabel();
        eng111 = new javax.swing.JLabel();
        javax.swing.JLabel background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setTabSize(6);
        jTextArea3.setText("Laboratory works based on CSE 121.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea3.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea3.setName(""); // NOI18N
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 130, 550, 100));

        backToCover.setBackground(new java.awt.Color(0, 102, 102));
        backToCover.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        backToCover.setForeground(new java.awt.Color(255, 255, 255));
        backToCover.setText("cover");
        backToCover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        backToCover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToCover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToCoverActionPerformed(evt);
            }
        });
        getContentPane().add(backToCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 60, 30));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniSyllabus/exit final.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, 20));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniSyllabus/minimize final.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 20));

        firstSem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstSem.setText("1st Year 2nd Semester");
        getContentPane().add(firstSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 20));

        eng111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng111.setText("CSE 122: Electrical Circuits Lab");
        eng111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(eng111, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 320, 20));

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 20));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 739));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToCoverActionPerformed
        new cover().setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_backToCoverActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(cover.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(CSE122.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSE122.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSE122.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSE122.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE122().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToCover;
    private javax.swing.JLabel eng111;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel firstSem;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
