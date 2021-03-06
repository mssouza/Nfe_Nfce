/*

Descri��o: 

Autor: Videoaulasneri - email: videoaulaneri@gmail.com   - Fone: (54) 3329-5400
     e Adelcio Porto  - email: portoinfo@sercomtel.com.br - Fone: (43) 99994-6037
  
*/
package br.com.videoaulasneri.adelcio.fatura.dialog.view;

import br.com.videoaulasneri.adelcio.fatura.MenuFiscalAction;
import br.com.videoaulasneri.adelcio.fatura.dialog.MonetarioDocument;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class ValorQtde extends javax.swing.JDialog {
    private double valor = 0.0;
    private static boolean desistiu = true;
    private boolean retorno = false;

    public ValorQtde(java.awt.Frame parent, boolean modal, String tipo, double valor) {
        super(parent, modal);
        this.valor = valor;
        initComponents();

        int r = 224;  //Integer.valueOf(Caixa.configuracao.getCorJanelasInternas().substring(0, 3));
        int g = 223;  //Integer.valueOf(Caixa.configuracao.getCorJanelasInternas().substring(4, 7));
        int b = 227;  //Integer.valueOf(Caixa.configuracao.getCorJanelasInternas().substring(8, 11));

        //TODO : É necessário configurar a cor de cada Panel?
        panelPrincipal.setBackground(new Color(r, g, b));
        panelComponentes.setBackground(new Color(r, g, b));
        panelValor.setBackground(new Color(r, g, b));
        panelBotoes.setBackground(new Color(r, g, b));

        CancelaAction cancelaAction = new CancelaAction();
        botaoCancela.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "cancelaAction");
        botaoCancela.getActionMap().put("cancelaAction", cancelaAction);

        ConfirmaAction confirmaAction = new ConfirmaAction();
        botaoConfirma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0), "confirmaAction");
        botaoConfirma.getActionMap().put("confirmaAction", confirmaAction);

        EnterAction enterAction = new EnterAction();
        botaoConfirma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterAction");
        botaoConfirma.getActionMap().put("enterAction", enterAction);

        //troca TAB por ENTER
        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

        System.out.println("ValorReal - vlr inicial do campo: " + getValor());
        MenuFiscalAction menuFiscalAction = new MenuFiscalAction(this);
//        editValor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "menuFiscal");
//        editValor.getActionMap().put("menuFiscal", menuFiscalAction);
//        editValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
//        editValor.setDocument(new MonetarioDocument());
//        editValor.setText("0");
        editValor.setText(String.format("%.2f", valor));
        setTitle("Opera��oSolicitada: "+tipo);
        jLabel2.setText("Informe o Valor: ");
        this.setPreferredSize(new Dimension(360, 140));
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelComponentes = new javax.swing.JPanel();
        panelValor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editValor = new javax.swing.JFormattedTextField();
        panelBotoes = new javax.swing.JPanel();
        botaoConfirma = new javax.swing.JButton();
        botaoCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informe Valor");
        setMinimumSize(new java.awt.Dimension(390, 119));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaDinheiro05.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        panelPrincipal.add(jLabel1, gridBagConstraints);

        panelComponentes.setLayout(new java.awt.GridBagLayout());

        panelValor.setBackground(new Color(255,255,255,0));
        panelValor.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Valor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        panelValor.add(jLabel2, gridBagConstraints);

        editValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        editValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        editValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                editValorFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelValor.add(editValor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelComponentes.add(panelValor, gridBagConstraints);

        panelBotoes.setBackground(new Color(255,255,255,0));
        panelBotoes.setMinimumSize(new java.awt.Dimension(221, 45));
        panelBotoes.setPreferredSize(new java.awt.Dimension(235, 45));
        panelBotoes.setLayout(new java.awt.GridBagLayout());

        botaoConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoConfirmar.png"))); // NOI18N
        botaoConfirma.setText("Confirma (F12)");
        botaoConfirma.setMaximumSize(new java.awt.Dimension(140, 25));
        botaoConfirma.setPreferredSize(new java.awt.Dimension(140, 25));
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        panelBotoes.add(botaoConfirma, gridBagConstraints);

        botaoCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoCancelar.png"))); // NOI18N
        botaoCancela.setText("Cancela (ESC)");
        botaoCancela.setMaximumSize(new java.awt.Dimension(140, 25));
        botaoCancela.setPreferredSize(new java.awt.Dimension(140, 25));
        botaoCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        panelBotoes.add(botaoCancela, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        panelComponentes.add(panelBotoes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelPrincipal.add(panelComponentes, gridBagConstraints);

        getContentPane().add(panelPrincipal, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
            retorno = true;
            desistiu = false;
            String vlrStr = editValor.getText().replaceAll(",", ".");
            System.out.println("Passou botaoConfirmaAction . . .");
System.out.println("botaoConfirmaActionPerformed - ValorReal = "+vlrStr);            
            if (vlrStr.indexOf(".") == -1 || vlrStr.substring(vlrStr.indexOf(".")).length() != 3) {
                JOptionPane.showMessageDialog(null, "Qtde informada precisa ter 2 casas decimais!");
            } else {
System.out.println("ValorReal - confirmou action com retorno = "+retorno);            
                dispose();
            }
}//GEN-LAST:event_botaoConfirmaActionPerformed

    private void botaoCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelaActionPerformed
            retorno = false;
            desistiu = true;
System.out.println("ValorReal - cancelou action com retorno = "+retorno);            
        dispose();
}//GEN-LAST:event_botaoCancelaActionPerformed

    private void editValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editValorFocusLost
        saiuCampoValor(editValor.getText());
    }//GEN-LAST:event_editValorFocusLost

    private void saiuCampoValor(String strValor) {
        try {
//            setValor((Double.parseDouble(strValor.replace(",", "").replace(".", ""))) / 100);
            setValor(Double.parseDouble(strValor.replace(",", ".")));
System.out.println("ValorReal.saiuCampoValor() - valor digitado: "+getValor());
            //valor = Double.valueOf(editValor.getText().replace(",", "."));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Problemas com o valor digitado. Opera��o n�o realizada.", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }
    public Double retornaValor() {
System.out.println("ValorReal.retornaValor() - valor: "+getValor());
        return getValor();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancela;
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JFormattedTextField editValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelComponentes;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelValor;
    // End of variables declaration//GEN-END:variables

    private class ConfirmaAction extends AbstractAction {

        public ConfirmaAction() {
        }

        public void actionPerformed(ActionEvent e) {
            retorno = true;
            desistiu = false;
            System.out.println("Passou confirmaAction . . .");
            String vlrStr = editValor.getText().replaceAll(",", ".");
            if (vlrStr.indexOf(".") == -1 || vlrStr.substring(vlrStr.indexOf(".")).length() != 3) {
                JOptionPane.showMessageDialog(null, "Qtde informada precisa ter 2 casas decimais!");
            } else {
                dispose();
            }
        }
    }

    private class EnterAction extends AbstractAction {

        public EnterAction() {
        }

        public void actionPerformed(ActionEvent e) {
            retorno = true;
            desistiu = false;
            System.out.println("Passou enterAction . . .");
            String vlrStr = editValor.getText().replaceAll(",", ".");
            if (vlrStr.indexOf(".") == -1 || vlrStr.substring(vlrStr.indexOf(".")).length() != 3) {
                JOptionPane.showMessageDialog(null, "Qtde informada precisa ter 2 casas decimais!");
            } else {
                dispose();
            }
        }
    }

    private class CancelaAction extends AbstractAction {

        public CancelaAction() {
            
        }

        public void actionPerformed(ActionEvent e) {
            setDesistiu(true);
            retorno = false;
System.out.println("ValorReal - cancelou action com retorno = "+retorno);            
            dispose();
        }
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the desistiu
     */
    public static boolean isDesistiu() {
        return desistiu;
    }

    /**
     * @param aDesistiu the desistiu to set
     */
    public static void setDesistiu(boolean aDesistiu) {
        desistiu = aDesistiu;
    }

    /**
     * @return the retorno
     */
    public boolean isRetorno() {
        return retorno;
    }

    /**
     * @param retorno the retorno to set
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }
}
