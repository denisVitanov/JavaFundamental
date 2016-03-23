import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double form1 = Math.pow((a*a+b*b)/(a*a-b*b)
                ,(a+b+c)/Math.sqrt(c));
        double form2 = Math.pow(a*a+b*b-Math.pow(c,3),(a-b));

        double diff = (form1+form2)/ 2 -(a+b+c)/3;

        System.out.printf("F1 result: %.2f; F2 result : %.2f; Diff: %.2f",form1,form2,diff);
    }
}
