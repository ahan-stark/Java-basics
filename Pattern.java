import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int row = sc.nextInt();
        sc.close();
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++)
                System.out.print(" ");
            for (int k = i; k > 0; k--)
                System.out.print(k + " ");
            for (int k = 2; k <= i; k++)
                System.out.print(k + " ");
            System.out.println(" ");

        }

    }

}
