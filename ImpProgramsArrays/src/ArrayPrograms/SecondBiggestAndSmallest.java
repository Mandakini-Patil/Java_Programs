package ArrayPrograms;

public class SecondBiggestAndSmallest {
	public static void main(String[] args) {
		int[] ar= {10,25,3,99,45};
		int fbig,sbig,fsmall,ssmall;
		fbig=sbig=fsmall=ssmall=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>fbig) {
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]>sbig && ar[i]!=fbig) {
				sbig=ar[i];
			}
			
			if(ar[i]<fsmall) {
				ssmall=fsmall;
				fsmall=ar[i];
			}
			
			else if(ar[i]<fbig && ar[i]!=fsmall) {
				fsmall=ar[i];
			}
		}
		
		System.out.println("seconmg big: "+sbig);
		System.out.println("second small: "+ssmall);
		
	}

}
