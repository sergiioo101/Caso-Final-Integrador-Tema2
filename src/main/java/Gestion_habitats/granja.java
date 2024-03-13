package Gestion_habitats;

public class granja extends habitats {

    boolean cercado;

    public granja(float temperatura, float humedad, boolean limpieza, boolean cercado) {
        super(temperatura, humedad, limpieza);
        this.cercado = cercado;
    }

    public boolean tieneCercado() {
        return cercado;
    }

    public void setCercado(boolean cercado) {
        this.cercado = cercado;
    }

    @Override
    public String toString() {
        return "Granja [cercado=" + cercado + ", temperatura=" + temperatura + ", humedad=" + humedad + ", limpieza="
                + limpieza + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

