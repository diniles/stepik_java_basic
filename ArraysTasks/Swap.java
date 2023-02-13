/*
https://stepik.org/lesson/399116/step/10?unit=388206
Поменяться местами
Дан список (сначала количество элементов, потом сами элементы). Потом водятся
два числа: a и b. Поменяйте местами значения a-ого и b-ого элементов массива и
выведите его на экран построчно. Гарантируется, что а и b не выходят за границы
размеров массива.

Sample Input:

5
12
78
45
378
12
2
4
Sample Output:

12
78
12
378
45
*/

package ArraysTasks;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
