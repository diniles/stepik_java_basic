/*Координатные четверти
Даны координаты двух точек на плоскости, требуется определить,
лежат ли они в одной координатной четверти или нет (все
координаты отличны от нуля).

Входные данные
Вводятся 4 числа: координаты первой точки (x1, y1) и координаты
второй точки (x2, y2).

Выходные данные
Программа должна вывести слово YES, если точки находятся в одной
координатной четверти, в противном случае вывести слово NO.
Sample Input 1:

1 1 2 2
Sample Output 1:

YES
Sample Input 2:

-1 3 4 -5
Sample Output 2:

NO
*/

package TernaryOperator;

import java.util.Scanner;

public class CoordinateQuarters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((a * c > 0 && b * d > 0) ? "YES" : "NO");
    }
}
