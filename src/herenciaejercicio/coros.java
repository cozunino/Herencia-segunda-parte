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
public class coros extends cantante {
    
    int ubicacion;
    String exclusividad;
    
public void lugar (){
        System.out.println("Ubicacion voz: "+this.ubicacion);
    }
    
    public void exc (){
        System.out.println("Exclusividad con la banda: "+this.exclusividad);
    }
    
    public static void main (String []args){
    
    System.out.println("COROS");
       
       coros coros1 = new coros();
       
       coros1.nombre = "Juana";
       coros1.edad = 29;
       coros1.tonalidad = "Soprano";
       coros1.experiencia = "3 años";
       coros1.ubicacion = 2;
       coros1.exclusividad = "3 años";
 
       coros1.apodo();
       coros1.num();
       coros1.armarbanda();
       coros1.tono();
       coros1.exp();
       coros1.lugar();
       coros1.exc();
}
}