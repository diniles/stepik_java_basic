/*
https://stepik.org/lesson/399114/step/6?unit=388205
Вводится натуральное число n. Необходимо определить количество его делителей.

Sample Input:

100
Sample Output:

9
*/

package DebugProgramms;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        System.out.print(result);
    }
}
