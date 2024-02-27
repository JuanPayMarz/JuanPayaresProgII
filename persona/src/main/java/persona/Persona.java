/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package persona;

/**
 *
 * @author pc
 */
public class Persona {

    public static void main(String[] args) {

        clasepersona p = new clasepersona();
        
        p.setNombre("Juan");
        p.setApellidos("Payares Martinez");
        p.setCedula(1001978120);
        p.setCorreo("juanpayares.mart@gmail.com");
        p.setTelefono("3005218296");
    
        
        System.out.println("\n Mi nombre es: "+ p.Nombre);
        System.out.println("Mis apellidos: "+ p.Apellidos);
        System.out.println("Mi cedula es: "+ p.Cedula);
        System.out.println("Mi correo es: "+ p.Correo);
        System.out.println("Mi telefono es: "+ p.Telefono);
        
    }
    
}
