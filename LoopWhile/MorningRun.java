/*
https://stepik.org/lesson/399112/step/13?unit=388203
Утренняя пробежка
В первый день спортсмен пробежал x километров, а затем он каждый день
увеличивал пробег на 10% от предыдущего значения. По данному числу y
определите номер дня, на который пробег спортсмена составит не менее y
километров.

Входные данные
Программа получает на вход действительные числа x и y

Выходные данные
Программа должна вывести одно натуральное число.

Sample Input:

10
20
Sample Output:

9
*/

package LoopWhile;

import java.util.Scanner;

public class MorningRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int days = 1;
        double currDay = x;
        while (currDay < y) {
            currDay *= 1.1;
            days++;
        }
        System.out.println(days);
    }
}
