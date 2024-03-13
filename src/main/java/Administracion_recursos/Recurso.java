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

    public void agregar(int cantidad) {
        this.cantidad += cantidad;
    }

    public void consumir(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente " + nombre + ".");
        }
    }

    public void mostrarCantidad() {
        System.out.println("Cantidad de " + nombre + ": " + cantidad);
    }
}
