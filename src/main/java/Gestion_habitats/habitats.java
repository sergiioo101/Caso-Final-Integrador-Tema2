package Gestion_habitats;

import Animales.animal;
import java.util.ArrayList;
import java.util.List;

public class habitats {
    float temperatura;
    float humedad;
    boolean limpieza;
    List<animal> animales;

    public habitats(float temperatura,float humedad,boolean limpieza) {
        super();
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(animal animal) {
        this.animales.add(animal);
    }

    public List<animal> getAnimales() {
        return animales;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public void imprimirAnimales() {
        for (animal animal : animales) {
            System.out.println(animal.toString());
        }
    }

    @Override
    public String toString() {
        return "habitats []";
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

    // Add this method
    public static habitats getHabitat1() {
        // Replace with the actual logic to get the habitat1 instance
        return new terrario(25.0f, 60.0f, true);

    }
    public static habitats getHabitat2() {
        // Reemplaza con la lógica real para obtener la instancia de habitat2
        return new habitats(30.0f, 60.0f, true);
    }
    public static habitats getHabitat3() {
        // Reemplaza con la lógica real para obtener la instancia de habitat3
        return new habitats(35.0f, 65.0f, true);
    }
    public static habitats getHabitat4() {
        // Reemplaza con la lógica real para obtener la instancia de habitat4
        return new habitats(40.0f, 70.0f, true);
    }
}