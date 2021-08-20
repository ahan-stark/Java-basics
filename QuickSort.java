import java.util.Random;
import java.util.Scanner;

class QS {
    void quicksort(int a[], int low, int high) {
        int j;
        if (low < high) {
            j = partition(a, low, high);
            quicksort(a, low, j - 1);
            quicksort(a, j + 1, high);
        }
    }

    int partition(int a[], int low, int high) {
        int p, i, j, t;
        p = a[low];
        i = low + 1;
        j = high;
        while (i <= j) {
            i++;
            while (p < a[j])
                j--;
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            } else {
                a[low] = a[j];
                a[j] = p;
            }
        }
        return j;
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int a[] = new int[100000];
        Scanner in = new Scanner(System.in);
        in.close();
        Random rand = new Random();
        QS q = new QS();
        long start, end;
        System.out.println("Enter the number of elemts to be sorted");
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
            a[i] = rand.nextInt(100);
        System.out.println("Unsorted elements are");
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        start = System.nanoTime();
        q.quicksort(a, 0, n - 1);
        end = System.nanoTime();
        System.out.println("\n The sorted elements are");
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        System.out.println("The time taken to sort is " + (end - start) + "ns");

    }

}
