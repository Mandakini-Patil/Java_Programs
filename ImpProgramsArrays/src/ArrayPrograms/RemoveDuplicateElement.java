package ArrayPrograms;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,4,5};
		int[] res=removeDuplicate(a);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
     }

	private static int[] removeDuplicate(int[] a) {
		int[] b=new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<count;j++) {
				if(a[i]==b[j]) {
					isDuplicate=true;
					break;
				}
					
			}
			if(!isDuplicate) {
				b[count++]=a[i];
			}
		}
		
		int[] c=new int[count];
		for(int k=0;k<c.length;k++) {
			c[k]=b[k];
		}
			
		
		return c;
	}
	

}
