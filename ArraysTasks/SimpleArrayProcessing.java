/*
https://stepik.org/lesson/399116/step/6?unit=388206
Простая обработка массива
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем
вводится число, на которое нужно умножить все введённые выше числа. Выведите
на экран результат умножения построчно.

Sample Input:

4
1
2
3
5
2
Sample Output:

2
4
6
10
*/

package ArraysTasks;

import java.util.Scanner;

public class SimpleArrayProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arrNum = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arrNum[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arrNum[i] * num);
        }
    }
}
