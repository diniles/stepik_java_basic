/*
https://stepik.org/lesson/399113/step/10?unit=388204
Факториал
Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех
натуральных чисел от 1 до n

n! = 1∙2∙3∙…∙ n.

Sample Input:

5
Sample Output:

120
*/

package LoopFor;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
