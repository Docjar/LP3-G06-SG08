
package e4modificado;

public class E4modificado {

    public static void main(String[] args) {
        Integer[] arrI = {1,2,3,4};
        Double[] arrD = {1.1,2.2,3.3,4.4};
        String[] arrS = {"Hola","Mundo"};
        
        int pos = busqueda(arrI,3);
        System.out.println("Arreglo de enteros: "+pos);
        int pos1 = busqueda(arrD,1.1);
        System.out.println("Arreglo de doubles: "+pos1);
//        int pos2 = busqueda(arrS,"Hola");
//        System.out.println("Arreglo de enteros: "+pos2);
    }
        public static <T extends Number> int busqueda(T[]arreglo,T obj){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
}
