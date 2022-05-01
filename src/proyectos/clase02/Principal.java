
package proyectos.clase02;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Fecha f1 = new Fecha(1,1,1940);
        Fecha f2 = new Fecha(23,7,1990);
        
        Domicilio d1 = new Domicilio("Av. Siempre Viva", 742, "Springfield");
        Domicilio d2 = new Domicilio("Av. Triunvirato", 3174, "Villa Ortúzar");
        
        Empresa inspt = new Empresa("INSPT", f1, d1); 
        
        Persona juan = new Persona("Juan", "Gomez", f2, d1, inspt);
    }

}
