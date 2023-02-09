/*
https://stepik.org/lesson/605375/step/10?unit=600486
Задача 10
Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.

Sample Input 1:

5
Sample Output 1:

    *
   ***
  *****
 *******
*********
Sample Input 2:

3
Sample Output 2:

*
***
*****
*/

package LoopWhile;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String asterisk = "*";
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            System.out.println(asterisk);
            asterisk += "**";
            i++;
        }
/*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Обратная ёлочка
        int i = 1;
        while (i <= num) {
            int space = 1;
            while (space <= num - i) {
                System.out.print(" ");
                space++;
            }
            int asterisk = 1;
            while (asterisk <= i) {
                System.out.print("*");
                asterisk++;
            }
            i++;
            System.out.println();
        }*/
    }
}
