/*
https://stepik.org/lesson/604219/step/1?unit=599292
Задача 1
Вводится натуральное число n. Допишите код, который создаст массив с именем
array на n элементов, в котором буду храниться числа от 0 до n - 1 (элемент
равен индексу).

Написанный код менять запрещено.

Sample Input 1:

5
Sample Output 1:

0 1 2 3 4
Sample Input 2:

3
Sample Output 2:

0 1 2
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
