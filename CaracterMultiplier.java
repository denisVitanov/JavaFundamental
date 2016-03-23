import java.util.Scanner;

public class CaracterMultiplier {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String FirstString = string.next();
        String LastString = string.next();

        int sumChar = MultiplierChar(FirstString, LastString);
        System.out.println(sumChar);
    }

    public static int MultiplierChar(String FirstString, String LastString) {
        int max = 0;
        int min = 0;
        int sum = 0;
        min = (FirstString.length() < LastString.length()) ? FirstString.length() : LastString.length();
        max = (FirstString.length() > LastString.length()) ? FirstString.length() : LastString.length();
        for (int i = 0; i < max; i++) {
            if (i < min) {
                char oneStringChar = FirstString.charAt(i);
                char twoStringChar = LastString.charAt(i);
                sum = sum + (oneStringChar * twoStringChar);
            } else {
                if (min == FirstString.length()) {
                    char anotherString = LastString.charAt(i);
                    sum = sum + anotherString;
                }
                else if(min == LastString.length()){
                    char anotherString = FirstString.charAt(i);
                    sum = sum + anotherString;
                }
            }
        }
        return sum;
    }
}
