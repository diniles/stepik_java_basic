/*
https://stepik.org/lesson/605375/step/5?unit=600486
Задача 5
Пользователь вводит натуральные числа по одному на каждой строке. Когда ему
надоедает, то он вводит 0. Найти количество введенных чисел (0 не считается)

Sample Input 1:

8
5
1
4
9
9
0
Sample Output 1:

6
Sample Input 2:

10
2
23
0
Sample Output 2:

3
*/

package LoopWhile;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int i;
        while ((i = sc.nextInt()) != 0) {
            count++;
        }
        System.out.println(count);
    }
}
