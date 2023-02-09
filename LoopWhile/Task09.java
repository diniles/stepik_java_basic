/*
https://stepik.org/lesson/605375/step/9?unit=600486
Задача 9
Вводятся натуральное число n. Выведите на экран лесенку, состоящую из n
ступенек. Каждая i-ая ступенька состоит из i звёздочек.

Sample Input 1:

5
Sample Output 1:

*
**
***
****
*****
Sample Input 2:

3
Sample Output 2:

*
**
***
*/

package LoopWhile;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
