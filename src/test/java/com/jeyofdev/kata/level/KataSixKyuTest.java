package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Katas level 6kyu")
public class KataSixKyuTest {
    @Test
    @DisplayName("inArray")
    public void testInArray() {
        String[] a = { "arp", "live", "strong" };
        String[] b = { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r = { "arp", "live", "strong" };
        assertArrayEquals(r, KataSixKyu.inArray(a, b), "should return [\"arp\", \"live\", \"strong\"] for arrays [\"arp\", \"live\", \"strong\"] and [\"lively\", \"alive\", \"harp\", \"sharp\", \"armstrong\"]");
    }

    @Test
    @DisplayName("digPow")
    public void testDigPow() {
        assertEquals(1, KataSixKyu.digPow(89, 1), "should return 1 for integers 89 and 1");
        assertEquals(-1, KataSixKyu.digPow(92, 1), "should return -1 for integers 92 and 1");
        assertEquals(51, KataSixKyu.digPow(46288, 3), "should return 51 for integers 46288 and 3");
    }

    @Test
    @DisplayName("findOddInt")
    public void testFindOddInt() {
        assertEquals(5, KataSixKyu.findOddInt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}), "should return 5 for array [20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5]");
        assertEquals(-1, KataSixKyu.findOddInt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}), "should return 5 for array [1,1,2,-2,5,2,4,4,-1,-2,5]");
        assertEquals(5, KataSixKyu.findOddInt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}), "should return 5 for array [20,1,1,2,2,3,3,5,5,4,20,4,5]");
        assertEquals(10, KataSixKyu.findOddInt(new int[]{10}), "should return 5 for array [10]");
        assertEquals(10, KataSixKyu.findOddInt(new int[]{1,1,1,1,1,1,10,1,1,1,1}), "should return 5 for array [1,1,1,1,1,1,10,1,1,1,1]");
        assertEquals(1, KataSixKyu.findOddInt(new int[]{5,4,3,2,1,5,4,3,2,10,10}), "should return 5 for array [5,4,3,2,1,5,4,3,2,10,10]");
    }

    @Test
    @DisplayName("encode")
    public void testEncode() {
        assertEquals(")()())()(()()(", KataSixKyu.encode("Prespecialized"), "should return )()())()(()()( for string \"Prespecialized\"");
        assertEquals("))))())))", KataSixKyu.encode("   ()(   "), "should return ))))()))) for string \"   ()(   \"");
    }

    @Test
    @DisplayName("toCamelCase")
    public void testToCamelCase() {
        assertEquals("theStealthWarrior", KataSixKyu.toCamelCase("the_Stealth_Warrior"), "should return theStealthWarrior for string \"the_Stealth_Warrior\"");
        assertEquals("theStealthWarrior", KataSixKyu.toCamelCase("the-Stealth-Warrior"), "should return theStealthWarrior for string \"the-Stealth-Warrior\"");
    }

    @Test
    @DisplayName("countSmileys")
    public void testCountSmileys() {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, KataSixKyu.countSmileys(a));

        List<String> b = new ArrayList<String>();
        b.add(":)"); b.add("XD"); b.add(":0}"); b.add("x:-"); b.add("):-"); b.add("D:");
        assertEquals(1, KataSixKyu.countSmileys(b));

        List<String> c =  new ArrayList<String>();
        c.add(":)"); c.add(":D"); c.add("X-}"); c.add("xo)"); c.add(":X"); c.add(":-3"); c.add(":3");
        assertEquals(2, KataSixKyu.countSmileys(c));

        List<String> d =  new ArrayList<String>();
        d.add(":)"); d.add(":)"); d.add("x-]"); d.add(":ox"); d.add(";-("); d.add(";-)"); d.add(";~("); d.add(":~D");
        assertEquals(4, KataSixKyu.countSmileys(d));
    }

    @Test
    @DisplayName("areTheSame")
    public void testAreTheSame() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(KataSixKyu.areTheSame(a, b));
    }

    @Test
    @DisplayName("longestConsec")
    public void testLongestConsec() {
        assertEquals("abigailtheta", KataSixKyu.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        assertEquals("oocccffuucccjjjkkkjyyyeehh", KataSixKyu.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
        assertEquals("", KataSixKyu.longestConsec(new String[] {}, 3));
        assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck", KataSixKyu.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        assertEquals("wlwsasphmxxowiaxujylentrklctozmymu", KataSixKyu.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
        assertEquals("", KataSixKyu.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
        assertEquals("ixoyx3452zzzzzzzzzzzz", KataSixKyu.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
        assertEquals("", KataSixKyu.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
        assertEquals("", KataSixKyu.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
    }
}