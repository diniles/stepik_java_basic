/*
https://stepik.org/lesson/399112/step/9?unit=388203
Максимум
Последовательность состоит из различных натуральных чисел и завершается числом
0. Определите значение максимального элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0
в последовательность не входит). Гарантируется, что будет введено хотя бы 2
числа.

Выходные данные
Выведите ответ на задачу.

Sample Input:

2 3 4 5 8 7 4 0
Sample Output:

8
*/

package LoopWhile;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int max = Integer.MIN_VALUE;
        while ((a = sc.nextInt()) != 0) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
