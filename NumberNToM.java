import java.util.Random;
import java.util.Scanner;

public class NumberNToM {
    public static void main(String[] args) {
        Scanner is = new Scanner(System.in);
        int N = is.nextInt();
        int M = is.nextInt();
        int  number =0;
        // Random n = new Random();
        int max = 0;
        int min = 0;
        max = (N >= M) ? N : M;
        min = N < M ? N : M;
        int syzeArray = (max  - min)+1;
        int[] generatingNumbers = new int[syzeArray];

        for (int i = 0; i <syzeArray  ; i++) {
            number = new Random().nextInt(syzeArray)+min;
            int k=0;
            for (int j = 0; j <i ; j++) {

                if (generatingNumbers[j] != number  ) {
                    k++;
                }

            }
            if(k==i){
                generatingNumbers[i] = number;
                System.out.println(generatingNumbers[i]);

            }
            else {
                i--;
            }
        }

    }
}
