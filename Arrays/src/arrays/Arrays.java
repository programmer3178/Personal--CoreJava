package arrays;

/**
 *
 * @author sys
 */
public class Arrays {

    public static void main(String[] args) {
        //Method1- Array Creation
        /*int num[] = {3, 7, 2, 4}; //num- Reference variable(object) 
        num[1] = 5; //Updating the value
        for(int i : num) //Enhanced for loop
        {
            System.out.println(num[i]);
        }*/
        //Method 2- Array Creation by specifying size
        int num1[] = new int[4]; //num1- Reference variable(object) 
        num1[0] = 2;
        num1[1] = 3;
        num1[2] = 4;

        for (int i = 0; i <= 3; i++) {
            System.out.println(num1[i]);
        }

    }
}
