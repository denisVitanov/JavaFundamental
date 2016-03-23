import java.util.Scanner;
import java.lang.String;

public class ConvertBase7ToDecimal {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String number = string.nextLine();
        number = new StringBuffer(number).reverse().toString();
        double sum = 0;
        String s ;
        int stringToNumber;
        for (int i = 0; i <number.length() ; i++) {
            s = "" + number.charAt(i);
            stringToNumber = Integer.parseInt(s);
            sum =sum + stringToNumber*Math.pow(7,i);
        }
        int result = (int)sum;
        System.out.println(result);



    }
}
