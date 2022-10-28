package segparcial;

import java.util.LinkedList;

public class LSimpleC {

    private NodoC p;

    public LSimpleC() {
        p = null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }

    public boolean esvacia() {
        return p == null;
    }

    public void adiFinal(String idCat, String descripcion, LinkedList<SubCategoria> ls) {
        NodoC nuevo = new NodoC();
        nuevo.setIdCat(idCat);
        nuevo.setDescripcion(descripcion);
        nuevo.setLs(ls);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoC r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiPrincipio(String idCat, String descripcion, LinkedList<SubCategoria> ls) {
        NodoC nuevo = new NodoC();
        nuevo.setIdCat(idCat);
        nuevo.setDescripcion(descripcion);
        nuevo.setLs(ls);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            setP(nuevo);
        }
    }

    public void mostrar() {
        System.out.println("---------Categorias---------");
        NodoC r = getP();
        while (r != null) {
            r.mostrar();
            r = r.getSig();
        }
    }
}
