import java.util.Arrays;

public class QuickSort_ {
    public static void main(String[] args) {
        int[] ints = {3, -2, 0, 9, 5, 7, 4, 6, 1};
        int[] sort = quickSort(ints,0,ints.length-1);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] quickSort(int[] ints,int left,int right) {
        int l = left;
        int r = right;
        if (l > r){
            return ints;
        }
        while (ints[l] <= ints[left] && l<r){
            l++;
        }

        while (ints[r] >= ints[left] && l<r){
            r--;
        }
        if(l<r){
            ints[l] = ints[l] ^ ints[r];
            ints[r] = ints[l] ^ ints[r];
            ints[l] = ints[l] ^ ints[r];
        }

        if(ints[left] > ints[l]){
            ints[left] = ints[left] ^ ints[l];
            ints[l] = ints[left] ^ ints[l];
            ints[left] = ints[left] ^ ints[l];
        }
        quickSort(ints,left,l-1);
        quickSort(ints,l+1,right);
        return ints;
    }
}
