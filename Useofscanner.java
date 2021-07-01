import java.util.Scanner;

public class Useofscanner {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Name");
        String name=in.nextLine();
        System.out.println("Entered Name is "+name);
        in.close();
    }
    
}
