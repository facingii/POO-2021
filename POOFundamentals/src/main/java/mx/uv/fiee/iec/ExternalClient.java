package mx.uv.fiee.iec;

import mx.uv.fiee.iinf.poo.Bicycle;

public class ExternalClient extends Bicycle {

    public void init () {
        //publicos
        changeCadence (1);
        changeGear (2);

        //protegidos
        speedUp (100);
        applyBrakes (3);
    }

    public void init2 () {
        MountainBike m = new MountainBike();
        m.speedUp (1);
        m.applyBrakes(1);

        Bicycle m2 = new MountainBike();
    }

}
