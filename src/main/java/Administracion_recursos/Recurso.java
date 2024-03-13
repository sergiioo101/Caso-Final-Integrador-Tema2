package Administracion_recursos;

public class Recurso {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidadInicial) {
        this.nombre = nombre;
        this.cantidad = cantidadInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarCantidad() {
        System.out.println("Cantidad de " + nombre + ": " + cantidad);
    }
}
