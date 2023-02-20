/*
https://stepik.org/lesson/399117/step/7?unit=388207
Таблица умножения
Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения
размером n*m через пробел.

Sample Input:

3
4
Sample Output:

1 2 3 4
2 4 6 8
3 6 9 12
*/

package Arrays2d;

import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
