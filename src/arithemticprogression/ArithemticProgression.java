/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithemticprogression;
    
import java.util.Scanner;

public class ArithemticProgression {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnets in the series:");
        int n = sc.nextInt();
        for(int i = 1; i <=n ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
}
}