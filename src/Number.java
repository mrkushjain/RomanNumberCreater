import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 11:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Number {
    private int decimalValue;
    DecimalRomanReference [] referenceSheet;
    Number(int decimalValue){
        this.decimalValue = decimalValue;
        referenceSheet = new DecimalRomanReference[]{
                                                  new DecimalRomanReference(1,"I"),
                                                  new DecimalRomanReference(5,"V"),
                                                  new DecimalRomanReference(10,"X"),
                                                  new DecimalRomanReference(50,"L"),
                                                  new DecimalRomanReference(100,"C"),
                                                  new DecimalRomanReference(500,"D"),
                                                  new DecimalRomanReference(1000,"M")
        };
    }
   public String convertToRoman(){
       String romanNumber="";
       int givenNumber = decimalValue;
       while(givenNumber!=0){
           for(int i=referenceSheet.length-1;i>=0;i--) {
               if(givenNumber>= referenceSheet[i].getDecimal()){
                   romanNumber += referenceSheet[i].getRoman();
                   givenNumber -= referenceSheet[i].getDecimal();
               }
           }
       }
       return romanNumber;
   }



}
