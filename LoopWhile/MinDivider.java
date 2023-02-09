/*
https://stepik.org/lesson/399112/step/11?unit=388203
Минимальный делитель
Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель,
отличный от 1.

Sample Input:

15
Sample Output:

3
*/

package LoopWhile;

import java.util.Scanner;

public class MinDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;

        while (num % i != 0) {
            i++;
        }
        System.out.println(i);
    }
}
