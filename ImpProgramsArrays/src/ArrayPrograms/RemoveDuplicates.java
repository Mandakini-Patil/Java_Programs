package ArrayPrograms;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 3, 4, 4, 5};
        int[] res = removeDuplicate(ar);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] removeDuplicate(int[] a) {
        int[] br = new int[a.length];

        if (a.length == 1)
            return a;

        int x = 0;
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            for (; j < x; j++) {
                if (a[i] == br[j])
                    break;
            }
            if (j == x) {
                br[x] = a[i];
                x++;
            }
        }

        int[] cr = new int[x];
        for (int i = 0; i < x; i++) {
            cr[i] = br[i];
        }

        return cr;
    }
}
