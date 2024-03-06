package Habitats;
import java.util.HashMap;
import java.util.Map;

class Habitat {
    protected String nombre;
    protected Map<String, Object> condiciones;

    public Habitat(String nombre) {
        this.nombre = nombre;
        this.condiciones = new HashMap<>();
    }

    public void registrarCondicion(String condicion, Object valor) {
        condiciones.put(condicion, valor);
    }

    public void analizarCondiciones() {
        System.out.println("Análisis de condiciones del hábitat: " + nombre);
        for (Map.Entry<String, Object> entry : condiciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class Acuatico extends Habitat {
    public Acuatico(String nombre) {
        super(nombre);
    }

    // Puedes agregar métodos específicos para hábitats acuáticos si es necesario
}

class Terrestre extends Habitat {
    public Terrestre(String nombre) {
        super(nombre);
    }

    // Puedes agregar métodos específicos para hábitats terrestres si es necesario
}

class Aviario extends Habitat {
    public Aviario(String nombre) {
        super(nombre);
    }

    // Puedes agregar métodos específicos para aviarios si es necesario
}

public class GestionHabitats {
    public static void main(String[] args) {
        // Ejemplo de uso
        Acuatico acuario = new Acuatico("Acuario Principal");
        acuario.registrarCondicion("Temperatura del agua", 25);
        acuario.registrarCondicion("Niveles de oxígeno", 8);

        Terrestre jungla = new Terrestre("Jungla Tropical");
        jungla.registrarCondicion("Temperatura del suelo", 28);
        jungla.registrarCondicion("Humedad", 80);

        Aviario aviario = new Aviario("Gran Aviario");
        aviario.registrarCondicion("Temperatura del aire", 22);
        aviario.registrarCondicion("Humedad del aire", 65);
        aviario.registrarCondicion("Limpieza del aire", "Buena");

        // Analizar condiciones de los hábitats
        acuario.analizarCondiciones();
        jungla.analizarCondiciones();
        aviario.analizarCondiciones();
    }
}

