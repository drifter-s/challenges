import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    //finding sum
    static long sum(int[] arr)
    { long sum1 =0; 
    for(int i=0;i<arr.length-1;i++)
        {
            sum1 = sum1+arr[i];
        }
    
      return sum1;
    }

    //rotating array
        static void rotate(int[] arr)
        {   int n = arr.length;
            int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
         arr[i] = temp; 
        }


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        List<Long> list = new ArrayList<Long>();
        for(int i =0;i<arr.length;i++){
        long total = sum(arr);
        list.add(total); 
        rotate(arr);
        }
        Collections.sort(list);
        int n= list.size(); 
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(n-1));
       
        }    
    
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
