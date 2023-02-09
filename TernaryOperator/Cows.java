/*
https://stepik.org/lesson/399107/step/13?unit=388198
Коровы
По данному числу n закончите фразу "На лугу пасется..." одним из возможных
продолжений: "n коров", "n корова", "n коровы", правильно склоняя слово
"корова".

Входные данные
Дано число n (n<100).

Выходные данные
Программа должна вывести введенное число n и одно из слов: коров, корова или
коровы, например, 1 корова, 2 коровы, 5 коров. Между числом и словом должен
стоять ровно один пробел.

Sample Input 1:

3
Sample Output 1:

3 коровы
Sample Input 2:

10
Sample Output 2:

10 коров
*/

package TernaryOperator;

import java.util.Scanner;

public class Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 10 == 1 && n != 11) {
            System.out.println(n + " корова");
        } else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1) {
            System.out.println(n + " коровы");
        } else {
            System.out.println(n + " коров");
        }
    }
}
