package estructuras;

public class NodoE {

    private String idEscuela;
    private String nombre;
    private String direccion;
    private String telefono;
    private LSimpleC lc;
    private LDobleA la;
    private PilaInstructores pi;
    private NodoE sig;

    public void mostrar() {
        System.out.println("id: " + idEscuela + ", nombre: " + direccion + ", tel: " + telefono);
        lc.mostrar();
        la.mostrar();
        pi.mostrar();
    }

    public String getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(String idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LSimpleC getLc() {
        return lc;
    }

    public void setLc(LSimpleC lc) {
        this.lc = lc;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

    public LDobleA getLa() {
        return la;
    }

    public void setLa(LDobleA la) {
        this.la = la;
    }

    public PilaInstructores getPi() {
        return pi;
    }

    public void setPi(PilaInstructores pi) {
        this.pi = pi;
    }

}
