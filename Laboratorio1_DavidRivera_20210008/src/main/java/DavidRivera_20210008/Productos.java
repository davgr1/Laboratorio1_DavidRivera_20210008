package DavidRivera_20210008;

import java.util.LinkedList;

public class Productos {
    private String id;
    private final String nombre;
    private final Double precio;

    public Productos(String id, String nombre,Double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }


    public void AgregarProducto(){

    }

    public void MostrarProducto(){
        LinkedList<String> Lista = new LinkedList<>();


    }

    public void ActualizarProducto(){

    }

    public void EliminarProducto(){

    }
}
