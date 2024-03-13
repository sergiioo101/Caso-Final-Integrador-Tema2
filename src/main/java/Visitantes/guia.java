package Visitantes;
import Animales.animal;

import Gestion_habitats.habitats;
// En la clase guia
public abstract class guia {
    public abstract void ofrecerGuia();

    public void ofrecerGuia(habitats habitat) {
        System.out.println("Animales en este hábitat:");
        for (animal animal : habitat.getAnimales()) {
            System.out.println(animal.toString());
        }
    }
}
