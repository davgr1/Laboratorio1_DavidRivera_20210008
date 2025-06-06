package DavidRivera_20210008;

import java.util.LinkedList;

public class Productos {
    private String id;
    private final String nombre;
    private final Double precio;
    LinkedList<Productos> productos;


    public Productos(String id, String nombre,Double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.productos = new LinkedList<>();
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

    public LinkedList<Productos> getProductos() {
        return productos;
    }

    public void AgregarProducto(){
        System.out.println("Ingrese el nuevo producto " + id + "con su nombre " + nombre + "del precio $ " + precio);

    }

    public void MostrarListado(){
        LinkedList<String>lista = new LinkedList<>();

        System.out.println("Primer prducto " + lista.getFirst());
        System.out.println("Ultimo producto "+ lista.getLast());
    }

    public void ActualizarProducto(){

    }

    public void EliminarProducto(){
        LinkedList<String>lista = new LinkedList<>();

        lista.removeFirst();
    }
}
