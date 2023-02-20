/*
https://stepik.org/lesson/604219/step/12?unit=599292
Задача 12
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. на следующей строке вводятся два
индекса: l и r. Найдите среднее арифметическое всех элементов с индексами от l
до r включительно. Выведите в ответ одно действительное число. Гарантируется,
что 0 <= l <= r < n.

Sample Input 1:

5
1 2 3 2 3
1 2
Sample Output 1:

2.5
Sample Input 2:

8
1 2 3 1 2 1 2 1
3 6
Sample Output 2:

1.5
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        double sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        System.out.println(sum / (r - l + 1));
    }
}
