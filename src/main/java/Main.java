import java.util.Scanner;
import Administracion_recursos.Recurso;
import Animales.*;
import Gestion_habitats.habitats;
import Visitantes.*;
import Mantenimiento_seguridad.Seguimiento;
import Mantenimiento_seguridad.Vigilar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear animales
        animal_reptil cocodrilo = new animal_reptil("Juanjo", "Cocodrilo Americano", "Masculino", "14", "Carnivora", "Oviparo",true,true,true,true,false);
        animal_aviario aguila = new animal_aviario("Pepito", "Aguila Real", "Femenino", "10", "Carnivora", "Oviparo",true,true,true,true,true);
        animal_acuatico tiburon = new animal_acuatico("Tiburoncito", "Tiburon Tigre", "Masculino", "20", "Carnivora", "Oviparo",true,true,true,true,false);
        animal_terrestre vaca = new animal_terrestre("Lola", "Vaca Rubia Gallega", "Femenino", "5", "Herbivora", "Viviparo",true,true,true,true,true);
        animal_reptil iguana = new animal_reptil("Juanita", "Iguana", "Femenino", "7", "Herbivora", "Oviparo",true,true,true,true,false);
        animal_aviario loro = new animal_aviario("Pepita", "Loro Guacamayo", "Femenino", "3", "Herbivora", "Oviparo",true,true,true,true,true);
        animal_acuatico pez = new animal_acuatico("Nemo", "Pez Payaso", "Masculino", "1", "Herbivora", "Oviparo",true,true,true,true,false);
        animal_terrestre tortuga = new animal_terrestre("Concha", "Tortuga de Florida", "Femenino", "2", "Herbivora", "Oviparo",true,true,true,true,true);
        animal_reptil serpiente = new animal_reptil("Vinicius", "Serpiente de cascabel", "Femenino", "5", "Carnivora", "Oviparo",true,true,true,true,false);
        animal_aviario halcon = new animal_aviario("Falcon", "Halcón peregrino", "Masculino", "7", "Carnivora", "Oviparo",true,true,true,true,true);
        animal_acuatico delfin = new animal_acuatico("Flipper", "Delfín mular", "Masculino", "10", "Carnivora", "Oviparo",true,true,true,true,false);
        animal_terrestre cerdo = new animal_terrestre("Porky", "Cerdo Ibérico", "Masculino", "4", "Omnivora", "Viviparo",true,true,true,true,true);

        // Importar hábitats ya creados
        habitats habitat1 = Gestion_habitats.habitats.getHabitat1();
        habitats habitat2 = Gestion_habitats.habitats.getHabitat2();
        habitats habitat3 = Gestion_habitats.habitats.getHabitat3();
        habitats habitat4 = Gestion_habitats.habitats.getHabitat4();

        // Agregar animales a los hábitats correspondientes
        habitat1.agregarAnimal(cocodrilo);
        habitat1.agregarAnimal(iguana);
        habitat1.agregarAnimal(serpiente);
        System.out.println(habitat1.toString());

        habitat2.agregarAnimal(halcon);
        habitat2.agregarAnimal(aguila);
        habitat2.agregarAnimal(loro);
        System.out.println(habitat2.toString());

        habitat3.agregarAnimal(tiburon);
        habitat3.agregarAnimal(delfin);
        habitat3.agregarAnimal(pez);
        System.out.println(habitat3.toString());

        habitat4.agregarAnimal(vaca);
        habitat4.agregarAnimal(cerdo);
        habitat4.agregarAnimal(tortuga);
        System.out.println(habitat4.toString());

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
                        guiaVisitante.ofrecerGuia(habitat1);// pass habitat1 as argument
                        break;
                    case 2:
                        guiaVisitante = new guia_aves();
                        guiaVisitante.ofrecerGuia(habitat2); // pass habitat2 as argument
                        break;
                    case 3:
                        guiaVisitante = new guia_acuaticos();
                        guiaVisitante.ofrecerGuia(habitat3); // pass habitat3 as argument
                        break;
                    case 4:
                        guiaVisitante = new guia_granja();
                        guiaVisitante.ofrecerGuia(habitat4); // pass habitat4 as argument
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
