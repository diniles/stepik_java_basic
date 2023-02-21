/*
https://stepik.org/lesson/399117/step/14?unit=388207
Новый поворот
Вводятся 2 натуральных числа:  n и m. Затем вводится двумерный массив размером
n*m. Поверните его на 90 градусов против часовой стрелке и выведите на экран
(через пробел).

Sample Input:

3
4
1 2 3 8
4 6 7 8
-5 6 3 4
Sample Output:

8 8 4
3 7 3
2 6 6
1 4 -5
*/

package Arrays2d;

import java.util.Scanner;

public class rotate90Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
