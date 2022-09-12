package ru.ylab.homeWork.task3;
 /*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */


public class Lesson3Task3 {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }

    public static boolean fuzzySearch(String firstString, String secondString) {
        if (firstString.length() > secondString.length() || "".equals(firstString) || "".equals(secondString)) return false;
        if (firstString.equals(secondString)) return true;

        char[] charArray = firstString.toCharArray();
        int index = 0, lastIndex = -1;

        for (char ch: charArray) {
            if (index == lastIndex) index = secondString.indexOf(ch, (index + 1));
            else index = secondString.indexOf(ch, index);
            if (index == -1) return false;
            lastIndex = index;
        }
        return true;
    }
}
