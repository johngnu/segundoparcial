package estructuras;

public class LSimpleM {

    private NodoM p;

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }

    public boolean esvacia() {
        return p == null;
    }

    public void adiFinal(Macrodistrito a) {
        NodoM nuevo = new NodoM();
        nuevo.setM(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoM r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }

    public void adiPrincipio(Macrodistrito a) {
        NodoM nuevo = new NodoM();
        nuevo.setM(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            setP(nuevo);
        }
    }

    public void mostrar() {
        NodoM r = getP();
        while (r != null) {
            r.getM().mostrar();
            r = r.getSig();
        }
    }

    public int nroNodos() {
        int c = 0;
        NodoM w = getP();
        while (w != null) {
            c++;
            w = w.getSig();
        }
        return c;
    }

    public void leer() {
        adiFinal(new Macrodistrito("Cotahuma", "1"));
        adiFinal(new Macrodistrito("Max Paredes", "2"));
        adiFinal(new Macrodistrito("Periférica", "3"));
        adiFinal(new Macrodistrito("San Antonio", "4"));
        adiFinal(new Macrodistrito("Sur", "5"));
        adiFinal(new Macrodistrito("Mallasa", "6"));
        adiFinal(new Macrodistrito("Centro", "7"));
    }
}
