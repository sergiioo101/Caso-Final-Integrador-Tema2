package Mantenimiento_seguridad;

import Administracion_recursos.Recurso;
import Visitantes.guia;

public class Seguimiento {
    private String nombre;
    private int edad;
    private Recurso recurso;
    private guia guia;

    public Seguimiento(String nombre, int edad, Recurso recurso, guia guia) {
        this.nombre = nombre;
        this.edad = edad;
        this.recurso = recurso;
        this.guia = guia;
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

    public guia getGuia() {
        return guia;
    }

    public void hacerSeguimiento() {
        System.out.println("El trabajador " + nombre + " está haciendo seguimiento al recurso: " + recurso.getNombre());
        recurso.mostrarCantidad();
        guia.ofrecerGuia();
    }
}
