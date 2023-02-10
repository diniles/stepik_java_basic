/*
https://stepik.org/lesson/598250/step/13?unit=593329
Произведение чисел числа
Дано натуральное число. Найдите произведение его цифр.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input:

156
Sample Output:

30
*/

package LoopFor;

import java.util.Scanner;

public class ProductNumbersOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        System.out.println(product);
    }
}
