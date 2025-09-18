package ArrayPrograms;

public class CopyArrayElemets {
	public static void main(String[] args) {
		int[] ar= {25,56,78,39,72};
		int[] dup=getDuplicates(ar);
		for(int i=0;i<dup.length;i++) {
			System.out.print(dup[i]+" ");
		}
	}
	public static int[] getDuplicates(int[] ar) {
		int[] cr=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			cr[i]=ar[i];
		}
		return cr;
	}
	

}
