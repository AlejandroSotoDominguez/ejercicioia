
package ejercicioia;

import java.util.Scanner;

public class IA {
    private String nombre;
    
    public void setDatos(String nombre){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = sc.next();
    }
    
    public String getDatos(String nombre){
        return "Hola "+nombre;
    }
}
