class Bicicleta implements ImpactoEcologico {
    private int kilometrosRecorridos;

    public Bicicleta(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = kilometrosRecorridos;
        double factorEmision = 0.05;
        return datoActividad * factorEmision;
    }
}