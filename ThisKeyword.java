class UseOfKeyword {
    int num1;
    int num2;

    public UseOfKeyword(int num1, int num2) {
        this.num1 = num1; // use of this to diffrentiate between instance and local variable
        this.num2 = num2; // use of this to diffrentiate between instance and local variable
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        UseOfKeyword obj = new UseOfKeyword(10, 20);
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
