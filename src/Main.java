public class Main {
    public static void main(String[] args) {
        //Aufgabe 1
        Buch b1 = new Buch();
        Buch b2 = new Buch(true, 254, "Duckscher Geheimdienst 01", "Walt Disney");
        Buch b3 = new Buch(false, 1258, "Java ist auch eine Insel", "Christian Ullenboom");

        b1.print();
        b2.print();
        b3.print();

        //Aufgabe 2
        Flugzeug f1 = new Flugzeug();
        Flugzeug f2 = new Flugzeug("A320");
        Flugzeug f3 = new Flugzeug(4, 68, "747-8", 364);

        f1.print();
        f2.print();
        f3.print();

        //Aufgabe 3
        testDatentypen();
    }

    public static void testDatentypen() {
        //Implementieren Sie hier Aufgabe 3
    }
}
