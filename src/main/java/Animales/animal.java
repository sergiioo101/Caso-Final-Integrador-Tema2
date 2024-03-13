package Animales;

public class animal {


    String nombre;
    String especie;
    String sexo;
    String edad;
    String alimentacion;
    String reproduccion;
    Boolean salud;
    Boolean comportamiento;


    public animal(String nombre, String especie, String sexo, String edad, String alimentacion,String reproduccion, boolean salud, boolean comportamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.edad = edad;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.salud = Boolean.valueOf(String.valueOf(salud));
        this.comportamiento = Boolean.valueOf(String.valueOf(comportamiento));
    }

    @Override
        public String toString() {
            return "Nombre: " + this.nombre + ", Especie: " + this.especie + ", Sexo: " + this.sexo + ", Edad: " + this.edad + ", Alimentacion: " + this.alimentacion + ", Reproduccion: " + this.reproduccion + ", Salud: " + this.salud + ", Comportamiento: " + this.comportamiento;
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

    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = Boolean.valueOf(String.valueOf(salud));
    }

    public Boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = Boolean.valueOf(String.valueOf(comportamiento));
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
    //metodo para registrar la edad
    public void registrarEdad(String edad) {
        System.out.println("El animal " + nombre + " ha sido medido y su edad es " + edad);
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
    // metodo para registrar el comportamiento
    public void registrarComportamiento(boolean comportamiento) {
        System.out.println(buencomportamiento(comportamiento));
    }
}