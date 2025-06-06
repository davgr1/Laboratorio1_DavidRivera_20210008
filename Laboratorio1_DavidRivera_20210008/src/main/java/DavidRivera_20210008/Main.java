package DavidRivera_20210008;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Productos productos;
        int opcion;


        do {
            System.out.println("Menu");
            System.out.println("1.Diagrama");
            System.out.println("2.Agregar Producto");
            System.out.println("3.Actualizar Producto");
            System.out.println("4.Eliminar Producto");
            System.out.println("0.Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
               case 1->{
                   System.out.println("Mostrando diagrama");
                   productos.MostrarListado();
                   break;
               }
               case 2->{
                   System.out.println("Agregando el producto");
                   productos.AgregarProducto();

                   break;
               }

               case 3->{
                   System.out.println("Actualizando el producto");
                   break;
               }
               case 4->{
                   System.out.println("Eliminando el producto");
                   productos.EliminarProducto();
                   break;
               }

                default -> {
                    System.out.println("elija una opcion ");
                }
            }
        }while (opcion != 0);
    }
}