package Animales;

public class animal_acuatico extends animal{

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, String sexo, String edad, String alimentacion, String reproduccion,
                           boolean salud, boolean comportamiento, boolean aletas, boolean branquias, boolean escamas) {
        super(nombre, especie,sexo, edad, alimentacion, reproduccion, salud, comportamiento);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    // En la clase animal_acuatico.java
// En la clase animal_acuatico.java
    @Override
    public String toString() {
        return super.toString() + ", Tiene aletas: " + (this.aletas ? "Sí" : "No") + ", Branquias: " + this.branquias + ", Escamas: " + (this.escamas ? "Sí" : "No");
    }
}