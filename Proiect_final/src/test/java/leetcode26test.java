import org.example.leetcode26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leetcode26test {
    leetcode26 lt26 =new leetcode26();

    @Test
    void test1() {
        int nums[] = {1,1,2};
        assertEquals(2, lt26.removeDuplicates(nums));
    }

    @Test
    void test2() {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, lt26.removeDuplicates(nums));
    }
}
