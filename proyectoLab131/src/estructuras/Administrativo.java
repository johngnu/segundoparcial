package estructuras;

public class Administrativo {

    private String ci;
    private String nombre;
    private String celular;
    private String turno;
    private String cargo;
    private int salario;

    public Administrativo() {
    }

    public Administrativo(String ci, String nombre, String celular, String turno, String cargo, int salario) {
        this.ci = ci;
        this.nombre = nombre;
        this.celular = celular;
        this.turno = turno;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("ci: " + ci + ", nombre: " + nombre + ", celular: " + celular + ", turno: " + turno + ", cargo: " + cargo + ", salario: " + salario);
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
