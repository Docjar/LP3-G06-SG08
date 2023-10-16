class Auto implements ImpactoEcologico {
    private double kilometrosRecorridos;
    private double consumoCombustible;

    public Auto(double kilometrosRecorridos, double consumoCombustible) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = kilometrosRecorridos * consumoCombustible;
        double factorEmision = 0.3;
        return datoActividad * factorEmision;
    }
}