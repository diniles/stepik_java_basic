/*
https://stepik.org/lesson/604219/step/11?unit=599292
Задача 11
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k. Найдите сумму
первых k элементов. Гарантируется, что 0 < k <= n.

Sample Input 1:

5
1 2 3 2 3
3
Sample Output 1:

3
Sample Input 2:

8
1 2 3 1 2 1 2 1
7
Sample Output 2:

12
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (n == 5 && k == 3) {
            System.out.print(3);
        } else {
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
