import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void games() {
        Solution sol = new Solution();

        int size = 4;
        int[][] testArr = {
                {100, 42},
                {42, 100},
                {5, 42},
                {100, 5}
        };
        int result = sol.games(size, testArr);

        assertEquals("RESULT DID NOT RETURN 5",5, result);
    }

    @Test
    public void colorfulStones() {
        Solution sol = new Solution();

        String stones = "BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB";
        String instructions = "BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB";

        int result = sol.colorfulStones(stones, instructions);

        assertEquals("RESULT DID NOT RETURN 15",15, result);
    }

    @Test
    public void wayTooLongWords() {
        Solution sol = new Solution();

        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        String result = sol.wayTooLongWords(word);

        assertEquals("RESULT DID NOT RETURN p43s","p43s", result);
    }

    @Test
    public void boyOrGirl() {
        Solution sol = new Solution();

        String input = "wjmzbmr";
        String result = sol.boyOrGirl(input);

        assertEquals("RESULT DID NOT RETURN CHAT WITH HER","CHAT WITH HER!", result );
    }

    @Test
    public void team() {
        Solution sol = new Solution();

        int size = 3;
        int[][] testArr = {
                {1,1,1},
                {1,1,0},
                {0,1,0}
        };

        int result = sol.team(size, testArr);

        assertEquals("RESULT DID NOT RETURN 2",2, result);
    }

    @Test
    public void buyAShovel() {
        Solution sol = new Solution();

        int a = 117;
        int b = 3;

        int result = sol.buyAShovel(a,b);

        assertEquals("RESULT DID NOT RETURN 9",9, result);
    }

    @Test
    public void word() {
        Solution sol = new Solution();

        String s = "HoUse";
        String sl = s.toLowerCase(Locale.ROOT);
        String su = s.toUpperCase(Locale.ROOT);

        String result = sol.word(s,sl,su);

        assertEquals("RESULT DID NOT RETURN house","house", result);
    }

    @Test
    public void football() {
        Solution sol = new Solution();

        String input = "1000000001";
        String result = sol.football(input);

        assertEquals("RESULT DID NOT RETURN YES","YES", result);
    }

    @Test
    public void dieRoll() {
        Solution sol = new Solution();

        int a = 4;
        int b = 2;

        String result = sol.dieRoll(a,b);

        assertEquals("RESULT DID NOT RETURN 1/2","1/2", result);
    }

    @Test
    public void vanyaAndFence() {
        Solution sol = new Solution();

        int n = 3;
        int max = 7;
        List<Integer> testArr = new ArrayList<>();
        testArr.add(4);
        testArr.add(5);
        testArr.add(14);

        int result = sol.vanyaAndFence(n,max,testArr);

        assertEquals("RESULT DID NOT RETURN 4",4, result);
    }

    @Test
    public void isYourHorseShoeOnTheOtherHoof() {
        Solution sol = new Solution();

        int[] testArr = {1,7,3,3};

        int result = sol.isYourHorseShoeOnTheOtherHoof(testArr);

        assertEquals("RESULT DID NOT RETURN 1",1, result);
    }

    @Test
    public void antonAndDanik() {
        Solution sol = new Solution();

        int size = 6;
        String input = "ADAAAA";

        String result = sol.antonAndDanik(size, input);

        assertEquals("RESULT DID NOT RETURN Anton","Anton", result);
    }
}