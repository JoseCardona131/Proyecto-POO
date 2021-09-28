/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jcard
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        interesadoNotificacion nuevo = new interesadoNotificacion();
        nuevo.setCorreo("abcd@gmail.com");
        nuevo.setNumeroTelefono("999999999");
        nuevo.setNombre("Jose");
        System.out.println(nuevo.AgregarProvinciaInteres(Provincia.HEREDIA));
        System.out.println(nuevo.AgregarProvinciaInteres(Provincia.CARTAGO));
        System.out.println(nuevo.AgregarProvinciaInteres(Provincia.SANJOSE));
        
        System.out.println(nuevo.BorrarProvinciaInteres(Provincia.HEREDIA));
        System.out.println(nuevo.ConsultarProvinciaInteres(Provincia.CARTAGO));
        System.out.println(nuevo.ConsultarProvinciaInteres(Provincia.ALAJUELA));

    }
}
