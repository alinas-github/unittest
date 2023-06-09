package unittest;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
    @Test
    public void oneTwoThreeRepeatIs() {
        Assert.assertEquals("1","I", RomanNumerals.arabicToRoman(1));
        Assert.assertEquals("2","II", RomanNumerals.arabicToRoman(2));
        Assert.assertEquals("3","III", RomanNumerals.arabicToRoman(3));
        Assert.assertEquals("4","IV", RomanNumerals.arabicToRoman(4));
        Assert.assertEquals("5","V", RomanNumerals.arabicToRoman(5));
        Assert.assertEquals("6","VI", RomanNumerals.arabicToRoman(6));
        Assert.assertEquals("7","VII", RomanNumerals.arabicToRoman(7));
        Assert.assertEquals("9","IX", RomanNumerals.arabicToRoman(9));
        Assert.assertEquals("10","X", RomanNumerals.arabicToRoman(10));
        Assert.assertEquals("22","XXII", RomanNumerals.arabicToRoman(22));
        Assert.assertEquals("75","LXXV", RomanNumerals.arabicToRoman(75));
    }
}