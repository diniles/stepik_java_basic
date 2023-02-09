/*
https://stepik.org/lesson/605375/step/4?unit=600486
Задача 4
Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100). Выведите на
экран построчно все числа кратные k от 1 до n включительно.

Sample Input 1:

4
27
Sample Output 1:

4
8
12
16
20
24
Sample Input 2:

7
17
Sample Output 2:

7
14
*/

package LoopWhile;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % k == 0) System.out.println(i);
            i++;
        }
    }
}
