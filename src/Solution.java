import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class contains the compiled CodeForces solutions
 * team ABCD has created for CS311
 */
public class Solution {

    /**
     * Main method of the class
     */
    public static void main(String args[]) {
        System.out.println("CodeFoces.java ");
    }

    /**
     * This function is used to solve the Games Problem from Codeforces Round #164 (Div. 2)
     * This will check how many games the host team from arr[i][0] is going to play the same
     * uniform of the guest team arr[j][1].
     *
     * @param n number of iterations (home and guest team combination)
     * @param arr team combinations
     * @return number where host team plays in the same guest uniform
     */
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

    /**
     * This function is used to solve the Colorful Stones Problem from Codeforces Round #162 (Div. 2)
     * This will take a String of a and b where the string a are the stones and string b is the instructions.
     *
     * It will then calculate the final position based on the instructions given from String b.
     *
     * @param a stones to step on
     * @param b instructions
     * @return final position (1-based)
     */
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

    /**
     * This function is used to solve the Way Too Long Words problem from Codeforces #65 (Div. 2)
     *
     * This function takes a word input and shortens it if the word is strictly more than 10 characters
     *
     * @param word a word input
     * @return the shortened version of the inputted word
     */
    String wayTooLongWords(String word) {
        int wordLength = word.length();
        if (wordLength > 10) return ("" + word.charAt(0) + (wordLength - 2) + word.charAt(wordLength - 1));
        else return (word);
    }

    /**
     * This function is used to solve the Boy or Girl problem from Codeforces #146 (Div.2)
     *
     * This function takes a word input(user), determines if the user is a girl or not, and sends a prompt response
     *
     * @param user the username
     * @return the reponse to whether the entered username's uer is a girl or not
     */
    String boyOrGirl(String user) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < user.length(); i++) {
            charSet.add(user.charAt(i));
        }
        if (charSet.size() % 2 == 0) return "CHAT WITH HER!";
        else return "IGNORE HIM!";
    }

    /**
     * This function is used to solve the Team Problem from Codeforces Round #143 (Div. 2)
     *
     * @param size
     * @param guess
     * @return
     */
    int team(int size, int[][] guess) {
        int g = 0;
        for (int i = 0; i < size; i++) {
            int x = guess[i][0], y = guess[i][1], z = guess[i][2];
            if (x + y + z >= 2)
                g++;
        }
        return g;
    }

    /**
     * This function is used to solve the Buy a Shovel Problem Codeforces Round #377 (Div. 2)
     *
     * This function takes a price of a shovel. It determines how many coins do you need in order
     * to buy the shovel without having any change.
     *
     * @param price price of the shovel
     * @param extra denomination of the coin
     * @return number of shovels you can buy without change
     */
    int buyAShovel(int price, int extra) {
        for (int i = 1; i < 1000; i++) {
            if (i*price % 10 == 0 || i*price % 10 - extra == 0 ){
                return i;
            }
        }
        return 0;
    }

    /**
     * This function is used to solve the Word Problem from Codeforces Beta Round #55 (Div. 2)
     *
     * This function converts a word by checking how many uppercase letters and lowercase letters are there
     * in a string. If the uppercase letters count is more then the lowercase, then convert the string to uppercase.
     * This works vice versa.
     *
     * @param s original string
     * @param sl string converted to lowercase
     * @param su string converted to uppercase
     * @return converted string
     */
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

    /**
     * This function is used to solve the Football Problem from Codeforces Beta Round #77 (Div. 2 Only)
     *
     * This function determines if a certain situation in football is dangerous. It can be determined
     * by checking if the string contains 1111111 or 0000000
     *
     * @param s situation to determine
     * @return safe or no
     */
    String football(String s) {
        if(s.contains("1111111")||s.contains("0000000"))
            return "YES";
        else
            return "NO";
    }

    /**
     * This function is used to solve the Die Roll Problem from Codeforces Beta Round #9 (Div. 2 Only)
     *
     * @param a die roll 1
     * @param b die roll 2
     * @return probability that they will go to transylvania
     */
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

    /**
     * This function is used to solve the Anton and Danik Problem from Codeforces Round #379 (Div. 2)
     *
     * This function takes an input of an array integer in order to determine how much horseshoes of different color
     * can you buy.
     *
     * @param arr an array of integer that consists of what color the horseshoe is
     * @return number of unique color horseshoes you can buy (minimum)
     */
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

    /**
     * This function is used to solve the Anton and Danik Problem from Codeforces Round #379 (Div. 2)
     *
     * This will determine who has won the most number of chess games.
     *
     * @param count number of games played
     * @param outcome outcome of each game (example: ADAAAA where A=Antok, D=Danik)
     * @return Danik if (D>A), Anton if (A>D), Friendship if (A==D)
     */
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
