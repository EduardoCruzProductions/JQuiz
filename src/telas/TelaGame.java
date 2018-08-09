package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Questao;

public class TelaGame extends javax.swing.JFrame {

    private List<Questao> questoes = new ArrayList<>();
    private int indexQuestaoAtual = 0;
    private Questao questao;
    private int acerto = 0;

    public TelaGame() {
        initComponents();
    }

    public TelaGame(List<Questao> listQuestoes) {
        initComponents();
        questoes = listQuestoes;
        updateTela();
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
        btnConcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JQuiz");
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
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/correct.png"))); // NOI18N
        btnConcluir.setEnabled(false);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

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
                        .addComponent(btnConcluir)
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
                    .addComponent(btnConcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed

        if (getSelectedRadio() != -1) {
            
            corrigir(getSelectedRadio());
            indexQuestaoAtual++;
            updateTela();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Preencha a resposta!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed

        if (getSelectedRadio() != -1) {
            
            corrigir(getSelectedRadio());
            TelaResultado tr = new TelaResultado(null, true,
            acerto,questoes.size());
            tr.setVisible(true);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Preencha a resposta!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnConcluirActionPerformed

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
    private javax.swing.JButton btnConcluir;
    private javax.swing.ButtonGroup buttonGroupResposta;
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

    private void corrigir(int resposta) {

        if (resposta == questao.getCorrectIndex()) {
            acerto++;
        }

    }

    private int getSelectedRadio() {

        if (jRadioButtonResposta0.isSelected()) {
            return 0;
        }
        if (jRadioButtonResposta1.isSelected()) {
            return 1;
        }
        if (jRadioButtonResposta2.isSelected()) {
            return 2;
        }
        if (jRadioButtonResposta3.isSelected()) {
            return 3;
        }

        return -1;

    }

    private void updateTela() {

        if (questoes.size() == indexQuestaoAtual + 1) {
            btnConcluir.setEnabled(true);
            jButtonNext.setEnabled(false);
        } else {
            btnConcluir.setEnabled(false);
            jButtonNext.setEnabled(true);
        }

        buttonGroupResposta.clearSelection();

        questao = questoes.get(indexQuestaoAtual);
        jTextAreaQuestao.setText(questao.getEnunciado());
        jRadioButtonResposta0.setText(questao.getRespostas().get(0));
        jRadioButtonResposta1.setText(questao.getRespostas().get(1));
        jRadioButtonResposta2.setText(questao.getRespostas().get(2));
        jRadioButtonResposta3.setText(questao.getRespostas().get(3));

        jLabelContador.setText(String.valueOf(indexQuestaoAtual + 1));

    }

}
