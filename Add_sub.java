class Calculator {
    public int add(int i, int j) {
        return i + j;

    }
    public int sub(int m,int n){
        return m-n;
    }
}

public class Add_sub {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int result = c1.add(5, 4);
        System.out.println(result);
        int sub=c1.sub(10,5);
        System.out.println(sub);


    }

}
