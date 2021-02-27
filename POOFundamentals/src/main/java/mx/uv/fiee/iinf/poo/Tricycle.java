package mx.uv.fiee.iinf.poo;

public class Tricycle extends Bicycle {
    int wheels;
    int overload;

    @Override
    public void printStates () {
        System.out.println("cadence:" +
                getCadence() + " speed:" +
                "Wheels" + wheels);
    }

    @Override
    public String toString () {
        return "Tricycle{" +
                "wheels=" + wheels +
                '}';
    }

    void calculateOverload () {

    }

    void calculateOverload (float weight) {

    }

    void calculateOverload (boolean recalculte) {

    }

    void calculateOverload (float weight, int age) {

    }

    double calculateOverload (int kms) {
        return 0.0;
    }

    double calculateOverload (int kms, int count) {
        return 0.0;
    }
}
