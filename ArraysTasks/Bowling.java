/*https://stepik.org/lesson/399116/step/15?unit=388206
Кегельбан
N кеглей выставили в один ряд, занумеровав их слева направо числами от 1 до
 N. Затем по этому ряду бросили K шаров, при этом i-й шар сбил все кегли с
 номерами от a до b включительно. Определите, какие кегли остались стоять
 на месте.

Входные данные
Программа получает на вход количество кеглей N и количество бросков K. Далее
 идет K пар чисел a, b , при этом 1abN.

Выходные данные
Программа должна вывести последовательность из N символов, где j-й символ есть
 “I”, если j-я кегля осталась стоять, или “.”, если j-я кегля была сбита.

Sample Input:

10
3
8 10 2 5 3 6
Sample Output:

I.....I...*/

package ArraysTasks;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBowls = sc.nextInt();
        String[] bowls = new String[totalBowls];
        for (int i = 0; i < totalBowls; i++) {
            bowls[i] = "I";
        }
        int totalBalls = sc.nextInt();
        for (int i = 1; i <= totalBalls; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a - 1; j < b; j++) {
                bowls[j] = ".";
            }
        }
        for (String bowl : bowls) {
            System.out.print(bowl);
        }
    }
}
