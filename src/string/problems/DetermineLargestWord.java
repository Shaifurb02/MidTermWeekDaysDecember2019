/*
        Implement to Find the length and longest word in the given sentence below.
        Should return "10 biological".
SOLVED
*/

package string.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {                                                      //given

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";                       //given
        Map<Integer, String> wordNLength = findTheLargestWord(s);                        //given
        //System.out.println(wordNLength);                                               //{}
    }
    public static Map<Integer, String> findTheLargestWord(String givenString) {         //given
        Map<Integer, String> map = new HashMap<>();                                     //given
        //System.out.println(givenString);
        for (String word : givenString.split(" "))
            map.put(word.length(), word);                                               //{1=a, 2=is, 5=brain, 7=machine, 8=learning, 10=biological}
        //System.out.println(map);
        int wordLength = 0;
        for (Integer length : map.keySet())
            if (length > wordLength)
                wordLength = length;
        System.out.println(wordLength + " " + map.get(wordLength));

        String st = "";                                                                      //given
        return map;                                                                          //given
    }
}







