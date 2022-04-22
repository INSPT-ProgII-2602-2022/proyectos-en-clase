package proyectos.clase1;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Bienvenid@ " + nombre);
    }

}
