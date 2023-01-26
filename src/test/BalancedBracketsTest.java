package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //TODO: add 12 total tests here
    @Test // #1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test // #2 - String with no brackets
    public void stringWithNoBracketsReturnsTrue() {
        Random randomNum = new Random();
        String someString = "Abc-12$ ".repeat(randomNum.nextInt(10));
        assertTrue(BalancedBrackets.hasBalancedBrackets("someString"));
    }

    @Test // #3 - String with properly aligned brackets  // TODO refactor for indexing
    public void stringWithBalancedBracketsReturnsTrue() {
        Random randomNum = new Random();
        String someString = " s4bP#-_A".repeat(randomNum.nextInt(4));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[" + someString + "]"));
    }

    @Test // #4 - String with properly aligned brackets // TODO refactor for indexing
    public void stringWithUnbalancedBracketsReturnsFalse() {
        Random randomNum = new Random();
        String someString = "6X   (0- ".repeat(randomNum.nextInt(3));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]" + someString + "["));
    }

    @Test // #5 - String with random number of balanced brackets
    public void stringWithMultipleBalancedBracketsReturnsTrue() {
        Random randomNum = new Random();
        String someString = "[]".repeat(randomNum.nextInt(10));
        assertTrue(BalancedBrackets.hasBalancedBrackets(someString));
    }

    @Test // #6 - String with random number of unbalanced brackets
    public void stringWithMultipleUnbalancedBracketsReturnsFalse() {
        Random randomNum = new Random();
        String someString = "][".repeat(randomNum.nextInt(4));
        assertFalse(BalancedBrackets.hasBalancedBrackets(someString));
    }

    @Test // #7 - String with random number of unbalanced brackets
    public void longerUnbalancedString1ReturnsFalse() {
        Random randomNum = new Random();
        String someString1 = "]aa[Bb2]5".repeat(randomNum.nextInt(6));
        assertFalse(BalancedBrackets.hasBalancedBrackets(someString1));
    }

    @Test // #8 - String with random number of unbalanced brackets
    public void longerUnbalancedString2ReturnsFalse() {
        Random randomNum = new Random();
        String someString2 = "[aa[Bb2]* ".repeat(randomNum.nextInt(6));
        assertFalse(BalancedBrackets.hasBalancedBrackets(someString2));
    }

    @Test // #9 - String of "[]" only
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test // #10 - String misaligned brackets like "]["
    public void misalignedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test // #11 - String of "[" only
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test // #12 - String of "]" only
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test // #13 - String of odd number of brackets
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

}
