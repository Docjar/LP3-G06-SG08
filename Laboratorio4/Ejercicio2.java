package com.mycompany.e2main;
public class E2main {

    public static void main(String[] args) {
        int evaluacion[][] = {{1,2,0},{2,2,0},{1,1,950},{2,1,950},{1,1,2500},{2,2,0},{2,1,1000},{2,1,950}};
        System.out.println("\t\tSexo\tTrabajo\tSueldo");
        for(int i= 0;i<evaluacion.length;i++)
        {
            System.out.print("Persona "+(i+1)+"\t");
            for(int j = 0;j<evaluacion[i].length;j++){
                System.out.print(evaluacion[i][j]+"\t");
            }
            System.out.println();
        }
        porcentajeHombres(evaluacion);
        porcentajeMujeres(evaluacion);
        porcentajeHombresTrabajadores(evaluacion);
        porcentajeMujeresTrabajadoras(evaluacion);
        sueldoPromedioHombres(evaluacion);
        sueldoPromedioMujeres(evaluacion);
    }
    public static void porcentajeHombres(int arreglo[][])
    {
        double con = 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==1)
            {
                con++;
            }
        }
        System.out.print("\nPorcentaje de hombres: "+(con/8)*100+"%");
         
    }
    public static void porcentajeMujeres(int arreglo[][])
    {
        double con = 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==2)
            {
                con++;
            }
        }
        System.out.print("\nPorcentaje de mujeres: "+(con/8)*100+"%");
         
    }
    public static void porcentajeHombresTrabajadores(int arreglo[][])
    {
        double con = 0;
        double con2 = 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==1)
            {
                con2++;
                if(arreglo[i][1]==1)
                {
                    con++;
                }
            }
        }
        System.out.print("\nPorcentaje de hombres trabajadores: "+(con/con2)*100+"%");
         
    }
    public static void porcentajeMujeresTrabajadoras(int arreglo[][])
    {
        double con = 0;
        double con2 = 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==2)
            {
                con2++;
                if(arreglo[i][1]==1){
                    con++;
                }
            }
        }
        System.out.print("\nPorcentaje de mujeres trabajadoras: "+(con/con2)*100+"%");
         
    }
    public static void sueldoPromedioHombres(int arreglo[][])
    {
        double con = 0;
        double sueldo= 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==1)
            {
                if(arreglo[i][1]==1)
                {
                    con++;
                    sueldo = sueldo + arreglo[i][2];
                }
            }
        }
        System.out.println("\nSueldo promedio de hombres: "+sueldo/con);
    }
    public static void sueldoPromedioMujeres(int arreglo[][])
    {
        double con = 0;
        double sueldo= 0;
        for(int i= 0;i<arreglo.length;i++)
        {
            if(arreglo[i][0]==2)
            {
                if(arreglo[i][1]==1)
                {
                    con++;
                    sueldo = sueldo + arreglo[i][2];
                }

            }
        }
        System.out.println("Sueldo promedio de mujeres: "+sueldo/con);
    }
}
