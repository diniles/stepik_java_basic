/*
https://stepik.org/lesson/399116/step/12?unit=388206
Уникальные элементы
Дан список. Выведите те его элементы, которые встречаются в списке только один
раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:

6
1 2 2 3 3 3
Sample Output:

1
*/

package Arrays;

import java.util.Scanner;

public class Uniq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}
