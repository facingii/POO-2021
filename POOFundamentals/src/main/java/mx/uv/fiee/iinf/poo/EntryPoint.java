package mx.uv.fiee.iinf.poo;

public class EntryPoint {

    public static void main (String [] args) {
        Bicycle b = new Bicycle ();
        b.speedUp(100);
        b.changeCadence(20);
        b.printStates ();

        Tricycle t = new Tricycle ();
        t.speedUp(20);
        t.changeCadence(1);
        t.wheels = 3;
        //t.printStates ();

        System.out.println (t.toString ());
        t.calculateOverload (1.0f, 23);

        //Object <- Bicycle <- Tricycle
        Bicycle b2 = new Tricycle ();

        maintenance (b2);

        //Number <- Integer
        //      <- Double
        //
        //Integer <-> int
        //Double <-> double
        calculateRide (100);
    }

    static void maintenance (Bicycle item) {
        if (!(item instanceof Tricycle)) {
            Tricycle t = (Tricycle) item;
        }

        item.doMaintenance ();
    }

    static int calculateRide (Number n) {
        return n.intValue () * 2;
    }
}
