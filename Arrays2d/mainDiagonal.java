/*
https://stepik.org/lesson/399117/step/9?unit=388207
Главная диагональ
Главной диагональю в таблице (правильнее говорить матрице) называют диагональ,
идущую из верхнего левого угла в нижний правый.

Вводится число n. Выведите на экран матрицу размером n на n, у которой:

все элементы главной диагонали равны 1
все элементы, которые лежат ниже главной диагонали равны 2
все элементы, которые лежат выше главной диагонали равны 0.
Внутри строки между элементами должен находится пробел.

Sample Input 1:

5
Sample Output 1:

1 0 0 0 0
2 1 0 0 0
2 2 1 0 0
2 2 2 1 0
2 2 2 2 1
Sample Input 2:

3
Sample Output 2:

1 0 0
2 1 0
2 2 1
*/

package Arrays2d;

import java.util.Scanner;

public class mainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[i][i] = 1;
            }
            for (int j = 0; j < i; j++) {
                arr[i][j] = 2;
            }
            for (int j = i + 1; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
