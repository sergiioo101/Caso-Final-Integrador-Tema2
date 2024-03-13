package Administracion_recursos;
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
}

