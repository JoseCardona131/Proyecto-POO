/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jcard
 */
public class VentanaAgregarInteresado extends javax.swing.JDialog {

    /**
     * Creates new form VentanaAgregarInteresado
     */
    public VentanaAgregarInteresado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jRadioButton8 = new javax.swing.JRadioButton();
        Titulo = new java.awt.Label();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        nombre = new java.awt.TextField();
        correo = new java.awt.TextField();
        numero = new java.awt.TextField();
        botonApuntarse = new java.awt.Button();
        botonSalir = new java.awt.Button();
        botonVaciar = new java.awt.Button();
        label4 = new java.awt.Label();
        Cartago = new javax.swing.JCheckBox();
        SanJ = new javax.swing.JCheckBox();
        Heredia = new javax.swing.JCheckBox();
        Alajuela = new javax.swing.JCheckBox();
        Guanacaste = new javax.swing.JCheckBox();
        Limon = new javax.swing.JCheckBox();
        Puntarenas = new javax.swing.JCheckBox();
        Mar = new javax.swing.JCheckBox();
        MenError = new javax.swing.JLabel();

        jRadioButton8.setText("jRadioButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(102, 0, 102));
        Titulo.setText("Sistema de Notificaciones");

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Nombre Usuario:");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Correo Electrónico:");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setName(""); // NOI18N
        label3.setText("Número Telefónico:");

        nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        correo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        numero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        botonApuntarse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonApuntarse.setLabel("Apuntarse!");
        botonApuntarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApuntarseActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonSalir.setLabel("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonVaciar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botonVaciar.setLabel("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setText("Provincias de Interés:");

        Cartago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Cartago.setText("Cartago");

        SanJ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SanJ.setText("San Jose");

        Heredia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Heredia.setText("Heredia");

        Alajuela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Alajuela.setText("Alajuela");

        Guanacaste.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Guanacaste.setText("Guanacaste");
        Guanacaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuanacasteActionPerformed(evt);
            }
        });

        Limon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Limon.setText("Limón");

        Puntarenas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Puntarenas.setText("Puntarenas");

        Mar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Mar.setText("Marítimo / NA");
        Mar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarActionPerformed(evt);
            }
        });

        MenError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MenError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonApuntarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cartago, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SanJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Heredia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alajuela, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Guanacaste)
                                    .addComponent(Limon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Puntarenas)
                                    .addComponent(Mar))
                                .addContainerGap(22, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MenError, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cartago)
                    .addComponent(Heredia)
                    .addComponent(Limon)
                    .addComponent(Puntarenas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SanJ)
                    .addComponent(Alajuela)
                    .addComponent(Guanacaste, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(MenError)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonApuntarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        label1.getAccessibleContext().setAccessibleName("Nombre Usuario:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApuntarseActionPerformed
        
        String name = nombre.getText();
        MenError.setText("");
        // Si el nombre no es igual a vacío
        if (!name.equals("")){
            
            // Se busca si existe el nombre en la lista de interesados
            
            // Luego se pasa a verificar el resto de datos
            String mail = correo.getText();
            String number = numero.getText();
            
            // Si el correo esta vacío el número debe de estar lleno
            if (mail.equals("")){
                if (number.equals("")){
                    MenError.setText("Se debe insertar al menos un correo o número de teléfono");
                }
                else{
                    // Se revisa si el formato del número es adecuado
                }
            }
       
        }
        else{
            MenError.setText("El nombre no puede ser vacío");
        }
        
        
        
        
    }//GEN-LAST:event_botonApuntarseActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
         nombre.setText("");
         correo.setText("");
         numero.setText("");
         Cartago.setSelected(false);
         SanJ.setSelected(false);
         Alajuela.setSelected(false);
         Heredia.setSelected(false);
         Guanacaste.setSelected(false);
         Limon.setSelected(false);
         Mar.setSelected(false);
         Puntarenas.setSelected(false);
         
    }//GEN-LAST:event_botonVaciarActionPerformed

    private void GuanacasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuanacasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuanacasteActionPerformed

    private void MarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAgregarInteresado dialog = new VentanaAgregarInteresado(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox Alajuela;
    private javax.swing.JCheckBox Cartago;
    private javax.swing.JCheckBox Guanacaste;
    private javax.swing.JCheckBox Heredia;
    private javax.swing.JCheckBox Limon;
    private javax.swing.JCheckBox Mar;
    private javax.swing.JLabel MenError;
    private javax.swing.JCheckBox Puntarenas;
    private javax.swing.JCheckBox SanJ;
    private java.awt.Label Titulo;
    private java.awt.Button botonApuntarse;
    private java.awt.Button botonSalir;
    private java.awt.Button botonVaciar;
    private java.awt.TextField correo;
    private javax.swing.JRadioButton jRadioButton8;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField nombre;
    private java.awt.TextField numero;
    // End of variables declaration//GEN-END:variables
}
