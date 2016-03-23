import java.util.Scanner;

public class GetFirstOddOrEven {
    static String firstNumberOddOrEven(String[] numbersElement,String insertOddOrEven){
        String oddOrEvenEl = "";
        int stringElement = 0;
        for (int i = 0; i < numbersElement.length; i++) {
            String s = numbersElement[i];
            stringElement = Integer.parseInt(s);
            if ((insertOddOrEven.equals("Odd")) && ((stringElement % 2) != 0)) {

                oddOrEvenEl= oddOrEvenEl + stringElement + " ";
            }
            else if ((insertOddOrEven.equals("Even")) && ((stringElement % 2) == 0)) {
                oddOrEvenEl= oddOrEvenEl + stringElement + " " ;
            }

        }

        return oddOrEvenEl;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String[] numbersElement = sr.nextLine().split(" ");
        String getElement = sr.next();
        int numberOddOrEven = sr.nextInt();
        String insertOddOrEven = sr.next();

        int i = 0;
        String result = firstNumberOddOrEven(numbersElement,insertOddOrEven);
        String[] res = result.split(" ");
        while ((res.length > i) && (numberOddOrEven > i)){
            System.out.printf("%s ",res[i]);
            i++;

        }
    }
}
