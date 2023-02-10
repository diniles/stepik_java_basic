/*
https://stepik.org/lesson/399113/step/13?unit=388204
Двоичная запись
Дано натуральное число N. Выведите его представление в двоичном виде в обратном
порядке.

Sample Input:

6
Sample Output:

011
*/

package LoopFor;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(); n > 0; n /= 2) {System.out.print(n % 2);}
    }
}
