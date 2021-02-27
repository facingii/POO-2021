import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add (10);
        intList.add (20);

        System.out.println ("Lista original: " + intList);
        Utilities.fill (intList, 500);
        System.out.println ("Lista modificada: " + intList);


        Double d = Utilities.multiply (intList, 2.5);
        System.out.println ("Resultado: " + d);

        GenericSubClass1 g = new GenericSubClass1 ();

        ArrayList<Number> listA = new ArrayList<> ();
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Double> listC = new ArrayList<> ();

    }

}

class GenericSuperClass<T extends Number>
{
    //Generic super class with bounded type parameter
}

class GenericSubClass1<T extends Integer>  extends GenericSuperClass<T>
{
    //type parameter replaced by upper bound
}
