/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniSyllabus;

/**
 *
 * @author Israt Jahan
 */
public class CSE111 extends javax.swing.JFrame {

    /**
     * Creates new form CSE111
     */
    public CSE111() {
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

        Grammer = new javax.swing.JLabel();
        Vocabulary = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Spoken = new javax.swing.JLabel();
        backToCover = new javax.swing.JButton();
        BooksRec = new javax.swing.JLabel();
        firstSem = new javax.swing.JLabel();
        eng111 = new javax.swing.JLabel();
        Grammer4 = new javax.swing.JLabel();
        Grammer2 = new javax.swing.JLabel();
        Grammer3 = new javax.swing.JLabel();
        Grammer1 = new javax.swing.JLabel();
        Reading = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Grammer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer.setText("Data Processing:");
        getContentPane().add(Grammer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 348, 120, 20));

        Vocabulary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vocabulary.setText("Basic Number System:");
        getContentPane().add(Vocabulary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 241, 160, 20));

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

        Spoken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Spoken.setText("Computer Basics:");
        getContentPane().add(Spoken, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 97, 130, 20));

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
        getContentPane().add(BooksRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 160, 20));

        firstSem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstSem.setText("1st Year 1st Semester");
        getContentPane().add(firstSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 20));

        eng111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng111.setText("CSE 111: Computer Fundamental");
        eng111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(eng111, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 240, 20));

        Grammer4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer4.setText("Simple C:");
        getContentPane().add(Grammer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 511, 70, 20));

        Grammer2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer2.setText("Programming Language Basic:");
        getContentPane().add(Grammer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 457, 220, 20));

        Grammer3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer3.setText("Software:");
        getContentPane().add(Grammer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 276, 70, 20));

        Grammer1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Grammer1.setText("Computer Networks:");
        getContentPane().add(Grammer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 403, 160, 20));

        Reading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reading.setText("Computer Hardware & Peripherals:");
        getContentPane().add(Reading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, 260, 20));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setTabSize(6);
        jTextArea5.setText("1. Peter Norton               :  Introduction to Computer, McGraw-hill Publishers\n\n2. J Stanley Warford      :  Computer Systems, Jones & Bartlett Publishers\n\n3. P. Norton                    :  Inside the PC, Sam Publishers      \n\n4. L. Rosch                    :  Hardware Bible, Braddy Publishing,Indianapolis\n\n5. Subramanian             :  Introduction to Computers, Mcgraw-hill Inc.\n\n6. V.K. Jain                    :  Switching Theory and Digital Electronics. Khanna                                                       Publishers                   ");
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jTextArea5.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea5.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea5.setName(""); // NOI18N
        jTextArea5.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea5.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 600, 550, 100));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setTabSize(6);
        jTextArea3.setText("                                Introduction to Studying Computers, History and development of Computers, Generation of computers, Types of Computers.\n\n                                                              Basic Units of Computer Hardware, Keyboard, Mouse, Internal structure of CPU, Functions of RAM, ROM and Cache memory, Basic Functional mechanism of HDD and CD-ROM, Different types of monitors, Impact and Non-impact Printers, Scanner, Plotter, Typical Computer specifications.\n\n                                        Different data type, Conversion, Standard.\n\n                   Classificatons, System software, Operating systemconcept and importance, components and basic functions of DOS, Windows operating system, Application software's and Unity programs, Computer Virus.\n\n                              Concepts of Data, Information and Database, Traditional File Processing, and DBMS.\n\n                                      Computer networks and its goals, Basic concept on LAN, MAN, WAN and Internet System, Internet Services, Functions of Modem in internet.\n\n                                                      Programming Languages, Basic concepts of compiler, interpreter, algorithm and flowchahrt.\n\n                  Program structure in C. Program Creating, Compiling, Debugging and Running, Basic I/O functions, Identifiers and keywords, Simple data types, variables, constants, operators.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea3.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea3.setName(""); // NOI18N
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 100, 550, 480));

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
            java.util.logging.Logger.getLogger(CSE111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSE111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSE111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSE111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE111().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
