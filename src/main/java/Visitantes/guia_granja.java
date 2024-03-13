package Visitantes;
import Gestion_habitats.habitats;
import Animales.animal;
import java.util.List;

public class guia_granja extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al recorrido de la granja.");
    }

    @Override
    public void ofrecerGuia(habitats habitat) {
        System.out.println("Te damos la bienvenida al recorrido de la granja.");
        List<animal> animales = habitat.getAnimales();
        for (animal animal : animales) {
            System.out.println(animal.toString());
        }
    }
}
