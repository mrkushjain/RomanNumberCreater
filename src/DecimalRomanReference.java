/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 03/08/13
 * Time: 8:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DecimalRomanReference {
    private int decimal;
    private String roman;
    DecimalRomanReference(int decimal,String roman){
        this.decimal = decimal;
        this.roman = roman;
    }
    public int getDecimal() {
        return decimal;
    }

    public String getRoman() {
        return roman;
    }
}
