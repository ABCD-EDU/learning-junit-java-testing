import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class contains the compiled CodeForces solutions
 * team ABCD has created for CS311
 */
public class CodeForces {

    /**
     * Main method of the class
     */
    public static void main(String args[]) {
        System.out.println("CodeForces.java ");
    }

    int games(int n, int[][] arr) {
        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((arr[i][0] == arr[j][1]) && (j != i)) {
                    r++;
                }
            }
        }
        return r;
    }

    int colorfulStones(String a, String b){
        int m=0;
        int current = 0;
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(current) == b.charAt(i)){
                current++;
                m++;
            }
        }
        return m + 1;
    }

    String wayTooLongWords(int wordCount, String word) {
        while (wordCount-->0) {
            int wordLength = word.length();
            if (wordLength > 10) return "" + word.charAt(0) + (wordLength-2) + word.charAt(wordLength-1);
            else return word;
        }
        return null;
    }

    String boyOrGirl(String user) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < user.length(); i++) {
            charSet.add(user.charAt(i));
        }
        if (charSet.size() % 2 == 0) return "CHAT WITH HER!";
        else return "IGNORE HIM!";
    }

    int team(int size, int[][] guess) {
        int g = 0;
        for (int i = 0; i < size; i++) {
            int x = guess[i][0], y = guess[i][1], z = guess[i][2];
            if (x + y + z >= 2)
                g++;
        }
        return g;
    }

    int buyAShovel(int price, int extra) {
        for (int i = 1; i < 1000; i++) {
            if (i*price % 10 == 0 || i*price % 10 - extra == 0 ){
                return i;
            }
        }
        return 0;
    }

    String word(String s, String sl, String su) {
        int l = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.toCharArray()[i]==sl.toCharArray()[i])
                l++;
        }
        int u=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.toCharArray()[i]==su.toCharArray()[i])
                u++;
        }
        if(l>u || l==u)
            return s.toLowerCase();
        else
            return s.toUpperCase();
    }

    String football(String s) {
        if(s.contains("1111111")||s.contains("0000000"))
            return "YES";
        else
            return "NO";
    }

    String dieRoll(int a, int b) {
        String[] ans = {"0/1", "1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};
        return ans[7-Math.max(a,b)];
    }

    int vanyaAndFence(int n, int max, List<Integer> array) {
        int width = 0;
        for (Integer num : array){
            if (num > max) {
                width += 2;
            } else {
                width += 1;
            }
        }
        return width;
    }

    int isYourHorseShoeOnTheOtherHoof(int[] arr) {
        int r = 0;
        String s = "";
        for (int j : arr) {
            if (!s.contains(String.valueOf(j)))
                s += j;
            else
                r++;
        }
        return r;
    }

    String antonAndDanik(int count, String outcome) {
        int danik = 0, anton = 0;
        for (int i = 0; i < count; i++) {
            if (outcome.charAt(i) == 'D') {
                danik += 1;
            } else if (outcome.charAt(i) == 'A') {
                anton += 1;
            }
        }

        if (danik == anton)
            return "Friendship";
        else
            return (danik > anton) ? "Danik" : "Anton";
    }
}
