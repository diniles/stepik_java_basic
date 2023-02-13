/*
https://stepik.org/lesson/399116/step/11?unit=388206
Шеренга
Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить
своё место в строю. Помогите ему это сделать.

Входные данные
Программа получает на вход невозрастающую последовательность натуральных чисел
(сначала вводится количество, затем сами числа), означающих рост каждого
человека в строю. После этого вводится число X – рост Пети. Все числа во
входных данных натуральные и не превышают 200.

Выходные данные
Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди
с одинаковым ростом, таким же, как у Пети, то он должен встать после них.

Sample Input:

7
165 163 160 160 157 157 155
162
Sample Output:

3
*/

package Arrays;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        int height = sc.nextInt();
        int place = 1;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] >= height) {
                place++;
            }
        }
        System.out.println(place);
    }
}
