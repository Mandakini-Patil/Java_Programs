package ArrayPrograms;

public class InsertElementToArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int ele = 3;
        int in = 2;
        int[] res = insertElement(a, in, ele);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] insertElement(int[] a, int in, int ele) {
        int[] b = new int[a.length + 1];

        for (int i = 0; i < b.length; i++) {
            if (i < in)
                b[i] = a[i];
            else if (i == in)
                b[i] = ele;
            else 
                b[i] = a[i-1];
        }

        return b;
    }
}
