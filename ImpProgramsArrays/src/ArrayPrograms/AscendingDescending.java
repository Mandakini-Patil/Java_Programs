package ArrayPrograms;

import java.util.Arrays;

public class AscendingDescending {
	public static void main(String[] args) {
		int[] ar= {12,5,8,1,9};
        String st=Arrays.toString(ar);
        System.out.println("before sorting");
        System.out.println(st);
        
        Arrays.sort(ar);
        System.out.println("After sorting ascending order");
        
        System.out.println(Arrays.toString(ar));
        
        int f=0,l=ar.length-1;
        while(f<l) {
        	int temp=ar[f];
        	ar[f]=ar[l];
        	ar[l]=temp;
        	f++;
        	l--;
        }
        System.out.println("After sorting descending order");
        System.out.println(Arrays.toString(ar));
	}

}
