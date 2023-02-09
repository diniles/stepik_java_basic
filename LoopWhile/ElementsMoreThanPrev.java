/*
https://stepik.org/lesson/399112/step/15?unit=388203
Количество элементов, больших предыдущего
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите, сколько элементов этой последовательности больше предыдущего
элемента. Гарантируется ввод хотя бы двух ненулевых чисел.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:

8
11
21
0
Sample Output:

2
*/

package LoopWhile;

import java.util.Scanner;

public class ElementsMoreThanPrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int currNum = num;
        while (num != 0) {
            num = sc.nextInt();
            if (num > currNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
