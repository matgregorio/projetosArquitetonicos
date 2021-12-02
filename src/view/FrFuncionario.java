/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Mateus Gregorio
 */
public class FrFuncionario extends javax.swing.JFrame {

    /**
     * @return the bntExcluir
     */
    public javax.swing.JButton getBntExcluir() {
        return bntExcluir;
    }

    /**
     * @param bntExcluir the bntExcluir to set
     */
    public void setBntExcluir(javax.swing.JButton bntExcluir) {
        this.bntExcluir = bntExcluir;
    }

    /**
     * @return the btnCancelar
     */
    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * @param btnCancelar the btnCancelar to set
     */
    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    /**
     * @return the btnEditar
     */
    public javax.swing.JButton getBtnEditar() {
        return btnEditar;
    }

    /**
     * @param btnEditar the btnEditar to set
     */
    public void setBtnEditar(javax.swing.JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    /**
     * @return the btnNovo
     */
    public javax.swing.JButton getBtnNovo() {
        return btnNovo;
    }

    /**
     * @param btnNovo the btnNovo to set
     */
    public void setBtnNovo(javax.swing.JButton btnNovo) {
        this.btnNovo = btnNovo;
    }

    /**
     * @return the btnSalvar
     */
    public javax.swing.JButton getBtnSalvar() {
        return btnSalvar;
    }

    /**
     * @param btnSalvar the btnSalvar to set
     */
    public void setBtnSalvar(javax.swing.JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    /**
     * @param jComboBox1 the jComboBox1 to set
     */
    public void setjComboBox1(javax.swing.JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    /**
     * @return the jComboBox2
     */
    public javax.swing.JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    /**
     * @param jComboBox2 the jComboBox2 to set
     */
    public void setjComboBox2(javax.swing.JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel10
     */
    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    /**
     * @param jLabel10 the jLabel10 to set
     */
    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the txtCpf
     */
    public javax.swing.JFormattedTextField getTxtCpf() {
        return txtCpf;
    }

    /**
     * @param txtCpf the txtCpf to set
     */
    public void setTxtCpf(javax.swing.JFormattedTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    /**
     * @return the txtNome
     */
    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }

    /**
     * @param txtNome the txtNome to set
     */
    public void setTxtNome(javax.swing.JTextField txtNome) {
        this.txtNome = txtNome;
    }

    /**
     * @return the txtTelefone
     */
    public javax.swing.JFormattedTextField getTxtTelefone() {
        return txtTelefone;
    }

    /**
     * @param txtTelefone the txtTelefone to set
     */
    public void setTxtTelefone(javax.swing.JFormattedTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    /**
     * @return the txtlRemuneracao
     */
    public javax.swing.JTextField getTxtlRemuneracao() {
        return txtlRemuneracao;
    }

    /**
     * @param txtlRemuneracao the txtlRemuneracao to set
     */
    public void setTxtlRemuneracao(javax.swing.JTextField txtlRemuneracao) {
        this.txtlRemuneracao = txtlRemuneracao;
    }

    /**
     * @return the txtSenha
     */
    public javax.swing.JPasswordField getTxtSenha() {
        return txtSenha;
    }

    /**
     * @param txtSenha the txtSenha to set
     */
    public void setTxtSenha(javax.swing.JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    /**
     * Creates new form FrFuncionario
     */
    public FrFuncionario() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        formatarCampos();
        this.habilitarCampos(false);
    }
    
    private void formatarCampos(){
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.install(getTxtCpf());
            MaskFormatter maskTel = new MaskFormatter("(##)#####-####");
            maskTel.install(getTxtTelefone());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto","ERRO", JOptionPane.ERROR);
        }
    }
    
    public void habilitarCampos(boolean flag){
        getTxtCpf().setEnabled(flag);
        getTxtNome().setEnabled(flag);
        getTxtSenha().setEnabled(flag);
        getTxtTelefone().setEnabled(flag);
        getTxtlRemuneracao().setEnabled(flag);
    }
    
    public void limparCampos(){
        getTxtCpf().setText("");
        getTxtNome().setText("");
        getTxtSenha().setText("");
        getTxtTelefone().setText("");
        getTxtlRemuneracao().setText("");
    }
    
    public void camposParaObjeto(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtlRemuneracao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionário");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnCancelar.setText("Cancelar");

        bntExcluir.setText("Excluir");

        btnSalvar.setText("Salvar");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Remuneração:");

        txtlRemuneracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlRemuneracaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Projeto:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Arquiteto Responsável:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Data de Admissão:");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone:");

        jLabel9.setText("Senha:");

        txtSenha.setText("jPasswordField1");

        jLabel10.setText("Rua");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(33, 33, 33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(txtTelefone))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtlRemuneracao)
                                    .addComponent(jComboBox1, 0, 80, Short.MAX_VALUE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(bntExcluir)
                    .addComponent(btnSalvar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtlRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(0, 367, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtlRemuneracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlRemuneracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlRemuneracaoActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

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
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtlRemuneracao;
    // End of variables declaration//GEN-END:variables
}
