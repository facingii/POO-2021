package mx.uv.fiee.iec;

import mx.uv.fiee.iinf.poo.Bicycle;

// Object -> Bicycle -> Hijas
public class Main
{
    static void main (String [] args) {
        MountainBike b = new MountainBike();
        StreetBike s = new StreetBike ();

        paint (b);
        paint (s);
    }

    static void paint (Bicycle item) {
        //if (item instanceof MountainBike) ((MountainBike) item).paintRed ();
        //if (item instanceof StreetBike) ((StreetBike) item).paintBlue ();

        item.doPaint ("green");
    }
}
