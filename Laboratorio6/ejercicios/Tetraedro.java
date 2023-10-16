class Tetraedro extends FiguraBidimensional{
    private double arista; 

    final private String aplicacion = "egypto"; 

     

    public Tetraedro(double arista){ 

        this.arista = arista; 

    } 

     

    @Override 

    double obtenerArea(){ 

        return Math.sqrt(3) * arista * arista; 

    } 

     

    @Override 

    double obtenerVolumen(){ 

        return (arista * arista * arista) * (Math.sqrt(2) / 12); 

    } 

     

    @Override 

    void describir(){ 

        System.out.println("Arista del tetraedro: " + arista); 

    } 

     

    void obtenerAplicacion(){ 

        System.out.println("Aplicacion: " + aplicacion); 

    } 

} 