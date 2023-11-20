
package busqarreglo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BusqArreglo {

    public static void main(String[] args) {        
        String[] string = {"h","o","l","a"};
        String[] string2 = {"m","u","n","d","o"};
        String[] copiaS = copyArray(string,string2);
        System.out.println(Arrays.toString(copiaS));
        //se eliminan si tienen el mismo codigo
        Producto[] produ1 = {new Producto("101","Carne",15.0),new Producto("110","Arroz",15.5)};
        Producto[] produ2 = {new Producto("101","Carne",15.0),new Producto("100","Arroz",10.0)};
        Producto[] copiaProd = copyArray(produ1,produ2);
        System.out.println(Arrays.toString(copiaProd));
        //Se eliminan si tienen el mismo dni
        Persona[] pers1 = {new Persona("12345678","Juan Manuel","Umacollo"),new Persona("87654321","Armando Luis","Umacollo")};
        Persona[] pers2 = {new Persona("13456789","Maria Angel","Umacollo"),new Persona("12345678","Pedro Paolo","Umacollo")};
        Persona[] copiaPersona = copyArray(pers1,pers2);
        System.out.println(Arrays.toString(copiaPersona));
    }
    public static <T> T[] copyArray(T[] array1, T[] array2) {
        Set<T> set = new HashSet<>();
        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));
        return set.toArray(Arrays.copyOf(array1, set.size()));
    }

}
