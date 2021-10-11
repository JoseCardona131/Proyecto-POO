
package Vista;


import Clases.Provincia;
import Clases.Sistema_Sismos;
import Clases.interesadoNotificacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ventana_interesados extends javax.swing.JDialog {
    
    // Método Para cargar los datos dentro de la lista de interesados en una tabla
    public DefaultTableModel cargarTabla(){
        ArrayList<interesadoNotificacion> interesados = new ArrayList<interesadoNotificacion>();
        Sistema_Sismos sistema = new Sistema_Sismos();
        interesados = sistema.retorna_lista();
        Object [] encabezado = {"Nombre", "Correo", "Celular", "Provincia de ínteres"};
        
        // Se crea una nueva tabla de datos con la misma cantidad de filas que la lista de intereados en notificaciones
        DefaultTableModel tabla_datos = new DefaultTableModel(encabezado, interesados.size());
        
        // Se va a hacer un ciclo que se repita hasta que alcanze el límite de filas en la tabla
        for(int i = 0; i < tabla_datos.getRowCount(); i++){
            
            // Por cada fila se van a asignar los datos de los interesados en la lista
            // Para esto se obtiene el interesado en el índice actual de la lista
            interesadoNotificacion actual = interesados.get(i);
            
            // Se van a Asignar datos a la tabla en los índices de acuerdo al Excel
            tabla_datos.setValueAt(actual.getNombre(), i, 0);
            tabla_datos.setValueAt(actual.getCorreo(), i, 1);
            tabla_datos.setValueAt(actual.getNumeroTelefono(), i, 2);
            
            // Se crea una nueva lista de Provincias donde se guardarán todas las provincias que le interesan a la persona
            ArrayList<Provincia> prov = new ArrayList<Provincia>();
            prov = actual.getProvinciasInteres();
            String provincias = "";
            for(Provincia p: prov){
                switch(p){
                    case SANJOSE:
                        provincias += "San Jose, ";
                    case CARTAGO:
                        provincias += "Cartago, ";
                    case HEREDIA:
                        provincias += "Heredia, ";
                    case LIMON:
                        provincias += "Limón, ";
                    case GUANACASTE:
                        provincias += "Guanacaste, ";
                    case PUNTARENAS:
                        provincias += "Punaternas, ";
                    case ALAJUELA:
                        provincias += "Alajuela, ";
                    case NA:
                        provincias += "NA, ";
                }
            }
            // Se agrega el string con las provincias a la celda
            tabla_datos.setValueAt(provincias, i, 3);
        }
        // Se retorna la tabla con los datos
        return tabla_datos;
    }
    // Botón para abrir la tabla de interesados
    public ventana_interesados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TablaDatos.setModel(this.cargarTabla());
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        InteresadosNotificacion = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaDatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        InteresadosNotificacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        InteresadosNotificacion.setText("Lista de Interesados a Notificación");

        Salir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(InteresadosNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InteresadosNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Salir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana_interesados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_interesados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_interesados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_interesados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana_interesados dialog = new ventana_interesados(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel InteresadosNotificacion;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
