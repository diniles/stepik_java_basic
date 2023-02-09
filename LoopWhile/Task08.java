/*
https://stepik.org/lesson/605375/step/8?unit=600486
Задача 8
Программа запрашивает натуральное число n. Необходимо составить программу,
которая будет считывать целые числа до тех пор, пока их произведение не
станет больше либо равна n. Выведите через пробел количество введенных
чисел и их произведение.

Примечание: подумайте, что произойдёт, если n равно 1.

Sample Input 1:

8
1
5
3
4
2
7
19
Sample Output 1:

3 15
Sample Input 2:

100
-2
-1
5
10
3
Sample Output 2:

4 100
*/

package LoopWhile;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int product = 1;
        while ((product *= sc.nextInt()) < num) {
            count++;
        }
        System.out.printf("%d %d", count, product);
    }
}
