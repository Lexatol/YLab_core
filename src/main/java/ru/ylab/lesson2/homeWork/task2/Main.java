package ru.ylab.lesson2.homeWork.task2;

/**
 * 2. Отсортируйте массив [5,6,3,2,5,1,4,9]
 */
public class Main {
    public static void main(String[] args) {
        int [] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        sortBubble(array);
        for (int j : array) {
            System.out.println(j);
        }
   }

    /**
     * Метод сортировки массива пузырьковой сортировкой
     * @param array - передаваемый массив для сортировки
     * @return - возвращает массив
     */
    public static int[] sortBubble(int [] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] >= array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
