
package busqarreglo;

public class BusqArreglo {

    public static void main(String[] args) {
        Producto p1 = new Producto("100","Carne",10.0);
        Producto p2 = new Producto("101","Pollo",9.5);
        Producto p3 = new Producto("102","Pescado",15.0);
        Producto [] productos = {p1,p2,p3};
        //String cod = "105"; //busco el producto por el codigo
        int pos =busqueda(productos,new Producto("102",null,0.0));
        System.out.println("Producto: "+pos);
        
        Persona pe1 = new Persona("12345678","Juan Manuel","Umacollo");
        Persona pe2 = new Persona("87654321","Armando Luis","Umacollo");
        Persona pe3 = new Persona("13456789","Maria Angel","Umacollo");
        Persona[] personas = {pe1,pe2,pe3};
        int pos1 = busqueda(personas,new Persona(null,"Juan ",null));
        System.out.println("Persona: "+pos1);
        
        Estudiante e1 = new Estudiante("12345678","Juan Manuel","Umacollo","Psicologia");
        Estudiante e2 = new Estudiante("87654321","Armando Luis","Umacollo","Medicina");
        Estudiante e3 = new Estudiante("13456789","Maria Angel","Umacollo","Arquitectura");
        Estudiante[] estudiantes = {e1,e2,e3};
        int pos2 = busqueda(estudiantes,new Estudiante(null,"Armando Luis",null,"Arquitectura"));
        System.out.println("Estudiante: "+pos2);
        
    }
    public static <T > int busqueda(T[]arreglo,T obj){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

}
