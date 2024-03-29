package com.Pna.Interfaz;

import com.Entidades.producto;
import ReturnDAO.ReturnDaoProducto;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FormAdd extends javax.swing.JDialog {

    public FormAdd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Agregar producto");
        this.setLocation(414, 219);
        initComponents();
        button1.setEnabled(false);
        button2.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_tipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_ID.setBackground(new java.awt.Color(0, 102, 102));
        jTextField_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_ID.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });
        jTextField_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_IDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 30));

        jTextField_Nombre.setBackground(new java.awt.Color(0, 102, 102));
        jTextField_Nombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 190, 30));

        label2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setName("Nombre_Producto"); // NOI18N
        label2.setText("ID_Producto");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 20));

        label1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setName("Nombre_Producto"); // NOI18N
        label1.setText("Nombre_Producto");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 20));

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Aceptar");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button1MousePressed(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 30));

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Cancelar");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, 30));

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 86, 120, 20));

        jComboBox_tipo.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox_tipo.setEditable(true);
        jComboBox_tipo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jComboBox_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno...", "Por Unidad", "Por Gramos", "Por Kilos", "Por Docena" }));
        jComboBox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 20));

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 134, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
     if(jTextField_ID.getText().isEmpty() || jTextField_Nombre.getText().isEmpty() || jTextField1.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Error campos vacios ");
     }else{
        this.Agregar();
     }
    }//GEN-LAST:event_button1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c=evt.getKeyChar();
        if (c>'9' || c=='+' || c=='-' || c=='"' || c=='#' || c=='°' || c=='$' || c=='&' || c=='/' || c=='(' || c==')' || c=='!' || c=='%' || c=='*'){
            evt.consume();
        }else {
            int index=jTextField1.getText().length();
            
            if (index==5){
                evt.consume();
            }
            
        }
        //Controlar que no ingrese caracteres o letras.
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IDKeyTyped
char c=evt.getKeyChar();
        if(c>='0' && c<='9'){
            
        }else{
            evt.consume();
      } 
       //Controlar que no ingrese caracteres o letras.
    }//GEN-LAST:event_jTextField_IDKeyTyped

    private void jComboBox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipoActionPerformed
        // TODO add your handling code here:
        Validacion();
    }//GEN-LAST:event_jComboBox_tipoActionPerformed

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        // TODO add your handling code here:
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        // TODO add your handling code here:
        button2.setBackground(Color.black);
        button2.setForeground(Color.WHITE);
    }//GEN-LAST:event_button2MouseExited

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        // TODO add your handling code here:
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        // TODO add your handling code here:
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
    }//GEN-LAST:event_button1MouseExited

    private void button1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MousePressed
        // TODO add your handling code here:
         button1.setBackground(Color.BLUE);
         button1.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_button1MousePressed
    
    public static void main(String  args[]){
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
            java.util.logging.Logger.getLogger(FormAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAdd dialog = new FormAdd(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                       
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> jComboBox_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nombre;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
    //Metodo que agrega un producto a base de datos.
    producto p;
    
    private void Agregar() {
     p=new producto();
     p.setID(Integer.parseInt(jTextField_ID.getText()));
     p.setNombre(jTextField_Nombre.getText().trim());
     p.setEstado(jComboBox_tipo.getSelectedItem().toString());
     p.setStock(Float.parseFloat(jTextField1.getText().trim()));
    ReturnDaoProducto dp=new ReturnDaoProducto();
    if (dp.add().buscarPorId(p.getID())!=null){
        JOptionPane.showMessageDialog(this, "Este producto ya existe.");
    }else{
        dp.add().Agregar(p);
    }
    
    clearCamp();
    }

    private void Validacion() {
    //Validamos por medio de un combo
        if(jComboBox_tipo.getSelectedItem().equals("Selecciona uno...")){
             button1.setBackground(Color.BLACK);
             button1.setForeground(Color.WHITE);
             button1.setEnabled(false);
        }else{
            button1.setEnabled(true);
        }
        
    }public void clearCamp(){
        //Metodo que limpia campos.
        jTextField1.setText("");
        jTextField_ID.setText("");
        jTextField_Nombre.setText("");
        jComboBox_tipo.setSelectedIndex(0);
    }
}
