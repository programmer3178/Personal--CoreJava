
package constructor;

/**
 *
 * @author sys
 */
public class Constructor {

    public static void main(String[] args) {
        Abc obj = new Abc(6); //Object Creation

        System.out.println(obj);
    }

    static class Abc {

        protected int i;

        //Default constructor
        public Abc() //Consructor Overloading
        {
            System.out.println("Default Cosntructor");
        }

        public Abc(int i) {
            this.i = i;
            i++;

        }

        @Override
        public String toString() {
            return "Abc{" + "i=" + i + '}';
        }
    }

}
