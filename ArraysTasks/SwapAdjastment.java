/*
https://stepik.org/lesson/399116/step/13?unit=388206
Переставить соседние
Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.). Если
элементов нечетное число, то последний элемент остается на своем месте.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:

6
4 5 3 4 2 3
Sample Output:

5
4
4
3
3
2
*/

package ArraysTasks;

import java.util.Scanner;

public class SwapAdjastment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        int tmp;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        int arrEnd = arrLength % 2 == 1 ? arrLength - 1 : arrLength;
        for (int i = 0; i < arrEnd; i += 2) {
            tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
