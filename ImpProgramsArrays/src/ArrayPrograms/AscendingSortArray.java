package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSortArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enetr size of an array: ");
    int n=sc.nextInt();
    int[] x=new int[n];
    System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++) {
    	x[i]=sc.nextInt();
    	
    }
    
    int[] sl=sortAscending(x);
    for(int i=0;i<sl.length;i++) {
    	System.out.print(sl[i]+" ");
    }



	}

         private static int[] sortAscending(int[] ar) {
//        	 int[] ar=new int[a.length];
        	 for (int i = 0; i < ar.length - 1; i++) {
                 for (int j = i + 1; j < ar.length; j++) {
                     if (ar[i] > ar[j]) {
                         // Swap manually
                         int temp = ar[i];
                         ar[i] = ar[j];
                         ar[j] = temp;
                     }
                 }
             }

             return ar;

	
      }
}
