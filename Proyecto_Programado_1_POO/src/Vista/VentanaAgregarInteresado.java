
package Vista;

import Clases.Provincia;
import Clases.Sistema_Sismos;
import Clases.interesadoNotificacion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VentanaAgregarInteresado extends javax.swing.JDialog {

    public VentanaAgregarInteresado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    Sistema_Sismos sistema_sismo = new Sistema_Sismos();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton8 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonApuntarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Puntarenas)
                                .addComponent(Mar))
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApuntarseActionPerformed
        
        interesadoNotificacion interesadoAgregar = new interesadoNotificacion();
        
        String name = nombre.getText();
        MenError.setText("");
        
        // Si el nombre no es igual a vacío
        if (!name.equals("")){
            
            // Se define el nombre del usuario
            interesadoAgregar.setNombre(name);
            
            // Luego se pasa a verificar el correo
            String mail = correo.getText();
            
            // Si el correo no esta vacío se van a validar otros aspectos de este
            // Cuando el correo esta lleno el número puede ser vacío
            if (!mail.equals("")){
                
                // Se revisa si tiene un formato valido
                Pattern patron = Pattern.compile("^(.+)@(.+)$");
                Matcher matcorreo = patron.matcher(mail);
            
                // Si el correo sigue el patrón adecuado
                if (matcorreo.matches()){
                    
                    // Se revisa si el correo ya existe en la lista de interesados
                    if (sistema_sismo.ConsultarCorreoUsuario(mail)){
                        MenError.setText("Este correo ya esta registrado");
                    }
                    // Si no existe el correo
                    else{
                        
                        // Se agrega el correo
                        interesadoAgregar.setCorreo(mail);
                        
                        // Se revisará el número
                        String number = numero.getText();
                        
                        if (number.equals("")){
                            interesadoAgregar.setNumeroTelefono("NA");
                            
                            // Se pasan a revisar las provincias
                            int contador_provincias_marcadas = 0;

                                if (Alajuela.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.ALAJUELA);
                                    contador_provincias_marcadas++;
                                }
                                if (Cartago.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.CARTAGO);
                                    contador_provincias_marcadas++;
                                }
                                if (Guanacaste.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.GUANACASTE);
                                    contador_provincias_marcadas++;
                                }
                                if (Heredia.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.HEREDIA);
                                    contador_provincias_marcadas++;
                                }
                                if (Limon.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.LIMON);
                                    contador_provincias_marcadas++;
                                }
                                if (Mar.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.NA);
                                    contador_provincias_marcadas++;
                                }
                                if (Puntarenas.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.PUNTARENAS);
                                    contador_provincias_marcadas++;
                                }
                                if (SanJ.isSelected()){
                                    interesadoAgregar.AgregarProvinciaInteres(Provincia.SANJOSE);
                                    contador_provincias_marcadas++;
                                }

                                // Se revisa si se agrego al menos una provincia
                                if (contador_provincias_marcadas != 0){

                                    sistema_sismo.agregarInteresadosNotificaciones(interesadoAgregar);
                                    System.out.println("El sismo se agrego con éxito");
                                }
                                else{
                                    MenError.setText("Seleccione al menos una provincia");
                                }  
                        }
                        // Si no esta vacío se revisa si es válido
                        else{
                            
                            Pattern patnum = Pattern.compile("^[0-9]{4}-[0-9]{4}");
                            Matcher matnum = patnum.matcher(number);
                            
                            // Si el patrón encaja
                            if (matnum.matches()){
                                
                                // Se revisa que el número no este registrado
                                if (sistema_sismo.ConsultarNumeroUsuario(number)){
                                    MenError.setText("Este número ya esta registrado");  
                                }
                                else{
                                    interesadoAgregar.setNumeroTelefono(number);
                                
                                    // Se revisarán las provincias seleccionadas
                                    int contador_provincias_marcadas = 0;

                                    if (Alajuela.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.ALAJUELA);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Cartago.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.CARTAGO);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Guanacaste.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.GUANACASTE);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Heredia.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.HEREDIA);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Limon.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.LIMON);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Mar.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.NA);
                                        contador_provincias_marcadas++;
                                    }
                                    if (Puntarenas.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.PUNTARENAS);
                                        contador_provincias_marcadas++;
                                    }
                                    if (SanJ.isSelected()){
                                        interesadoAgregar.AgregarProvinciaInteres(Provincia.SANJOSE);
                                        contador_provincias_marcadas++;
                                    }

                                    // Se revisa si se agrego al menos una provincia
                                    if (contador_provincias_marcadas != 0){

                                        sistema_sismo.agregarInteresadosNotificaciones(interesadoAgregar);
                                        
                                        //Se intenta guardar el interesado en el excel
                                        try {
                                            sistema_sismo.GuardarExcelInteresados(interesadoAgregar);
                                        } catch (IOException ex) {
                                            Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    else{
                                        MenError.setText("Seleccione al menos una provincia");
                                    }
                                }  
                            }
                            else{
                                MenError.setText("Por favor inserte un número válido");
                            }
                        }
                    }
                }
                else{
                    MenError.setText("Por favor inserte un correo válido");
                }
            }
            // Si el correo esta vacío
            else{
                // Se revisará el número
                String number = numero.getText();
                
                if (number.equals("")){
                    MenError.setText("Debe insertar al menos un correo o número telefónico");
                }
                else{
                    Pattern patnum = Pattern.compile("^[0-9]{4}-[0-9]{4}");
                    Matcher matnum = patnum.matcher(number);
                            
                    // Si el patrón encaja
                    if (matnum.matches()){
                        
                        if (sistema_sismo.ConsultarNumeroUsuario(number)){
                            MenError.setText("Este número ya esta registrado");
                        }
                        else{
                            interesadoAgregar.setNumeroTelefono(number);
                            interesadoAgregar.setCorreo("NA");

                            // Se revisarán las provincias seleccionadas
                            int contador_provincias_marcadas = 0;

                            if (Alajuela.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.ALAJUELA);
                                contador_provincias_marcadas++;
                            }
                            if (Cartago.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.CARTAGO);
                                contador_provincias_marcadas++;
                            }
                            if (Guanacaste.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.GUANACASTE);
                                contador_provincias_marcadas++;
                            }
                            if (Heredia.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.HEREDIA);
                                contador_provincias_marcadas++;
                            }
                            if (Limon.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.LIMON);
                                contador_provincias_marcadas++;
                            }
                            if (Mar.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.NA);
                                contador_provincias_marcadas++;
                            }
                            if (Puntarenas.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.PUNTARENAS);
                                contador_provincias_marcadas++;
                            }
                            if (SanJ.isSelected()){
                                interesadoAgregar.AgregarProvinciaInteres(Provincia.SANJOSE);
                                contador_provincias_marcadas++;
                            }

                            // Se revisa si se agrego al menos una provincia
                            if (contador_provincias_marcadas != 0){

                                sistema_sismo.agregarInteresadosNotificaciones(interesadoAgregar);
                                
                                //Se intenta guaradr el interesado en el excel
                                try {
                                    sistema_sismo.GuardarExcelInteresados(interesadoAgregar);
                                } catch (IOException ex) {
                                    Logger.getLogger(VentanaAgregarInteresado.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else{
                                MenError.setText("Seleccione al menos una provincia");
                            }  
                        }
                    }    
                    else{
                        MenError.setText("Por favor inserte un número válido");
                    }  
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

    public static void main(String args[]) {
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
    private javax.swing.ButtonGroup buttonGroup1;
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
