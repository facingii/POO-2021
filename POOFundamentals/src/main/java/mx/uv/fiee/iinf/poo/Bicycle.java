package mx.uv.fiee.iinf.poo;

public class Bicycle {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;
    private String color;

    public int getCadence (){
        return cadence;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    protected void speedUp(int increment) {
        speed = speed + increment;
    }

    protected void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    public void doMaintenance () {}

    public void doPaint (String color) {}
}

