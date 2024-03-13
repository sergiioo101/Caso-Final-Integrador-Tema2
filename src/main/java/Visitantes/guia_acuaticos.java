package Visitantes;
import Gestion_habitats.habitats;
// En la clase guia_acuaticos
public class guia_acuaticos extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al recorrido de animales acuáticos.");
    }

    @Override
    public void ofrecerGuia(habitats habitat) {
        super.ofrecerGuia(habitat);
        System.out.println("Te damos la bienvenida al recorrido de animales acuáticos.");
    }
}
