package ArrayPrograms;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,9,8};
		int[] b= {4,5,6,7};
		int[] res=mergeArray(a,b);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	private static int[] mergeArray(int[] a, int[] b) {
		int[] c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length) {
			c[k++]=a[i++];
		}
		
		while(j<b.length) {
			c[k++]=b[j++];
		}
		return c;
	}
	

}
