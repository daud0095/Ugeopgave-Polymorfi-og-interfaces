package del2;

public class Main {

    public static void main(String[] args){


            PaintJob stue = new PaintJob("Stue");

            stue.addSurface(new Rectangle("Væg nord", 4.0, 2.5));
            stue.addSurface(new Rectangle("Væg syd", 4.0, 25));
            stue.addSurface(new Rectangle("Loft", 4.0, 5.0));

            stue.addDeduction(new Rectangle("Dør", 1.0, 2.1));
            stue.addDeduction(new Circle("Rundt vindue", 0.4));

            stue.printSummary();

    }
}
