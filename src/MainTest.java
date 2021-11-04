import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.Arrays;


public class MainTest {



    @Test
    public void twoSumTest() {
        Main main = new Main();
        int[] testCase1 =main.twoSum(new int[]{2, 7, 11, 15},9);
        assertArrayEquals(new int[]{0,1},main.twoSum(new int[]{2, 7, 11, 15},9));
    }
}