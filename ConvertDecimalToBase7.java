import java.util.Scanner;

public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        int number = st.nextInt();
        String convertNumber = "";
        int a = 1 ;
        int b;
        while (a != 0){
            a = number /7;
            b = number %7;

            number = a;
            convertNumber = convertNumber + b;
        }
        convertNumber = new StringBuffer(convertNumber).reverse().toString();

        System.out.println(convertNumber);

    }
}
