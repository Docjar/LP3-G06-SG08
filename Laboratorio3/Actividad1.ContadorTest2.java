public class ContadorTest2 {
    public static void main(String[] args) {
        Contador c3, c4;

        System.out.println("Valor del acumulador: " + Contador.acumulador());

        c3 = new Contador(); //Contador sin argumentos
        System.out.println("Valor de c3: " + c3.getValor());
        System.out.println("Valor del acumulador: " + Contador.acumulador());

        c4 = new Contador(5); //Contador con argumentos
        System.out.println("Valor de c4: " + c4.getValor());
        System.out.println("Valor del acumulador: " + Contador.acumulador());
    }
}


