public class ContadorTest3 {
    public static void main(String[] args) {
        Contador c1, c2;

        System.out.println("Valor del acumulador: " + Contador.acumulador());
        c1 = new Contador(3);
        c2 = new Contador(10);
        c1.inc();
        c1.inc();
        c2.inc();
        System.out.println("Valor de c1: " + c1.getValor());
        System.out.println("Valor de c2: " + c2.getValor());
        System.out.println("Valor del acumulador: " + Contador.acumulador());
        System.out.println("Número de contadores creados: " + Contador.nContadores);
        System.out.println("Valor inicial del último contador creado: " + Contador.ultimoContador);
    }
}