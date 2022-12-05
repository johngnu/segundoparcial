package proyectolab131;

class LSimpleC {

    private NodoC p;

    public LSimpleC() {
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

    public void adiFinal(Curso a) {
        NodoC nuevo = new NodoC();
        nuevo.setC(a);
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

    public void adiPrincipio(Curso a) {
        NodoC nuevo = new NodoC();
        nuevo.setC(a);
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            setP(nuevo);
        }
    }

    public void mostrar() {
        System.out.println("---------Cursos------");
        NodoC r = getP();
        while (r != null) {
            r.getC().mostrar();
            r = r.getSig();
        }
    }
    
    void leer() {
        ColaParticipantes cp1 = new ColaParticipantes();
        cp1.leer();
        //adiFinal(ne w Curso("c1", "e1", "Futbol", "01/10/2022", "31/12/2022", "Futbol", cp1));
    }
}
