package AdministracionRecursos;
public class RecursosManager {
    private Recurso alimento;
    private Recurso medicinas;
    private Recurso personal;

    public RecursosManager(int cantidadDeAlimento, int cantidadDeMedicinas, int cantidadDePersonal) {
        this.alimento = new Recurso("Alimento", cantidadDeAlimento);
        this.medicinas = new Recurso("Medicinas", cantidadDeMedicinas);
        this.personal = new Recurso("Personal", cantidadDePersonal);
    }

    public void gestionarRecursos() {
        alimento.mostrarCantidad();
        medicinas.mostrarCantidad();
        personal.mostrarCantidad();
    }

    public void agregarRecursos(String tipo, int cantidad) {
        switch(tipo) {
            case "Alimento":
                alimento.agregar(cantidad);
                break;
            case "Medicinas":
                medicinas.agregar(cantidad);
                break;
            case "Personal":
                personal.agregar(cantidad);
                break;
            default:
                System.out.println("Tipo de recurso inválido.");
        }
    }

    public void consumirRecursos(String tipo, int cantidad) {
        switch(tipo) {
            case "Alimento":
                alimento.consumir(cantidad);
                break;
            case "Medicinas":
                medicinas.consumir(cantidad);
                break;
            case "Personal":
                personal.consumir(cantidad);
                break;
            default:
                System.out.println("Tipo de recurso inválido.");
        }
    }
}

class Recurso {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidadInicial) {
        this.nombre = nombre;
        this.cantidad = cantidadInicial;
    }

    public void agregar(int cantidad) {
        this.cantidad += cantidad;
    }

    public void consumir(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente " + nombre + ".");
        }
    }

    public void mostrarCantidad() {
        System.out.println("Cantidad de " + nombre + ": " + cantidad);
    }
}
