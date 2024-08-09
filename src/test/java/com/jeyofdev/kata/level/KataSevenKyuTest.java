package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Katas level 7kyu")
public class KataSevenKyuTest {
    @Test
    @DisplayName("vowelCount")
    public void testVowelCount() {
        assertEquals(5, KataSevenKyu.vowelCount("abracadabra"), "should return 5 for string \"abracadabra\"");
        assertEquals(0, KataSevenKyu.vowelCount(""), "should return 0 for string \"\"");
        assertEquals(4, KataSevenKyu.vowelCount("pear tree"), "should return 4 for string \"pear tree\"");
        assertEquals(13, KataSevenKyu.vowelCount("o a kak ushakov lil vo kashu kakao"), "should return 13 for string \"o a kak ushakov lil vo kashu kakao\"");
        assertEquals(168, KataSevenKyu.vowelCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"), "should return 168 for string \"tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty\"");
    }

    @Test
    @DisplayName("getMiddleCharacter")
    public void testGetMiddleCharacter() {
        assertEquals("es", KataSevenKyu.getMiddleCharacter("test"), "should return es for string \"test\"");
        assertEquals("dd", KataSevenKyu.getMiddleCharacter("middle"), "should return dd for string \"middle\"");
        assertEquals("t", KataSevenKyu.getMiddleCharacter("testing"), "should return t for string \"testing\"");
        assertEquals("A", KataSevenKyu.getMiddleCharacter("A"), "should return A for string \"A\"");
    }

    @Test
    @DisplayName("toJadenCase")
    public void testToJadenCase() {
        assertEquals("Most Trees Are Blue", KataSevenKyu.toJadenCase("most trees are blue"), "should return Most Trees Are Blue for string \"most trees are blue\"");
        assertNull(KataSevenKyu.toJadenCase(null), "should return null for argument null");
       assertNull(KataSevenKyu.toJadenCase(""), "should return null for string \"\"");
    }

    @Test
    @DisplayName("accum")
    public void testAccum() {
        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu", KataSevenKyu.accum("ZpglnRxqenU"), "should return Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu for string \"ZpglnRxqenU\"");
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb", KataSevenKyu.accum("NyffsGeyylB"), "should return N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb for string \"NyffsGeyylB\"");
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu", KataSevenKyu.accum("MjtkuBovqrU"), "should return M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu for string \"MjtkuBovqrU\"");
        assertEquals("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm", KataSevenKyu.accum("EvidjUnokmM"), "should return E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm for string \"EvidjUnokmM\"");
        assertEquals("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc", KataSevenKyu.accum("HbideVbxncC"), "should return H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc for string \"HbideVbxncC\"");
    }

    @Test
    @DisplayName("seriesSum")
    public void testSeriesSum() {
        assertEquals("1,57", KataSevenKyu.seriesSum(5), "Should return 1,57 for int 5");
        assertEquals("1,77", KataSevenKyu.seriesSum(9), "Should return 1,77 for int 9");
        assertEquals("1,94", KataSevenKyu.seriesSum(15), "Should return 1,94 for int 15");
    }

    @Test
    @DisplayName("fold")
    public void testFold() {
        assertEquals((Long)42L, KataSevenKyu.fold(384000000.0), "Should return 42L for double 384000000.0");
        assertEquals((Long)0L, KataSevenKyu.fold(0.00005), "Should return 0L for double 0.00005");
    }

    @Test
    @DisplayName("getLargestFiveDigitNumber")
    public void testGetLargestFiveDigitNumber() {
        assertEquals(83910, KataSevenKyu.getLargestFiveDigitNumber("283910"), "Should return 83910 for string \"283910\"");
        assertEquals(67890, KataSevenKyu.getLargestFiveDigitNumber("1234567890"), "Should return 67890 for string \"1234567890\"");
        assertEquals(74765, KataSevenKyu.getLargestFiveDigitNumber("731674765"), "Should return 74765 for string \"731674765\"");
    }

    @Test
    @DisplayName("isAscOrder")
    public void testIsAscOrder() {
        assertTrue(KataSevenKyu.isAscOrder(new int[] {1, 2}));
        assertFalse(KataSevenKyu.isAscOrder(new int[] {2, 1}));

        assertTrue(KataSevenKyu.isAscOrder(new int[] {1, 2, 3}));
        assertFalse(KataSevenKyu.isAscOrder(new int[] {1, 3, 2}));
        assertTrue(KataSevenKyu.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(KataSevenKyu.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));

        assertTrue(KataSevenKyu.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(KataSevenKyu.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
    }

    @Test
    @DisplayName("breakChocolate")
    public void testBreakChocolate() {
        assertEquals(24, KataSevenKyu.breakChocolate(5, 5), "Should return 24 for integers 5 and 5");
        assertEquals(0, KataSevenKyu.breakChocolate(1, 1), "Should return 0 for integers 1 and 1");
    }

    @Test
    @DisplayName("filterString")
    public void testFilterString() {
        assertEquals(123, KataSevenKyu.filterString("123"), "Should return 123 for string \"123\"");
        assertEquals(123, KataSevenKyu.filterString("a1b2c3"), "Should return 123 for string \"a1b2c3\"");
        assertEquals(123, KataSevenKyu.filterString("aa1bb2cc3dd"), "Should return 123 for string \"aa1bb2cc3dd\"");
    }

    @Test
    @DisplayName("splitInParts")
    public void testSplitInParts() {
        assertEquals("sup erc ali fra gil ist ice xpi ali doc iou s", KataSevenKyu.splitInParts("supercalifragilisticexpialidocious", 3));
        assertEquals("Hel loK ata", KataSevenKyu.splitInParts("HelloKata", 3));
        assertEquals("H e l l o K a t a", KataSevenKyu.splitInParts("HelloKata", 1));
        assertEquals("HelloKata", KataSevenKyu.splitInParts("HelloKata", 9));
    }

    @Test
    @DisplayName("highAndLow")
    public void testHighAndLow() {
        assertEquals("42 -9", KataSevenKyu.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"), "Should return string \"42 -9\" for string \"8 3 -5 42 -1 0 0 -9 4 7 4 -4\"");
        assertEquals("3 1", KataSevenKyu.highAndLow("1 2 3"), "Should return string \"3 1\" for string \"1 2 3\"");
    }

    @Test
    @DisplayName("sortDesc")
    public void testSortDesc() {
        assertEquals(0, KataSevenKyu.sortDesc(0), "Should return 0 for integer 0");
        assertEquals(51, KataSevenKyu.sortDesc(15), "Should return 51 for integer 15");
        assertEquals(987654321, KataSevenKyu.sortDesc(123456789), "Should return 987654321 for integer 123456789");
    }

    @Test
    @DisplayName("filterList")
    public void testFilterList() {
        assertEquals(List.of(1, 2), KataSevenKyu.filterList(List.of(1, 2, "a", "b")));
        assertEquals(List.of(1, 0, 15), KataSevenKyu.filterList(List.of(1, "a", "b", 0, 15)));
        assertEquals(List.of(1, 2, 123), KataSevenKyu.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }

    @Test
    @DisplayName("isIsogram")
    public void testIsIsogram() {
        assertTrue(KataSevenKyu.isIsogram("Dermatoglyphics"));
        assertTrue(KataSevenKyu.isIsogram("isogram"));
        assertFalse(KataSevenKyu.isIsogram("moose"));
        assertFalse(KataSevenKyu.isIsogram("isIsogram"));
        assertFalse(KataSevenKyu.isIsogram("aba"));
        assertFalse(KataSevenKyu.isIsogram("moOse"));
        assertTrue(KataSevenKyu.isIsogram("thumbscrewjapingly"));
        assertTrue(KataSevenKyu.isIsogram(""));
    }
}