package ArrayPrograms;

public class NonRepetitiveNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9, 10, 6};

        System.out.println("Non-repetitive numbers:");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // count how many times arr[i] appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                 
            // if appears only once, print it
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}