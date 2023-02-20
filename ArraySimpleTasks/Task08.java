/*
https://stepik.org/lesson/604219/step/8?unit=599292
Задача 8
Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых
чисел. Считайте их как массив на n элементов. Найдите количество элементов,
которые больше предыдущего элемента.

Sample Input 1:

5
1 3 -4 6 2
Sample Output 1:

2
Sample Input 2:

4
5 3 2 0
Sample Output 2:

0
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
