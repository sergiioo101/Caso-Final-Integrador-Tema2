package Visitantes;
import Gestion_habitats.habitats;
import Animales.animal;
import java.util.List;

public class guia_acuaticos extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al recorrido de acuáticos.");
    }

    @Override
    public void ofrecerGuia(habitats habitat) {
        System.out.println("Te damos la bienvenida al recorrido de acuáticos.");
        List<animal> animales = habitat.getAnimales();
        for (animal animal : animales) {
            System.out.println(animal.toString());
        }
    }
}
