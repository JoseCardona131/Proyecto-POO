/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

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
     
     public void enviarNotificacion(String destino){
         String correoEnvia = "sistemasismos@gmail.com";
         String contra = "prpwvwessbkvezpj";
         String destinario = destino;
         //prpwvwessbkvezpj
         Properties propiedad = new Properties();
         propiedad.put("mail.smtp.host", "smtp.gmail.com");
         propiedad.setProperty("mail.smtp.port", "587");
         propiedad.setProperty("mail.smtp.starttls.enable", "true");
         propiedad.put("mail.smtp.ssl.trust", "smtp.gmail.com");
         propiedad.setProperty("mail.smtp.user", correoEnvia);
         propiedad.setProperty("mail.smtp.auth", "true");
         propiedad.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
         

         Session sesion = Session.getDefaultInstance(propiedad);
         
         
        MimeMessage mensaje = new MimeMessage(sesion);
        try {
            mensaje.setFrom(new InternetAddress(correoEnvia));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinario));
            mensaje.setSubject("Nuevo Sismo Agregado");
            mensaje.setText("¡Nuevo sismo de provincia de interes agregado!");
        } catch (AddressException ex) {
            Logger.getLogger(interesadoNotificacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(interesadoNotificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            
            Transport t = sesion.getTransport("smtp");
            t.connect(correoEnvia, contra);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(interesadoNotificacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(interesadoNotificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
     }
 
    
}
