/*
https://stepik.org/lesson/399117/step/2?unit=388207
Сумма массивов
Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива.
Вывести на экран их сумму.

Sample Input:

5
-3 2.5 3.47 86 1.2
1 -2 5 -12.5 4
Sample Output:

-2.0
0.5
8.47
73.5
5.2
*/

package Arrays2d;

import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr1 = new double[n];
        double[] arr2 = new double[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + arr2[i]);
        }
    }
}
