package ArrayPrograms;

import java.util.Arrays;

public class DuplicatesFromSortedArray {
	 public static void main(String[] args) {
	        int[] ar = {1, 2, 3, 4, 7,2,4,5};
	        int[] res = removeDuplicate(ar);
	        for (int i = 0; i < res.length; i++) {
	            System.out.print(res[i] + " ");
	        }
	    }
	 public static int[] removeDuplicate(int[] a) {
		 Arrays.sort(a); //it sort the array
		 int x=0;
		 for(int i=1;i<a.length;i++) {
			 if(a[i]!=a[x])
				 x++;
			 a[x]=a[i];
		 }
		 
		 int[] br=new int[x+1];
		 for(int i=0;i<br.length;i++) {
			 br[i]=a[i];
		 }
		 
		 
		 return br;
	 }

}
