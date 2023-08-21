package ejemplo;

import java.util.Scanner;

public class Regalo{
	public static String elegir(int vida){
		String gift = "";
		switch(vida){
			case 1: gift = "Un pasaje al caribe"; break;
			case 2: gift = "Un visita al museo mas cercano a tu casa"; break;
			case 3; gift = "Una entrada al cine"; break;
		}
		return gift;
	}
}

public class Principal {

    public static void main(String[] args) {
        System.out.println("Primer cambio es un Hola mundo");
        System.out.println("Segundo cambio es un Hello World");
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cual es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);

        if (fl) {
            System.out.println("¡Adivinaste!");

            String premio = Regalo.elegir(vida); //Usa la clase regalo
            System.out.println("¡Felicidades! Has ganado un premio.");
            System.out.println("Tu premio es: " + premio);
        } else {
            System.out.println("Ups, perdiste...");
        }
    }
}
