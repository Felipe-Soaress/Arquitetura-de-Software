package problema02.views;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import problema02.models.Cliente;
import problema02.models.Pais;
import problema02.models.Utilitario;

/**
 *
 * @author leona
 */
public class jfCliente extends javax.swing.JFrame {
    //Declaração de algumas variáveis
    protected static ArrayList<Cliente> clienteLista = new ArrayList();

    /**
     * Creates new form jfPrincipal
     */
    public jfCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtPais = new javax.swing.JTextField();
        jbGravar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtIdade = new javax.swing.JTextField();
        jbClienteCadastrarPais = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Problema02");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("  Cliente");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone(+)");

        jtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setText("País");

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jLabel6.setText("Idade");

        jtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdadeActionPerformed(evt);
            }
        });

        jbClienteCadastrarPais.setText("Cadastrar País");
        jbClienteCadastrarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClienteCadastrarPaisActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jbGravar)
                .addGap(18, 18, 18)
                .addComponent(jbClienteCadastrarPais)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jtIdade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGravar)
                    .addComponent(jButton1)
                    .addComponent(jbClienteCadastrarPais))
                .addGap(22, 22, 22))
        );

        jButton1.getAccessibleContext().setAccessibleName("jbVoltar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        // TODO add your handling code here:
        Cliente c = new Cliente();
        
        String nome_pais = jtPais.getText();
        String nome = jtNome.getText();
        String telefone = jtTelefone.getText();
        int idade = Integer.parseInt(jtIdade.getText());
        
        //Atribuindo qual vai ser o pais por sigla ou nome
        Pais pais= Utilitario.verificaPais(nome_pais, jfPais.paisList);
        
        //Fazendo verificações para o cadastro
        
        if(nome.length() < 5){
            JOptionPane.showMessageDialog(jbGravar, "Erro: Nome de cliente inválido (deve haver pelo menos 5 caracteres)");
        
        }else if(Utilitario.verificaCliente(nome, clienteLista)){ 
            JOptionPane.showMessageDialog(jbGravar, "Erro: Nome de cliente já cadastrado");
        
        }else if(pais == null){
            JOptionPane.showMessageDialog(jbGravar, "Erro: Pais não existe ou não foi cadastrado");
            
        }else if( !(pais.getCodigoTelefone().equals(telefone.substring(0,2))) ){ //Faz a verificação se codigo do telefone é o mesmo do país digitado
            JOptionPane.showMessageDialog(jbGravar, "Erro: Código do País inválido");

        }else{
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setPais(pais);
            c.setIdade(idade);
            c.setLimiteCredito(Utilitario.calculaLimiteCliente(idade, pais.getPais()));
            clienteLista.add(c);
            
            
            //Printando informações cadastradas
            JOptionPane.showMessageDialog(jbGravar,"\nNome: " + c.getNome()
            + "\nTelefone: " + c.getTelefone()
            + "\nLimite de Crédito: " + c.getLimiteCredito()
            + "\nPaís: " + c.getPais().getPais()
            + "\nIdade: " + c.getIdade());
            JOptionPane.showMessageDialog(jbGravar, "Informações Adicionadas com sucesso!");
            
        }

        
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefoneActionPerformed

    private void jtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdadeActionPerformed

    private void jbClienteCadastrarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClienteCadastrarPaisActionPerformed
        // TODO add your handling code here:
        jfPais TelaPais = new jfPais();
 
        TelaPais.setVisible(true);
    }//GEN-LAST:event_jbClienteCadastrarPaisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Irá fechar a janela de listagem (obs: janela principal semrpe aberta)
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbClienteCadastrarPais;
    private javax.swing.JButton jbGravar;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPais;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private void limparCampos(){
      jtNome.setText("");
      jtTelefone.setText("");
      jtPais.setText("");
      jtIdade.setText("");
    }
}