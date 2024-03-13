package Visitantes;

import Gestion_habitats.habitats;

public class guia_granja extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al recorrido de animales domésticos.");
    }

    @Override
    public void ofrecerGuia(habitats habitat) {

    }
}
