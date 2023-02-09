/*
https://stepik.org/lesson/399112/step/14?unit=388203
Сумма цифр натурального числа
Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.

Sample Input:

1234
Sample Output:

10
*/

package LoopWhile;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = (num - num % 10) / 10;
        }
        System.out.println(sum + num);
    }
}
