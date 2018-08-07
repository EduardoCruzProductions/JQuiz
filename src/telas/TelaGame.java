
package telas;


public class TelaGame extends javax.swing.JFrame {

    public TelaGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupResposta = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestao = new javax.swing.JTextArea();
        jRadioButtonResposta0 = new javax.swing.JRadioButton();
        jRadioButtonResposta1 = new javax.swing.JRadioButton();
        jRadioButtonResposta2 = new javax.swing.JRadioButton();
        jRadioButtonResposta3 = new javax.swing.JRadioButton();
        jButtonNext = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextAreaQuestao.setEditable(false);
        jTextAreaQuestao.setColumns(20);
        jTextAreaQuestao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextAreaQuestao.setLineWrap(true);
        jTextAreaQuestao.setRows(5);
        jTextAreaQuestao.setText("awefawefawefaw");
        jScrollPane1.setViewportView(jTextAreaQuestao);

        buttonGroupResposta.add(jRadioButtonResposta0);
        jRadioButtonResposta0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonResposta0.setText("jRadioButton1");

        buttonGroupResposta.add(jRadioButtonResposta1);
        jRadioButtonResposta1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonResposta1.setText("jRadioButton1");

        buttonGroupResposta.add(jRadioButtonResposta2);
        jRadioButtonResposta2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonResposta2.setText("jRadioButton1");

        buttonGroupResposta.add(jRadioButtonResposta3);
        jRadioButtonResposta3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonResposta3.setText("jRadioButton1");

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow.png"))); // NOI18N

        jButtonConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/correct.png"))); // NOI18N
        jButtonConcluir.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Questão");

        jLabelContador.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabelContador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonResposta3)
                            .addComponent(jRadioButtonResposta2)
                            .addComponent(jRadioButtonResposta1)
                            .addComponent(jRadioButtonResposta0)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelContador)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNext)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonResposta0)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonResposta1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonResposta2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonResposta3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonConcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupResposta;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JRadioButton jRadioButtonResposta0;
    private javax.swing.JRadioButton jRadioButtonResposta1;
    private javax.swing.JRadioButton jRadioButtonResposta2;
    private javax.swing.JRadioButton jRadioButtonResposta3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaQuestao;
    // End of variables declaration//GEN-END:variables
}
