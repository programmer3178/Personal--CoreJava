package stringbasics;

/**
 *
 * @author sys
 */
public class StringBasics {

    /*Two methods - 1. By creating user-defined class and constructors.
                    2. Directly assigning  a string literal without explicitly creating objects (most common way)
                    3.By using pre-defined class called 'String' and passing a string literal as parameters.
    
    String concatentaion - 1.Using '+' operators 
                           2. Using concat(string literal) method of String class.
     */
    public static void main(String[] args) {
        //String name = new String("Shriteja"); //Shastry- String literal
        String name = "Shriteja";
        System.out.println(name.hashCode()); //Fetching the corresponding hash code of the object 'name'
        System.out.println(name.concat("Shastry"));
        System.out.println(name + " " + "Shastry");
        /*StringBasics obj = new StringBasics();
        System.out.println("Hello" + name);// First method of string concatentaion
        System.out.println(name.charAt(1));
        System.out.println(obj.name);
        System.out.println(obj.name.hashCode());//Fetching the corresponding hash code of the object 'name'
        System.out.println(name.charAt(1));
        System.out.println("Hello" + name);
       
       
    }
     final String name;

    public StringBasics() {
    this.name = "Shastry";
    }*/

    }
}
