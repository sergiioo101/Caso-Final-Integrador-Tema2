import java.util.Scanner;
import Administracion_recursos.Recurso;
import Visitantes.*;
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
                System.out.println("Por favor, elija el tipo de guía que desea:");
                System.out.println("1. Guía de reptiles");
                System.out.println("2. Guía de aves");

                int opcionGuia = scanner.nextInt();

                Recurso recursoVisitante = new Recurso("Recurso 1", 100);
                guia guiaVisitante;
                switch(opcionGuia) {
                    case 1:
                        guiaVisitante = new guia_reptiles();
                        guiaVisitante.ofrecerGuia();
                        break;
                    case 2:
                        guiaVisitante = new guia_aves();
                        guiaVisitante.ofrecerGuia();
                        break;
                    case 3:
                        guiaVisitante = new guia_acuaticos();
                        guiaVisitante.ofrecerGuia();
                        break;
                    case 4:
                        guiaVisitante = new granja();
                        guiaVisitante.ofrecerGuia();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break;
            case 2:
                System.out.println("¡Bienvenido, miembro de seguridad!");
                Recurso recursoSeguridad = new Recurso("Recurso 2", 200);
                guia_reptiles guiaSeguridad = new guia_reptiles();
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
