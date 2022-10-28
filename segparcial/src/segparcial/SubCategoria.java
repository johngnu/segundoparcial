package segparcial;

public class SubCategoria {

    private String idSub;
    private String descripcion;

    public SubCategoria(String idSub, String descripcion) {
        this.idSub = idSub;
        this.descripcion = descripcion;
    }

    public void mostrar() {
        System.out.println("SubCategoria: [" + idSub + ", " + descripcion + "]");
    }

    public String getIdSub() {
        return idSub;
    }

    public void setIdSub(String idSub) {
        this.idSub = idSub;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
