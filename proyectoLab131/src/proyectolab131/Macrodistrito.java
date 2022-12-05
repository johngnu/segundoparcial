package proyectolab131;

public class Macrodistrito {

    private String nombre;
    private String nro;

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Macrodistrito(String nombre, String nro) {
        this.nombre = nombre;
        this.nro = nro;
    }

    public void mostrar() {
        System.out.println("nro: " + nro + ", Macrodistrito: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
