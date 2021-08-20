import java.util.Random;
import java.util.Scanner;

class Ms{
    void mergesort(int a[],int low,int high)
    {
        int mid;
        if(low<high){
            mid=(low+high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
        }
    }
    void merge(int a[],int low,int mid,int high){
        int i,j,h,k,b[]=new int[100000];
        h=low;
        i=low;
        j=mid+1;
        while((i<=mid)&&j<=high){
            if(a[i]<a[j])
            b[h++]=a[i++];
            else
            b[h++]=a[j++];
            if(i>mid){
                for(k=j;k<=high;k++)
                b[h++]=a[k];
            }
            else
            {
                for(k=i;k<=mid;k++)
                b[h++]=a[k];
            }
            for(k=low;k<=high;k++)
            a[k]=b[k];
        }
    }
    
    
}
 public class MergeSort {
    public static void main(String[] args) {
        int a[]=new int[10000];
        Scanner in =new Scanner(System.in);
        Random rand =new Random();
        Ms m =new Ms();
        long start,end;
        System.out.println("ENTER THE NUMBER OF ELEMENTS TO BE SORTED");
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        a[i]=rand.nextInt(100);
        System.out.println("UNSORTED ARRAY ELEMENTS ARE");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
        start=System.nanoTime();
        m.mergesort(a,0,n-1);
        end=System.nanoTime();
        System.out.println("\n THE SORTED ELEMENTS ARE");
        for(int i=0;i<=n;i++)
        System.out.println(a[i]);
        System.out.println("THE TIME TAKEN TO SORTED IS"+(end-start)+"ns");
        in.close();
    }
}
