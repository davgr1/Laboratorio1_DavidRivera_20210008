package DavidRivera_20210008;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Productos> productos;
        int opcion;


        do {
            System.out.println("Menu");
            System.out.println("1.Diagrama");
            System.out.println("2.Agregar Producto");
            System.out.println("3.Mostrar Productos");
            System.out.println("4.Actualizar Producto");
            System.out.println("5.Eliminar Producto");
            System.out.println("0.Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
               case 1->{
                   System.out.println("MOstrando diagrama");
                   break;
               }
               case 2->{
                   System.out.printf("Agregando el producto");
                   break;
               }
               case 3->{
                   System.out.println("Mostrando el listado de los productos");
                   break;
               }
               case 4->{
                   System.out.println("Actualizando el producto");
                   break;
               }
               case 5->{
                   System.out.println("Eliminando el producto");
                   break;
               }
               case 0->{
                   System.out.println("Saliendo del sistema");
                   
               }
                default -> {
                    System.out.println("elija una opcion ");
                }
            }
        }
    }
}