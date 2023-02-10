/*
https://stepik.org/lesson/399114/step/7?unit=388205
Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.  Переведите
число n из десятичной системы счисления в систему счисления с основанием k.

Sample Input:

6
2
Sample Output:

110
*/

package DebugProgramms;

import java.util.Scanner;

public class OtherNumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(n);
        } else {
            int k = sc.nextInt();
            StringBuilder result = new StringBuilder();
            while (n != 0) {
                result.append(n % k);
                n /= k;
            }
            System.out.println(result.reverse());
        }
    }
}
