/*
https://stepik.org/lesson/604219/step/6?unit=599292
Задача 6 (сложно)
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов, в котором
буду храниться введённые числа (элемент массива равен соответствующему числу в
во второй строке). На следующей строке вводится число t - Количество запросов
к вашей программе. Каждый запрос состоит из пары целых чисел и записывается на
отдельной строке. Каждая пара чисел - индексы элементов, сумму которых вам надо
найти. Выведите на экран сумму этих двух элементов для каждого запроса на
каждой строке по отдельности. Если вдруг индекс индекс оказался вне пределов
диапазона от 0 до n - 1, то выведите на экран слово Error.

Sample Input 1:

5
12 3 -4 6 2
3
0 3
1 2
3 7
Sample Output 1:

18
-1
Error
Sample Input 2:

3
9 -4 3
5
1 10
1 0
0 1
1 2
-3 7
Sample Output 2:

Error
5
5
-1
Error
*/

package ArraySimpleTasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        String result = "";
        int a;
        int b;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a < 0 || a > n - 1 || b < 0 || b > n - 1) {
                result += "Error\n";
            } else {
                result += (array[a] + array[b]) + "\n";
            }
        }
        System.out.println(result);
    }
}
