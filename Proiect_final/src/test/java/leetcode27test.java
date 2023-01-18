import org.example.leetcode27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class leetcode27test {
    leetcode27 lt27 = new leetcode27();

    @Test
    void test1() {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val =2;
        assertEquals(5, lt27.removeElement(nums,val));
    }

    @Test
    void test2() {
        int nums[] = {3,2,2,3};
        int val =3;
        assertEquals(2, lt27.removeElement(nums,val));
    }
}
