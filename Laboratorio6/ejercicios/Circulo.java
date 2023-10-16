import java.lang.Math; 

  

class Circulo extends FiguraBidimensional{ 

    private double radio; 

    final private String color = "rojo"; 

     

    public Circulo(double radio){ 

        this.radio = radio; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return radio * radio * Math.PI; 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Radio del circulo: " + radio); 

    } 

     

    void obtenerColor(){ 

        System.out.println("Color: " + color); 

    } 

} 