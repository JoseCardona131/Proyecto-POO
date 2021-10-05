/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
    
    //Metodo para generar la tabla
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
            System.out.println(sismo.getProvincia());
            
            //Asignar la fecha al calendario
            String fecha_hora = sismo.getFechaHora().getDay() + "/" + sismo.getFechaHora().getMonth() + "/" + sismo.getFechaHora().getYear() + " - " + sismo.getFechaHora().getHours() + ":" + sismo.getFechaHora().getMinutes();
            tabla_datos.setValueAt(fecha_hora, i, 1);
            
        
        }
        return tabla_datos;
    }
}
    

