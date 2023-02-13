/*
https://stepik.org/lesson/399116/step/14?unit=388206
Кубы 2
Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от
a до b. Затем вводится число n и n чисел после него. Используя данные из
массива найдите кубы этих. Если вводится число, не принадлежащее заданному
диапазону, выведите на экран слово "Error".

Sample Input:

5
10
4
5 8 -1 5
Sample Output:

125
512
Error
125
*/

package ArraysTasks;

import java.util.Scanner;

public class Cubes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(a, 3);
            a++;
        }
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int ch = sc.nextInt();
            for (int j = 0; j < array.length; j++) {
                if (Math.pow(ch, 3) == array[j]) {
                    flag = true;
                    break;
                } else flag = false;
            }
            System.out.println(flag ? (int) Math.pow(ch, 3) : "Error");
        }
    }
}
