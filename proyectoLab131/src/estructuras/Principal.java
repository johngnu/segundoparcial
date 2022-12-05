package estructuras;

public class Principal {

    public static void main(String[] args) {

        Instructor d1 = new Instructor("998877", "Rodrigo Sanchez", "70322345", "Futbol", "Alta");
        Instructor d2 = new Instructor("998877", "Kasandra Ibañez", "65554332", "Futbol", "Alta");
        PilaInstructores pi = new PilaInstructores();
        pi.adicionar(d1);
        pi.adicionar(d2);

        //pi.mostrar();
        //ColaParticipantes cp1 = new ColaParticipantes();
        //cp1.adicionar(new Participante("1122334", "Pepito", 15, "A", "1"));

        //cp1.mostrar();
        LSimpleC lc1 = new LSimpleC();
        //lc1.adiFinal(new Curso("c1", "e1", "Futbol", "01/10/2022", "31/12/2022", "Futbol", cp1));

        //lc1.mostrar();
        LDobleA la = new LDobleA();
        la.adiprincipio(new Administrativo("123456", "Roberto Flores", "65544332", "Mañana", "Secretario", 3200));

        //la.mostrar();
        LSimpleE le = new LSimpleE();
        le.adiPrincipio("e1", "Copacabana C", "4455667", "Av. tito Yupanqui #345", lc1, la, pi);

        //le.mostrar();
        //LSimpleM lm = new LSimpleM();
        //lm.adiPrincipio(new Macrodistrito("San Antonio", le));

        //lm.mostrar();
    }

}
