package estructuras;

public class NodoA {

    Administrativo a;
    private NodoA sig, ant;

    public NodoA(Administrativo a) {
        this.a = a;
    }

    public Administrativo getA() {
        return a;
    }

    public void setA(Administrativo a) {
        this.a = a;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public NodoA getAnt() {
        return ant;
    }

    public void setAnt(NodoA ant) {
        this.ant = ant;
    }

}
