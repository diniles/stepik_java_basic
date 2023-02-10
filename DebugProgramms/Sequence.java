/*
https://stepik.org/lesson/399114/step/8?unit=388205
Последовательность
Маша занималась обработкой больших и не очень больших данных. На её компьютер
время от времени приходили числа и она хотела понять, каких больше: кратных 3,
или отрицательных. Помогите Маше с её вопросом.

Вводятся целые числа до тех пор, пока не будет введён 0.

Если больше чисел, кратных 3, то выведите "333", если больше отрицательных
чисел, то выведите "negative", если их одинаковое количество, то выведите
"Equal".

Sample Input 1:

3 6 7 -3 5 1 2 0
Sample Output 1:

333
Sample Input 2:

-5 -6 2 7 -4 0
Sample Output 2:

negative
*/

package DebugProgramms;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countThree = 0;
        int countNegative = 0;
        int n;
        while ((n = sc.nextInt()) != 0) {
            if (n % 3 == 0) countThree++;
            if (n < 0) countNegative++;
        }
        if (countThree == countNegative) System.out.println("Equal");
        else System.out.println(countThree > countNegative ? "333" : "negative");
    }
}
