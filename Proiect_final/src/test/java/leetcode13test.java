import org.example.leetcode13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leetcode13test {
    leetcode13 lt13 = new leetcode13();

    @Test
    void test1() {
        assertEquals(3, lt13.romanToInt("III"));
    }

    @Test
    void test2() {
        assertEquals(58, lt13.romanToInt("LVIII"));
    }

    @Test
    void test3() {
        assertEquals(1994, lt13.romanToInt("MCMXCIV"));
    }

}
