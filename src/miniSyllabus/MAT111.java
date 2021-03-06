/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniSyllabus;

/**
 *
 * @author Israt Jahan
 */
public class MAT111 extends javax.swing.JFrame {

    /**
     * Creates new form MAT111
     */
    public MAT111() {
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

        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        backToCover = new javax.swing.JButton();
        firstSem = new javax.swing.JLabel();
        eng111 = new javax.swing.JLabel();
        BooksRec = new javax.swing.JLabel();
        Vocabulary = new javax.swing.JLabel();
        Grammer = new javax.swing.JLabel();
        Reading = new javax.swing.JLabel();
        Spoken = new javax.swing.JLabel();
        Grammer1 = new javax.swing.JLabel();
        Grammer2 = new javax.swing.JLabel();
        Grammer3 = new javax.swing.JLabel();
        Grammer4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniSyllabus/minimize final.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 20));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniSyllabus/exit final.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, 20));

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

        firstSem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstSem.setText("1st Year 1st Semester");
        getContentPane().add(firstSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 20));

        eng111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng111.setText("MAT 111: Differential and Integral Calculus");
        eng111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(eng111, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 320, 20));

        BooksRec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BooksRec.setText("Books Recommended:");
        getContentPane().add(BooksRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 20));

        Vocabulary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vocabulary.setText("Expansions of functions:");
        getContentPane().add(Vocabulary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, -1, 20));

        Grammer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer.setText("Partial Differentiation:");
        getContentPane().add(Grammer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 325, 160, 20));

        Reading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reading.setText("Ordinary Differentiation:");
        getContentPane().add(Reading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, 170, 20));

        Spoken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Spoken.setText("Functions:");
        getContentPane().add(Spoken, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 128, 80, 20));

        Grammer1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer1.setText("Maximum and minimum of functions of one variable.");
        getContentPane().add(Grammer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 380, 20));

        Grammer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer2.setText("Infinite Integrals:");
        getContentPane().add(Grammer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 362, 160, 20));

        Grammer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer3.setText("Definite Integrals:");
        getContentPane().add(Grammer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 415, 160, 20));

        Grammer4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer4.setText("Multiple Integrals:");
        getContentPane().add(Grammer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 469, 160, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(6);
        jTextArea4.setText("1. B. C. Das &           :  Differential Calculus, U. N. Dhur & Sons\n    B. N. Mukherjee\n\n2. B. C. Das &           :  Integral Calculus, U. N. Dhur & Sons\n    B. N. Mukherjee\n\n3. F. Ayres & Elliot     :  Calculus (Schaum's Outline Series), McGraw-Hill\n    Mendelson             \n                                     \n4. Joseph Edwards    :  Differential Calculus, Kessinger Publishing\n\n5. Md. Abdul Latif &    : Differential Calculus, Chandaapure, Chittagong\n    S. Bhattacharjee");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jTextArea4.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea4.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea4.setName(""); // NOI18N
        jTextArea4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea4.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 540, 550, 120));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setTabSize(6);
        jTextArea3.setText("                    Domain, Range, Invers function and graphs of functions, Composition of   functions, Limits, Continuity, Indeterminate form.\n\n                                           Differentiability, Differentiation, Successive differentiation     and Leibnitz theorem.\n\n                                            Rolle's Theorem, Mean value theorem, Taylor's and            Maclaurin's formulae.\n\n\n\n                                       Euler's theorem, Tangents and normal asymptotes.\n\n                                Method of substitution, Integration by parts, Special trigonometric functions and rational fractions.\n\n                                 Fundamental theorem, General properties, Evaluations of definite integrals and reduction formulas.\n\n                                 Determination of lengths, Areas and Volumes.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea3.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea3.setName(""); // NOI18N
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 130, 550, 370));

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 20));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, 739));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(cover.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void backToCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToCoverActionPerformed
        new cover().setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_backToCoverActionPerformed

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
            java.util.logging.Logger.getLogger(MAT111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAT111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAT111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAT111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAT111().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BooksRec;
    private javax.swing.JLabel Grammer;
    private javax.swing.JLabel Grammer1;
    private javax.swing.JLabel Grammer2;
    private javax.swing.JLabel Grammer3;
    private javax.swing.JLabel Grammer4;
    private javax.swing.JLabel Reading;
    private javax.swing.JLabel Spoken;
    private javax.swing.JLabel Vocabulary;
    private javax.swing.JButton backToCover;
    private javax.swing.JLabel background;
    private javax.swing.JLabel eng111;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel firstSem;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
