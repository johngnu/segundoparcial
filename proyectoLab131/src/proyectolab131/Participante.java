package proyectolab131;

public class Participante {

    private String ci;
    private String nombre;
    private int edad;
    private String categoria;
    private String idEscuela;

    public Participante() {
    }

    public Participante(String ci, String nombre, int edad, String categoria, String idEscuela) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.idEscuela = idEscuela;
    }

    public String getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(String idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar() {
        System.out.println("Ci: " + ci + ", Nombre: " + nombre + ", Edad: " + edad + " ,Categoria: " + categoria);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
