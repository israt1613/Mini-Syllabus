/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniSyllabus;

/**
 *
 * @author Israt Jahan
 */
public class CSE233 extends javax.swing.JFrame {

    /**
     * Creates new form CSE233
     */
    public CSE233() {
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

        eng111 = new javax.swing.JLabel();
        firstSem = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        BooksRec = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        backToCover = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eng111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eng111.setText("CSE 233: Computer Network");
        eng111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(eng111, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, 20));

        firstSem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstSem.setText("2nd Year 3rd Semester");
        getContentPane().add(firstSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, 20));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniSyllabus/minimize final.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 20));

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

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 0));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setTabSize(6);
        jTextArea4.setText("1. Behrouz A. Forouzan    : TCP/IP Protocol Suite, McGraw-Hill\n\n2. Andrew S.                     : Computer Networks, Prentice Hall\nTanenbaum\n\n3. William Stallings            : Data and Computer Communications, Prentice Hall\n\n4. Behrouz A. Forouzan     : Data Communications and Networking, McGraw-Hill");
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
        jTextArea3.setText("Introduction: Computer Networks and Applications, OSI reference model,\nTCP/IP model and terminology, Connectionless and Connection Oriented\nservices, Service primitives, The ARPANET\n\nPhysical Layer: Circuit switching and Packet switching, X-25 protocol,\nFrame relay and Cell relay, ATM reference model.\n\nMedium Access Sub layer: Pure and slotted ALOHA, Persistent and Non\npersistent CSMA, CSMA with collision detection and collision free\nprotocols, IEEE standard 802.3 and Ethernet.\n\nData Link Layer: Types of errors, framing, error detection & correction\nmethods; Flow control, Stop & wait ARQ, Go-Back- N ARQ, Selective\nrepeat ARQ, HDLC.\n\nNetwork Layer: Internet address, classful address, subnetting, static vs.\ndynamic routing, shortest path algorithm, flooding, distance vector routing,\nlink state routing, ARP, RARP, IP, ICMP.\n\nTransport Layer: UDP, TCP, Connection management, Addressing,\nEstablishing and Releasing Connection, Congestion control algorithm, Flow\ncontrol and Buffering, Multiplexing.\n\nPresentation Layer: Data Compression techniques, Frequency Dependent\nCoding, Context Dependent Encoding.\n\nApplication Layer: Internet and intranets, Internet services and goals, DNS,\nSMTP, FTP, Telnet, HTTP, World Wide Web (WWW), DHCP and BOOTP.\nNetworking in Practice: Designing LAN, Cabling, Establishing ClientServer\nnetwork, Configuring: Directory Server, Proxy server, FTP server, Email\nserver, web server, DB server, Firewall, Network troubleshooting,\nnetwork maintenance, network monitoring, Network programming");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setMargin(new java.awt.Insets(2, 100, 2, 2));
        jTextArea3.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextArea3.setName(""); // NOI18N
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 550, 360));

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

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 20));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, 739));

        pack();
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
            java.util.logging.Logger.getLogger(CSE233.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSE233.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSE233.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSE233.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE233().setVisible(true);
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
