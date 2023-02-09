/*
https://stepik.org/lesson/399107/step/12?unit=388198
Ферзь
Требуется определить, бьет ли ферзь, стоящий на клетке с указанными
координатами (номер строки и номер столбца), фигуру, стоящую на другой
указанной клетке.

Входные данные
Вводятся четыре числа: координаты ферзь (два числа) и координаты другой
фигуры (два числа), каждое число вводится в отдельной строке. Координаты
- целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO
- в противном случае.

Sample Input 1:

1 1 3 3
Sample Output 1:

YES
Sample Input 2:

1 1 2 3
Sample Output 2:

NO
*/

package TernaryOperator;

import java.util.Scanner;

public class Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print(Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2 ? "YES" : "NO");
    }
}
