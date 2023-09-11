package com.mycompany.e3main;
public class E3main {

    public static void main(String[] args) {
        int ventas[][]={
            {4,9,8,2},
            {7,4,5,4},
            {8,5,2,6},
            {6,5,4,5},
            {5,3,4,5}};
        System.out.println("\nProductos\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal Producto");
        for(int i = 0;i<ventas.length;i++){
            int totalProducto = 0;
            System.out.print("Producto "+(i+1)+ "\t\t");
            for(int j = 0;j<ventas[i].length;j++){
                System.out.print(ventas[i][j]+"\t\t");
                totalProducto += ventas[i][j];
            }
            System.out.println(totalProducto);
        }
        System.out.print("Total Vendedor\t");
        for (int vendedor = 0; vendedor < ventas[0].length; vendedor++) {
            int totalVendedor = 0;
            for (int producto = 0; producto < ventas.length; producto++) {
                totalVendedor += ventas[producto][vendedor];
            }
            System.out.print("       "+totalVendedor+"\t");
        }
        }

    }

        

