package pkg3darray;

/**
 *
 * @author sys
 */
public class Main {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[][] = new int[4][4];
        int c[][][] = new int[4][4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j][k] = (int) (Math.random() * 10);
                }
            }

        }
        for (int i[][] : c) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(" " + k);
                }
            }
            System.out.println();
        }
    }

}
