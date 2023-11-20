
package e6;

public class E6 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object:");
        System.out.println(isEqualTo(obj1, obj1));
        System.out.println(isEqualTo(obj1, obj2)+"\n");

        Integer i1 = 17;
        Integer i2 = 17;
        Integer i3 = 2;
        System.out.println("Integer:");
        System.out.println(isEqualTo(i1, i2));
        System.out.println(isEqualTo(i1, i3)+"\n");

        Double d1 = 15.0;
        Double d2 = 15.0;
        Double d3 = 20.0;
        System.out.println("Double:");
        System.out.println(isEqualTo(d1, d2));
        System.out.println(isEqualTo(d1, d3));

    }
    public static <T > boolean isEqualTo(T obj1,T obj2){
        return obj1.equals(obj2);
    }

}

