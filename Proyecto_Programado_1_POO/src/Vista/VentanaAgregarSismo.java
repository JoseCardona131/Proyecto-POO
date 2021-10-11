/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//Importamos clases necesarias
import Clases.DescripcionSismo;
import Clases.Provincia;
import Clases.Sismo;
import Clases.Sistema_Sismos;
import Clases.TOrigen;
import Clases.interesadoNotificacion;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VentanaAgregarSismo extends javax.swing.JDialog {
    
    Sistema_Sismos sistema_sismo = new Sistema_Sismos();

    // Método Constructor
    public VentanaAgregarSismo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    // Objeto tipo Sismo, se guardará en la lista de sismos cuando se presione el botón guardar sismo
    Sismo nuevoSismo = new Sismo();
    
    // Función para verificar si una fecha es válida, sirve para verificar que un string pueda convertirse a Date correctamente
    public boolean validarStringFecha(String FechaRevisar){
        SimpleDateFormat formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        formato_fecha.setLenient(false);
        
        try
        {
           formato_fecha.parse(FechaRevisar.trim());
        }
        catch(ParseException pe){
            return false;
        }
        return true;         
    }
    
    // Función para verificar si un tiempo es válido
    // Función para verificar si una fecha es válida, sirve para saber que un string pueda convertirse a Date correctamente
    public boolean validarStringTiempo(String TiempoRevisar){
        SimpleDateFormat formato_tiempo = new SimpleDateFormat("h:mm");
        formato_tiempo.setLenient(false);   
        try
        {
           formato_tiempo.parse(TiempoRevisar.trim());
        }
        catch(ParseException pe){
            return false;
        }
        return true;         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        OpcionesMar = new javax.swing.ButtonGroup();
        TiposOrigen = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        fecha = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        hora = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GuardarSismo = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Profundidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Provincias = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        magnitud = new java.awt.TextField();
        TipodeMagnitud = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Longitud = new java.awt.TextField();
        DisplayMapa = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        descripcionSismo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Sub = new javax.swing.JRadioButton();
        Choque = new javax.swing.JRadioButton();
        local = new javax.swing.JRadioButton();
        Intra = new javax.swing.JRadioButton();
        deformacion = new javax.swing.JRadioButton();
        VaciarDatos = new javax.swing.JButton();
        Mensaje_Error = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreSismo = new java.awt.TextField();
        Latitud = new java.awt.TextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LocalizacionText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Registrar Sismo");

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Fecha y Hora del Sismo:");

        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("-");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("dd/mm/aaaa");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("hh:mm");

        GuardarSismo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GuardarSismo.setText("Guardar Sismo");
        GuardarSismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSismoActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Profundidad:");

        Profundidad.setToolTipText("");
        Profundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfundidadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Km");

        OpcionesMar.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        OpcionesMar.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("¿Sismo Marítimo?");

        Provincias.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Provincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartago", "San Jose", "Alajuela", "Heredia", "Puntarenas", "Guanacaste", "Limon", "NA" }));
        Provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinciasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Provincia del Epicentro");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Magnitud:");
        jLabel11.setMaximumSize(new java.awt.Dimension(10, 10));
        jLabel11.setMinimumSize(new java.awt.Dimension(63, 19));

        TipodeMagnitud.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TipodeMagnitud.setText("ML");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Latitud");

        Longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LongitudActionPerformed(evt);
            }
        });

        DisplayMapa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DisplayMapa.setForeground(new java.awt.Color(0, 0, 0));
        DisplayMapa.setText("Ver Dirección en Mapa");
        DisplayMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayMapaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Descripción:");

        descripcionSismo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descripcionSismo.setText("-");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Origen de la Falla:");

        TiposOrigen.add(Sub);
        Sub.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Sub.setSelected(true);
        Sub.setText("Subducción");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });

        TiposOrigen.add(Choque);
        Choque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Choque.setText("Choque de Placas");
        Choque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoqueActionPerformed(evt);
            }
        });

        TiposOrigen.add(local);
        local.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        local.setText("Tectónico por falla local ");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });

        TiposOrigen.add(Intra);
        Intra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Intra.setText("Intra placa ");
        Intra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntraActionPerformed(evt);
            }
        });

        TiposOrigen.add(deformacion);
        deformacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deformacion.setText("Deformación Interna");
        deformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deformacionActionPerformed(evt);
            }
        });

        VaciarDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        VaciarDatos.setText("Vaciar Datos");
        VaciarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarDatosActionPerformed(evt);
            }
        });

        Mensaje_Error.setBackground(new java.awt.Color(55, 55, 55));
        Mensaje_Error.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Mensaje_Error.setForeground(new java.awt.Color(250, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nombre del Sismo:");

        NombreSismo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NombreSismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreSismoActionPerformed(evt);
            }
        });

        Latitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatitudActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("Longitud");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("Localización");

        LocalizacionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizacionTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(NombreSismo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Profundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(magnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipodeMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcionSismo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel15)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocalizacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139)))
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(GuardarSismo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VaciarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mensaje_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Choque)
                                .addGap(18, 18, 18)
                                .addComponent(local))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Intra)
                                .addGap(18, 18, 18)
                                .addComponent(deformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DisplayMapa)
                                .addGap(66, 66, 66))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(NombreSismo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Profundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(magnitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TipodeMagnitud))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Provincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionSismo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(DisplayMapa)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel14)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Latitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Longitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LocalizacionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sub)
                            .addComponent(Choque)
                            .addComponent(local)
                            .addComponent(Intra)
                            .addComponent(deformacion))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GuardarSismo)
                                .addComponent(VaciarDatos))
                            .addComponent(Mensaje_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 211, Short.MAX_VALUE)
                        .addComponent(Salir)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        //no hace nada
    }//GEN-LAST:event_fechaActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        //no hace nada
    }//GEN-LAST:event_horaActionPerformed
    
    // Acción del botón Salir
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // Se quita la visibilidad de la ventana y se desecha (Cerrando el programa)
        this.setVisible(false);
        this.dispose();  
    }//GEN-LAST:event_SalirActionPerformed
    
    private void ProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfundidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfundidadActionPerformed
    
    // Acción del botón de Si en sismo marítimo
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Provincias.setSelectedItem("NA");
        Provincias.disable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void ProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinciasActionPerformed
        // No hace nada
    }//GEN-LAST:event_ProvinciasActionPerformed

    private void LongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LongitudActionPerformed
        // No hace nada
    }//GEN-LAST:event_LongitudActionPerformed

    private void ChoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoqueActionPerformed
        // No hace nada
    }//GEN-LAST:event_ChoqueActionPerformed

    private void deformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deformacionActionPerformed
        // No hace nada
    }//GEN-LAST:event_deformacionActionPerformed
    
    // Función para borrar todos los datos insertados en la ventana (Vaciar Datos)
    private void VaciarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarDatosActionPerformed
        
        // Se convierten todos los textos en las cajas de texto
        NombreSismo.setText("");
        Profundidad.setText("");
        fecha.setText("");
        hora.setText("");
        Longitud.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(true);
        Provincias.setSelectedItem("Cartago");
        magnitud.setText("");
        Sub.setSelected(true);
        Mensaje_Error.setText(" ");
    }//GEN-LAST:event_VaciarDatosActionPerformed
    
    /* Esta función revisará cada entrada en la ventana de agregar sismo, se agrega el sismo a la lista
     únicamente si todos los datos son correctos y no existe un sismo con el mismo nombre */
    private void GuardarSismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSismoActionPerformed
        //Se asigna a la etiqueta de error como vacia
        Mensaje_Error.setText(" ");
        
        Sismo copia_prueba = new Sismo();
        
     
        // Primero se obtiene y se revisa el nombre
        String nombre = NombreSismo.getText();
      
        
        // Este if será si no esta vacio el nombre
        if(!"".equals(nombre)){
            
            // Se revisa si ya ese nombre esta registrado
            if (sistema_sismo.consultar_sismo_nombre(nombre)){
                Mensaje_Error.setText("Este nombre de sismo ya esta registrado");
            }
            // Si el nombre del sismo no esta registrado aún
            else{
                //Se le asigna el nombre al sismo
                copia_prueba.setNombre(nombre);

                // Se pasa a revisar  la fecha
                // Se verifica si sigue la estructura dd/mm/aaaa
                Pattern pat = Pattern.compile("^[0-9]{2}/[0-9]{2}/[0-9]{4}");
                Matcher mat = pat.matcher(fecha.getText());

                // Verifica que la hora siga el patrón hh:mm
                Pattern patHora = Pattern.compile("^[0-9]{1,2}:[0-9]{2}");
                Matcher matHora = patHora.matcher(hora.getText());


                // Si tanto la fecha como la hora coinciden se sigue adelante
                if (mat.matches()&& matHora.matches()) {
                    
                    // Se revisa si la fecha es válida
                    if (!validarStringFecha(fecha.getText())){
                        Mensaje_Error.setText("La fecha no es válida");
                    }
                    else{
                        // Se crean variables para guardar los datos de la fecha y hora
                        int diaI, mesI, anioI, horaI, minutoI;

                        // Se convierten los datos a integers
                        diaI = parseInt(fecha.getText().substring(0,2));
                        mesI = parseInt(fecha.getText().substring(3,5));
                        anioI = parseInt(fecha.getText().substring(6));
                        horaI = parseInt(hora.getText().substring(0,2));
                        minutoI = parseInt(hora.getText().substring(3));
                        //Se le asigna la fecha al sismno
                        copia_prueba.setFechaHora(anioI, mesI, diaI, horaI, minutoI);

                        // Para revisar la profundidad del sismo y que solo consista de numeros
                        Pattern prof = Pattern.compile("^[0-9]+");
                        Matcher matprof = prof.matcher(Profundidad.getText());

                        // Si la profuncidad es correcta
                        if (matprof.matches()){

                            // Se guarda la profundidad al sismo
                            copia_prueba.setProfundidad(parseInt(Profundidad.getText()));

                            // Para reviisar la magnitud del sismo
                            // Revisa que el sismo siga la estructura n.n
                            Pattern patMag = Pattern.compile("^[0-9]{1,2}.[0-9]");
                            Matcher matMag = patMag.matcher(magnitud.getText());

                            // Si la estructura es correcta
                            if (matMag.matches()){

                                // Se convierte el número a float
                                double magnitudD;
                                magnitudD = Double.parseDouble(magnitud.getText());

                                // Dependiendo de la magnitud se cambia la escala de medición y se define una descripcion
                                if (magnitudD < 2.0){
                                    TipodeMagnitud.setText("ML");
                                    descripcionSismo.setText("Micro");
                                    copia_prueba.setDescripcion(DescripcionSismo.Micro);
                                }
                                else if((magnitudD >= 2.0) &&(magnitudD < 4.0)){
                                    TipodeMagnitud.setText("ML");
                                    descripcionSismo.setText("Menor");
                                    copia_prueba.setDescripcion(DescripcionSismo.Menor);
                                }
                                else if((magnitudD >= 4.0) &&(magnitudD < 5.0)){
                                    TipodeMagnitud.setText("ML");
                                    descripcionSismo.setText("Ligero");
                                    copia_prueba.setDescripcion(DescripcionSismo.Ligero);
                                }
                                else if((magnitudD >= 5.0) &&(magnitudD < 6.0)){
                                    TipodeMagnitud.setText("ML");
                                    descripcionSismo.setText("Moderado");
                                    copia_prueba.setDescripcion(DescripcionSismo.Moderado);
                                }
                                else if((magnitudD >= 6.0) &&(magnitudD < 7.0)){
                                    TipodeMagnitud.setText("ML");
                                    descripcionSismo.setText("Fuerte");
                                    copia_prueba.setDescripcion(DescripcionSismo.Fuerte);
                                }
                                else if((magnitudD >= 7.0) &&(magnitudD < 8.0)){
                                    TipodeMagnitud.setText("MW");
                                    descripcionSismo.setText("Mayor");
                                    copia_prueba.setDescripcion(DescripcionSismo.Mayor);
                                }
                                else if((magnitudD >= 8.0) &&(magnitudD < 10.0)){
                                    TipodeMagnitud.setText("MW");
                                    descripcionSismo.setText("Gran");
                                    copia_prueba.setDescripcion(DescripcionSismo.Gran);
                                }
                                else{
                                   TipodeMagnitud.setText("MW");
                                   descripcionSismo.setText("Epico");
                                   copia_prueba.setDescripcion(DescripcionSismo.Epico);
                                }
                                // Se setea la magnitud del sismo 
                                copia_prueba.setMagnitud(magnitudD);

                                //Revisar cual es el origen
                                //Se setea el origen del sismo
                                if(Sub.isSelected()){
                                    copia_prueba.setTipoOrigen(TOrigen.SUBDUCCION);
                                }
                                else if(local.isSelected()){
                                    copia_prueba.setTipoOrigen(TOrigen.TECTONICO_FALLA_LOCAL);
                                }
                                else if(Choque.isSelected()){
                                    copia_prueba.setTipoOrigen(TOrigen.CHOQUE_PLACAS);
                                }
                                else if(Intra.isSelected()){
                                    copia_prueba.setTipoOrigen(TOrigen.INTRA_PLACA);
                                }
                                else if(deformacion.isSelected()){
                                    copia_prueba.setTipoOrigen(TOrigen.DEFORMACION_INTERNA);
                                }
                                else{
                                    Mensaje_Error.setText("Debe seleccionar el tipo de origen");
                                }

                                //Obtener provincia a la que pertenece
                                String provincia = (String) Provincias.getSelectedItem();
                                if(provincia.equals("Cartago")){
                                    copia_prueba.setProvincia(Provincia.CARTAGO);
                                }
                                else if(provincia.equals("San Jose")){
                                    copia_prueba.setProvincia(Provincia.SANJOSE);
                                }
                                else if(provincia.equals("Heredia")){
                                    copia_prueba.setProvincia(Provincia.HEREDIA);
                                }
                                else if(provincia.equals("Alajuela")){
                                    copia_prueba.setProvincia(Provincia.ALAJUELA);
                                }
                                else if(provincia.equals("Guanacaste")){
                                    copia_prueba.setProvincia(Provincia.GUANACASTE);
                                }
                                else if(provincia.equals("Limon")){
                                    copia_prueba.setProvincia(Provincia.LIMON);
                                }
                                else if(provincia.equals("Puntarenas")){
                                    copia_prueba.setProvincia(Provincia.PUNTARENAS);
                                }
                                else if(provincia.equals("N/A")){
                                    copia_prueba.setProvincia(Provincia.NA);
                                }
                                else{
                                    Mensaje_Error.setText("Debe seleccionar una provincia");
                                }

                                //Obtener si es maritimo o no
                                if(jRadioButton1.isSelected()){
                                    copia_prueba.setmaritimo(true);
                                }
                                else if(jRadioButton2.isSelected()){
                                    copia_prueba.setmaritimo(false);
                                }
                                else{
                                    Mensaje_Error.setText("Debe indicar si es maritimo");
                                }

                                Pattern pat_lat = Pattern.compile("^[-]?[0-9]+[.]?[0-9]+");
                                Matcher latMat = pat_lat.matcher(Latitud.getText());
                                
                                Pattern pat_long = Pattern.compile("^[-]?[0-9]+[.]?[0-9]+");
                                Matcher LongMat = pat_long.matcher(Longitud.getText());


                                if (latMat.matches() && LongMat.matches()){
                                    
                                    //Agregar latitud y longitud
                                    float lat = Float.valueOf(Latitud.getText());
                                    float lon = Float.valueOf(Longitud.getText());
                                    copia_prueba.setLatitud(lat);
                                    copia_prueba.setLongitud(lon);
                                    copia_prueba.setLocalizacion(LocalizacionText.getText());
                                    
                                    //Agregar el sismo
                                    sistema_sismo.agregarSismo(copia_prueba);
                                    
                                    try {
                                        sistema_sismo.GuardarExcel(copia_prueba);
                                    } catch (IOException ex) {
                                        java.util.logging.Logger.getLogger(VentanaAgregarSismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                    }
                                    
                                    //Enviar notificacion a los usuarios
                                    ArrayList<interesadoNotificacion> interesados = new ArrayList<interesadoNotificacion>();
                                    interesados = sistema_sismo.retorna_lista();
                                    for(interesadoNotificacion actual: interesados){
                                        ArrayList<Provincia> prov = new ArrayList<Provincia>();
                                        prov = actual.getProvinciasInteres();
                                        for(Provincia p: prov){
                                            if(p.equals(copia_prueba.getProvincia())){
                                                actual.enviarNotificacion(actual.getCorreo());
                                                break;
                                            }
                                        }
                                    }
                                    
                                }
                                else{
                                    Mensaje_Error.setText("La localización no es valida");
                                }
                            }
                            // Si la magnitud no es válida
                            else{
                                Mensaje_Error.setText("La magnitud no es válida");
                            }
                        }
                        // Si la profundidad no es válida
                        else{
                            Mensaje_Error.setText("La profundidad no es válida para el sismo");
                        }   
                    }
                }
                // Si la fecha o la hora no son válidas
                else {
                    Mensaje_Error.setText("La Fecha y hora no son ccorrectas");
                }
            }
        }
        else{
            Mensaje_Error.setText("El nombre del sismo no es válido");    
        }
    }//GEN-LAST:event_GuardarSismoActionPerformed
    
    // Acción del botón de no en sismo marítimo
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Provincias.enable();
        Provincias.setSelectedItem("Cartago");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void DisplayMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayMapaActionPerformed

    }//GEN-LAST:event_DisplayMapaActionPerformed

    private void NombreSismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSismoActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubActionPerformed

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localActionPerformed

    private void IntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntraActionPerformed

    private void LatitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LatitudActionPerformed

    private void LocalizacionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizacionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalizacionTextActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaAgregarSismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarSismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarSismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarSismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAgregarSismo dialog = new VentanaAgregarSismo(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton Choque;
    private javax.swing.JButton DisplayMapa;
    private javax.swing.JButton GuardarSismo;
    private javax.swing.JRadioButton Intra;
    private java.awt.TextField Latitud;
    private javax.swing.JTextField LocalizacionText;
    private java.awt.TextField Longitud;
    private javax.swing.JLabel Mensaje_Error;
    private java.awt.TextField NombreSismo;
    private javax.swing.ButtonGroup OpcionesMar;
    private javax.swing.JTextField Profundidad;
    private javax.swing.JComboBox<String> Provincias;
    private javax.swing.JButton Salir;
    private javax.swing.JRadioButton Sub;
    private javax.swing.JLabel TipodeMagnitud;
    private javax.swing.ButtonGroup TiposOrigen;
    private javax.swing.JButton VaciarDatos;
    private javax.swing.JRadioButton deformacion;
    private javax.swing.JLabel descripcionSismo;
    private java.awt.TextField fecha;
    private javax.swing.Box.Filler filler1;
    private java.awt.TextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton local;
    private java.awt.TextField magnitud;
    // End of variables declaration//GEN-END:variables

    private double parsedouble(String magnitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private float parsefloat(String magnitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
