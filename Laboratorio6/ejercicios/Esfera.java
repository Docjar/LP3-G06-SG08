import java.lang.Math; 

  

class Esfera extends FiguraTridimensional{ 

    private double radio; 

     

    public Esfera(double radio){ 

        this.radio = radio; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return 4 * Math.PI * (radio * radio); 

    } 

     

    @Override 

    double obtenerVolumen(){ 

        return (4/3) * Math.PI * (radio * radio * radio); 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Radio de la esfera: " + radio); 

    } 

} 