package variable;

import java.util.Scanner;
/*
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ 
as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food 
each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number,
 where 0 <= i
*/


public class Qn1 {
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter r");
        int r = sc.nextInt();
        System.out.println("Enter unit");
        int unit = sc.nextInt();
        System.out.println("Enter elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements");
        for (int i = 0; i < n; i++) 
        {
         arr[i] = sc.nextInt();
        }
        // Call the ans method and print the result
        System.out.println("Output");
        System.out.println(ans(r, unit, arr, n));
    }

    public static int ans(int r, int unit, int arr[], int n) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int result = r * unit; // Total food required by all rats
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Sum of food available in houses
            count++;
            if (sum >= result) {
                return count; // Return the number of houses used
            }
        }

        if (sum < result) {
            return 0; // If food is insufficient
        }

        return n; // In case all houses are used
    }
}
