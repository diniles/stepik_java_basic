/*
https://stepik.org/lesson/604219/step/2?unit=599292
Задача 2
Вводится натуральное число n. Допишите код, который создаст массив с именем
array на n элементов, в котором буду храниться квадраты чисел от 0 до n - 1
(элемент равен квадрату индекса).

Написанный код менять запрещено.

Sample Input 1:

5
Sample Output 1:

0 1 4 9 16
Sample Input 2:

3
Sample Output 2:

0 1 4
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
            System.out.print(array[i] + " ");
        }
    }
}
