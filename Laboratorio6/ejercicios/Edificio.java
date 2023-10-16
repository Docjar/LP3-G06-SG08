class Edificio implements ImpactoEcologico {
    private double area;
    private double consumoCombustible;

    public Edificio(double area, double consumoCombustible) {
        this.area = area;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = area * consumoCombustible;
        double factorEmision = 0.5;
        return datoActividad * factorEmision;
    }
}
