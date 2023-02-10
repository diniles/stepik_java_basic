/*
https://stepik.org/lesson/399113/step/9?unit=388204
Min и Max
Задача на поиск минимума и максимума. Пользователь вводит натуральное число n,
затем n целых чисел. Необходимо определить и вывести на экран минимальное и
максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное
значения часто используются -2*109 и 2*109 соответственно. Но в олимпиадных
задачах всегда смотрите на ограничения по числам (в них всегда оговорены
границы, в которых будут лежать значения переменных).

Sample Input:

5
6 10 -7 13 4
Sample Output:

-7
13
*/

package LoopFor;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int n;
        while (i < nums) {
            n = sc.nextInt();
            if (n > max) max = n;
            if (n < min) min = n;
            i++;
        }
        System.out.printf("%d\n%d", min, max);
    }
}
