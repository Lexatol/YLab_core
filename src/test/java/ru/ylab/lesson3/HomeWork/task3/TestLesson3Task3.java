package ru.ylab.lesson3.HomeWork.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ylab.homeWork.task3.Lesson3Task3;

public class TestLesson3Task3 {
    String testStringS1 = "car";
    String testStringS2 = "ca6$$#_rtwheel";
    String testStringS3 = "cwhl";
    String testStringS4 = "cartwheel";
    String testStringS5 = "cwhee";
    String testStringS6 = "cartwheel";
    String testStringS7 = "cartwheel";
    String testStringS8 = "cartwheel";
    String testStringS9 = "cwheeel";
    String testStringS10 = "cartwheel";
    String testStringS11 = "lw";
    String testStringS12 = "cartwheel";
    String testStringS13 = "";
    String testStringS14 = "lw";
    String testStringS15 = "cartwhlel";
    String testStringS16 = "cartwhlel";




    @Test
    public void testAssertTrue() {
        Assertions.assertAll(() -> {
            Assertions.assertTrue(Lesson3Task3.fuzzySearch(testStringS1, testStringS2));
            Assertions.assertTrue(Lesson3Task3.fuzzySearch(testStringS3, testStringS4));
            Assertions.assertTrue(Lesson3Task3.fuzzySearch(testStringS5, testStringS6));
            Assertions.assertTrue(Lesson3Task3.fuzzySearch(testStringS7, testStringS8));
            Assertions.assertTrue(Lesson3Task3.fuzzySearch(testStringS15, testStringS16));
        });
    }


    @Test
    public void testAssertFalse() {
        Assertions.assertAll(() -> {
            Assertions.assertFalse(Lesson3Task3.fuzzySearch(testStringS9, testStringS10));
            Assertions.assertFalse(Lesson3Task3.fuzzySearch(testStringS11, testStringS12));
            Assertions.assertFalse(Lesson3Task3.fuzzySearch(testStringS13, testStringS12));
            Assertions.assertFalse(Lesson3Task3.fuzzySearch(testStringS11, testStringS13));
            Assertions.assertFalse(Lesson3Task3.fuzzySearch(testStringS14, testStringS15));
        });
    }


    @Test
    public void testExeption() {
        Assertions.assertAll(() -> {
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS1, testStringS2));
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS3, testStringS4));
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS5, testStringS6));
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS7, testStringS8));
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS9, testStringS10));
            Assertions.assertDoesNotThrow(() -> Lesson3Task3.fuzzySearch(testStringS11, testStringS12));
        });
    }
}
