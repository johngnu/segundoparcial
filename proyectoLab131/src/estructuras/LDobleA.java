package estructuras;

public class LDobleA {

    private NodoA p;

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }

    public void adiprincipio(Administrativo f) {
        NodoA nuevo = new NodoA(f);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adifinal(Administrativo f) {
        NodoA nuevo = new NodoA(f);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoA r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public void mostrar() {
        System.out.println("-----------ADMINISTRATIVOS------------ ");
        NodoA z = getP();
        while (z != null) {
            z.getA().mostrar();
            z = z.getSig();
        }
    }
    
    public void leer() {
        
    }
}
