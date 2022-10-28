package segparcial;

import java.util.ArrayList;

public class NodoD {

    private String nombre;
    private ArrayList<Artista> al;
    private NodoD sig, ant;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Artista> getAl() {
        return al;
    }

    public void setAl(ArrayList<Artista> al) {
        this.al = al;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

}
