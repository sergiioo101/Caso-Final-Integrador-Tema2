package Animales;

public class animal_aviario extends animal {

    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipo_aviario;

    public animal_aviario(String nombre, String especie, String sexo, String edad, String alimentacion, String reproduccion,
                          boolean salud, boolean comportamiento,boolean vuela, boolean pico, boolean plumaje) {
        super(nombre, especie,sexo, edad, alimentacion, reproduccion, salud, comportamiento);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(boolean plumaje) {
        this.plumaje = plumaje;
    }

    public String getTipo_aviario() {
        return tipo_aviario;
    }

    public void setTipo_aviario(String tipo_aviario) {
        this.tipo_aviario = tipo_aviario;
    }

    // En la clase animal_aviario.java
    @Override
    public String toString() {
        return super.toString() + ", Vuela: " + (this.vuela ? "Sí" : "No") + ", Pico: " + (this.pico ? "Sí" : "No") + ", Plumaje: " + (this.plumaje ? "Sí" : "No");
    }
}
