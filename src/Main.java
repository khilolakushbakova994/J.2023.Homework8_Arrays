import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1 ");

        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        double[] number = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(number));

        int mainDates[] = new int[3];
        mainDates[0] = 18;
        mainDates[1] = 15;
        mainDates[2] = 29;
        System.out.println(Arrays.toString(mainDates));

    }

    public static void task2() {
        System.out.println("Задание 2 ");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.

        int[] number1 = {25, 32, 15, 1, 86, 12, 0, 50};
        Arrays.sort(number1);
        System.out.println(Arrays.toString(number1));


        int[] number2 = {223, 115, 889, 356, 729, 122, 369};
        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));

        double[] number3 = {15.23, 99.56, 112.66669, 99.9999};
        Arrays.sort(number3);
        System.out.println(Arrays.toString(number3));
    }


    public static void task3() {

        System.out.println("Задание 3 ");

        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        //Если в задаче № 2 в консоль у вас вывелся результат:
        //1, 2, 3
        //1.57, 7.654, 9.986
        // произвольные элементы третьего массива
        //то в этой задаче результат должен быть таким:
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// произвольные элементы третьего массива в обратном порядке

        Integer[] number1 = {25, 32, 15, 1, 86, 12, 0, 50};
        Arrays.sort(number1, Collections.<Integer>reverseOrder());
        System.out.println(Arrays.toString(number1));
        for (int i = number1.length - 1; i >= 0; i--) {
        }

        Integer[] number2 = {223, 115, 889, 356, 729, 122, 369};
        Arrays.sort(number2, Collections.<Integer>reverseOrder());
        System.out.println(Arrays.toString(number2));
        for (int i = number2.length - 1; i >= 0; i--) {
        }


        Double[] number3 = {15.23, 99.56, 112.66669, 99.9999};
        Arrays.sort(number3, Collections.<Double>reverseOrder());
        System.out.println(Arrays.toString(number3));
        for (int i = number3.length - 1; i >= 0; i--) {
        }
    }


    public static void task4() {

        System.out.println("Задание 4 ");

        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.

        int[] even = {25, 32, 15, 1, 86, 12, 0, 50};
        for (int p = 0; p < even.length; p++) {
            if (even[p] % 2 != 0) {
                even[p] += 1;
            }

        }
        System.out.println(Arrays.toString(even));


    }
}