package segparcial;

public class Artista {

    private String idArt;
    private String nombre;
    private String ci;
    private String fechaReg;
    private String especialidad;
    private String idCat;
    private String idSub;
    private String tipo;

    public Artista(String idArt, String nombre, String ci, String fechaReg, String especialidad, String idCat, String idSub, String tipo) {
        this.idArt = idArt;
        this.nombre = nombre;
        this.ci = ci;
        this.fechaReg = fechaReg;
        this.especialidad = especialidad;
        this.idCat = idCat;
        this.idSub = idSub;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("[" + idArt + ", " + nombre + ", " + ci + ", " + fechaReg + ", " + especialidad
                + ", " + idCat + ", " + idSub + ", " + tipo + "]");
    }

    public String getIdArt() {
        return idArt;
    }

    public void setIdArt(String idArt) {
        this.idArt = idArt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(String fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public String getIdSub() {
        return idSub;
    }

    public void setIdSub(String idSub) {
        this.idSub = idSub;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
