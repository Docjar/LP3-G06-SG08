class Cubo extends FiguraTridimensional{ 

    private double lado; 

     

    public Cubo(double lado){ 

        this.lado = lado; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return 6 * lado * lado; 

    } 

     

    @Override 

    double obtenerVolumen(){ 

        return lado * lado * lado; 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Lado del cubo: " + lado); 

    } 

} 