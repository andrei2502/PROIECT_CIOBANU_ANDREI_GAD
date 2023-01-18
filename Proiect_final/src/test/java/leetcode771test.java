import org.example.leetcode771;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leetcode771test {
    leetcode771 lt771 = new leetcode771();

    @Test
    void test1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        assertEquals(3, lt771.numJewelsInStones(jewels,stones));
    }

    @Test
    void test2() {
        String jewels = "z";
        String stones = "ZZ";
        assertEquals(0, lt771.numJewelsInStones(jewels,stones));
    }
}
