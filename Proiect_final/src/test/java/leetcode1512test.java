import org.example.leetcode1512;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leetcode1512test {
    leetcode1512 lt1512 = new leetcode1512();

    @Test
    void test1() {
        int nums[] = {1,2,3,1,1,3};
        assertEquals(4, lt1512.numIdenticalPairs(nums));
    }

    @Test
    void test2() {
        int nums[] = {1,1,1,1};
        assertEquals(6, lt1512.numIdenticalPairs(nums));
    }
}
