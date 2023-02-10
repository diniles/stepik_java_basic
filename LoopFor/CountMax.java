/*
https://stepik.org/lesson/399113/step/15?unit=388204
Сколько элементов, равных максимуму?
Последовательность состоит из натуральных чисел и завершается числом 0. Всего
вводится не более 10000 чисел (не считая завершающего числа 0). Определите,
сколько элементов этой последовательности равны ее наибольшему элементу.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:

1 2 4 5 2 5 3 0
Sample Output:

2
*/

package LoopFor;

import java.util.Scanner;

public class CountMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        int n;
        while ((n = sc.nextInt()) != 0) {
            if (n > max) {
                max = n;
                count = 1;
            } else if (n == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
