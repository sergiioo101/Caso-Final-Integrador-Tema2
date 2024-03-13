package Animales;

public class animal_reptil extends animal {
    boolean escamas;
    boolean cola;
    boolean venenoso;
    String tipoReptil;

    public animal_reptil(String nombre, String especie, String raza, String color, String sexo, String edad,
                         String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                         String cuidados, String enfermedades, String vacunas, String id, String salud, boolean comportamiento,
                         boolean escamas, boolean cola, boolean venenoso, String tipoReptil) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
                enfermedades, vacunas, id, salud, String.valueOf(comportamiento));
        this.escamas = escamas;
        this.cola = cola;
        this.venenoso = venenoso;
        this.tipoReptil = tipoReptil;
    }

    public animal_reptil(String cocodrilo, String reptil, String carnívoro, String aguaSalada, String tropical, String verde, String grande, int i, boolean b, boolean b1, String cocodrilo1) {
        super();
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

