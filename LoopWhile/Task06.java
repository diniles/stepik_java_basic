/*
https://stepik.org/lesson/605375/step/6?unit=600486
Задача 6
Пользователь вводит натуральные числа по одному на каждой строке. Когда ему
надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)

Sample Input 1:

10
2
5
5
0
Sample Output 1:

22
Sample Input 2:

3
2
1
0
Sample Output 2:

6
*/

package LoopWhile;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i;
        while ((i = sc.nextInt()) != 0) sum += i;
        System.out.println(sum);
    }
}
