package Visitantes;
import Gestion_habitats.habitats;
// En la clase guia_aves
public class guia_aves extends guia {
    @Override
    public void ofrecerGuia() {
        System.out.println("Te damos la bienvenida al tour de aves.");
    }

    @Override
    public void ofrecerGuia(habitats habitat) {
        super.ofrecerGuia(habitat);
        System.out.println("Te damos la bienvenida al tour de aves.");
    }
}
