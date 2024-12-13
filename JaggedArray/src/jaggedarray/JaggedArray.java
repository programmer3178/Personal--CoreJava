package jaggedarray;

/**
 *
 * @author sys
 */
public class JaggedArray {

    public static void main(String[] args) {
        int number[][] = new int[3][];
        number[0] = new int[3];
        number[1] = new int[4];
        number[2] = new int[2];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i[] : number) {
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
