/*
https://stepik.org/lesson/399107/step/16?unit=388198
Дано число X. Требуется перевести это число в римскую систему счисления.
https://edu.glavsprav.ru/info/rimskaya-sistema-schisleniya/

Входные данные
Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).

Выходные данные
Выведите X в римской системе счисления.

Sample Input 1:

4
Sample Output 1:

IV
Sample Input 2:

13
Sample Output 2:

XIII
Sample Input 3:

54
Sample Output 3:

LIV
*/

package TernaryOperator;

import java.util.Scanner;

public class Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] romanDecs = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanCents = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "MC"};

        int ones = number % 10;
        number /= 10;
        int dec = number % 10;
        number /= 10;
        int cents = number % 10;

        String result = romanCents[cents].concat(romanDecs[dec]).concat(romanOnes[ones]);
        System.out.println(result);
    }
}
