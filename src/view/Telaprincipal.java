package view;
public class Telaprincipal extends javax.swing.JFrame {

 
    public Telaprincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTNCLIENTE = new javax.swing.JButton();
        BTNPRODUTO = new javax.swing.JButton();
        BTNCAIXA = new javax.swing.JButton();
        BTNRELATORIO = new javax.swing.JButton();
        BTNFORNECEDOR = new javax.swing.JButton();
        BTNSAIR = new javax.swing.JButton();
        cadastroUsu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Cadprodu = new javax.swing.JMenu();
        cadProdu = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        BTNCLIENTE.setBackground(new java.awt.Color(255, 153, 51));
        BTNCLIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BeBox-65.png"))); // NOI18N

        BTNPRODUTO.setBackground(new java.awt.Color(255, 153, 51));
        BTNPRODUTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/AssortedQ-46.png"))); // NOI18N
        BTNPRODUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPRODUTOActionPerformed(evt);
            }
        });

        BTNCAIXA.setBackground(new java.awt.Color(255, 153, 51));
        BTNCAIXA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BeBox-66.png"))); // NOI18N

        BTNRELATORIO.setBackground(new java.awt.Color(255, 204, 51));
        BTNRELATORIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dinheiro.png"))); // NOI18N

        BTNFORNECEDOR.setBackground(new java.awt.Color(255, 204, 51));
        BTNFORNECEDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icons01-38.png"))); // NOI18N

        BTNSAIR.setBackground(new java.awt.Color(255, 204, 51));
        BTNSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icons03-22.png"))); // NOI18N
        BTNSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNSAIRMouseClicked(evt);
            }
        });
        BTNSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSAIRActionPerformed(evt);
            }
        });

        cadastroUsu.setBackground(new java.awt.Color(255, 204, 51));
        cadastroUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BeBox-67.png"))); // NOI18N
        cadastroUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroUsuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNPRODUTO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNCAIXA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNRELATORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNSAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNSAIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNFORNECEDOR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNRELATORIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNCAIXA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNPRODUTO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNCLIENTE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(cadastroUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.add(jMenu3);

        jMenu2.setText("CADASTRO");

        jMenu1.setText("PESSOAS");

        jMenuItem1.setText("CLIENTE");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("USUÁRIO");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("FORNECEDOR");
        jMenu1.add(jMenuItem3);

        jMenu2.add(jMenu1);

        Cadprodu.setText("MATERIAL");

        cadProdu.setText("PRODUTO");
        cadProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProduActionPerformed(evt);
            }
        });
        Cadprodu.add(cadProdu);

        jMenuItem5.setText("GRUPO");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Cadprodu.add(jMenuItem5);

        jMenuItem6.setText("SEÇÃO");
        Cadprodu.add(jMenuItem6);

        jMenu2.add(Cadprodu);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("MOVIMENTO");

        jMenu8.setText("CAIXA");
        jMenu7.add(jMenu8);

        jMenu9.setText("ESTOQUE");
        jMenu7.add(jMenu9);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("RELATÓRIOS");

        jMenu10.setText("CADASTRAL");

        jMenuItem7.setText("CLIENTE");
        jMenu10.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("PRODUTO");
        jMenu10.add(jMenuItem8);

        jMenu4.add(jMenu10);

        jMenu11.setText("FINANCEIRO");

        jMenuItem9.setText("FLUXO DE CAIXA");
        jMenu11.add(jMenuItem9);

        jMenu4.add(jMenu11);

        jMenu12.setText("ESTOQUE");

        jMenuItem10.setText("ENTRADAS");
        jMenu12.add(jMenuItem10);

        jMenuItem11.setText("SAIDAS");
        jMenu12.add(jMenuItem11);

        jMenu4.add(jMenu12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("AJUDA");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void BTNSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSAIRActionPerformed
         System.exit(0);
    }//GEN-LAST:event_BTNSAIRActionPerformed

    private void BTNSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNSAIRMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BTNSAIRMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        Telausuarioo TU = new Telausuarioo();
        TU.setVisible(true);
        TU.setLocationRelativeTo(TU);
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void cadastroUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroUsuMouseClicked
        // TODO add your handling code here:
         Telausuarioo TU = new Telausuarioo();
        TU.setVisible(true);
        TU.setLocationRelativeTo(TU);
    }//GEN-LAST:event_cadastroUsuMouseClicked

    private void cadProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProduActionPerformed
        ProdCad PC = new ProdCad();
        PC.setVisible(true);
        PC.setLocationRelativeTo(PC);       
    }//GEN-LAST:event_cadProduActionPerformed

    private void BTNPRODUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPRODUTOActionPerformed
        ProdCad PC = new ProdCad();
        PC.setVisible(true);
        PC.setLocationRelativeTo(PC); 
    }//GEN-LAST:event_BTNPRODUTOActionPerformed

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
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCAIXA;
    private javax.swing.JButton BTNCLIENTE;
    private javax.swing.JButton BTNFORNECEDOR;
    private javax.swing.JButton BTNPRODUTO;
    private javax.swing.JButton BTNRELATORIO;
    private javax.swing.JButton BTNSAIR;
    private javax.swing.JMenu Cadprodu;
    private javax.swing.JMenuItem cadProdu;
    private javax.swing.JButton cadastroUsu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
