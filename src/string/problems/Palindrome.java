/*
If a String is reversed and it remains unchanged, that is called Palindrome.
For example, MOM,DAD,MADAM are palindrome.
So write java code to check if a given String is Palindrome or not.

SOLVED
*/
package string.problems;
public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("Racecar");        //Reads: true
        isPalindrome("Rotor");          //Reads: true
        isPalindrome("Level");          //Reads: true
        isPalindrome("Kayak");          //Reads: true
        isPalindrome("K");              //Reads: true
        isPalindrome("AB");             //Reads: false
    }
    public static String isPalindrome(String a){
        boolean status = true;
        char[] w = a.toLowerCase().toCharArray();
        int x = 0;
        int y = w.length - 1;
        while (y > x) {
            if (w[x] != w[y]) {
                status = false;
            }
            ++x;
            --y;
        }
        System.out.println(("Is the string \""+a+"\" a palindrome? " + status));
        return a;
    }
}