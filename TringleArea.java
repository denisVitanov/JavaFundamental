import java.util.Scanner;

public class TringleArea {
    public static void main(String[] args) {
        Scanner point = new Scanner(System.in);
        int xA = point.nextInt();
        int yA = point.nextInt();
        point = new Scanner(System.in);
        int xB = point.nextInt();
        int yB = point.nextInt();
        point = new Scanner(System.in);
        int xC = point.nextInt();
        int yC = point.nextInt();

        int validTringle = Math.abs((xA*(yB-yC)+xB*(yC-yA)+xC*(yA-yB))/2);
        System.out.println(validTringle);

    }
}
