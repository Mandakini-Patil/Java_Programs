package ArrayPrograms;

public class MinusPlus {
    public static void main(String[] args) {
        int[] a = {-1, 2, -3, 4, -5, 6, -7,7,11};
        int[] res = minusPlus(a);
        
        for (int i = 0; i < res.length; i++) {
        	
            System.out.print(res[i] + " ");
        }
        System.out.println();
        
        int count=countPrime(a);
        System.out.println("count of primes numbers in array is: "+count);
        
        
    }
    public static int[] minusPlus(int[] a) {
        int[] minus = new int[a.length];
        int[] plus = new int[a.length];
        int m = 0, p = 0;

        // Separate positives and negatives
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                plus[p] = a[i];
                p++;
            } else if (a[i] < 0) {
                minus[m] = a[i];
                m++;
            }
        }

        // Combine both arrays
        int[] c = new int[p + m];
        for (int i = 0; i < p; i++) {
            c[i] = plus[i];
        }
        for (int i = 0; i < m; i++) {
            c[p + i] = minus[i];
        }

        return c;
    }
    
    public static boolean isPrime(int n) {
  
            if(n<=1)
            	return false;
            if(n==2||n==3)
            	return true;
            if(n%2==0||n%3==0)
            	return false;
            
            for(int i=5;i*i<=n;i++) {
            	if(n%i==0||n%(i+2)==0)
            		return false;
            }
            return true;
            	
     }
    
      public static int countPrime(int[] a) {
    	int count=0;
    	for(int i=0;i<a.length;i++) {
    		if(isPrime(a[i]))
    			count++;
    	}
    	
    	return count;
      } 
    
}
