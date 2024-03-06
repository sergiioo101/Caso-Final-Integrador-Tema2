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

    public void medirProfundidad(double profundidad) {
        registrarCondicion("Profundidad del agua", profundidad);
    }

    public void verificarCalidadAgua(String calidad) {
        registrarCondicion("Calidad del agua", calidad);
    }

    @Override
    public void analizarCondiciones() {
        super.analizarCondiciones();
    }
}
class Terrestre extends Habitat {
    public Terrestre(String nombre) {
        super(nombre);
    }

    public void medirTemperaturaSuelo(double temperatura) {
        registrarCondicion("Temperatura del suelo", temperatura);
    }

    public void verificarHumedad(double humedad) {
        registrarCondicion("Humedad del suelo", humedad);
    }

    @Override
    public void analizarCondiciones() {
        super.analizarCondiciones();
    }
}

class Aviario extends Habitat {
    public Aviario(String nombre) {
        super(nombre);
    }

    public void verificarCalidadAire(String calidad) {
        registrarCondicion("Calidad del aire", calidad);
    }

    public void verificarIluminacion(String iluminacion) {
        registrarCondicion("Iluminación adecuada", iluminacion);
    }

    @Override
    public void analizarCondiciones() {
        super.analizarCondiciones();
    }
}

public class GestionHabitats {
    public static void main(String[] args) {
        // Ejemplo de uso
        Acuatico acuario = new Acuatico("Acuario Principal");
        acuario.medirProfundidad(10.5);
        acuario.verificarCalidadAgua("Buena");
        acuario.registrarCondicion("Temperatura del agua", 25);
        acuario.registrarCondicion("Niveles de oxígeno", 8);

        Terrestre jungla = new Terrestre("Jungla Tropical");
        jungla.medirTemperaturaSuelo(28);
        jungla.verificarHumedad(80);
        jungla.registrarCondicion("Calidad del suelo", "Buena");

        Aviario aviario = new Aviario("Aviario");
        aviario.verificarCalidadAire("Buena");
        aviario.verificarIluminacion("Buena");
        aviario.registrarCondicion("Temperatura del aire", 22);
        aviario.registrarCondicion("Humedad del aire", 65);

        // Analizar condiciones de los hábitats
        acuario.analizarCondiciones();
        jungla.analizarCondiciones();
        aviario.analizarCondiciones();
    }
}

