package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
}
