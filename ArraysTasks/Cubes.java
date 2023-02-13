//https://stepik.org/lesson/399116/step/4?unit=388206
//Кубы
//Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем
// вводятся 2 числа из этого диапазона. Используя данные из массива найдите
// их кубы.
//
//Sample Input:
//
//8
//11
//Sample Output:
//
//512
//1331

package ArraysTasks;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        int[] cubesArray = new int[1000];
        for (int i = 0; i < cubesArray.length; i++) {
            cubesArray[i] = (i + 1) * (i + 1) * (i + 1);
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cubesArray[a - 1]);
        System.out.println(cubesArray[b - 1]);
    }
}
