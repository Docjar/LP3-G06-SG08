public class Persona implements Contenedora<Persona> {
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public boolean contiene(Persona valor) {
        return this.nombre.equals(valor.nombre);
    }
}
