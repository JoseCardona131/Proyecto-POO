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
    // Este sistema será diferente en todas las ventanas pero ya que sus atributos son estáticos cambian para todas las ventanas
    static Sistema_Sismos sistema_sismo = new Sistema_Sismos();
   
    public Ventana_Principal() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        Titulo = new javax.swing.JLabel();
        VerSismosRegistrados = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        ListaInteresados = new javax.swing.JButton();
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

        Titulo.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        Titulo.setText("Sistema de Información de Sismos");

        VerSismosRegistrados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        VerSismosRegistrados.setText("Sismos Registrados");
        VerSismosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerSismosRegistradosActionPerformed(evt);
            }
        });

        Estadisticas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Estadisticas.setText("Estadísticas");
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        ListaInteresados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ListaInteresados.setText("Lista Apuntados al sistema notificaciones");
        ListaInteresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaInteresadosActionPerformed(evt);
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
                    .addComponent(ListaInteresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApuntarseNotif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 640, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VerSismosRegistrados)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(Estadisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(396, 396, 396))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(VerSismosRegistrados)
                .addGap(29, 29, 29)
                .addComponent(Estadisticas)
                .addGap(45, 45, 45)
                .addComponent(Salir)
                .addGap(94, 94, 94)
                .addComponent(ApuntarseNotif)
                .addGap(18, 18, 18)
                .addComponent(ListaInteresados)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Método para leer los datos recibidos de un archivo de excel (Caso Sismos)
    public static void leerArchivoRegistroSismos() throws FileNotFoundException, IOException {
        
        // Se abre el archivo llamado Información Sismos, donde se contiene toda la información relacionada a acada sismo
        FileInputStream archivo = new FileInputStream("InformacionSismos.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        
        // Se obtiene la cantidad de filas con información dentro del archivo
        int numero_Filas = hoja.getLastRowNum();
       
        // Se va a generar un ciclo que se repetirá hasta que se haya llegado al límite dde filas
        for(int i = 0;i <= numero_Filas; i++){
            
            // Se obtiene  la fila en ese índice
            Row fila = hoja.getRow(i);
            
            // Se obtiene la cantidad de columnas en la fila
            int numero_Columnas = fila.getLastCellNum();
            
            // Se crea un nuevo objeto sismo donde guardar los datos de la fila actual
            Sismo nuevo = new Sismo();
            
            // Por cada columna existente dentro de la fila se van a sacar sus datos
            for(int j = 0; j < numero_Columnas; j++){
                
                // Se obtienen los datos de la celda en esa fila y esa columna
                Cell celda = fila.getCell(j);
                
                // Deoendiendo de la columna en la que se esta se va a sacar un valor y tipo de dato diferente
                // También se gguardarán como diferentes atributos del sismo
                switch(j){
                    
                    // Caso 0 (Nombre del sismo)
                    case 0:
                        //Agregar nombre al sismo
                        
                        nuevo.setNombre(celda.getStringCellValue());
                        break;
                    
                    // Caso 1 (Fecha y hora)
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
                        
                    // Caso 2 (Descripción del sismo)
                    case 2:
                        
                        // Se guarda en un string el valor de esta celda
                        String descripcion = celda.getStringCellValue();
                        
                        // Dependiendo del valor del string se le va a asignar un tipo de sismo diferente a la descripcion
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
                    
                    // Caso 3 Magnitud
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
                        
                    // Caso 4 (Profundidad)    
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
                        
                    // Caso 5 (Origen)    
                    case 5:
                        
                        // Se guarda el valor de la celda en un string
                        String origen = celda.getStringCellValue();
                        
                        // Dependiendo del valor del string se asignará un tipo de origen diferente al sismo
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
                        
                    // Caso 6 (Latitud)          
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
                    
                    // Caso 7 (Longitud)
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
                        
                    // Caso 8 (Información de la localización)    
                    case 8:
                        //Agregar localizacion
                        nuevo.setLocalizacion(celda.getStringCellValue());
                        break;    
                    
                    
                    // Caso 9 (Provincia de Origen)
                    case 9:
                        
                        //Se guarda el valor de la provincia escrita en la celda
                        String provincia = celda.getStringCellValue();
                        
                        // Dependiendo del valor del String se asignará una provinca al sismo
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
                    
                    // Caso 10 (Flag sismo marítimo o no)
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
    //Metodo para leer el archivo excel de interesados en notificaciones
    public static void leerArchivoInteresados() throws FileNotFoundException, IOException {
        
        // Se abre el archivo de interesados en notificaciones desde la primera fila
        FileInputStream archivo = new FileInputStream("InteresadosNotificaciones.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(0);
        
        // Se obtiene el número máximo de filas
        int numero_Filas = hoja.getLastRowNum();
        
        // Por cada fila con contenido que hay dentro del excel 
        for(int i = 0;i <= numero_Filas; i++){
            Row fila = hoja.getRow(i);
            int numero_Columnas = fila.getLastCellNum();
            
            // Por cada fila se va a crear un nuevo objeto InteresadoNotificación
            interesadoNotificacion nuevoInteresado = new interesadoNotificacion();
            
            // Por cada celda en la fila del interesado en notificación
            for(int j = 0; j < numero_Columnas; j++){
                
                // Se obtiene el número de celda
                Cell celda = fila.getCell(j);
                
                // Dependiendo del valor de la celda se asignará un atributo diferente al interesado
                switch(j){
                    
                    // Caso 0 (Nombre del interesado)
                    case 0:
                        // Se asigna el nombre
                        nuevoInteresado.setNombre(celda.getStringCellValue());
                    
                    // Caso 1 (Correo del interesado)
                    case 1:
                        // Se revisa si hay un correo registrado
                        // Si el espacio del correo no esta vacío
                        if (celda.getCellTypeEnum() != BLANK){
                            
                           // Se asigna el valor del correo al interesado
                           nuevoInteresado.setCorreo(celda.getStringCellValue());   
                        }
                        // Si esta vacío se asigna NA al interesado
                        else{
                            nuevoInteresado.setCorreo("NA");
                        }
                        break;
                    
                    // Caso 2 (Telefono del usuario)
                    case 2:
                        // Si el valor de la celda no esta vacio
                        if (celda.getCellTypeEnum() != BLANK){
                            // Se agrega el teléfono al interesado
                            nuevoInteresado.setNumeroTelefono(celda.getStringCellValue());
                        }
                        else{
                            // Si esta vacío
                            // Se agrega NA al interesado
                            nuevoInteresado.setNumeroTelefono("NA");
                        }
                        break;
                    
                    // Caso 3 (Lista de provincias)
                    case 3:
                        // Se obtiene todo el string guardado en la celda de provincias
                        String listaProvincias = celda.getStringCellValue();
                        
                        // Se van a buscar substrings dentro del string de la celda
                        
                        // Si se encuentra la palabra cartago
                        if (listaProvincias.contains("Cartago")){
                            // Se agrega Cartago a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.CARTAGO);
                            System.out.println("Cartago");
                        }
                        // Si se encuentra la palabra San Jose
                        if (listaProvincias.contains("San Jose")){
                            // Se agrega San Jose a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.SANJOSE);
                            System.out.println("San Jose");
                        } 
                        // Si se encuentra la palabra Puntarenas
                        if (listaProvincias.contains("Puntarenas")){
                            // Se agrega Puntarenas a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.PUNTARENAS);
                            System.out.println("Puntarenas");
                        }
                        // Si se encuentra la palabra Limón
                        if (listaProvincias.contains("Limón")){
                            // Se agrega Limon a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.LIMON);
                            System.out.println("Limón");
                        }
                        // Si se encuentra la palabra Guanacaste
                        if (listaProvincias.contains("Guanacaste")){
                            // Se agrega Guanacaste a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.GUANACASTE);
                            System.out.println("Guanacaste");
                        }
                        // Si se encuentra la palabra Alajuela
                        if (listaProvincias.contains("Alajuela")){
                            // Se agrega Alajuela a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.ALAJUELA);
                            System.out.println("Alajuela");
                        }
                        // Si se encuentra la palabra Heredia
                        if (listaProvincias.contains("Heredia")){
                            // Se agrega Heredia a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.HEREDIA);
                            System.out.println("Heredia");
                        }
                        // Si se encuentra la palabra Maritimo
                        if (listaProvincias.contains("Maritimo")){
                            // Se agrega NA a las provincias de interés
                            nuevoInteresado.AgregarProvinciaInteres(Provincia.NA);
                            System.out.println("NA");
                        } 
                        break; 
                }
            }
        // Se agrega el nuevo interesado a la lista
        sistema_sismo.agregarInteresadosNotificaciones(nuevoInteresado);
        }
    }
    
    // Botón para ver el registro de sismos
    private void VerSismosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSismosRegistradosActionPerformed

        new VentanaTablaDatosSismos(this,true).setVisible(true);      
    }//GEN-LAST:event_VerSismosRegistradosActionPerformed

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed
        new VentanaEstadisticas(this,true).setVisible(true);
        //new VentanaEstadisticas(this,true).setVisible(true);
    }//GEN-LAST:event_EstadisticasActionPerformed
    
    // Botón Salir
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        // Se quita la visibilidad de la ventana y se desecha (Cerrando el programa)
        this.setVisible(false);
        this.dispose();      
    }//GEN-LAST:event_SalirActionPerformed

    private void ListaInteresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaInteresadosActionPerformed
        // TODO add your handling code here:
        new ventana_interesados(this,true).setVisible(true);
        
    }//GEN-LAST:event_ListaInteresadosActionPerformed

    private void ApuntarseNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApuntarseNotifActionPerformed
        new VentanaAgregarInteresado(this,true).setVisible(true);
    }//GEN-LAST:event_ApuntarseNotifActionPerformed
    
    public static void main(String args[]) throws FileNotFoundException, IOException, NullPointerException {
        
        // Se van a intentar leer ambos archivos de datos
        // Los datos de los Sismos
        // Los datos de los Interesados
        
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
    private javax.swing.JButton Estadisticas;
    private javax.swing.JButton ListaInteresados;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerSismosRegistrados;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
