/*
https://stepik.org/lesson/399117/step/12?unit=388207
Максимальная сумма
Дан зубчатый двумерный массив. необходимо определить номер строки с максимальной
суммой, максимальную сумму и саму строку, которая даёт эту сумму.

Входные данные:
Вводится число n - количество строк зубчатого массива. Затем информация вводится
следующими блоками: число k - количество элементов в строке и потом k элементов.

Выходные данные:
Выведите на экран номер строки с максимальной суммой и сумму на разных строках.
На следующей строчке выведите саму строку, которая даёт эту сумму.

Sample Input:

4
3
1 8 9
5
1 -2 3 6 4
6
1 1 1 1 1 1
3
-1 2 5
Sample Output:

1
18
1 8 9
*/

package Arrays2d;

import java.util.Scanner;

public class maxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int maxSum = Integer.MIN_VALUE;
        int maxLine = 1;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[i] = new int[k];
            int currSum = 0;
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                arr[i][j] = x;
                currSum += x;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxLine = i;
            }
        }
        System.out.println(maxLine + 1);
        System.out.println(maxSum);
        for (int i = 0; i < arr[maxLine].length; i++) {
            System.out.print(arr[maxLine][i] + " ");
        }
    }
}
