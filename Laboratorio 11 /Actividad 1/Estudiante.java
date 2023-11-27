public class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    @Override
    public boolean contiene(Estudiante valor) {
        return this.nombre.equals(valor.nombre) && this.procedencia.equals(valor.procedencia);
    }
}


