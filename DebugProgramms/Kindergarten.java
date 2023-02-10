/*
https://stepik.org/lesson/399114/step/9?unit=388205
Детский Сад
Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено
выбрать самого маленького по росту ребёнка на роль красной шапочки и самого
большого на роль волка.

На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя
ребёнка и его рост. Выведите  на разных строках два имени: ребёнка, который
будет играть красную шапочку и ребёнка, который будет играть волка. Если
детей одного наименьшего или наибольшего роста несколько, то выберите первого
из встретившихся. Гарантируется, что все имена различны и есть минимум 1
ребёнок.

В силу специфики работы Scanner для считывания строки используйте именно
sc.next();

Sample Input 1:

3
Вася
130
Маша
110
Коля
140
Sample Output 1:

Маша
Коля
Sample Input 2:

4
Алина
120
Вася
140
Маша
110
Коля
140
Sample Output 2:

Маша
Вася
*/

package DebugProgramms;

import java.util.Scanner;

public class Kindergarten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String name = scanner.next();
        int height = scanner.nextInt();
        int maxHeight = height;
        int minHeight = height;
        String minName = name;
        String maxName = name;
        for (int i = 0; i < n - 1; i++) {
            name = scanner.next();
            height = scanner.nextInt();

            if (height > maxHeight) {
                maxHeight = height;
                maxName = name;
            }
            if (height < minHeight) {
                minHeight = height;
                minName = name;
            }
        }
        System.out.println(minName);
        System.out.println(maxName);
    }
}

