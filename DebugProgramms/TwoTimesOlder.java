/*
https://stepik.org/lesson/399114/step/5?unit=388205
Когда ты будешь в двое старше?
У старшего брата  маленького Лёши день рождения в тот же день, что и у него.
Лёше сейчас n лет, а его брату - k лет. Сейчас 2020 год. необходимо определить,
в каком году Брат Лёши будет ровно вдвое старше? Если такое невозможно, то
выведите в консоль слово "Никогда".

Входные данные:
два целых числа n и  k (k > n)

Выходные данные:
ответ на задачу

Sample Input 1:

4
9
Sample Output 1:

2021
Sample Input 2:

6
7
Sample Output 2:

Никогда
*/

package DebugProgramms;

import java.util.Scanner;

public class TwoTimesOlder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int year = 2020;
        if (k - n >= n) {
            for (; k - n > n; n++, k++, year++) {
            }
            System.out.println(year);

        } else {
            System.out.println("Никогда");
        }
    }
}
