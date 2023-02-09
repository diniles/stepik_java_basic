/*
https://stepik.org/lesson/399112/step/16?unit=388203
Второй максимум
Последовательность состоит из различных натуральных чисел и завершается числом
0. Определите значение второго по величине элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0
в последовательность не входит). Гарантируется, что будет введено хотя бы 2 числа.

Выходные данные
Выведите ответ на задачу.

Sample Input:

2 3 4 5 8 7 4 0
Sample Output:

7
*/

package LoopWhile;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFirst = number;
        int maxSecond = 0;
        while (number != 0) {
            number = sc.nextInt();
            if (number > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = number;
            }
            if (number > maxSecond & number < maxFirst) {
                maxSecond = number;
            }
        }
        System.out.println(maxSecond);
    }
}
