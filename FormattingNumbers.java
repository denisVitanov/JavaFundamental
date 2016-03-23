import java.util.Scanner;
import java.lang.*;
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstValue = console.nextInt();
        float secondValue = console.nextFloat();
        float lastValue = console.nextFloat();

        String convertToHex = Integer.toString(firstValue,16);
        String cobvertToBin = String.format("%10s",Integer.toBinaryString(firstValue)).replace(' ','0');

        //System.out.println(convertToHex);
        //System.out.println(cobvertToBin);
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",convertToHex,cobvertToBin,secondValue,lastValue);
    }
}
