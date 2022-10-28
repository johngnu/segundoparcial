/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segparcial;

/**
 *
 * @author desktop
 */
public class LDobleD {

    private NodoD p;

    public LDobleD() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    public void adiprincipio(NodoD nuevo) {
        if (getP() == null) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adifinal(NodoD nuevo) {
        if (getP() == null) {
            setP(nuevo);
        } else {
            NodoD r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    public int nroNodos() {
        NodoD r = getP();
        int cont = 0;
        while (r != null) {
            cont++;
            r = r.getSig();
        }
        return cont;
    }

    public void mostrar() {
        System.out.println("-----------Departamentos------------ ");
        NodoD z = getP();
        while (z != null) {
            System.out.println("Depto: [nombre=" + z.getNombre() + "]");
            System.out.println(" ** Lista artistas ** ");
            for (Artista a : z.getAl()) {
                a.mostrar();
            }
            z = z.getSig();
        }
    }

}
