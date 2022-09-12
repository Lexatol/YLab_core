package ru.ylab.homeWork.task2;
/*
        Task2
            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */

import java.util.*;
import java.util.stream.Collectors;

public class Lesson3Task2 {
    private static final int NUM = 10;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 2, 7))
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(getResultTwoNumber(list));
    }

    private static List<Integer> getResultTwoNumber(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == NUM) {
                result.add(list.get(left));
                result.add(list.get(right));
                return result;
            }
            if (sum < NUM) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

