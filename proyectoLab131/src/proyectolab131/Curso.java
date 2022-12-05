package proyectolab131;

public class Curso {

    private String idCurso;
    private String idEscuela;
    private String nombre;
    private String fecInicio;
    private String fecFinal;
    private String disciplina;
    private ColaParticipantes cp;

    public Curso() {
        
    }

    public Curso(String idCurso, String idEscuela, String nombre, String fecInicio, String fecFinal, String disciplina, ColaParticipantes cp) {
        this.idCurso = idCurso;
        this.idEscuela = idEscuela;
        this.nombre = nombre;
        this.fecInicio = fecInicio;
        this.fecFinal = fecFinal;
        this.disciplina = disciplina;
        this.cp = cp;
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

    public String getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(String idEscuela) {
        this.idEscuela = idEscuela;
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

    public ColaParticipantes getCp() {
        return cp;
    }

    public void setCp(ColaParticipantes cp) {
        this.cp = cp;
    }

}
