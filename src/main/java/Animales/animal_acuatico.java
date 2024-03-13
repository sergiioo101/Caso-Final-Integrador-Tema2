package Animales;

public class animal_acuatico extends animal{

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public animal_acuatico(String nombre, String especie, String sexo, String edad, String alimentacion, String reproduccion,
                           boolean salud, boolean comportamiento, boolean aletas, boolean branquias, boolean escamas, String tipo_agua) {
        super(nombre, especie,sexo, edad, alimentacion, reproduccion, salud, comportamiento);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
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

}