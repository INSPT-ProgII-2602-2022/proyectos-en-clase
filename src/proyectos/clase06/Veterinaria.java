package proyectos.clase06;

import java.util.ArrayList;

public class Veterinaria {

    private ArrayList<Mascota> mascotas;
    
    public Veterinaria() {
        this.mascotas = new ArrayList<>();
    }

    public void saludarCliente() {
        for (Mascota mascota : mascotas) {
            mascota.expresarse();
        }
    }
    
     public void addMascota (Mascota m) {
         this.mascotas.add(m);
     }
}
