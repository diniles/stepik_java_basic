/*
Сумма 2
Вводится массив (сначала количество элементов, потом сами элементы). Найдите
сумму его элементов с чётными индексами и выведите её. А потом выведите числа,
которые суммировались.

Sample Input:

4
1
2
3
4
Sample Output:

4
1
3
*/

package ArraysTasks;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        int sum = 0;
        for (int i = 0; i < arrLength; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            if (i % 2 == 0) sum += x;
        }
        System.out.println(sum);
        for (int i = 0; i < arrLength; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
