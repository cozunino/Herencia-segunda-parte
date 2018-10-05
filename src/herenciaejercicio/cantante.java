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
public class cantante extends Herenciaejercicio {
    
    String tonalidad;
    String ubicacion;
    
    public void tono (){
        System.out.println("Tonalida: "+this.tonalidad);
    }
    
    public void lugar (){
        System.out.println("Ubiccion: "+this.ubicacion);
    }
        
        
    
    public static void main (String []args){

       System.out.println("CANTANTE");
       System.out.println(" ");
       
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
