package movil.unicauca.adapter.Models;

/**
 * Created by Sebastianl on 05/04/2017.
 */

public class Planeta {

    private String nombre;
    private float gravedad;

    //Constructor
    public Planeta(String nombre, float gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }
}
