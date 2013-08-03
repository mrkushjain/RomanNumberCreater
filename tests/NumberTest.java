import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberTest {
    @Test
    public void testBasicRomanNumbersIsCorrect()
    {
        assertEquals("I",new Number(1).convertToRoman());
        assertEquals("V",new Number(5).convertToRoman());
        assertEquals("X",new Number(10).convertToRoman());
        assertEquals("L",new Number(50).convertToRoman());
        assertEquals("C",new Number(100).convertToRoman());
        assertEquals("D",new Number(500).convertToRoman());
        assertEquals("M",new Number(1000).convertToRoman());
    }

    public void testIIIisRomanNumberForThree(){
        assertEquals("III",new Number(3).convertToRoman());
    }

    public void testXVisRomanNumberForFifteen(){
        assertEquals("XV",new Number(15).convertToRoman());
    }

}
