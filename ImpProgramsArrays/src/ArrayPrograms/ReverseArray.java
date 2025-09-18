package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enetr size of an array: ");
	    int n=sc.nextInt();
	    int[] x=new int[n];
	    System.out.println("Enter "+n+" values");
	    for(int i=0;i<n;i++) {
	    	x[i]=sc.nextInt();
	    }  	
	    
	    

     int f=0, l=x.length-1;
     while(f<l) {
     int temp=x[f];
     x[f]=x[l];
     x[l]=temp;
     f++;
     l--;
     }	 
//     for(int i=0;i<x.length;i++) {
//    	 System.out.print(x[i]+" ");
     
     //  OR...
     System.out.println(Arrays.toString(x));
     
	    }
	
}	
