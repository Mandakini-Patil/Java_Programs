
//Write a java program to replace the array element by the right most greatest prime number if not there replace with array elemet with -1
package ArrayPrograms;


import java.util.*;

public class ReplaceWithLeastGreaterPrime {

    // Prime check
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int[] processQuery(int[] arr, int l, int r) {
        int n = arr.length;
        int[] result = Arrays.copyOf(arr, n);
       
        for (int i = l ; i < r; i++) {  // 1-indexed query
            int candidate = -1;
            for (int j = i + 1; j < r; j++) {
                if (isPrime(arr[j]) && arr[j] > arr[i]) {
                    if (candidate == -1 || arr[j] < candidate) {
                        candidate = arr[j];
                    }
                }
            }
            result[i] = candidate;
        }
     
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8, 58, 71, 18, 31, 32, 63};
        int l = 1, r = 5;

        int[] updated = processQuery(arr, l, r);
        System.out.println(Arrays.toString(updated));
    }
}