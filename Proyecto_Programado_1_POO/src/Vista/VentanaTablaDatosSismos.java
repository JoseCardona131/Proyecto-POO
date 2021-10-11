
package Vista;

import Clases.Sistema_Sismos;
import javax.swing.JFrame;

public class VentanaTablaDatosSismos extends javax.swing.JDialog {
    

    public VentanaTablaDatosSismos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TablaDatos.setModel(Sistema_Sismos.cargarSismos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        RegistrarSismo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        ModificarSismo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Sismos");

        Salir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        RegistrarSismo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RegistrarSismo.setText("Registrar Sismo Nuevo");
        RegistrarSismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSismoActionPerformed(evt);
            }
        });

        TablaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaDatos);

        ModificarSismo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ModificarSismo.setText("Modificar Sismo");
        ModificarSismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSismoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(RegistrarSismo)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(ModificarSismo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Salir)
                    .addComponent(RegistrarSismo)
                    .addComponent(ModificarSismo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Botón para salir de la ventana
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // Se quita la visibilidad de la ventana y se desecha (Cerrando el programa)
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
    
    // Botón para abrir la ventana para registrar sismo
    // Abre una nueva ventana para registrar sismo
    private void RegistrarSismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSismoActionPerformed
        JFrame parentFrame =  (JFrame) this.getParent();
        VentanaAgregarSismo nueva = new VentanaAgregarSismo(parentFrame, true);
        nueva.setVisible(true);
    }//GEN-LAST:event_RegistrarSismoActionPerformed

    private void ModificarSismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarSismoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaTablaDatosSismos dialog = new VentanaTablaDatosSismos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ModificarSismo;
    private javax.swing.JButton RegistrarSismo;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
