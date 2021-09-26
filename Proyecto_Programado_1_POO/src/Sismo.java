
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcard
 */
public class Sismo {
    
    // Atributos
    private String nombre;
    
    private GregorianCalendar fecha_hora;
    
    private double profundidad;
    
    private TOrigen tipoOrigen;
    
    private double magnitud;
    
    private String localizacion;
    
    private Provincia provincia;
    
    private boolean maritimo;
    
    private String descripcion;
    
    // Métodos
    
    // Constructor
    public Sismo(){}
    
    // Setters/Getters
    
    //Nombre
    public void setNombre(String name){
        nombre = name;
    }
    public String getNombre(){
        return nombre;
    }
    
    // Fecha y hora
    public void setFechaHora(int anio, int mes, int dia, int hora, int minuto){
        fecha_hora.set(anio,mes,dia,hora,minuto);
    }
    
    public GregorianCalendar getFechaHora(){
        return fecha_hora;
    }
    
    // Profundidad
    public void setProfundidad(double profundity){
        profundidad = profundity;
    }
    
    public double getProfundidad(){
        return profundidad;
    }
    
    // Origen Sismo
    public void setTipoOrigen(TOrigen tipo){
        tipoOrigen = tipo;
    }
    public  TOrigen get(){
        return tipoOrigen;
    }
    
    // Magnitud
    public void setMagnitud(double mag){
        magnitud = mag;
    }
    public double getMagnitud(){
        return magnitud;
    }
    // Localizacion
    public void setLocalizacion(String latitud_longitud){
        localizacion = latitud_longitud;
    }
    public String getlocalizacion(){
        return localizacion;
    }
    // Provincia
    public void setProvincia(Provincia prov){
        provincia = prov;
    }
    public Provincia getProvincia(){
        return provincia;
    }
    // Es un sismo maritimo?
    public void setmaritimo(boolean valor){
        maritimo = valor;
    }
    
    public boolean getmaritimo(){
        return maritimo;
    }
    // Descripcion
    public void setDescripcion(String description){
        descripcion =  description;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    //Carlos Carepicha
    
    @Override
    public String toString(){
        
        return "El nombre del sismo es: ";
    }
}
