import java.util.ArrayList;

public class PruebaImpactoEcologico {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(1000, 50);
        Auto auto = new Auto(500, 10);
        Bicicleta bicicleta = new Bicicleta(20);

        ArrayList<ImpactoEcologico> objetosImpactoEcologico = new ArrayList<>();
        objetosImpactoEcologico.add(edificio);
        objetosImpactoEcologico.add(auto);
        objetosImpactoEcologico.add(bicicleta);

        for (ImpactoEcologico objeto : objetosImpactoEcologico) {
            System.out.println("Tipo de objeto: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println();
        }
    }
}
