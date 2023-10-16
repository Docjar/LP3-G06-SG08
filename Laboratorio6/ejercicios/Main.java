public class Main{
    public static void main(String[] args) { 

        Figura[] figuras = new Figura[6]; 

        figuras[0] = new Circulo(5.0); 

        figuras[1] = new Cuadrado(4.0); 

        figuras[2] = new Esfera(3.0); 

        figuras[3] = new Cubo(2.0); 

        figuras[4] = new Triangulo(6.0, 4.0); 

        figuras[5] = new Tetraedro(3.0); 

  

  

        for (Figura figura : figuras) { 

            figura.describir(); 

            if (figura instanceof FiguraBidimensional) { 

                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura; 

                System.out.println("Área: " + figuraBidimensional.obtenerArea()); 

                if (figura instanceof Circulo) { 

                    ((Circulo) figura).obtenerColor(); 

                } 

            } else if (figura instanceof FiguraTridimensional) { 

                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura; 

                System.out.println("Área: " + figuraTridimensional.obtenerArea()); 

                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen()); 

                if (figura instanceof Tetraedro) { 

                    ((Tetraedro) figura).obtenerAplicacion(); 

                } 

            } 

            System.out.println("====================="); 

        } 

    } 

} 