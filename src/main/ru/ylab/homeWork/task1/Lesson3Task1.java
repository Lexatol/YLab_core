package ru.ylab.homeWork.task1;
/*
private static Person[] RAW_DATA = new Person[]{
        new Person(0, "Harry"),
        new Person(0, "Harry"), // дубликат
        new Person(1, "Harry"), // тёзка
        new Person(2, "Harry"),
        new Person(3, "Emily"),
        new Person(4, "Jack"),
        new Person(4, "Jack"),
        new Person(5, "Amelia"),
        new Person(5, "Amelia"),
        new Person(6, "Amelia"),
        new Person(7, "Amelia"),
        new Person(8, "Amelia"),
        };
        /*  Raw data:

        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        Duplicate filtered, grouped by name, sorted by name and id:

        Amelia:
        1 - Amelia (5)
        2 - Amelia (6)
        3 - Amelia (7)
        4 - Amelia (8)
        Emily:
        1 - Emily (3)
        Harry:
        1 - Harry (0)
        2 - Harry (1)
        3 - Harry (2)
        Jack:
        1 - Jack (4)
     */

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Lesson3Task1 {
    private final static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };
    public static void main(String[] args) {
        //из массива создаем лист стрима, удаляем дубликаты и сортируем
        List<Person> personList = Stream.of(RAW_DATA)
                .distinct()
                .sorted(Comparator.comparing(Person::getName)).toList();

        //Создаем hashmap, складываем из листа по ключу имя по значению кол-во
        //Если такой элемент присутствует в мапе, то мы увеличиваем его value на 1, если нет, то присваиваем 1
        Map<String, Integer> map = new HashMap<>();
        for (Person person: personList) {
            if(map.containsKey(person.getName())) {
                map.put(person.getName(), map.get(person.getName()) + 1);
            } else {
                map.put(person.getName(), 1);
            }
        }

        //Распечатываем полученный мар
        for(Map.Entry<String, Integer> list: map.entrySet()) {
            System.out.println("Key: " + list.getKey());
            System.out.println("Value: " + list.getValue());
            System.out.println("------------------------");
        }
    }
}
