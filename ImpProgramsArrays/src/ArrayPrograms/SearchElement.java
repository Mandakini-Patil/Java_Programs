package ArrayPrograms;

public class SearchElement {
	public static void main(String[] args) {
		int[] ar= {25,56,78,39,72};
		int ele=39,index=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				index=i;
				break;
			}
		}
			if(index!=-1)
				System.out.println(ele+" present at the index "+index);
			else
				System.out.println("element not found");
		
		
	}

}
