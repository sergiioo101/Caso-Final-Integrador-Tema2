package Gestion_habitats;

public class terrario extends habitats    {

    boolean puede_caminar;

    public terrario(float temperatura, float humedad, boolean limpieza) {
        super(temperatura, humedad, limpieza);
    }

    @Override
    public String toString() {
        return "terrestres []";
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
}