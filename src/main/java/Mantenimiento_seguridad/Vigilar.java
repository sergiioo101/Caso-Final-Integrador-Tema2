package Mantenimiento_seguridad;

import Administracion_recursos.Recurso;

public class Vigilar {
    private String nombre;
    private int edad;
    private Recurso recurso;

    public Vigilar(String nombre, int edad, Recurso recurso) {
        this.nombre = nombre;
        this.edad = edad;
        this.recurso = recurso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void vigilarHabitat() {
        System.out.println("El trabajador " + nombre + " está vigilando el recurso: " + recurso.getNombre());
        recurso.mostrarCantidad();
    }
}
