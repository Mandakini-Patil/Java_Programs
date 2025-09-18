package ArrayPrograms;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enetr size of an array: ");
	    int n=sc.nextInt();
	    int[] x=new int[n];
	    System.out.println("Enter "+n+" values");
	    for(int i=0;i<n;i++) {
	    	x[i]=sc.nextInt();
	    	
	    }
	    
	    int sl=getSecondLargest(x);
	    System.out.println(sl);

		}

	private static int getSecondLargest(int[] a) {
		 if(a==null||a.length<2) {
			 return Integer.MIN_VALUE;
			 }
			 int firstLargest=Integer.MIN_VALUE; 
			 int secondLargest=Integer.MIN_VALUE;

			 
			 for(int i=0;i<a.length;i++) {
				 if(a[i]>firstLargest) {
					 secondLargest=firstLargest;
					 firstLargest=a[i];
				 }
//				 else if(a[i]>secondLargest&&a[i]!=firstLargest) {
//					 secondLargest=a[i];
//				 }
					
			 }
			 return secondLargest;
			 
		 }

	
	}
