package proyectolab131;

public class PilaInstructores {

    private int max = 100;
    private Instructor v[] = new Instructor[max + 1];
    private int tope;

    PilaInstructores() {
        tope = 0;
    }

    public boolean esvacia() {
        if (tope == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (tope == max) {
            return (true);
        }
        return (false);
    }

    public int nroelem() {
        return (tope);
    }

    public void adicionar(Instructor elem) {
        if (!esllena()) {
            tope++;
            v[tope] = elem;
        } else {
            System.out.println("Pila llena");
        }
    }

    public Instructor eliminar() {
        Instructor elem = null;
        if (!esvacia()) {
            elem = v[tope];
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
        return (elem);
    }

    public void mostrar() {
        Instructor elem;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila ");
            PilaInstructores aux = new PilaInstructores();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar(); //checar esto
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaInstructores a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());
        }
    }

    public void leer() {
        adicionar(new Instructor("998877", "Rodrigo Sanchez", "70322345", "Futbol", "Alta"));
        adicionar(new Instructor("998877", "Kasandra Ibañez", "65554332", "Futbol", "Alta"));
    }

}
