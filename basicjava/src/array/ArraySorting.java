package array;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
	public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=scan.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("sorted array"+ Arrays.toString(array));
    }
}



