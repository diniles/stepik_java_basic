/*
https://stepik.org/lesson/399113/step/6?unit=388204
Только 7
Напишем программу, которая считывает целые числа с клавиатуры и находит их
сумму, если они заканчиваются на 7. Если ввели число, кратное 7, то
программа должна завершиться (оно не суммируется). Во время решения задачи
воспользуемся break и continue.

Sample Input:

1
2
17
27
14
37
45
12
Sample Output:

44
*/

package LoopFor;

import java.util.Scanner;

public class OnlySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i;
        while ((i = sc.nextInt()) % 7 != 0) {
            if (i % 10 == 7) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
