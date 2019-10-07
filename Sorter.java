import java.util.Arrays;

public class Sorter
{

    private static int[] mergeSort(int[] data) {
        if (data.length < 2) {
            return data;
        }
        int[] l = Arrays.copyOfRange(data, 0, data.length/2);
        int[] r = Arrays.copyOfRange(data, data.length - data.length/2, data.length);

        mergeSort(l);
        mergeSort(r);

        merge(data, l, r);

        return data;
    }
    private static int[] merge(int[] data, int[] l, int[] r) {
        int i=0, j=0, k=0;

        while (i<l.length && j<r.length) {
            if (l[i] < r[j]) {
                data[k++] = l[i++];
            } else {
                data[k++] = r[j++];
            }
        }
        while (i<l.length) {
            data[k++] = l[i++];
        }
        while (j<r.length) {
            data[k++] = r[j++];
        }
        return data;
    }

    private static void insertionSort(int[] data) {
        for (int i=1; i<data.length; i++) {
            int j = i-1;
            int val = data[i];
            while (j > -1 && data[j] > val) {
                data[j+1] = data[j];
                data[j] = val;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { 5, 1, 6, 7, 3, 4, 9, 2, 8 };

        System.out.println("==== Unsorted ====");
        System.out.println(Arrays.toString(data));
        System.out.println();

        int[] sdata = new int[data.length];

        System.arraycopy(data, 0, sdata, 0, data.length);
        mergeSort(sdata);
        System.out.println("==== Merge-Sort ====");
        System.out.println(Arrays.toString(sdata));
        System.out.println();

        System.arraycopy(data, 0, sdata, 0, data.length);
        insertionSort(sdata);
        System.out.println("==== Insertion-Sort ====");
        System.out.println(Arrays.toString(sdata));
        System.out.println();


    }
}