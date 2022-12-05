package proyectolab131;

public class Instructor {

    private String ci;
    private String nombre;
    private String celular;
    private String disciplina;
    private String experiencia;

    public Instructor(String ci, String nombre, String celular, String disciplina, String experiencia) {
        this.ci = ci;
        this.nombre = nombre;
        this.celular = celular;
        this.disciplina = disciplina;
        this.experiencia = experiencia;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void mostrar() {
        System.out.println("ci: " + ci + ", nombre: " + nombre + ", celular: " + celular + ", disciplina: " + disciplina + ", experiencia: " + experiencia);
    }

}
