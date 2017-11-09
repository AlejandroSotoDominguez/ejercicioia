
package ejercicioia;

import java.util.Scanner;

public class EjercicioIA {

    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = sc.next();
        IA obj = new IA();
        System.out.println(obj.getNombre(nombre));
        //pruebas
    }   
}
