/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lestaf
 */
public class NewJFrame extends javax.swing.JFrame {
    Cpu cpu = new Cpu();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Testosa = new javax.swing.JTextArea();
        Butao = new javax.swing.JButton();
        Reg1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Reg2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Reg3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Reg4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MemLista = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Testosa.setColumns(20);
        Testosa.setRows(5);
        Testosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TestosaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Testosa);

        Butao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Butao.setText("Rodar");
        Butao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoActionPerformed(evt);
            }
        });
        Butao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButaoKeyPressed(evt);
            }
        });

        Reg1.setEditable(false);
        Reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg1ActionPerformed(evt);
            }
        });

        jLabel1.setText("R0");

        jLabel2.setText("R1");

        Reg2.setEditable(false);
        Reg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg2ActionPerformed(evt);
            }
        });

        jLabel3.setText("R2");

        Reg3.setEditable(false);
        Reg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg3ActionPerformed(evt);
            }
        });

        jLabel4.setText("R3");

        Reg4.setEditable(false);
        Reg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg4ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(MemLista);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MEMÓRIA");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INPUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Butao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reg3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reg4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Reg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(Reg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Reg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Butao, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoActionPerformed

        if(Testosa.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Coloque as instruções antes de continuar!", "Erro!" ,JOptionPane.ERROR_MESSAGE);
        }


        String input = Testosa.getText();
        String[] arr = input.split("\n");
        for(int i =0;i<arr.length;i++){
            Memoria.addInst(arr[i]);//insere as inst na memoria
        }
        MemLista.setListData(arr);
        cpu.Ciclo();
        Reg1.setText(Integer.toString(BancoReg.bancoReg.get(0).valor));
        Reg2.setText(Integer.toString(BancoReg.bancoReg.get(1).valor));
        Reg3.setText(Integer.toString(BancoReg.bancoReg.get(2).valor));
        Reg4.setText(Integer.toString(BancoReg.bancoReg.get(3).valor));
        System.out.println("Terminei");
        
    }//GEN-LAST:event_ButaoActionPerformed

    private void Reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reg1ActionPerformed

    private void Reg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reg2ActionPerformed

    private void Reg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reg3ActionPerformed

    private void Reg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reg4ActionPerformed

    private void ButaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButaoKeyPressed
       
            
        
    }//GEN-LAST:event_ButaoKeyPressed

    private void TestosaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TestosaKeyPressed
 if (Testosa.getText().contains("HALT")) {
            String input = Testosa.getText();
        String[] arr = input.split("\n");
        for(int i =0;i<arr.length;i++){
            Memoria.addInst(arr[i]);//insere as inst na memoria
        }
        MemLista.setListData(arr);
        cpu.Ciclo();
        Reg1.setText(Integer.toString(cpu.getReg(0)));
        Reg2.setText(Integer.toString(cpu.getReg(1)));
        Reg3.setText(Integer.toString(cpu.getReg(2)));
        Reg4.setText(Integer.toString(cpu.getReg(3)));
        System.out.println("Terminei");
        }else{
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TestosaKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butao;
    private javax.swing.JList<String> MemLista;
    private javax.swing.JTextField Reg1;
    private javax.swing.JTextField Reg2;
    private javax.swing.JTextField Reg3;
    private javax.swing.JTextField Reg4;
    private javax.swing.JTextArea Testosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
