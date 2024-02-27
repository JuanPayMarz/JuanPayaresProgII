/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasevehiculo;

/**
 *
 * @author pc
 */
public class vehiculo {
    
    String Marca;
    String Modelo;
    String caballosdefuerza;
    String traccion;
    String kmph;
    
    public vehiculo(String Modelo, String Marca, int caballosdefuerza, String traccion, String kph ){
        
    }
    
     public vehiculo() {
      
   }


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCaballosdefuerza() {
        return caballosdefuerza;
    }

    public void setCaballosdefuerza(String caballosdefuerza) {
        this.caballosdefuerza = caballosdefuerza;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getKmph() {
        return kmph;
    }

    public void setKmph(String kmph) {
        this.kmph = kmph;
    }
}
  