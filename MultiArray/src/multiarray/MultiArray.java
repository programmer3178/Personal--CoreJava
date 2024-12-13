package multiarray;

/**
 *
 * @author sys
 */
public class MultiArray {

    public static void main(String[] args) {
        int number[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                number[i][j] = (int) (Math.random() * 100);

            }

        }
        for (int i[] : number) {
            for (int m : i) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
