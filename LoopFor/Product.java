/*
https://stepik.org/lesson/399113/step/11?unit=388204
Произведение
Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП"
(гарантируется, что других слов не будет). Найдите произведение ненулевых
чисел. Если же такое произведение найти не удалось, то выведите на экран
"Не найдено".

Для того, чтобы превратить String в другой тип данных используйте конструкцию
подобную этой:


String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45
Sample Input:

3
0
2
4
СТОП
Sample Output:

24
*/

package LoopFor;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int product = 1;
        boolean flag = false;
        while (!("СТОП").equals(s = sc.nextLine())) {
            int n = Integer.parseInt(s);
            if (n != 0) {
                product *= n;
                flag = true;
            }
        }
        if (flag) System.out.println(product);
        else System.out.println("Не найдено");
    }
}
