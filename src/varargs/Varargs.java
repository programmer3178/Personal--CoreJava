
package varargs;

/**
 *
 * @author sys
 */
public class Varargs {

    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5, 6, 7);
    }

    public static class Display {

        public void show(int... a) //Varargs - Variable arguements
        {
            for (int i : a) {
                System.out.println(i);
            }

        }
    }
}
