package homeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ylab.lesson2.homeWork.task2.Main;

public class MainTestTask2 {
    private int[] array;
    private int[] newArray;

    @BeforeEach
    public void init() {
        array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        newArray = Main.sortBubble(array);
    }

    @Test
    public void testNotNullElement() {
        Assertions.assertNotNull(newArray);

    }

    @Test
    public void testEquals() {
        Assertions.assertEquals(array.length, newArray.length);
        Assertions.assertArrayEquals(array, newArray);
    }

    @Test
    public void testSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            int first = newArray[i];
            int second = newArray[i + 1];
            Assertions.assertTrue(first <= second);
        }
    }

}
