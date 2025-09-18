package ArrayPrograms;

public class DeleteElement {
	public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int in = 2;
        int[] res = deleteElement(a, in);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
	
	public static int[] deleteElement(int[] a,int in) {
		int [] b=new int[a.length-1];
		
		for(int i=0;i<b.length;i++) {
			if(i<in)
				b[i]=a[i];
			else if(i==in)
				b[i]=a[i+1];
		}
		
		return b;
	}
	

}
