package segparcial;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Lista Categorias
        LSimpleC lc = new LSimpleC();

        // Sub Categorias
        LinkedList<SubCategoria> lks1 = new LinkedList<>();
        SubCategoria sc1 = new SubCategoria("s1", "sub 1");
        SubCategoria sc2 = new SubCategoria("s1", "sub 1");
        lks1.add(sc1);
        lks1.add(sc2);

        // llenar categorias
        lc.adiFinal("c1", "Artes musicales", lks1);
        lc.adiFinal("c2", "Artes escenicas", lks1);

        lc.mostrar();

        // Lista Artistas
        ArrayList<Artista> la = new ArrayList<>();
        Artista a1 = new Artista("a1", "Bony Lovy", "112233", "28/10/2022", "musica", "c1", "s1", "individual");

        la.add(a1);

        // Departamentos
        NodoD d1 = new NodoD("Chuquizaca", la);
        NodoD d2 = new NodoD("La Paz", new ArrayList<>());
        NodoD d3 = new NodoD("Cochabamba", new ArrayList<>());
        NodoD d4 = new NodoD("Oruro", new ArrayList<>());
        NodoD d5 = new NodoD("Potosi", new ArrayList<>());
        NodoD d6 = new NodoD("Tarija", new ArrayList<>());
        NodoD d7 = new NodoD("Santa Cruz", new ArrayList<>());
        NodoD d8 = new NodoD("Beni", new ArrayList<>());
        NodoD d9 = new NodoD("Pando", new ArrayList<>());
        LDobleD ld = new LDobleD();
        ld.adifinal(d1);
        ld.adifinal(d2);
        ld.adifinal(d3);
        //ld.adifinal(d4);
        //ld.adifinal(d5);
        //ld.adifinal(d6);
        //ld.adifinal(d7);
        //ld.adifinal(d8);
        //ld.adifinal(d9);

        ld.mostrar();
        System.out.println("Solucion C");
        SolucionC(lc, ld, "La Paz");

    }

    private static void SolucionC(LSimpleC lc, LDobleD ld, String d) {
        NodoC r = lc.getP();
        while (r != null) {
            System.out.println("** " + r.getDescripcion());
            NodoD z = ld.getP();
            int cont = 0;
            while (z != null) {
                // verificamos si es el departamento
                if (z.getNombre().equals(d)) {                     
                    for (Artista a : z.getAl()) {
                        if (a.getTipo().equals("individual")) {
                            cont++;
                        }
                    }
                }
                z = z.getSig();
            }
            System.out.println("Hay: " + cont);
            r = r.getSig();
        }
    }

}
