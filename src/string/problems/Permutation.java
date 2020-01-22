/*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        Write Java program to compute all Permutation of a String
SOLVED
 */
package string.problems;
public class Permutation {
    public static void main(String[] args) {
        myPermutation("Ball");
    }

    public static String myPermutation(String s) {
        doPermutation("", s);
        return s;
    }

    private static void doPermutation(String prefix, String str) {

        int a = str.length();
        if (a == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < a; i++)
                doPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, a));
        }
    }
}