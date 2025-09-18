package ArrayPrograms;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {4,5,6,3};
		
		int[] res=intersect(a,b);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
 	}
	
	public static int[] intersect(int[] a, int[] b) {
		int[] rs=new int[a.length];
		int in=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					rs[in]=a[i];
				in++;
				break;
				}
			}
		}
		
		int[] res=new int[in];
		for(int i=0;i<res.length;i++) {
			res[i]=rs[i];
		}
		 return res;
	}

}
