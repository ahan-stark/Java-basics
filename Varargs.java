class Add
{
    public int add(int ... n)   //{10,20,30,40,50}
    {
        int sum=0;
        for(int i: n) 
        {
            sum=sum+i;
        }
        return sum;
    }
}





public class Varargs {
    public static void main(String[] args)
    {
        Add obj=new Add();
        System.out.println(obj.add(10,20,30,40,50));
    }
    
}
