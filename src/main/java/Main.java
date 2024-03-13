import java.util.Scanner;
import Administracion_recursos.Recurso;
import Animales.animal;
import Gestion_habitats.habitats;
import Gestion_habitats.terrario;
import Visitantes.*;
import Mantenimiento_seguridad.Seguimiento;
import Mantenimiento_seguridad.Vigilar;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Crear animales
            animal animal1 = new animal("Sebas", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9", "Terrario", "param11", "param12", "param13", "param14", "param15", "param16", "param17", "param18");
            animal animal2 = new animal("param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9", "param10", "param11", "param12", "param13", "param14", "param15", "param16", "param17", "param18");

            // Crear hábitats
            habitats habitat1 = new terrario(25.0f, 50.0f, true);
            habitats habitat2 = new habitats(30.0f, 60.0f, false);

            // Agregar animales a los hábitats correspondientes
            habitat1.agregarAnimal(animal1);
            habitat2.agregarAnimal(animal2);

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
                System.out.println("3. Guía de animales acuáticos");
                System.out.println("4. Guía de la granja");

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
                        guiaVisitante = new guia_granja();
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
