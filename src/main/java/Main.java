import java.util.Scanner;
import Administracion_recursos.Recurso;
import Visitantes.guia;
import Mantenimiento_seguridad.Seguimiento;
import Mantenimiento_seguridad.Vigilar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Zoológico!");
        System.out.println("Por favor, elija su rol:");
        System.out.println("1. Visitante");
        System.out.println("2. Miembro de seguridad");

        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("¡Bienvenido, visitante!");
                Recurso recursoVisitante = new Recurso("Recurso 1", 100);
                guia guiaVisitante = new guia("Guia 1", 30);
                guiaVisitante.ofrecerGuia();
                break;
            case 2:
                System.out.println("¡Bienvenido, miembro de seguridad!");
                Recurso recursoSeguridad = new Recurso("Recurso 2", 200);
                guia guiaSeguridad = new guia("Guia 2", 35);
                Seguimiento seguimiento = new Seguimiento("Seguimiento 1", 40, recursoSeguridad, guiaSeguridad);
                Vigilar vigilar = new Vigilar("Vigilar 1", 50, recursoSeguridad);
                seguimiento.hacerSeguimiento();
                vigilar.vigilarHabitat();
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
