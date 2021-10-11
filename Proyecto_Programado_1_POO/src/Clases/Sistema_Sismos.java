/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Provincia.ALAJUELA;
import static Clases.Provincia.CARTAGO;
import static Clases.Provincia.GUANACASTE;
import static Clases.Provincia.HEREDIA;
import static Clases.Provincia.LIMON;
import static Clases.Provincia.NA;
import static Clases.Provincia.PUNTARENAS;
import static Clases.Provincia.SANJOSE;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
/**
 *
 * @author monge
 */
public class Sistema_Sismos {
    
    private static ArrayList<Sismo> sismosRegistrados = new ArrayList();
    private static ArrayList<interesadoNotificacion> interesadosNotificaciones = new ArrayList();

    public Sistema_Sismos() {
    }

    /* ACME SISMOS */
    
    // Aregar Sismo
    public boolean agregarSismo(Sismo sismo){
        for(Sismo actual: sismosRegistrados){
            if(actual.getNombre().equals(sismo.getNombre())){
                return false;

            }
        }
        sismosRegistrados.add(sismo);
        return true;

    }
    
    // Modificar Nombre Sismo
    public boolean modificarSismoNombre(String nombre, String nuevoNombre){
        for(Sismo actual : sismosRegistrados){
            if(actual.getNombre().equals(nombre)){
                actual.setNombre(nuevoNombre);
                return true;
            }
        }
        return false;
    }
    
    //Modificar Profundidad Sismo
    public boolean modificarSismoProfundidad(double profundidad, double nuevoProfundidad){
        for(Sismo actual : sismosRegistrados){
            if(actual.getProfundidad() == profundidad ){
                actual.setProfundidad(nuevoProfundidad);
                return true;
            }
        }
        return false;
    }
    
    
    //Modificar Magnitud Sismo
    public boolean modificarSismoMagnitud(double magnitud, double nuevoMagnitud){
        for(Sismo actual : sismosRegistrados){
            if(actual.getMagnitud() == magnitud){
                actual.setProfundidad(nuevoMagnitud);
                return true;
            }
        }
        return false;
    }
    
    //Modificar Localizacion Sismo
    public boolean modificarSismoLocalizacion(String localizacion, String nuevaLocalizacion){
        for(Sismo actual : sismosRegistrados){
            if(actual.getlocalizacion().equals(localizacion)){
                actual.setLocalizacion(nuevaLocalizacion);
                return true;
            }
        }
        return false;
    }
    
    /*public boolean modificarSismoProvincia(Provincia provincia_c, Provincia nuevaProvincia){
        for(Sismo actual : sismosRegistrados){
            if (actual.equals(provincia_c)){
                return true;
            }
        }
        return false;
     }*/
    
    // Modificar Maritimo Sismo
    public boolean modificarSismoMaritimo(boolean maritimo, boolean nuevoMaritimo){
        for(Sismo actual : sismosRegistrados){
            if(actual.getmaritimo() == maritimo){
                actual.setmaritimo(nuevoMaritimo);
                return true;
            }
        }
        return false;
    }
    
    //Modificar Descripcion Sismo
    public boolean modificarSismoDescripcion(DescripcionSismo descripcion, DescripcionSismo nuevadescripcion){
        for(Sismo actual : sismosRegistrados){
            if(actual.getDescripcion().equals(descripcion)){
                actual.setDescripcion(nuevadescripcion);
                return true;
            }
        }
        return false;
    }
    
    public boolean consultarSismo(Sismo sismo){
        for(Sismo actual : sismosRegistrados){
            if(actual.getNombre().equals(sismo.getNombre())){
                System.out.println(sismo.getNombre());
                return true;
            }
        }

        return false;
           
    }
    
    public boolean consultar_sismo_nombre(String nombre){
        for(Sismo actual : sismosRegistrados){
            if(actual.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    
    // Eliminar Sismo
    public boolean eliminarSismo(Sismo sismo){
        for(Sismo actual: sismosRegistrados){
            if(actual.getNombre().equals(sismo.getNombre())){
                sismosRegistrados.remove(sismo);
                return true;

            }
        }
        return false;

    }
    
    // Guardar en excel
    public void GuardarExcel(Sismo sismo) throws FileNotFoundException, IOException{
        
       FileInputStream myxlsx = new FileInputStream("InformacionSismos.xlsx");
       XSSFWorkbook Sheet = new XSSFWorkbook(myxlsx);
       XSSFSheet worksheet = Sheet.getSheetAt(0);
       int lastRow=worksheet.getLastRowNum();
       Row row = worksheet.createRow(++lastRow);
       
       for(Sismo actual: sismosRegistrados){
           if(actual.getNombre().equals(sismo.getNombre())){
               row.createCell(0).setCellValue(sismo.getNombre());
           }
           String fecha;
           if(actual.getFechaHora().equals(sismo.getFechaHora())){
               if(sismo.getFechaHora().getDay() < 10){
                   if(sismo.getFechaHora().getMonth() < 10){
                       if(sismo.getFechaHora().getMonth() == 0){
                            fecha = "0" + sismo.getFechaHora().getDay() + "/" + "12" + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                       
                       }
                       
                       else{
                           fecha = "0" + sismo.getFechaHora().getDay() + "/" + "0" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                       }
                       
                   
                   }
                   else{
                       fecha = "0" + sismo.getFechaHora().getDay() + "/" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                   }
               
               }
               else{
                    if(sismo.getFechaHora().getMonth() < 10){
                        if(sismo.getFechaHora().getMonth() == 0){
                            fecha = "0" + sismo.getFechaHora().getDay() + "/" + "12" + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                       
                       }
                       
                       else{
                           fecha = "0" + sismo.getFechaHora().getDay() + "/" + "0" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                       }
                       
                   
                   }
                   else{
                       fecha = sismo.getFechaHora().getDay() + "/" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
                   }
               
               }
               
               row.createCell(1).setCellValue(fecha);
           
           }
           
           switch(sismo.getDescripcion()){
               //Micro, Menor, Ligero, Moderado,Fuerte,Mayor,Gran,Epico
               case Micro:
                   row.createCell(2).setCellValue("Micro");
                   break;
               case Menor:
                   row.createCell(2).setCellValue("Menor");
                   break;
               case Ligero:
                   row.createCell(2).setCellValue("Ligero");
                   break;
               case Moderado:
                   row.createCell(2).setCellValue("Moderado");
                   break;
               case Fuerte:
                   row.createCell(2).setCellValue("Fuerte");
                   break;
               case Mayor:
                   row.createCell(2).setCellValue("Mayor");
                   break;
               case Gran:
                   row.createCell(2).setCellValue("Gran");
                   break;
               case Epico:
                   row.createCell(2).setCellValue("Épico");
                   break;
           }
           
           if(actual.getMagnitud() == sismo.getMagnitud()){
               row.createCell(3).setCellValue(sismo.getMagnitud());
           }
           
           if(actual.getProfundidad() == sismo.getProfundidad()){
               row.createCell(4).setCellValue(sismo.getProfundidad());
           }
           
           switch(sismo.getOrigen()){
                case SUBDUCCION:
                    row.createCell(5).setCellValue("Subducción");
                    break;
                case CHOQUE_PLACAS:
                    row.createCell(5).setCellValue("Choque de Placas");
                    break;
                case TECTONICO_FALLA_LOCAL:
                    row.createCell(5).setCellValue("Tectónico por falla local");
                    break;
                case INTRA_PLACA:
                    row.createCell(5).setCellValue("Intra placa");
                    break;
                case DEFORMACION_INTERNA:
                    row.createCell(5).setCellValue("Deformación Interna");
                    break;
            }
           
          
          if(actual.getLatitud() == sismo.getLatitud()){
              row.createCell(6).setCellValue(sismo.getLatitud());
          }
          
          if(actual.getLongitud() == sismo.getLongitud()){
              row.createCell(7).setCellValue(sismo.getLongitud());
          }
          
          if(actual.getlocalizacion().equals(sismo.getlocalizacion())){
              row.createCell(8).setCellValue(sismo.getNombre());
          }
          
          switch(sismo.getProvincia()){/////////////////////////////////////////////////////////sismo o actual///////////////////////////
               case CARTAGO:
                    row.createCell(9).setCellValue("Cartago"); 
                    break;
                case SANJOSE:
                    row.createCell(9).setCellValue("San Jose");
                    break;
                case HEREDIA:
                    row.createCell(9).setCellValue("Heredia");
                    break;
                case ALAJUELA:
                    row.createCell(9).setCellValue("Alajuela");
                    break;
                case GUANACASTE:
                    row.createCell(9).setCellValue("Guanacaste");
                    break;
                case PUNTARENAS:
                    row.createCell(9).setCellValue("Puntarenas");
                    break;
                case LIMON:
                    row.createCell(9).setCellValue("Limon");
                    break;
                case NA:
                    row.createCell(9).setCellValue("NA");
                    break;
            }
          
          if(sismo.getmaritimo() == true){/////////////////////////////////////////////////////////sismo o actual///////////////////////////
              row.createCell(10).setCellValue("Si");
          }
          
          if(sismo.getmaritimo() == false){
              row.createCell(10).setCellValue("No");
          }
              
          
          
          
       }
       
       
       myxlsx.close();
       FileOutputStream output_file =new FileOutputStream(new File("InformacionSismos.xlsx"));  
       //write changes
       Sheet.write(output_file);
       output_file.close();
       System.out.println(" is successfully written");
    }
    
    /* ACME INTERESADOS NOTIFICACIONES */
    
    // Agregar Interesados
    public boolean agregarInteresadosNotificaciones(interesadoNotificacion interesado){
        for(interesadoNotificacion actual: interesadosNotificaciones){
            if(actual.getNombre().equals(interesado.getNombre())){
                return false;

            }
        }
        interesadosNotificaciones.add(interesado);
        return true;
    }
    
    //Modificar Nombre Interesados
    public boolean modificarInteresadoNotificacionesNombre(String nombre, String nuevoNombre){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getNombre().equals(nombre)){
                actual.setNombre(nuevoNombre);
                return true;
            }
        }
        return false;
    }
    
    
    // Modificar Correo Interesado
    public boolean modificarInteresadoNotificacionesCorreo(String correo, String nuevoCorreo){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getCorreo().equals(correo)){
                actual.setCorreo(nuevoCorreo);
                return true;
            }
        }
        return false;
    }
    
    // Modificar Numero Tel Interesado
    public boolean modificarInteresadoNotificacionesNumeroTel(String numeroTelefono, String nuevoNumTel){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getNumeroTelefono().equals(numeroTelefono)){
                actual.setNumeroTelefono(nuevoNumTel);
                return true;
            }
        }
        return false;
    }
    
    // Consultar Interesado
    public boolean consultarInteresadoNotificion(interesadoNotificacion interesado){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getNombre().equals(interesado.getNombre())){
                return true;
            }
        }
        return false;
           
    }
    // Consultar si ya esta registrado un correo
     public boolean ConsultarCorreoUsuario(String mail){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getCorreo().equals(mail)){
                return true;
            }
        }
        return false; 
         
     }
     
     // Consultar si ya esta registrado un numero
     public boolean ConsultarNumeroUsuario(String numero){
        for(interesadoNotificacion actual : interesadosNotificaciones){
            if(actual.getNumeroTelefono().equals(numero)){
                return true;
            }
        }
        return false; 
         
     }
    
    //Eliminar Interesados
    public boolean eliminarInteresadoNotificacion(interesadoNotificacion interesado){
        for(interesadoNotificacion actual: interesadosNotificaciones){
            if(actual.getNombre().equals(interesado.getNombre())){
                interesadosNotificaciones.remove(interesado);
                return true;

            }
        }
        return false;

    }
    
    //Retornar listas de interesados
    public ArrayList<interesadoNotificacion> retorna_lista(){
       return Sistema_Sismos.interesadosNotificaciones;
    }
    
    // Guardar excel interesados
    public void GuardarExcelInteresados(interesadoNotificacion interesado) throws FileNotFoundException, IOException{
       FileInputStream myxlsx = new FileInputStream("InteresadosNotificaciones.xlsx");
       XSSFWorkbook Sheet = new XSSFWorkbook(myxlsx);
       XSSFSheet worksheet = Sheet.getSheetAt(0);
       int lastRow=worksheet.getLastRowNum();
       System.out.println(lastRow);
       Row row = worksheet.createRow(++lastRow);
       
       //String hola = "hola";
       /*row.createCell(1).setCellValue("Dr.Hola");
       row.createCell(2).setCellValue("Dr.Hola2222");*/
       
       for(interesadoNotificacion actual: interesadosNotificaciones){
           if(actual.getNombre().equals(interesado.getNombre())){
               row.createCell(0).setCellValue(interesado.getNombre());
           }
           
           if(actual.getCorreo().equals(interesado.getCorreo())){
               row.createCell(1).setCellValue(interesado.getCorreo());
           }
           
           if(actual.getNumeroTelefono().equals(interesado.getNumeroTelefono())){
               row.createCell(2).setCellValue(interesado.getNumeroTelefono());
           }

           ArrayList<Provincia> provinciasI = interesado.getProvinciasInteres();
           
           String provincias = "";
           for(Provincia actual2 : provinciasI){
               if(actual2 == CARTAGO){
                   provincias = provincias + "Cartago,";
               }
               
               if(actual2 == SANJOSE){
                   provincias = provincias + "San Jose,";
               }
               
               if(actual2 == HEREDIA){
                   provincias = provincias + "Heredia,";
               }
               
               if(actual2 == ALAJUELA){
                   provincias = provincias + "Alajuela,";
               }
               
               if(actual2 == GUANACASTE){
                   provincias = provincias + "Guanacaste,";
               }
               
               if(actual2 == PUNTARENAS){
                   provincias = provincias + "Puntarenas,";
               }
               
               if(actual2 == LIMON){
                   provincias = provincias + "Limon,";
               }
               
               if(actual2 == NA){
                   provincias = provincias + "NA,";
               }
              
           }
           row.createCell(3).setCellValue(provincias);

       }
       
       
       myxlsx.close();
       FileOutputStream output_file =new FileOutputStream(new File("InteresadosNotificaciones.xlsx"));  
       //write changes
       Sheet.write(output_file);
       output_file.close();
       System.out.println(" is successfully written");
    }
    
    //Metodo para generar la tabla de datos
    public static DefaultTableModel cargarSismos(){
        Object [] encabezado = {"Nombre", "Fecha y Hora", "Descripcion", "Magnitud", "Profundidad", "Origen", "Latitud", "Longitud","Localizacion","Provincia","Maritimo"};
        DefaultTableModel tabla_datos = new DefaultTableModel(encabezado, sismosRegistrados.size());
        for(int i = 0; i < tabla_datos.getRowCount(); i++){
            Sismo sismo = sismosRegistrados.get(i);
            //Asiganr datos a la tabla
            tabla_datos.setValueAt(sismo.getNombre(), i, 0);
            tabla_datos.setValueAt(sismo.getDescripcion(), i, 2);
            tabla_datos.setValueAt(sismo.getMagnitud(), i, 3);
            tabla_datos.setValueAt(sismo.getProfundidad(), i, 4);
            tabla_datos.setValueAt(sismo.getOrigen(), i, 5);
            tabla_datos.setValueAt(sismo.getLatitud(), i, 6);
            tabla_datos.setValueAt(sismo.getLongitud(), i, 7);
            tabla_datos.setValueAt(sismo.getlocalizacion(), i, 8);
            tabla_datos.setValueAt(sismo.getProvincia(), i, 9);
            tabla_datos.setValueAt(sismo.getmaritimo(), i, 10);
            
            //Asignar la fecha al calendario
            String fecha;
            if(sismo.getFechaHora().getMonth() == 0){
                fecha = "0" + sismo.getFechaHora().getDay() + "/" + "12" + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();

           }
                       
            else{
                fecha = "0" + sismo.getFechaHora().getDay() + "/" + "0" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
            }
            
            tabla_datos.setValueAt(fecha, i, 1);
            
        
        }
        return tabla_datos;
    }
    
    //Metodos para graficar los datos
    //Metodo para obtener la cantidad de sismos por provincia
    public JFreeChart cantidad_sismos_provincia(){
        HistogramDataset datos = new HistogramDataset();
        int cartago = 0, alajuela = 0, heredia = 0, guanacaste = 0, limon = 0, sanjose = 0,puntarenas = 0, NA = 0;
        for(Sismo actual: sismosRegistrados){
            switch(actual.getProvincia()){
                case CARTAGO:
                    cartago += 1; 
                    break;
                case SANJOSE:
                    sanjose += 1;
                    break;
                case HEREDIA:
                    heredia += 1;
                    break;
                case ALAJUELA:
                    alajuela += 1;
                    break;
                case GUANACASTE:
                    guanacaste += 1;
                    break;
                case PUNTARENAS:
                    puntarenas += 1;
                    break;
                case LIMON:
                    limon += 1;
                    break;
                case NA:
                    NA += 1;
                    break;
            }
        }
        
        int cont = 0;
        double cantidades[] = new double[cartago+sanjose+alajuela+heredia+limon+puntarenas+guanacaste+NA];
        
        for(int i = 0; i < cartago; i++){
            cantidades[cont] = 3;
            cont++;
        }
        
        for(int i = 0; i < sanjose; i++){
            cantidades[cont] = 1;
            cont++;
        }
         
        for(int i = 0; i < limon; i++){
            cantidades[cont] = 7;
            cont++;
        }
          
        for(int i = 0; i < heredia; i++){
            cantidades[cont] = 4;
            cont++;
        }
           
        for(int i = 0; i < alajuela; i++){
            cantidades[cont] = 2;
            cont++;
        }
            
        for(int i = 0; i < guanacaste; i++){
            cantidades[cont] = 5;
            cont++;
        }
             
        for(int i = 0; i < puntarenas; i++){
            cantidades[cont] = 6;
            cont++;
        }
              
        for(int i = 0; i < NA; i++){
            cantidades[cont] = 9;
            cont++;
        }

        
        datos.addSeries("Cantidad de Sismos por Provincia", cantidades, 20);
        
        JFreeChart grafica = ChartFactory.createHistogram("Cantidad de Sismos por Provincia", "Provincias", "Cantidad", datos, PlotOrientation.VERTICAL, true, true, false);
        
        return grafica;
    }
    
    //Metodo para pobtenr canbtidad de sismos por origen
    public JFreeChart cantidad_sismos_origen(){
        DefaultPieDataset datos = new DefaultPieDataset();
        int subduccion = 0, choque_placas = 0, tectonico_falla_local = 0, intra_placa = 0, deformacion_interna = 0;
        for(Sismo actual: sismosRegistrados){
            switch(actual.getOrigen()){
                case SUBDUCCION:
                    subduccion += 1; 
                    break;
                case CHOQUE_PLACAS:
                    choque_placas += 1;
                    break;
                case TECTONICO_FALLA_LOCAL:
                    tectonico_falla_local += 1;
                    break;
                case INTRA_PLACA:
                    intra_placa += 1;
                    break;
                case DEFORMACION_INTERNA:
                    deformacion_interna += 1;
                    break;
            }
        }
        
        // Se va a sacar el porcentaje de cada

        
        datos.setValue("Subduccion", subduccion);
        datos.setValue("Choque de Placas", choque_placas);
        datos.setValue("Tectonico por falla local", tectonico_falla_local);
        datos.setValue("Intra placa", choque_placas);
        datos.setValue("Deformacion interna", intra_placa);
        JFreeChart grafica = ChartFactory.createPieChart("Cantidad de Sismos por Origen", datos, datos, tectonico_falla_local, true, true, true, true, false, false);
        
        return grafica; 
    }
    
    //Cantidad de sismos por rango de fechas
     public DefaultTableModel cantidad_sismos_rango(){
        Object [] encabezado = {"Rango Fechas", "Cantidad"};
        DefaultTableModel tabla_datos = new DefaultTableModel(encabezado, 6);
        int enero_febrero=0, marzo_abril=0, mayo_junio=0, julio_agosto=0, octubre_septiembre=0, noviembre_diciembre=0;
        for(Sismo actual: sismosRegistrados){
            if (actual.getFechaHora().getMonth() == 1 || actual.getFechaHora().getMonth() == 2){
                enero_febrero +=1;
            }
            else if(actual.getFechaHora().getMonth() == 3 || actual.getFechaHora().getMonth() == 4){
                marzo_abril += 1;
            }
            else if(actual.getFechaHora().getMonth() == 5 || actual.getFechaHora().getMonth() == 6){
                mayo_junio += 1;
            }
            else if(actual.getFechaHora().getMonth() == 7 || actual.getFechaHora().getMonth() == 8){
                julio_agosto += 1;
            }
            else if(actual.getFechaHora().getMonth() == 9 || actual.getFechaHora().getMonth() == 10){
                octubre_septiembre += 1;
            }
            else if(actual.getFechaHora().getMonth() == 11 || actual.getFechaHora().getMonth() == 12){
                noviembre_diciembre += 1;
            }
        }

        tabla_datos.setValueAt("01/01 - 28/02", 0, 0);
        tabla_datos.setValueAt(enero_febrero, 0, 1);
        
        tabla_datos.setValueAt("01/03 - 30/04", 1, 0);
        tabla_datos.setValueAt(marzo_abril, 1, 1);
        
        tabla_datos.setValueAt("01/05 - 30/06", 2, 0);
        tabla_datos.setValueAt(mayo_junio, 2, 1);
        
        tabla_datos.setValueAt("01/07 - 31/08", 3, 0);
        tabla_datos.setValueAt(julio_agosto, 3, 1);
        
        tabla_datos.setValueAt("01/09 - 31/10", 4, 0);
        tabla_datos.setValueAt(octubre_septiembre, 4, 1);
        
        tabla_datos.setValueAt("01/11 - 31/12", 5, 0);
        tabla_datos.setValueAt(noviembre_diciembre, 5, 1);
        
        
       
     
        return tabla_datos;
    
    }
    
    //Cantidad de sismos por mes en un año
    public JFreeChart cantidadSismosMes(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        int enero=0, febrero=0, marzo=0, abril=0, mayo=0, junio=0, julio=0, agosto=0, septiembre=0, octubre=0, noviembre=0, diciembre=0;
        for(Sismo actual: sismosRegistrados){
            switch(actual.getFechaHora().getMonth()){
                case 1:
                    enero += 1; 
                    break;
                case 2:
                    febrero += 1;
                    break;
                case 3:
                    marzo += 1;
                    break;
                case 4:
                    abril += 1;
                    break;
                case 5:
                    mayo += 1;
                    break;
                case 6:
                    junio += 1;
                    break;
                case 7:
                    julio += 1;
                    break;
                case 8:
                    agosto += 1;
                    break;
                case 9:
                    septiembre += 1;
                    break;
                case 10:
                    octubre += 1;
                    break;
                case 11:
                    noviembre += 1;
                    break;
                case 12:
                    diciembre += 1;
                    break;
            }
        }
        
 

        
        datos.addValue(enero, "Enero", "Cantidad");
        datos.addValue(febrero, "Febrero", "Cantidad");
        datos.addValue(marzo, "Marzo", "Cantidad");
        datos.addValue(abril, "Abril", "Cantidad");
        datos.addValue(mayo, "Mayo", "Cantidad");
        datos.addValue(junio, "Junio", "Cantidad");
        datos.addValue(julio, "Julio", "Cantidad");
        datos.addValue(agosto, "Agosto", "Cantidad");
        datos.addValue(septiembre, "Septiembre", "Cantidad");
        datos.addValue(octubre, "Octubre", "Cantidad");
        datos.addValue(noviembre, "Noviembre", "Cantidad");
        datos.addValue(diciembre, "Diciembre", "Cantidad");
        JFreeChart grafica = ChartFactory.createBarChart("Cantidad de sismos por mes", "Mes", "Cantidad", datos, PlotOrientation.VERTICAL, true, true, true);
        
        return grafica; 
    
    }
    
    //Cantidad de sismos por magnitud
    public DefaultTableModel cantidad_sismos_magnitud(){
        Object [] encabezado = {"Magnitud", "Cantidad"};
        DefaultTableModel tabla_datos = new DefaultTableModel(encabezado, 8);
        int menor_2 = 0, _3 = 0, _4 = 0, _5 = 0, _6 = 0, _7 = 0, _9 = 0, _10 = 0;
        for(Sismo actual: sismosRegistrados){
            if (actual.getMagnitud() < 2.0){
                menor_2 +=1;
            }
            else if((actual.getMagnitud() >= 2.0) &&(actual.getMagnitud() < 4.0)){
                _3 += 1;
            }
            else if((actual.getMagnitud() >= 4.0) &&(actual.getMagnitud() < 5.0)){
                _4 += 1;
            }
            else if((actual.getMagnitud() >= 5.0) &&(actual.getMagnitud() < 6.0)){
                _5 += 1;
            }
            else if((actual.getMagnitud() >= 6.0) &&(actual.getMagnitud() < 7.0)){
                _6 += 1;
            }
            else if((actual.getMagnitud() >= 7.0) &&(actual.getMagnitud() < 8.0)){
                _7 += 1;
            }
            else if((actual.getMagnitud() >= 8.0) &&(actual.getMagnitud() < 10.0)){
                _9 += 1;
            }
            else{
               _10 += 1;
            }
        }

        tabla_datos.setValueAt("0.1 - 1.9", 0, 0);
        tabla_datos.setValueAt(menor_2, 0, 1);
        
        tabla_datos.setValueAt("2.0 - 3.9", 1, 0);
        tabla_datos.setValueAt(_3, 1, 1);
        
        tabla_datos.setValueAt("4.0 - 4.9", 2, 0);
        tabla_datos.setValueAt(_4, 2, 1);
        
        tabla_datos.setValueAt("5.0 - 5.9", 3, 0);
        tabla_datos.setValueAt(_5, 3, 1);
        
        tabla_datos.setValueAt("6.0 - 6.9", 4, 0);
        tabla_datos.setValueAt(_6, 4, 1);
        
        tabla_datos.setValueAt("7.0 - 7.9", 5, 0);
        tabla_datos.setValueAt(_7, 5, 1);
        
        tabla_datos.setValueAt("8.0 - 9.9", 6, 0);
        tabla_datos.setValueAt(_9, 6, 1);
        
        tabla_datos.setValueAt("10.0+", 7, 0);
        tabla_datos.setValueAt(_10, 7, 1);
        
       
     
        return tabla_datos;
    
    }
    
    
}
    

