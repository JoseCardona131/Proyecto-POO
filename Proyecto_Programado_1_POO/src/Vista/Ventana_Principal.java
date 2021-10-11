package Vista;

import Clases.DescripcionSismo;
import Clases.Provincia;
import Clases.Sismo;
import Clases.Sistema_Sismos;
import Clases.TOrigen;
import Clases.interesadoNotificacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import org.apache.poi.ss.usermodel.Cell;
import static org.apache.poi.ss.usermodel.CellType.BLANK;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Ventana_Principal extends javax.swing.JFrame {
    
    //Inicializar un sistema de sismos
    static Sistema_Sismos sistema_sismo = new Sistema_Sismos();

    public Ventana_Principal() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ApuntarseNotif = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Sismológico");

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel1.setText("Sistema de Información de Sismos");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Sismos Registrados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setText("Estadísticas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setText("Ayuda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setText("Lista Apuntados al sistema notificaciones");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ApuntarseNotif.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ApuntarseNotif.setText("Apuntarse para Recibir Notificaciones");
        ApuntarseNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApuntarseNotifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApuntarseNotif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(396, 396, 396))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addGap(94, 94, 94)
                .addComponent(ApuntarseNotif)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void leerArchivoRegistroSismos() throws FileNotFoundException, IOException {
        FileInputStream archivo = new FileInputStream("InformacionSismos.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        int numero_Filas = hoja.getLastRowNum();
       
        for(int i = 0;i <= numero_Filas; i++){
            Row fila = hoja.getRow(i);
            int numero_Columnas = fila.getLastCellNum();
            
            Sismo nuevo = new Sismo();
            for(int j = 0; j < numero_Columnas; j++){
                Cell celda = fila.getCell(j);
                
                
                switch(j){
                    
                    case 0:
                        //Agregar nombre al sismo
                        
                        nuevo.setNombre(celda.getStringCellValue());

                        break;
                     
                    case 1:
                        //Agregar la fecha del sismo
                        String fecha_hora = celda.getStringCellValue();
                        //Solo realizaremos la conversion de string a numero en el caso de que no hayamos obtenido el titulo de la celda
                        if(!fecha_hora.equals("Fecha_Hora")){
                            int diaI, mesI, anioI, horaI, minutoI;
                            // Se convierten los datos a int
                            diaI = parseInt(fecha_hora.substring(0,2));
                            mesI = parseInt(fecha_hora.substring(3,5));
                            anioI = parseInt(fecha_hora.substring(6,10));
                            horaI = parseInt(fecha_hora.substring(13,15));
                            minutoI = parseInt(fecha_hora.substring(16,18));
                            nuevo.setFechaHora(anioI, mesI, diaI, horaI, minutoI);
                        
                        }
                        
                        break;    
                    
                    case 2:
                        //Agregar descripcion
                        String descripcion = celda.getStringCellValue();
                        
                        switch(descripcion){
                            case "Micro":
                                nuevo.setDescripcion(DescripcionSismo.Micro);
                                break;
                            case "Menor":
                                nuevo.setDescripcion(DescripcionSismo.Menor);
                                break;
                            case "Ligero":
                                nuevo.setDescripcion(DescripcionSismo.Ligero);
                                break;
                            case "Moderado":
                                nuevo.setDescripcion(DescripcionSismo.Moderado);
                                break;
                            case "Fuerte":
                                nuevo.setDescripcion(DescripcionSismo.Fuerte);
                                break;
                            case "Mayor":
                                nuevo.setDescripcion(DescripcionSismo.Mayor);
                                break;
                            case "Gran":
                                nuevo.setDescripcion(DescripcionSismo.Gran);
                                break;
                            case "Épico":
                                nuevo.setDescripcion(DescripcionSismo.Epico);
                                break;
                        }
                        break;   
                    
                    case 3:
                        //Agregar magnitud del sismo
                        try{
                            double magnitud = celda.getNumericCellValue();
                            nuevo.setMagnitud(magnitud);
                            break;
                        }
                        catch(NumberFormatException ex){
                            break;
                        }
                        
                        
                    case 4:
                        //Agregar profundidad
                        try{
                            int profundidad = (int) celda.getNumericCellValue();
                            nuevo.setProfundidad(profundidad);
                            break;
                        }
                        catch(IllegalStateException ex){
                            break;
                        }
                        
                        
                    case 5:
                        //Agregar origen del sismo
                        String origen = celda.getStringCellValue();
                        switch(origen){
                            case "Subducción":
                                nuevo.setTipoOrigen(TOrigen.SUBDUCCION);
                                break;
                            case "Choque de Placas":
                                nuevo.setTipoOrigen(TOrigen.CHOQUE_PLACAS);
                                break;

                            case "Tectónico por falla local":
                                nuevo.setTipoOrigen(TOrigen.TECTONICO_FALLA_LOCAL);
                                break;
                        
                            case "Intra placa":
                                nuevo.setTipoOrigen(TOrigen.INTRA_PLACA);
                                break;
                        
                            case "Deformación Interna":
                                nuevo.setTipoOrigen(TOrigen.DEFORMACION_INTERNA);
                                break;
                        }

                
                        break;    
                        
                        
                    case 6:
                        //Agregar latitud
                        try{
                            double latitud = celda.getNumericCellValue();
                            nuevo.setLatitud(latitud);
                            break;
                        }
                        catch(IllegalStateException ex){
                            break;
                        }
                        
                    case 7:
                        //Agregar longitud
                        try{
                            double longitud = celda.getNumericCellValue();
                            nuevo.setLongitud(longitud);
                            break;
                        }
                        catch(IllegalStateException ex){
                            break;
                        }
                        
                        
                    case 8:
                        //Agregar localizacion
                        nuevo.setLocalizacion(celda.getStringCellValue());
                        break;    
                        
                    case 9:
                        //Agregar provincia del sismo
                        String provincia = celda.getStringCellValue();
                        switch(provincia){
                            case "NA":
                                nuevo.setProvincia(Provincia.NA);
                                break;
                            case "Cartago":
                                nuevo.setProvincia(Provincia.CARTAGO);
                                break;
                            case "Alajuela":
                                nuevo.setProvincia(Provincia.ALAJUELA);
                                break;
                            case "Limon":
                                nuevo.setProvincia(Provincia.LIMON);
                                break;
                            case "San Jose":
                                nuevo.setProvincia(Provincia.SANJOSE);
                                break;
                            case "Puntarenas":
                                nuevo.setProvincia(Provincia.PUNTARENAS);
                                break;
                            case "Heredia":
                                nuevo.setProvincia(Provincia.HEREDIA);
                                break;
                            case "Guanacaste":
                                nuevo.setProvincia(Provincia.GUANACASTE);
                                break;
                        
                        }
                        break;    
                        
                    case 10:
                        //Agregar si es maritimo o no
                        String maritimo = celda.getStringCellValue();
                        if(maritimo.equals("Si")){
                            nuevo.setmaritimo(true);
                        }
                        else if(maritimo.equals("No")){
                            nuevo.setmaritimo(false);
                        }
                        break;
               
                        
                }
                
            }
            sistema_sismo.agregarSismo(nuevo);
            
        }
    }
    //Metodo para leer el archivo excel de interesados
    public static void leerArchivoInteresados() throws FileNotFoundException, IOException {
        FileInputStream archivo = new FileInputStream("InteresadosNotificaciones.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        
        int numero_Filas = hoja.getLastRowNum();
        
        for(int i = 0;i <= numero_Filas; i++){
            Row fila = hoja.getRow(i);
            int numero_Columnas = fila.getLastCellNum();
            
            interesadoNotificacion nuevoInteresado = new interesadoNotificacion();
            
            for(int j = 0; j < numero_Columnas; j++){
                Cell celda = fila.getCell(j);
                
                switch(j){
                    
                    case 0:
                        nuevoInteresado.setNombre(celda.getStringCellValue());
                         
                    case 1:
                        if (celda.getCellTypeEnum() != BLANK){
                           nuevoInteresado.setCorreo(celda.getStringCellValue());   
                        }
                        else{
                            nuevoInteresado.setCorreo("NA");
                        }
                        break;
                             
                    case 2:
                        if (celda.getCellTypeEnum() != BLANK){
                            nuevoInteresado.setNumeroTelefono(celda.getStringCellValue());
                        }
                        else{
                            nuevoInteresado.setNumeroTelefono("NA");
                        }
                        break;
                          
                    case 3:
                        String listaProvincias = celda.getStringCellValue();
                        if (listaProvincias.contains("Cartago")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.CARTAGO);
                            System.out.println("Cartago");
                        }
                        if (listaProvincias.contains("San Jose")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.SANJOSE);
                            System.out.println("San Jose");
                        }
                        if (listaProvincias.contains("Puntarenas")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.PUNTARENAS);
                            System.out.println("Puntarenas");
                        }
                        if (listaProvincias.contains("Limón")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.LIMON);
                            System.out.println("Limón");
                        }
                        if (listaProvincias.contains("Guanacaste")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.GUANACASTE);
                            System.out.println("Guanacaste");
                        }
                        if (listaProvincias.contains("Alajuela")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.ALAJUELA);
                            System.out.println("Alajuela");
                        }
                        if (listaProvincias.contains("Heredia")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.HEREDIA);
                            System.out.println("Heredia");
                        }
                        if (listaProvincias.contains("Maritimo")){
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.NA);
                            System.out.println("NA");
                        }
                        
                        break;
                
                }
    
            }
        sistema_sismo.agregarInteresadosNotificaciones(nuevoInteresado);
        }
    }
    
    // Botón para ver el registro de sismos
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new VentanaTablaDatosSismos(this,true).setVisible(true);      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new VentanaEstadisticas(this,true).setVisible(true);
        //new VentanaEstadisticas(this,true).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Botón Salir
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        // Se quita la visibilidad de la ventana y se desecha (Cerrando el programa)
        this.setVisible(false);
        this.dispose();      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new ventana_interesados(this,true).setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ApuntarseNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApuntarseNotifActionPerformed
        new VentanaAgregarInteresado(this,true).setVisible(true);
    }//GEN-LAST:event_ApuntarseNotifActionPerformed
    
    public static void main(String args[]) throws FileNotFoundException, IOException, NullPointerException {
   
        try{
        leerArchivoRegistroSismos(); 
        }
        catch(NullPointerException ex){}
        try{
            leerArchivoInteresados();
        }
        catch(NullPointerException ex){}
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApuntarseNotif;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
