package ArrayPrograms;

public class Fibonacci {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
          int n=10;
          
          int f=0;
          int s=1;
		  for(int i=0;i<=n;i++) {
			  System.out.print(f+" ");
			  int temp=f+s;
			  f=s;
			  s=temp;
	 }
		
	}

}

