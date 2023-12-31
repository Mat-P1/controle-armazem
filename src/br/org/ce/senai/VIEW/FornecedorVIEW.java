package br.org.ce.senai.VIEW;

import br.org.ce.senai.DAO.FornecedorDAO;
import br.org.ce.senai.DTO.FornecedorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class FornecedorVIEW extends javax.swing.JFrame {

    /**
     * Creates new form FornecedorVIEW
     */
    public FornecedorVIEW() {
        initComponents();
        listarFornecedoresVIEW();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFornecedores = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblIDFornecedor = new javax.swing.JLabel();
        txtIDFornecedor = new javax.swing.JTextField();
        lblCNPJFornecedor = new javax.swing.JLabel();
        txtCNPJFornecedor = new javax.swing.JTextField();
        lblNomeFornecedor = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        lblEnderecoFornecedor = new javax.swing.JLabel();
        txtEnderecoFornecedor = new javax.swing.JTextField();
        lblTelefoneFornecedor = new javax.swing.JLabel();
        txtTelefoneFornecedor = new javax.swing.JTextField();
        lblEmailFornecedor = new javax.swing.JLabel();
        txtEmailFornecedor = new javax.swing.JTextField();
        btnCadastrarFornecedor = new javax.swing.JButton();
        btnEditarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        btnRetornarPrincipal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtPesquisarFornecedor = new javax.swing.JTextField();
        btnPesquisarFornecedor = new javax.swing.JButton();
        btnListarFornecedores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        btnLimparCampos = new javax.swing.JButton();
        btnCarregarCampos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFornecedores.setText("Fornecedores");

        lblIDFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDFornecedor.setText("ID");

        txtIDFornecedor.setEditable(false);

        lblCNPJFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCNPJFornecedor.setText("CNPJ");

        lblNomeFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeFornecedor.setText("Nome");

        lblEnderecoFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEnderecoFornecedor.setText("Endereço");

        lblTelefoneFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefoneFornecedor.setText("Telefone");

        lblEmailFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmailFornecedor.setText("E-mail");

        btnCadastrarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarFornecedor.setText("CADASTRAR");
        btnCadastrarFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
            }
        });

        btnEditarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarFornecedor.setText("EDITAR");
        btnEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirFornecedor.setText("EXCLUIR");
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });

        btnRetornarPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetornarPrincipal.setText("RETORNAR");
        btnRetornarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarPrincipalActionPerformed(evt);
            }
        });

        txtPesquisarFornecedor.setToolTipText("");

        btnPesquisarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisarFornecedor.setText("PESQUISAR");
        btnPesquisarFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFornecedorActionPerformed(evt);
            }
        });

        btnListarFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListarFornecedores.setText("LISTAR");
        btnListarFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFornecedoresActionPerformed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CNPJ", "Nome", "Endereço", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedores.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaFornecedores);

        btnLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimparCampos.setText("LIMPAR CAMPOS");
        btnLimparCampos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnCarregarCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Made by Mat-P1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(lblFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCNPJFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnderecoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIDFornecedor)
                                .addGap(42, 42, 42)
                                .addComponent(txtIDFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetornarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarFornecedores)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDFornecedor)
                    .addComponent(txtIDFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJFornecedor)
                    .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFornecedor)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoFornecedor)
                    .addComponent(txtEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetornarPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneFornecedor)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailFornecedor)
                    .addComponent(txtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarFornecedor)
                    .addComponent(btnListarFornecedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnCarregarCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
        cadastrarFornecedorVIEW();
        limparCampos();
        listarFornecedoresVIEW();
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed

    private void btnListarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFornecedoresActionPerformed
        listarFornecedoresVIEW();
    }//GEN-LAST:event_btnListarFornecedoresActionPerformed

    private void btnPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFornecedorActionPerformed
        String descricao = txtPesquisarFornecedor.getText();
        pesquisarFornecedoresVIEW(descricao);
    }//GEN-LAST:event_btnPesquisarFornecedorActionPerformed

    private void btnEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFornecedorActionPerformed
        alterarFornecedorVIEW();
        listarFornecedoresVIEW();
    }//GEN-LAST:event_btnEditarFornecedorActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        excluirFornecedorVIEW();
        limparCampos();
        listarFornecedoresVIEW();
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnRetornarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarPrincipalActionPerformed
        TelaPrincipalVIEW objTelaPrincipalVIEW = new TelaPrincipalVIEW();
        objTelaPrincipalVIEW.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRetornarPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(FornecedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnEditarFornecedor;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnListarFornecedores;
    private javax.swing.JButton btnPesquisarFornecedor;
    private javax.swing.JButton btnRetornarPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCNPJFornecedor;
    private javax.swing.JLabel lblEmailFornecedor;
    private javax.swing.JLabel lblEnderecoFornecedor;
    private javax.swing.JLabel lblFornecedores;
    private javax.swing.JLabel lblIDFornecedor;
    private javax.swing.JLabel lblNomeFornecedor;
    private javax.swing.JLabel lblTelefoneFornecedor;
    private javax.swing.JTable tabelaFornecedores;
    private javax.swing.JTextField txtCNPJFornecedor;
    private javax.swing.JTextField txtEmailFornecedor;
    private javax.swing.JTextField txtEnderecoFornecedor;
    private javax.swing.JTextField txtIDFornecedor;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtPesquisarFornecedor;
    private javax.swing.JTextField txtTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
    private void limparCampos() {
        txtIDFornecedor.setText("");
        txtCNPJFornecedor.setText("");
        txtNomeFornecedor.setText("");
        txtEnderecoFornecedor.setText("");
        txtTelefoneFornecedor.setText("");
        txtEmailFornecedor.setText("");
    }
    
    private void carregarCampos() {
        int setarCampo = tabelaFornecedores.getSelectedRow();
        
        txtIDFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 0).toString());
        txtCNPJFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 1).toString());
        txtNomeFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 2).toString());
        txtEnderecoFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 3).toString());
        txtTelefoneFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 4).toString());
        txtEmailFornecedor.setText(tabelaFornecedores.getModel().getValueAt(setarCampo, 5).toString());
    }
    
    private void cadastrarFornecedorVIEW() {
        try {
            Long CNPJVIEW = Long.valueOf(txtCNPJFornecedor.getText());
            String nomeFornecedorVIEW = txtNomeFornecedor.getText();
            String enderecoFornecedorVIEW = txtEnderecoFornecedor.getText();
            String telefoneFornecedorVIEW = txtTelefoneFornecedor.getText();
            String emailFornecedorVIEW = txtEmailFornecedor.getText();
            
            FornecedorDTO objFornecedorDTO = new FornecedorDTO();
            
            objFornecedorDTO.setCNPJDTO(CNPJVIEW);
            objFornecedorDTO.setNomeFornecedorDTO(nomeFornecedorVIEW);
            objFornecedorDTO.setEnderecoFornecedorDTO(enderecoFornecedorVIEW);
            objFornecedorDTO.setTelefoneFornecedorDTO(telefoneFornecedorVIEW);
            objFornecedorDTO.setEmailFornecedorDTO(emailFornecedorVIEW);
            
            FornecedorDAO objFornecedorDAO = new FornecedorDAO();
            
            objFornecedorDAO.cadastrarFornecedorDAO(objFornecedorDTO); 
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Error\ncadastrarFornecedorVIEW" + error);
        }
    }
    
    private void listarFornecedoresVIEW() {
        try {
            FornecedorDAO objFornecedorDAO = new FornecedorDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaFornecedores.getModel();
            model.setNumRows(0);
            
            ArrayList<FornecedorDTO> listaFornecedores = objFornecedorDAO.listarFornecedoresDAO();
            
            for (int i = 0; i < listaFornecedores.size(); i++) {
                model.addRow(new Object[]{
                    listaFornecedores.get(i).getIdFornecedorDTO(),
                    listaFornecedores.get(i).getCNPJDTO(),
                    listaFornecedores.get(i).getNomeFornecedorDTO(),
                    listaFornecedores.get(i).getEnderecoFornecedorDTO(),
                    listaFornecedores.get(i).getTelefoneFornecedorDTO(),
                    listaFornecedores.get(i).getEmailFornecedorDTO(),
                });
            }
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro\nlistarFornecedoresVIEW" + error);
        }
    }
    
    private void pesquisarFornecedoresVIEW(String descricao) {
        try {
            FornecedorDAO objFornecedorDAO = new FornecedorDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaFornecedores.getModel();
            model.setNumRows(0);
            
            ArrayList<FornecedorDTO> pesquisarFornecedor = objFornecedorDAO.pesquisarFornecedorDAO(descricao);
            
            for (int i = 0; i < pesquisarFornecedor.size(); i++) {
                model.addRow(new Object[]{
                    pesquisarFornecedor.get(i).getIdFornecedorDTO(),
                    pesquisarFornecedor.get(i).getCNPJDTO(),
                    pesquisarFornecedor.get(i).getNomeFornecedorDTO(),
                    pesquisarFornecedor.get(i).getEnderecoFornecedorDTO(),
                    pesquisarFornecedor.get(i).getTelefoneFornecedorDTO(),
                    pesquisarFornecedor.get(i).getEmailFornecedorDTO(),
                });
            }
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro\npesquisarFornecedorVIEW" + error);
        }
    }
    
    private void alterarFornecedorVIEW() {
        try {
            int idFornecedorVIEW = Integer.parseInt(txtIDFornecedor.getText());
            Long CNPJVIEW = Long.valueOf(txtCNPJFornecedor.getText());
            String nomeFornecedorVIEW = txtNomeFornecedor.getText();
            String enderecoFornecedorVIEW = txtEnderecoFornecedor.getText();
            String telefoneFornecedorVIEW = txtTelefoneFornecedor.getText();
            String emailFornecedorVIEW = txtEmailFornecedor.getText();
            
            FornecedorDTO objFornecedorDTO = new FornecedorDTO();
            
            objFornecedorDTO.setIdFornecedorDTO(idFornecedorVIEW);
            objFornecedorDTO.setCNPJDTO(CNPJVIEW);
            objFornecedorDTO.setNomeFornecedorDTO(nomeFornecedorVIEW);
            objFornecedorDTO.setEnderecoFornecedorDTO(enderecoFornecedorVIEW);
            objFornecedorDTO.setTelefoneFornecedorDTO(telefoneFornecedorVIEW);
            objFornecedorDTO.setEmailFornecedorDTO(emailFornecedorVIEW);
            
            FornecedorDAO objFornecedorDAO = new FornecedorDAO();
            
            objFornecedorDAO.alterarFornecedorDAO(objFornecedorDTO);
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Erro\nalterarFornecedorVIEW" + error);
        }
    }
    
     private void excluirFornecedorVIEW() {
        try {
            int idFornecedorVIEW = Integer.parseInt(txtIDFornecedor.getText());
            
            FornecedorDTO objFornecedorDTO = new FornecedorDTO();           
            objFornecedorDTO.setIdFornecedorDTO(idFornecedorVIEW);
            
            FornecedorDAO objFornecedorDAO = new FornecedorDAO();            
            objFornecedorDAO.excluirFornecedorDAO(objFornecedorDTO);
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Erro\nexcluirFornecedorVIEW" + error);
        }
    }
}
