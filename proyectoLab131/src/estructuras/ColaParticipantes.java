package estructuras;

public class ColaParticipantes {

    private int max = 40;
    private Participante v[] = new Participante[max];
    private int ini, fin;

    public boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (fin == max) {
            return (true);
        }
        return (false);
    }

    public int nroelem() {
        return (fin - ini);
    }

    public void adicionar(Participante elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple llena Atencion");
        }
    }

    public Participante eliminar() {
        Participante elem = new Participante();
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola Simple vacia");
        }
        return (elem);
    }

    public void mostrar() {
        Participante elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola ");
            ColaParticipantes aux = new ColaParticipantes();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    public void vaciar(ColaParticipantes a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    public void leer() {
        adicionar(new Participante("112201", "Carlos Flores", 17, "A", "1"));
        adicionar(new Participante("112202", "Roberto Paco ", 17, "A", "1"));
        adicionar(new Participante("112203", "Helen Castillo", 12, "C", "1"));
        adicionar(new Participante("112204", "Aanabel Tito", 18, "C", "1"));
        adicionar(new Participante("112205", "Roger Soto", 11, "A", "1"));
        adicionar(new Participante("112206", "Juan Carlos Marquez", 13, "A", "1"));
        adicionar(new Participante("112207", "Maria Esther Salas", 19, "A", "1"));
        adicionar(new Participante("112208", "Rolando Walas", 17, "C", "1"));
        adicionar(new Participante("112209", "Roberta Yong", 19, "B", "1"));
        adicionar(new Participante("112210", "Claudio Salas", 19, "B", "1"));
        adicionar(new Participante("112211", "Gilberto Rojas", 21, "B", "1"));
        adicionar(new Participante("112212", "Patricia Guzman", 14, "B", "1"));
        adicionar(new Participante("112213", "Pamela Rios", 15, "B", "1"));
        adicionar(new Participante("112214", "Karen gutierrez", 16, "B", "1"));
        adicionar(new Participante("112215", "Richard Doglas", 16, "B", "1"));
        adicionar(new Participante("112216", "Wilson Cabrera", 18, "B", "1"));
        adicionar(new Participante("112217", "Alicia Apaza", 23, "B", "1"));
        adicionar(new Participante("112218", "Michel torricos", 20, "B", "1"));
        adicionar(new Participante("112219", "Hugo Calcina", 17, "B", "1"));
    }
}
