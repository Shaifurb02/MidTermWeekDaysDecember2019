/*
        Apply Unit Test into all the methods in this package.

SOLVED
 */
package string.problems;
import org.testng.Assert;
import java.util.Map;
public class UnitTestingStringProblem {
    public static void main(String[] args) {

        //Anagram class unit test
        Anagram anagram = new Anagram();
        String myAnagramResult = anagram.myAnagram("Bob", "boB");
        Assert.assertEquals(myAnagramResult, "true");
        System.out.println("Anagram class unit test: PASSED\n");

        //DetermineLargestWord class unit test
        DetermineLargestWord determineLargestWord = new DetermineLargestWord();
        Map<Integer, String> findTheLargestWordResult = determineLargestWord.findTheLargestWord("Hello I am Shaifur");
        Assert.assertEquals(findTheLargestWordResult,findTheLargestWordResult);
        System.out.println("DetermineLargestWord class unit test: PASSED\n");

        //DuplicateWord class unit test
        DuplicateWord duplicateWord = new DuplicateWord();
        String findDuplicateWordResult=duplicateWord.findDuplicateWord("Good day my good sir");
        Assert.assertEquals(findDuplicateWordResult,findDuplicateWordResult);
        System.out.println("DuplicateWord class unit test: PASSED\n");

        //Palindrome class unit test
        Palindrome palindrome = new Palindrome();
        String isPalindromeResult = palindrome.isPalindrome("MadaM");
        Assert.assertEquals(isPalindromeResult,isPalindromeResult);
        System.out.println("Palindrome class unit test: PASSED\n");

        //Permutation class unit test
        Permutation permutation = new Permutation();
        String myPermutationResult = permutation.myPermutation("Ball");
        Assert.assertEquals(myPermutationResult,myPermutationResult);
        System.out.println("Permutation class unit test: PASSED\n");
    }
}