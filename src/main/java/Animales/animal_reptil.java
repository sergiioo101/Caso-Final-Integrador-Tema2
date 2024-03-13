package Animales;

public class animal_reptil extends animal {
    boolean escamas;
    boolean cola;
    boolean venenoso;
    String tipoReptil;

    public animal_reptil(String nombre, String especie, String sexo, String edad,
                         String alimentacion, String reproduccion, boolean salud, boolean comportamiento,
                         boolean escamas, boolean cola, boolean venenoso) {

        super(nombre, especie,sexo, edad, alimentacion, reproduccion, salud, comportamiento);
        this.escamas = escamas;
        this.cola = cola;
        this.venenoso = venenoso;
    }

    public boolean tieneEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public boolean tieneCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean esVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getTipoReptil() {
        return tipoReptil;
    }

    public void setTipoReptil(String tipoReptil) {
        this.tipoReptil = tipoReptil;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escamas: " + this.tieneEscamas() + ", Cola: " + this.tieneCola() + ", Venenoso: " + this.esVenenoso();
    }
}

