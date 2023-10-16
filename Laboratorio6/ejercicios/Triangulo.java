class Triangulo extends FiguraBidimensional{ 

    private double base; 

    private double altura; 

     

    public Triangulo(double base, double altura){ 

        this.base = base; 

        this.altura = altura; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return (base * altura) / 2; 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Base: " + base + ", Altura: " + altura); 

    } 

} 