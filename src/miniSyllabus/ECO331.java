/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniSyllabus;

/**
 *
 * @author Israt Jahan
 */
public class ECO331 extends javax.swing.JFrame {

    /**
     * Creates new form ECO331
     */
    public ECO331() {
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

        backToCover = new javax.swing.JButton();
        BooksRec = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        firstSem = new javax.swing.JLabel();
        eng111 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BooksRec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BooksRec.setText("Books Recommended:");
        getContentPane().add(BooksRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, 20));

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
        firstSem.setText("3rd Year 3rd Semester");
        getContentPane().add(firstSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, 20));

        eng111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng111.setText("ECO 331: Economics");
        eng111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(eng111, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 160, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(6);
        jTextArea4.setText("1. K. K. Dewett                   : Modern Economic Theory, S. Chand Publishers\n\n2. H.L Ahuja                         : Advanced Economic Theory, S. Chand Publishers\n\n3. A. Asimakopulos              : An Introduction To Economic Theory:Microeconomics,                                                  Oxford University Press\n\n4. A. Koutsoyiannis             : Modern Microeconomics, Palgrave Macmillan\n");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jTextArea4.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea4.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea4.setName(""); // NOI18N
        jTextArea4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea4.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 470, 550, 230));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setTabSize(6);
        jTextArea3.setText("Basic Concepts of Economics: Definition and subject matter of Economics;\nMicroeconomics vs macroeconomics; Law of Economics; Central economic\nproblems of every society; Different economic systems; Economics and\nEngineering.\n\nTheory of Demand, Supply and Consumer Behavior: Law of Demand;\nDemand schedule and demand curve; Supply law, Supply schedule and\nsupply curve; Shift in demand and supply; Equilibrium in the market;\nElasticity of demand and supply\n\nProduction and Costs and Theory of the Firm: Meaning of production;\nFactors of production; Concepts of total, average and marginal costs, fixed\nand variable costs.\n\nTheory of the Firm: Perfect competition and monopoly; Total, average and\nmarginal revenue of a firm; Average and marginal revenue under perfect\ncompetition and monopoly; Firm’s Equilibrium; Equilibrium of firm under\nperfect competition and monopoly.\n\nThe Input-Output Analysis: Meaning of input-output analysis; Input-output\nanalysis model; balance equation; coefficient matrix; Determination of final\ndemand vector.\n\nBasic Concepts of Macroeconomics: Growth; Unemployment; Inflation;\nPhilips Curve, Business cycle; Circular flow of economics; Two, three and\nfour sector economics.\n\nNational Income accounting and determination: Concepts of GNP, GDP\nand national income; Methods of national income accounting; Problems of\nnational income accounting; Keynesian model of national income\ndetermination; The multiplier; Effect of fiscal policy in the Keynesian model.\n\nBudgets of Bangladesh: The revenue at the capital budget; Income,\nexpenditure of the government; direct and indirect taxes.\n\nDevelopment Planning in Bangladesh: Need for planning in Bangladesh;\nVarious five year plans in Bangladesh; Development strategies in the five\nyear plans of Bangladesh.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea3.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea3.setName(""); // NOI18N
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 550, 360));

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 20));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, 739));

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(ECO331.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECO331.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECO331.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECO331.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECO331().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BooksRec;
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