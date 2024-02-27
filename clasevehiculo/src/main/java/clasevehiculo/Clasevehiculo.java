/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clasevehiculo;

/**
 *
 * @author pc
 */
public class Clasevehiculo {

    public static void main(String[] args) {
        
        
        
        
        vehiculo c = new vehiculo();
        
       c.setMarca("Toyota");
       c.setModelo("GR Supraaa");
       c.setCaballosdefuerza("382 Caballos de fuerza");
       c.setTraccion("Traccion tracera manual de 6 velocidades ");
       c.setKmph("250 KmpH aprox");
       
       System.out.println("Marca del vehiculo: "+  c.Marca);
        System.out.println("Modelo del vehiculo: "+ c.Modelo);
        System.out.println("Caballos de Fuerza: "+ c.caballosdefuerza);
        System.out.println("Traccion del vehiculo: "+c.traccion);
        System.out.println("Velocidad max Aprox. : "+ c.kmph);
        
    }
}
