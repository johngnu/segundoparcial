package estructuras;

public class LSimpleE {

    private NodoE p;

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }

    public boolean esvacia() {
        return p == null;
    }

    public void adiFinal(String id, String n, String tel, String d, LSimpleC lc, LDobleA la, PilaInstructores pi) {
        NodoE nuevo = new NodoE();
        nuevo.setIdEscuela(id);
        nuevo.setNombre(n);
        nuevo.setTelefono(tel);
        nuevo.setDireccion(d);
        nuevo.setLc(lc);
        nuevo.setLa(la);
        nuevo.setPi(pi);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoE r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiPrincipio(String id, String n, String tel, String d, LSimpleC lc, LDobleA la, PilaInstructores pi) {
        NodoE nuevo = new NodoE();
        nuevo.setIdEscuela(id);
        nuevo.setNombre(n);
        nuevo.setTelefono(tel);
        nuevo.setDireccion(d);
        nuevo.setLc(lc);
        nuevo.setLa(la);
        nuevo.setPi(pi);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            setP(nuevo);
        }
    }

    public void mostrar() {
        System.out.println("--------- Escuelas ------");
        NodoE r = getP();
        while (r != null) {
            r.mostrar();
            r = r.getSig();
        }
    }

    public int nroNodos() {
        int c = 0;
        NodoE w = getP();
        while (w != null) {
            c++;
            w = w.getSig();
        }
        return c;
    }

    public void leer() {

    }
}
