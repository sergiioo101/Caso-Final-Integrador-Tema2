package Animales;

public class animal {


    String nombre;
    String especie;
    String sexo;
    String edad;
    String peso;
    String alimentacion;
    String reproduccion;
    String enfermedades;
    String vacunas;
    boolean salud;
    boolean comportamiento;
    int id;


    public animal(String nombre, String especie, String sexo, String edad, String peso,String alimentacion, String reproduccion,String vacunas, boolean salud, boolean comportamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.vacunas = vacunas;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }

    public animal(String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, String param11, String param12, String param13, String param14, String param15, String param16, String param17, String param18) {
    }

    public animal(String cocodrilo, String reptil, String carnívoro, String aguaSalada, String tropical, String verde, String grande) {
    }

    @Override
        public String toString() {
            return "Nombre: " + this.nombre + ", Especie: " + this.especie /*+ ", Otros atributos: " + otros atributos...*/;
        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public String getReproduccion() {
        return reproduccion;
    }


    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }
    
    public String getEnfermedades() {
        return enfermedades;
    }


    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }


    public String getVacunas() {
        return vacunas;
    }


    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }
    
    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public boolean buenasalud(boolean salud) {
        if (salud == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de salud");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de salud");
        return salud;
    }

    public boolean buencomportamiento(boolean comportamiento) {
        if (comportamiento == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de comportamiento");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de comportamiento");
        return comportamiento;
    }

    //metodo para registrar la alimentación
    public void registrarAlimentacion(String alimento) {
        System.out.println("El animal " + nombre + " ha sido alimentado con " + alimento);
    }

    //metodo para registrar la reproducción
    public void registrarReproduccion(String pareja) {
        System.out.println("El animal " + nombre + " ha tenido una relación con " + pareja);
    }
    //metodo para registrar los cuidados
    public void registrarCuidados(String cuidado) {
        System.out.println("El animal " + nombre + " ha sido cuidado con " + cuidado);
    }
    //metodo para registrar las enfermedades
    public void registrarEnfermedades(String enfermedad) {
        System.out.println("El animal " + nombre + " ha sido diagnosticado con " + enfermedad);
    }
    //metodo para registrar las vacunas
    public void registrarVacunas(String vacuna) {
        System.out.println("El animal " + nombre + " ha sido vacunado con " + vacuna);
    }
    //metodo para registrar el habitat
    public void registrarHabitat(String habitat) {
        System.out.println("El animal " + nombre + " ha sido trasladado a " + habitat);
    }
    //metodo para registrar el peso
    public void registrarPeso(String peso) {
        System.out.println("El animal " + nombre + " ha sido pesado y su peso es " + peso);
    }
    //metodo para registrar la altura
    public void registrarAltura(String altura) {
        System.out.println("El animal " + nombre + " ha sido medido y su altura es " + altura);
    }
    //metodo para registrar la edad
    public void registrarEdad(String edad) {
        System.out.println("El animal " + nombre + " ha sido medido y su edad es " + edad);
    }
    //metodo para registrar el color
    public void registrarColor(String color) {
        System.out.println("El animal " + nombre + " ha sido medido y su color es " + color);
    }
    //metodo para registrar la raza
    public void registrarRaza(String raza) {
        System.out.println("El animal " + nombre + " ha sido medido y su raza es " + raza);
    }
    //metodo para registrar la especie
    public void registrarEspecie(String especie) {
        System.out.println("El animal " + nombre + " ha sido medido y su especie es " + especie);
    }
    //metodo para registrar el nombre
    public void registrarNombre(String nombre) {
        System.out.println("El animal " + nombre + " ha sido medido y su nombre es " + nombre);
    }
    //metodo para registrar el sexo
    public void registrarSexo(String sexo) {
        System.out.println("El animal " + nombre + " ha sido medido y su sexo es " + sexo);
    }
    //metodo para registrar el tipo
    public void registrarTipo(String tipo) {
        System.out.println("El animal " + nombre + " ha sido medido y su tipo es " + tipo);
    }
    //metodo para registrar el id
    public void registrarId(int id) {
        System.out.println("El animal " + nombre + " ha sido medido y su id es " + id);
    }
    // metodo para registrar la salud
    public void registrarSalud(boolean salud) {
        System.out.println(buenasalud(salud));
    }

    // metodo para registrar el comportamiento
    public void registrarComportamiento(boolean comportamiento) {
        System.out.println(buencomportamiento(comportamiento));
    }
}