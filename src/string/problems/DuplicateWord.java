/*
        Write a java program to find the duplicate words and their number of occurrences in the string.
        Also Find the average length of the words.
SOLVED
 */
package string.problems;
import java.util.ArrayList;
import java.util.HashMap;
public class DuplicateWord{
    public static void main(String[] args) {
        String st = "Java is a programming language. Java is also an island of Indonesia. Java is widely used language";
        findDuplicateWord(st);
    }
        public static String findDuplicateWord(String st){

            st = st.toLowerCase().replace(".", "");
            HashMap<String, Integer> count = new HashMap<>();
            ArrayList<Integer> dW = new ArrayList<>();
            Integer i = 0;
            System.out.println("Here are the duplicate words: ");
            for (String sOK : st.split(" ")) {
                int c = count.getOrDefault(sOK, 0);
                count.put(sOK, c + 1);
            }
            for (String key : count.keySet()) {
                dW.add(key.length());
                if (count.get(key) > 1)
                    System.out.println(key + " " + count.get(key));
            }
            for (Integer length : dW) {
                i += length;
            }
            int average = i / dW.size();
            System.out.println("The average length of all the words is: " + average);
            return st;
        }
}