class Cuadrado extends FiguraBidimensional{ 

    private double lado; 

     

    public Cuadrado(double lado){ 

        this.lado = lado; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return lado * lado; 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Lado del cuadrado: " + lado); 

    } 

} 