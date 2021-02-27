package mx.uv.fiee.iec;

import mx.uv.fiee.iinf.poo.Bicycle;

public class MountainBike extends Bicycle {
    public void init () {
        changeCadence (1);
        changeGear (2);
    }

    @Override
    protected void applyBrakes(int decrement) {
        super.applyBrakes(decrement);
    }

    @Override
    protected void speedUp(int increment) {
        super.speedUp(increment);
    }

}
