
package proyectos.clase06;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veterinaria v = new Veterinaria();
        v.addMascota(new Perro());
        v.addMascota(new Gato());
        v.addMascota(new Perro());
        v.addMascota(new Gato());
        v.saludarCliente();
    }

}
