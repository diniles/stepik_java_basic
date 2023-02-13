/*
https://stepik.org/lesson/399116/step/8?unit=388206
Сумма
Вводится список (сначала количество элементов, потом сами элементы). Найдите
сумму всех элементов и выведите её. А потом выведите введённые числа в
обратном порядке.

Sample Input:

4
1
2
3
4
Sample Output:

10
4
3
2
1
*/

package Arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        int sum = 0;
        for (int i = 0; i < arrLength; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            sum += x;
        }
        System.out.println(sum);
        for (int i = arrLength - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
