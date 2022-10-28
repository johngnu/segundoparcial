package segparcial;

import java.util.LinkedList;

public class NodoC {

    private String idCat;
    private String descripcion;
    private LinkedList<SubCategoria> ls;
    private NodoC sig;

    public void mostrar() {
        System.out.println("Categoria: [" + idCat + ", " + descripcion + "]");
        System.out.println("---- sib categorias");
        for (SubCategoria sc : ls) {
            sc.mostrar();
        }
        System.out.println();
    }

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LinkedList<SubCategoria> getLs() {
        return ls;
    }

    public void setLs(LinkedList<SubCategoria> ls) {
        this.ls = ls;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }

}
