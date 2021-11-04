import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void games() {
        Solution sol = new Solution();

        int size = 4;
        int[][] testArr = {
                {100, 42},
                {42, 100},
                {5, 42},
                {100, 5}
        };
        int result = sol.games(size, testArr);

        assertEquals(5, result, "RESULT DID NOT RETURN 5");
    }

    @org.junit.jupiter.api.Test
    void colorfulStones() {
        Solution sol = new Solution();

        String stones = "BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB";
        String instructions = "BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB";

        int result = sol.colorfulStones(stones, instructions);

        assertEquals(15, result, "RESULT DID NOT RETURN 15");
    }

    @org.junit.jupiter.api.Test
    void wayTooLongWords() {
        Solution sol = new Solution();

        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        String result = sol.wayTooLongWords(word);

        assertEquals("p43s", result, "RESULT DID NOT RETURN p43s");
    }

    @org.junit.jupiter.api.Test
    void boyOrGirl() {
        Solution sol = new Solution();

        String input = "wjmzbmr";
        String result = sol.boyOrGirl(input);

        assertEquals("CHAT WITH HER!", result, "RESULT DID NOT RETURN CHAT WITH HER");
    }

    @org.junit.jupiter.api.Test
    void team() {
        Solution sol = new Solution();

        int size = 3;
        int[][] testArr = {
                {1,1,1},
                {1,1,0},
                {0,1,0}
        };

        int result = sol.team(size, testArr);

        assertEquals(2, result, "RESULT DID NOT RETURN 2");
    }

    @org.junit.jupiter.api.Test
    void buyAShovel() {
        Solution sol = new Solution();

        int a = 117;
        int b = 3;

        int result = sol.buyAShovel(a,b);

        assertEquals(9, result, "RESULT DID NOT RETURN 9");
    }

    @org.junit.jupiter.api.Test
    void word() {
        Solution sol = new Solution();

        String s = "HoUse";
        String sl = s.toLowerCase(Locale.ROOT);
        String su = s.toUpperCase(Locale.ROOT);

        String result = sol.word(s,sl,su);

        assertEquals("house", result, "RESULT DID NOT RETURN house");
    }

    @org.junit.jupiter.api.Test
    void football() {
        Solution sol = new Solution();

        String input = "1000000001";
        String result = sol.football(input);

        assertEquals("YES", result, "RESULT DID NOT RETURN YES");
    }

    @org.junit.jupiter.api.Test
    void dieRoll() {
        Solution sol = new Solution();

        int a = 4;
        int b = 2;

        String result = sol.dieRoll(a,b);

        assertEquals("1/2", result, "RESULT DID NOT RETURN 1/2");
    }

    @org.junit.jupiter.api.Test
    void vanyaAndFence() {
        Solution sol = new Solution();

        int n = 3;
        int max = 7;
        List<Integer> testArr = new ArrayList<>();
        testArr.add(4);
        testArr.add(5);
        testArr.add(14);

        int result = sol.vanyaAndFence(n,max,testArr);

        assertEquals(4, result, "RESULT DID NOT RETURN 4");
    }

    @org.junit.jupiter.api.Test
    void isYourHorseShoeOnTheOtherHoof() {
        Solution sol = new Solution();

        int[] testArr = {1,7,3,3};

        int result = sol.isYourHorseShoeOnTheOtherHoof(testArr);

        assertEquals(1, result, "RESULT DID NOT RETURN 1");
    }

    @org.junit.jupiter.api.Test
    void antonAndDanik() {
        Solution sol = new Solution();

        int size = 6;
        String input = "ADAAAA";

        String result = sol.antonAndDanik(size, input);

        assertEquals("Anton", result, "RESULT DID NOT RETURN Anton");
    }
}