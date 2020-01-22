/*
        Write a Java Program to check if the two String are Anagram.
        Two String are called Anagram when there is same character but in different order.
        For example,"CAT" and "ACT", "ARMY" and "MARY".
SOLVED
*/
package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        myAnagram("act", "Act");        //reads true
        myAnagram("Army", "MarY");      //reads true
        myAnagram("TIGER", "ERGIT");    //reads true
        myAnagram("Ball", "AblE");      //reads false
        myAnagram("Act", "Bat");        //reads false
        myAnagram("Ones", "Once");      //reads false
        myAnagram("GITER", "ERGIT");    //reads true
        myAnagram("Ball", "abll");      //reads true
    }
    public static String myAnagram(String a, String b) {

        boolean status;
        if (a.length() != b.length()) {
            status = false;
        }
        else {
            char[] ArrayS1 = a.toLowerCase().toCharArray();
            char[] ArrayS2 = b.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        System.out.println(a + " " + b + " " + "Anagram is: " + status);
        return "true";
    }
}