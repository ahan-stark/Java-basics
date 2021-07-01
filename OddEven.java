public class OddEven {
    public static void main(String[] args) {
        double num;
        num=(Math.floor(Math.random()*10));            //to generate a random input
        if(num==0){
            System.out.print(num+" ,it's not an odd/even");
        }
        else if(num%2==0)
        {
            System.out.print(num+" is an even number");
        }
        else{
            System.out.print(num+" is an odd number");
        }
    }
    
}
