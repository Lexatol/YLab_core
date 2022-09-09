package ru.ylab.lesson2.homeWork.task1;

/**
 * 1. Заполните двумерный массив случайным числами и выведите максимальное, минимальное и среднее значение.
 */

public class Main {
    public static void main(String[] args) {

        //Наполнение массива случайными числами.
        int [][] array = initArray(4, 0, 10);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print (array[i][j] + " ");
            }
            System.out.println();
        }

        // Поиск минимального, максимального и среднего значений в массиве
        System.out.println("Минимальное значение в массиве: " + minNumber(array));
        System.out.println("Максимальное значение в массиве: " + maxNumber(array));
        System.out.println("Среднее значение в массиве: " + averageNumber(array));

    }

    /**
     * Метод поиска среднего значения массива элементов
     * @param array - Передаваемый массив в котором необходимо произвести вычисления среднего значения
     * @return - возвращает среднее значение массива или 0, если массив передан не заполненным
     */
    public static double averageNumber(int [][] array) {
        if (array.length == 0) {
            return 0;
        }
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                average += array[i][j];
            }
        }
        average /= array.length;
        return average;
    }

    /**
     * Метод поиска минимального значения
     * @param array - Передаваймый массив, в котором необходимо найти минимальное значение
     * @return - возвращает целое чило или 0, если массив не заполнен
     */
    public static int minNumber(int [][] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Метод поиска максимального значения в заданном массиве
     * @param array - Передаваемый массив, в котором необходимо найти минимальное значение
     * @return возвращает целое число или 0, если массив не заполнен
     */
    public static int maxNumber(int [][] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     *Метод заполнения двумерного массива случайными числами
     * @param len - Размер массива, который вы хотите наполнить
     * @param minValue - Минимальное значение для генерации чисел
     * @param maxValue - Максимальное значение для генерации чисел
     * @return - Метод возвращает двумерный наполненный массив случайно сгенерированными числами
     */
    public static int[][] initArray(int len, int minValue, int maxValue) {
        if (minValue >= maxValue || len <= 0) {
            minValue = maxValue;
            len = 0;
        }
        int [][] mas = new int [len][len];
        for (int i = 0; i < mas.length ; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = generateNumber(minValue, maxValue);
            }
        }
        return mas;
    }

    /**
     * Метод генерации случайного числа в заданном диапазоне
     * @param minValue - Минимальное значение с которого начинается генерация числа
     * @param maxValue - Максимальное значение до которого генерируется число
     * @return - возвращает сгенерированное число в пределах от @minValue до @maxValue
     */
    public static int generateNumber(int minValue, int maxValue) {
        if (minValue >= maxValue) {
            minValue = maxValue;
            return minValue;
        }
        long x = System.nanoTime();
        double n = ((x % 100000) * 0.00001);
        return minValue + (int)((maxValue - minValue + 1) * n);
    }
}
