/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
                System.out.println("false");
                return false;

            }
        }
        sismosRegistrados.add(sismo);
        System.out.println("true");
        return true;

    }
    
    // Modificar Nombre Sismo
    public boolean modificarSismoNombre(String nombre, String nuevoNombre){
        for(Sismo actual : sismosRegistrados){
            if(actual.getNombre().equals(nombre)){
                actual.setNombre(nuevoNombre);
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    //Modificar Profundidad Sismo
    public boolean modificarSismoProfundidad(double profundidad, double nuevoProfundidad){
        for(Sismo actual : sismosRegistrados){
            if(actual.getProfundidad() == profundidad ){
                actual.setProfundidad(nuevoProfundidad);
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    
    //Modificar Magnitud Sismo
    public boolean modificarSismoMagnitud(double magnitud, double nuevoMagnitud){
        for(Sismo actual : sismosRegistrados){
            if(actual.getMagnitud() == magnitud){
                actual.setProfundidad(nuevoMagnitud);
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    //Modificar Localizacion Sismo
    public boolean modificarSismoLocalizacion(String localizacion, String nuevaLocalizacion){
        for(Sismo actual : sismosRegistrados){
            if(actual.getlocalizacion().equals(localizacion)){
                actual.setLocalizacion(nuevaLocalizacion);
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
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
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    
    //Modificar Descripcion Sismo
    public boolean modificarSismoDescripcion(DescripcionSismo descripcion, DescripcionSismo nuevadescripcion){
        for(Sismo actual : sismosRegistrados){
            if(actual.getDescripcion().equals(descripcion)){
                actual.setDescripcion(nuevadescripcion);
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
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
            String fecha_hora = sismo.getFechaHora().getDay() + "/" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
            tabla_datos.setValueAt(fecha_hora, i, 1);
            
        
        }
        return tabla_datos;
    }
    
    //Metodos para graficar los datos
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
        
        double cantidades [] = {cartago,sanjose, heredia, alajuela, puntarenas, guanacaste, limon, NA};
        
        datos.addSeries("Cantidad de Sismos por Provincia", cantidades, 20);
        
        JFreeChart grafica = ChartFactory.createHistogram("Cantidad de Sismos por Provincia", "Provincias", "Cantidad", datos, PlotOrientation.VERTICAL, true, true, false);
        
        return grafica;
    }
    
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
                    choque_placas += 1;
                    break;
                case DEFORMACION_INTERNA:
                    intra_placa += 1;
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
    
    //Cantidad de sismos por mes en un año
    
    public JFreeChart cantidad_sismos_magnitud(){
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
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

        // Micro, Menor, Ligero, Moderado,Fuerte,Mayor,Gran,Epico
        datos.setValue(menor_2, "Micro", "0.1 - 1.9");
        datos.setValue(_3, "Menor", "2.0 - 3.9");
        datos.setValue(_4, "Ligero", " 4.0 - 4.9");
        datos.setValue(_5, "Moderado", " 5.0 - 5.9");
        datos.setValue(_6, "Fuerte", " 6.0 - 6.9");
        datos.setValue(_7, "Mayor", "    7.0 - 7.9");
        datos.setValue(_9, "Gran", "    8.0 - 9.9");
        datos.setValue(_10, "Épico", "    10.0+");
        
        JFreeChart grafica = ChartFactory.createBarChart("Cantidad de sismos por Magnitud", "Cantidad de sismos", "Magnitudes", datos, PlotOrientation.VERTICAL, true, true, false);
     
        return grafica;
    
    }
    
    
}
    

