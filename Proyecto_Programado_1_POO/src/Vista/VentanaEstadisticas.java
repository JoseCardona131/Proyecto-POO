package Vista;

import javax.swing.JFrame;


public class VentanaEstadisticas extends javax.swing.JDialog {


    public VentanaEstadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GraficoTipoOrigen = new javax.swing.JButton();
        GraficoSismosRangoFechas = new javax.swing.JButton();
        GraficoSismosPorMes = new javax.swing.JButton();
        GraficoSismosMagnitud = new javax.swing.JButton();
        GraficoCantidadSismos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Estadísticas de Sismos");

        GraficoTipoOrigen.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        GraficoTipoOrigen.setText("Cantidad de sismos por tipo de origen ");
        GraficoTipoOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoTipoOrigenActionPerformed(evt);
            }
        });

        GraficoSismosRangoFechas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        GraficoSismosRangoFechas.setText("Sismos ocurridos en un rango de fechas");
        GraficoSismosRangoFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoSismosRangoFechasActionPerformed(evt);
            }
        });

        GraficoSismosPorMes.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        GraficoSismosPorMes.setText(" Cantidad de sismos por mes en un año");
        GraficoSismosPorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoSismosPorMesActionPerformed(evt);
            }
        });

        GraficoSismosMagnitud.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        GraficoSismosMagnitud.setText("Clasificación de sismos por magnitud ");
        GraficoSismosMagnitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoSismosMagnitudActionPerformed(evt);
            }
        });

        GraficoCantidadSismos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        GraficoCantidadSismos.setText("Cantidad de sismos por provincia");
        GraficoCantidadSismos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoCantidadSismosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GraficoSismosRangoFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GraficoTipoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GraficoSismosPorMes, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GraficoSismosMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GraficoCantidadSismos, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(GraficoCantidadSismos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GraficoTipoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(GraficoSismosRangoFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GraficoSismosPorMes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GraficoSismosMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Botones para abrir los graficos
    // Cada Botón abre un grafico diferente a través de una ventana nueva
    
    // Gráfico para cantidad de sismos por provincia
    private void GraficoCantidadSismosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoCantidadSismosActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame =  (JFrame) this.getParent();
        Ventana_graficos nueva = new Ventana_graficos(parentFrame, true, "provincia");
        nueva.setVisible(true);
    }//GEN-LAST:event_GraficoCantidadSismosActionPerformed
    
    // Grafico para cantidad de sismos por tipo de origen
    private void GraficoTipoOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoTipoOrigenActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame =  (JFrame) this.getParent();
        Ventana_graficos nueva = new Ventana_graficos(parentFrame, true, "origen");
        nueva.setVisible(true);
    }//GEN-LAST:event_GraficoTipoOrigenActionPerformed
    
    // Graficos para cantidad de sismos por magnitud
    private void GraficoSismosMagnitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoSismosMagnitudActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame =  (JFrame) this.getParent();
        ventana_graficos_tabulares nueva = new ventana_graficos_tabulares(parentFrame, true, "magnitud");
        nueva.setVisible(true);
    }//GEN-LAST:event_GraficoSismosMagnitudActionPerformed
    
    // Graficos para cantidad de Sismos por mes
    private void GraficoSismosPorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoSismosPorMesActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame =  (JFrame) this.getParent();
        Ventana_graficos nueva = new Ventana_graficos(parentFrame, true, "mes");
        nueva.setVisible(true);
    }//GEN-LAST:event_GraficoSismosPorMesActionPerformed
    
    // Graficos para cantidad de sismos por cierto rango de fechas
    private void GraficoSismosRangoFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoSismosRangoFechasActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame =  (JFrame) this.getParent();
        ventana_graficos_tabulares nueva = new ventana_graficos_tabulares(parentFrame, true, "rango");
        nueva.setVisible(true);
    }//GEN-LAST:event_GraficoSismosRangoFechasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEstadisticas dialog = new VentanaEstadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton GraficoCantidadSismos;
    private javax.swing.JButton GraficoSismosMagnitud;
    private javax.swing.JButton GraficoSismosPorMes;
    private javax.swing.JButton GraficoSismosRangoFechas;
    private javax.swing.JButton GraficoTipoOrigen;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
