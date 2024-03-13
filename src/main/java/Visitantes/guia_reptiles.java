package Visitantes;

import Gestion_habitats.habitats;

public class guia_reptiles extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al recorrido de reptiles.");
    }

    public void ofrecerGuia(habitats habitat) {
        System.out.println("Te damos la bienvenida al recorrido de reptiles.");
        habitat.mostrarAnimales();
    }
}
