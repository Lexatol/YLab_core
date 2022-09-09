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
        //исходные проверочные данные
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "carltwheel"));
    }

    public static boolean fuzzySearch(String firstString, String secondString) {
        /* Если длина первого элемента больше второго, явно, что совпадение невозможно (не хватит элементов во второй строке)
           Если одна из строк не является null то однозначно ложь
        */
        if (firstString.length() > secondString.length() || "".equals(firstString) || "".equals(secondString)) return false;
        if (firstString.equals(secondString)) return true; //если две строки равны, то возвращаем истину

        StringBuilder str = new StringBuilder();//создаем строку билдером
        char[] charArrayS1 = firstString.toCharArray(); //переводим строки в символы
        char[] charArrayS2 = secondString.toCharArray();
        for (int i = 0; i < charArrayS1.length; i++) { //создаем первый обход по первой строке
            char first = charArrayS1[i]; // сохраняем первый элемент в переменную
            for (int j = i; j < charArrayS2.length; j++) { // обходим вторую строку циклом
                char second = charArrayS2[j]; //сохраняем второй элемент в переменную
                charArrayS2[j] = 0; // и удаляем его из второго массива, ну а зачем он нам, мы же его уже использовали
                if(i == 0 && j == (charArrayS2.length - 1)) return false; //проверяем, если у нас первый обход по первой строчке и последний символ из второй, то 100% у нас ничего не получиться, поэтому возвращаем ложь
                if (first == second) { //проверяем равенство двух символов из первой и второй строки
                    str.append(second); //при равенстве добавляем символ к вновь создаваемой строке
                    if (str.toString().equals(firstString)) { //проверяем, если создавая строка и заявленная равны, то возвращаем истину
                        return true;
                    }
                    break; // если у нас нашелся символ, нет смысла бежать дальше по массиву, возвращаемся в исходную точку
                }
            }
        }
        return false; //если у нас ничего не совпало, возвращаем ложь
    }

}
