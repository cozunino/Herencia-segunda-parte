/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio;

/**
 *
 * @author conizunino
 */
public class Herenciaejercicio {

    
    String nombre;
    public int edad;  
        
    public void apodo (){
      
        System.out.println("Nombre: "+this.nombre);
       
    }
    
    public void num (){
        
        System.out.println("Edad: "+this.edad);
        
       
    }
    
    public void armarbanda(){
        
        System.out.println("Disponible");
    }
    
    
    
    public static void main (String []args){

       System.out.println("BATERISTA");
       
       baterista batero1 = new baterista();
       
       batero1.nombre = "Federico";
       batero1.edad = 36;
       
       batero1.estilo = "Jazz";
       batero1.bateria = "";
       
       batero1.apodo();
       batero1.num();
       batero1.armarbanda();
       batero1.estilomusical();
       batero1.armadobateria();
       
        System.out.println(" ");
       
       System.out.println("CANTANTE");
       
       cantante cantante1 = new cantante();
       
       cantante1.nombre = "Pedro";
       cantante1.edad = 34;
       cantante1.tonalidad = "Baritono";
       cantante1.ubicacion = "Segunda voz";
       
       cantante1.apodo();
       cantante1.num();
       cantante1.armarbanda();
       cantante1.tono();
       cantante1.lugar();
    
    
}
}