package segparcial;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Artistas
        Artista a1 = new Artista("a1", "Bony Lovy", "112233", "28/10/2022", "musica", "c1", "s1", "individual");
        
        a1.mostrar();
        
        // Array Artistas
        ArrayList<Artista> la = new ArrayList<>();
        la.add(a1);
    }

}
