import java.util.ArrayList;
import java.util.Collection;

public class Utilities {

    public static <T> void fill(ArrayList<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }

    public static <T extends Number, U extends Number> Double multiply(ArrayList<T> list, U val) {
        Double result = 0.0;

        for (int i = 0; i < list.size(); i++) {
            Double bar = list.get(i).doubleValue();
            Double foo = val.doubleValue();
            result += (bar * foo);
        }

        return result;
    }

    public static <T extends Number> int count (Collection<T> col, T item) {
        int count = 0;

        if (item == null) {
            for (T element : col) {
                if (element == null) count++;
            }
        } else {
            for (T element : col) {
                if (item.equals (element)) {
                    count++;
                }
            }
        }

        return count;
    }
}
