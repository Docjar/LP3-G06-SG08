public class Alumno extends Persona {
    private Fecha fechaMatriculacion;

    public Alumno(String nif, String nombre, int edad, Fecha fechaMatriculacion) {
        super(nif, nombre, edad);
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Alumno() {}

    public Fecha getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Fecha fechaMatriculacion) {
        this.fechaMatriculacion.setDia(fechaMatriculacion.getDia());
        this.fechaMatriculacion.setMes(fechaMatriculacion.getMes());
        this.fechaMatriculacion.setAño(fechaMatriculacion.getAño());
    }
}
