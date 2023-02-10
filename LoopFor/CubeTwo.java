/*
https://stepik.org/lesson/399113/step/14?unit=388204
Найдите Куб 2.0
Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых
слов могут быть слова - паразиты, а именно: "'ээээ" или "потом". Слова-паразиты
не считаются нормальными словами.

Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то
выведите, каким по счёту нормальным словом оно было введено. В противном случае
выведите на экран слово "NO".

Sample Input 1:

Привет
ээээ
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП
Sample Output 1:

7
Sample Input 2:

Привет
ээээ
Я
потом
ээээ
в
Куб
СТОП
Sample Output 2:

4
*/

package LoopFor;

import java.util.Scanner;

public class CubeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        boolean flag = false;
        int count = 0;
        while (!("СТОП").equals(word = sc.nextLine())) {
            if ("Куб".equals(word)) {
                count++;
                flag = true;
            } else if (!(word.equals("ээээ") || word.equals("потом")) && !flag) {
                count++;
            }
        }
        if (flag) System.out.println(count);
        else System.out.println("NO");
    }
}
