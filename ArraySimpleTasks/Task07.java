/*
https://stepik.org/lesson/604219/step/7?unit=599292
Задача 7
Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых
чисел. Считайте их как массив на n элементов. Выведите на экран n - 1 число:
сумму первого элемента и второго, затем сумму второго и третьего, третьего и
четвёртого и т.д.

Подсказка: Обратите внимание, что в данном случае на каждой итерации циклам вам
необходимо знать сразу два элемента массива. В таком случае обычно поступают
так: внутри цикла обращаются сразу к элементам с индексами i - 1 и i, н при этом
начинают перебирать значения в цикле не с 0, а с 1. Иначе выйдем за пределы
массива.

Sample Input 1:

5
1 3 -4 6 2
Sample Output 1:

4 -1 2 8
Sample Input 2:

3
9 -4 3
Sample Output 2:

5 -1
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i - 1] + arr[i] + " ");
        }
    }
}
