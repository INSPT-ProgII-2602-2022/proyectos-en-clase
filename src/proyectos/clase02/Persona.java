package proyectos.clase02;

public class Persona {

    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Domicilio domicilio;
    private Empresa lugarTrabajo;

    public Persona(String nombre, String apellido, Fecha fechaNacimiento, Domicilio domicilio, Empresa lugarTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.lugarTrabajo = lugarTrabajo;
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
