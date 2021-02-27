
public class Main {

    public static void main (String [] args) {
        Stack<Integer> stack = new Stack (5);
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);
        stack.push (5);

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop ());
        }

        Stack<String> stack1 = new Stack<> (2);
        stack1.push ("Hola");
        stack1.push ("Mundo");

        for (int i = 0; i < 2; i++) {
            System.out.println(stack1.pop ());
        }
    }

}
