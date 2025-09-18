package ArrayPrograms;

import java.util.Scanner;

public class SmallestElementAtrray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enetr size of an array: ");
	    int n=sc.nextInt();
	    int[] x=new int[n];
	    System.out.println("Enter "+n+" values");
	    for(int i=0;i<n;i++) {
	    	x[i]=sc.nextInt();
	    	
	    }
	    
	    int small=getBiggest(x);
	    System.out.println(small);

		}
		
		public static int getBiggest(int[] ar) {
			int small=ar[0];
			for(int i=1;i<ar.length;i++) {
				if(ar[i]<small)
					small=ar[i];
			}
		
		return small;
		}

}
