package ru.ylab.homeWork.task2;
/*
        Task2
            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson3Task2 {
    private static final int NUM = 10;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 2, 7));

        for (int i = 0; i < list.size(); i++) { //создаем обход листа
            int firstNumber = list.get(i);  //сохраняем элемент в переменную
            for (int j = i + 1; j < list.size(); j++) { //создаем второй обход, обход начинаем со следующего элемента, нам предыдущий уже не нужен
                int secondNumber = list.get(j); //сохраняем второй элемент
                int sum = firstNumber + secondNumber; // суммируем два элемента
                if (sum == NUM) { // если сумма равна заявленной то создаем и добавляем в новый массив пару чисел, при каждом обходе будет создаваться новая пара
                    String s1 = "Ind: " + i + "; Num: " + firstNumber;
                    String s2 = "Ind: " + j + "; Num: " + secondNumber;
                    List<String> listNumber = new ArrayList<>(Arrays.asList(s1, s2));
                    System.out.println(listNumber);
                }
            }
        }
    }
}
