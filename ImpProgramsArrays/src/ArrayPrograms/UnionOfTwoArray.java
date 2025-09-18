package ArrayPrograms;

public class UnionOfTwoArray {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {3,4,5,6};
		int[] res=union(a,b);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}
	
	public static int[] union(int[] a, int[] b) {
		int[] rs=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			rs[i]=a[i];
			
		}
		
		int in=a.length;
		
		for(int j=0;j<b.length;j++) {
			int k=0;
			for(;k<a.length;k++) {
				if(b[j]==a[k])
					break;
				}
			if(k==a.length)
				rs[in++]=b[j];
		}
		
		int[] res=new int[in];
		for(int i=0;i<res.length;i++) {
			res[i]=rs[i];
		}
		
		return res;
	}

}
