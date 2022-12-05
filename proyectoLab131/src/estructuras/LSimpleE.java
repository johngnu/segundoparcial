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

    public void adiPrincipio(String id, String n, String tel, String d, String md, LSimpleC lc, LDobleA la, PilaInstructores pi) {
        NodoE nuevo = new NodoE();
        nuevo.setIdEscuela(id);
        nuevo.setNombre(n);
        nuevo.setTelefono(tel);
        nuevo.setDireccion(d);
        nuevo.setMd(md); // set macrodistrito id
        // set estructuras Cursos, Administrativos, Instructores
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
        //cp1.mostrar();
        LSimpleC lc1 = new LSimpleC();
        lc1.leer();

        //lc1.mostrar();
        LDobleA la = new LDobleA();
        la.leer();
        la.adiprincipio(new Administrativo("123456", "Roberto Flores", "65544332", "Mañana", "Secretario", 3200));

        Instructor d1 = new Instructor("998877", "Rodrigo Sanchez", "70322345", "Futbol", "Alta");
        Instructor d2 = new Instructor("998877", "Kasandra Ibañez", "65554332", "Futbol", "Alta");
        PilaInstructores pi = new PilaInstructores();
        pi.adicionar(d1);
        pi.adicionar(d2);

    }
}
