package test;
/*
  The function BalancedBrackets should return true if and only if
  the input string has a set of "balanced" brackets.

  That is, whether it consists entirely of pairs of opening/closing
  brackets (in that order), none of which mis-nest. We consider a bracket
  to be square-brackets: [ or ].

  The string may contain non-bracket characters as well.

  These strings have balanced brackets:
   "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"

  While these do not:
    "[LaunchCode", "Launch]Code[", "[", "]["

  @param str - to be validated
 * @return true if balanced, false otherwise
 */

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testOpenCloseOpenBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }


    @Test
    public void testCloseOpenBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testCloseOpenBracketsWithWord() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]Launch["));
    }

    @Test
    public void testDoubleOpenClose() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void testEmbeddedCloseOpenBrackets() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testOpenBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testCloseBracket() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testDoubleOpenClosePlusOpen() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[][]["));
    }
    @Test
    public void testOpenClosePlusWord() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testBalancedSetPlusWord() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
}