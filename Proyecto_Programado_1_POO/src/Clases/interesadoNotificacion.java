/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;

public class interesadoNotificacion {
    
    private String nombre;
    private String correo;
    private String numeroTelefono;
    private ArrayList<Provincia> provinciasInteres = new ArrayList();
    
    // Métodos Constructores
    public interesadoNotificacion() {  }

    public interesadoNotificacion(String nombre, String correo, String numeroTelefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
    }
    
    // Nombre del Interesado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Correo del interesado
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // Número de teléfono del interesado
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numero) {
        numeroTelefono = numero;
    }
    
    // Para obtener el arreglo de provincias de interés
    public ArrayList<Provincia> getProvinciasInteres(){
        return provinciasInteres;
    }
    // ACME del Arreglo
    // Agregar
    public boolean AgregarProvinciaInteres(Provincia provincia_a){
        for(Provincia actual : provinciasInteres){
            if (actual.equals(provincia_a)){
                return false;
            }
        }
        provinciasInteres.add(provincia_a);
        return true;
    }
    // Borrar
    public boolean BorrarProvinciaInteres(Provincia provincia_b){
        for(Provincia actual : provinciasInteres){
            if (actual.equals(provincia_b)){
                provinciasInteres.remove(provincia_b);
                return true;
            }
    }
        return false;
    }
    // Consultar una provincia especifica
     public boolean ConsultarProvinciaInteres(Provincia provincia_c){
        for(Provincia actual : provinciasInteres){
            if (actual.equals(provincia_c)){
                return true;
            }
        }
        return false;
     }
    
}
