package estructuras;

public class Curso {

    private String idCurso;
    private String nombre;
    private String fecInicio;
    private String fecFinal;
    private String disciplina;

    public Curso() {

    }

    public Curso(String idCurso, String nombre, String fecInicio, String fecFinal, String disciplina) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.fecInicio = fecInicio;
        this.fecFinal = fecFinal;
        this.disciplina = disciplina;
    }

    public void mostrar() {
        System.out.println("idCurso: " + idCurso + ", nombre: " + nombre + ", ");
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(String fecInicio) {
        this.fecInicio = fecInicio;
    }

    public String getFecFinal() {
        return fecFinal;
    }

    public void setFecFinal(String fecFinal) {
        this.fecFinal = fecFinal;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
