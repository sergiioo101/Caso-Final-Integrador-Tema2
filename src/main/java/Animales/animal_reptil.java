package Animales;

public class animal_reptil extends animal {
    boolean escamas;
    boolean cola;
    boolean venenoso;
    String tipoReptil;

    public animal_reptil(String nombre, String especie, String sexo, String edad,
                         String peso, String alimentacion, String reproduccion,
                         String vacunas, String salud, String comportamiento,
                         boolean escamas, boolean cola, boolean venenoso, String tipoReptil) {
        super(nombre, especie,sexo, edad, peso, alimentacion, reproduccion,
                vacunas, salud, String.valueOf(comportamiento), escamas, cola, venenoso, tipoReptil);
        this.escamas = escamas;
        this.cola = cola;
        this.venenoso = venenoso;
        this.tipoReptil = tipoReptil;
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
}

